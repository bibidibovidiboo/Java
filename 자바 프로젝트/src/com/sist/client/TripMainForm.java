// 여행 메인페이지
package com.sist.client;
import javax.swing.*; // 윈도우 관련 클래스
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.sist.client2.SearchForm;

import java.awt.*; // 레이아웃 (화면 배치)
import java.awt.event.*; // 버튼 , 텍스트에 엔터 => 행위 (이벤트)
import java.net.URL;
public class TripMainForm extends JFrame implements ActionListener,MouseListener{
	// menu
	SearchForm sb=new SearchForm();
	TripMenu ml=new TripMenu();
	CardLayout card=new CardLayout(); // 레이아웃 화면 바뀜
	
	// 페이지 초기화
	int curpage=1;
	int totalpage=2;
	
	TripMainForm(){
		// 검색창 (SearchBar)
		sb.setBounds(10, 10, 1465, 50);
		add(sb);
		
		// 레이아웃 설정
		setLayout(card);
		add("ML",ml); // 리스트 먼저 출력

		// 윈도우 크기 설정
		setSize(1200, 900);
		setVisible(true);
		
		// 이전-다음 버튼
		ml.b1.addActionListener(this); 
		ml.b2.addActionListener(this); 
		
		tripPrint(1);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ml.trip[i][j].addMouseListener(this);
			}
		}
		
	}
	// 포스터 출력
	void tripPrint(int page) {
		TripVO[] trips=TripManager.tripListData(page);
		int k=0;
		for(TripVO vo:trips) {
			try {
				// 포스터 읽기 => 예외처리 필요
				URL url=new URL(vo.tripimg);
				Image img=getImage(new ImageIcon(url),
								ml.trip[0][0].getWidth(),
								ml.trip[0][0].getHeight());
				ml.trip[k/3][k%3].setIcon(new ImageIcon(img));
				k++;
			} catch (Exception ex) {}
		}
		
	}

	static Image getImage(ImageIcon ii, int w, int h) {
		Image dimg = ii.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);	
		return dimg;
	}

	// 윈도우창 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new TripMainForm(); 
		
	}

	
	// 이전다음 마우스 효과
	// 페이지 넘기기
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 이전 버튼
		if(e.getSource()==ml.b1) {
			if(curpage>1) {
				curpage--;
				tripPrint(curpage);
			}
		}
		// 다음 버튼
		else if(e.getSource()==ml.b2) {
			if(curpage<totalpage) {
				curpage++;
				tripPrint(curpage);
			}
		}
		
	}
	
	// 마우스 오버라이드
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	
	// 마우스 갖다 댔을 때
	@Override 
	public void mouseEntered(MouseEvent e) {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(e.getSource()==ml.trip[i][j]) {
					LineBorder line=new LineBorder(Color.orange,4);
					ml.trip[i][j].setBorder(line);
				}
			}
		}
	}
	
	@Override 
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ml.trip[i][j].setBorder(null);
			}
		}
		
	}

}

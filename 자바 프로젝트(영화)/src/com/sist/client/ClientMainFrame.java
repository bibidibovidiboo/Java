// 메인
package com.sist.client;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
public class ClientMainFrame extends JFrame implements ActionListener,MouseListener {
	JLabel title=new JLabel("JAVA PROJECT",JLabel.CENTER); 
	MenuForm mf=new MenuForm(); // 메뉴
	ChatForm cf=new ChatForm(); // 채팅
	ControlPanel cp; // 컨트롤패널
	
	int curpage=1; // 첫페이지
	int totalpage=16; // 마지막페이지

	//  윈도우 창 띄우기
	public ClientMainFrame() {
		cp=new ControlPanel(this); // 현재 떠있는 창으로 이동
		// 타이틀
		title.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		title.setBounds(10, 8, 1400, 100);
		setLayout(null); 
		add(title);
		
		// 메뉴 
		mf.setBounds(18, 110, 110, 300);
		add(mf);
		
		// 채팅
		cf.setBounds(150, 650, 1200, 200);
		add(cf);
		
		// 출력화면
		cp.setBounds(150, 110, 1200, 550);
		add(cp);
		
		// 윈도우창
		setSize(1400,900);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x버튼 누르면 종료
		
		// 메뉴버튼 눌렀을 때 
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		mf.b4.addActionListener(this);
		mf.b5.addActionListener(this);
		
		cp.ff.b1.addActionListener(this); // 이전버튼
		cp.ff.b2.addActionListener(this); // 다음버튼

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new ClientMainFrame();
	}
	
	// 이미지 크기 조절 
	public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
				
		// 카드 레이아웃
		if(e.getSource()==mf.b1) {
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2) {
			cp.card.show(cp, "BF");
		}
		else if(e.getSource()==mf.b3) {
			cp.card.show(cp, "OF");
		}
		else if(e.getSource()==mf.b4) {
			cp.card.show(cp, "SF");
		}
		else if(e.getSource()==mf.b5) {
			cp.card.show(cp, "NF");
		}
		
		// 홈 이전버튼
		else if(e.getSource()==cp.ff.b1) {
			
			if(curpage>1) {
				curpage--;
				cp.ff.p.removeAll(); // JPanel의 모든 기능을 삭제
				cp.ff.moviePrint(curpage);
				cp.ff.repaint(); // paint 다시 호출
				cp.ff.p.validate(); // JPanel의 원래 기능을 재배치
			}		
		}
		
		// 홈 다음버튼
		else if(e.getSource()==cp.ff.b2) {
			if(curpage<totalpage) {
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}	
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(e.getSource()==cp.ff.mc[i]) {
				if(e.getClickCount()==2) { 
					int a=(i+1)+((curpage*10)-10);				
					cp.df.datailPrint(a);
					cp.card.show(cp,"DF"); 
					break;
				}
			}
		}		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

}
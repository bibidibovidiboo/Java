/*	< 채팅창 만들기  >
 * 	윈도우 => JFrame
 * 	윈도우와 관련된 클래스를 읽어온다
 * 	
 * 	/ 재사용
 * 	= 상속 (is-a) : 기존의 클래스를 변경해서 사용
 * 	public class ClientMainFrame extends JFrame
 * 				 ===============
 * 				 JFrame의 기능을 전체 가지고 온다
 * 	class A 
 * 	{
 * 		O X W
 * 	}
 * 	class B 
 * 	{
 * 		O X W
 * 	}
 * 	= 포함 (has-a) : 기존의 클래스를 변경없이 사용
 * 	public class ClientMainFrame {
 * 		JFrame f=new JFrame();
 * 	}
 *   
 *  ==============================================
 *  
 *  윈도우 크기 결정 => 생성자에서 사용
 * 	 클래스에서 생성자 사용 => 선언이 아니라 => 구현할 때
 * 	 예) 
 * 		데이터베이스 : 오라클연결
 * 		네트워크 : 셋팅 => IP,PORT => 핸드폰 (개통)
 * 		웹 : 쿠키에서 값 읽기 => 자동로그인
 * 
 */	
package com.sist.client;
import javax.swing.*;
import java.awt.*; // Color , Layout
import java.awt.event.*; // interface

public class ClientMainFrame extends JFrame implements ActionListener,MouseListener {
	JLabel title=new JLabel("영화 예매 & 추천 프로그램",JLabel.CENTER); // 가운데정렬
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControlPanel cp;
	// 멤버변수 => 프로그램 종료할 때 까지 안지워져서 여기서 선언
	int curpage=1; // 첫페이지
	int totalpage=16; // 마지막페이지

	//  윈도우 창 띄우기
	public ClientMainFrame() {
		cp=new ControlPanel(this); // 현재떠있는 창으로 가려면 계속 this
		
		title.setFont(new Font("맑은 고딕", Font.BOLD, 45));
		// title.setOpaque(true); // 투명도
		// title.setBackground(Color.PINK); => 주석처리 한 이유 : 일단 칸 배열하려고 배경셋팅함
		title.setBounds(10, 15, 1570, 100);
		setLayout(null); // JFrame (BorderLayout) 사용자 정의로 배치 => null
		// 추가 => add()
		add(title);
		// 메뉴 배치
		mf.setBounds(10, 120, 100, 300);
		add(mf);
		// 채팅홈
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// 출력화면
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		
		setSize(1600,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x버튼 누르면 종료
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b5.addActionListener(this); // mf = 메뉴
		
		// 이전다음버튼
		cp.ff.b1.addActionListener(this); // 이전
		cp.ff.b2.addActionListener(this); // 다음

		cp.df.b2.addActionListener(this); // 목록
		
		// 영화 찾기 
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.b6.addActionListener(this);
		cp.lf.tf.addActionListener(this);
		
		
		
		/*
		for(int i=0;i<10;i++) {
			cp.ff.mc[i].addMouseListener(this);
			// mc => 영화하나 
		}
		*/
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new ClientMainFrame();
	}
	// 이미지 크기 조절 (공통 사용 메소드-static)
	public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// 홈버튼
		if(e.getSource()==mf.b1) {
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2) {
			cp.card.show(cp, "LF");
		}
		else if(e.getSource()==mf.b5) {
			cp.card.show(cp, "NF");
		}
		else if(e.getSource()==cp.df.b2) {
			cp.card.show(cp, "FF"); // 목록 누르면 내가 보던 페이지로 넘어감
		}
		
		// 이전버튼
		else if(e.getSource()==cp.ff.b1) {
			
			if(curpage>1) {
				curpage--;
				cp.ff.p.removeAll(); // JPanel의 모든 기능을 삭제
				cp.ff.moviePrint(curpage);
				cp.ff.repaint(); // paint 다시 호출
				cp.ff.p.validate(); // JPanel의 원래 기능을 재배치
			}
				
		}
		// 다음버튼
		else if(e.getSource()==cp.ff.b2) {
			if(curpage<totalpage) {
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}
		//  영화 찾기
		else if(e.getSource()==cp.lf.b1) {
			cp.lf.movieAllDate(1);
		}
		else if(e.getSource()==cp.lf.b2) {
			cp.lf.movieAllDate(2);
		}
		else if(e.getSource()==cp.lf.b3) {
			cp.lf.movieAllDate(3);
		}
		else if(e.getSource()==cp.lf.b4) {
			cp.lf.movieAllDate(4);
		}
		else if(e.getSource()==cp.lf.b5) {
			cp.lf.movieAllDate(5);
		}
		// 검색버튼 누르기 or 엔터쳤을 때 둘다 동작 ↓ => 처리하는 내용이 같을때 동시에 가능 
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf) {
			// 1. 입력된 값 읽기
			String ss=cp.lf.tf.getText(); // list폼안에 tf 값 가져와라
			if(ss.length()<1) {
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요"); // this => ClientMainFrame
				cp.lf.tf.requestFocus(); // 커서
				return; //  메소드 종료
				
			}
			cp.lf.movieFindDate(ss);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(e.getSource()==cp.ff.mc[i]) {
				if(e.getClickCount()==2) { // 2 => 더블클릭
					int a=(i+1)+((curpage*10)-10);
					// JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.datailPrint(a);
					cp.card.show(cp,"DF"); // default로 바꿔라
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

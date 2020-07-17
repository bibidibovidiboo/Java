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

public class ClientMainFrame extends JFrame implements ActionListener {
	JLabel title=new JLabel("레시피 & 맛집 추천사이트",JLabel.CENTER); // 가운데정렬
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControlPanel cp=new ControlPanel();
	//  윈도우 창 띄우기
	public ClientMainFrame() {
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
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1) {
			cp.card.show(cp, "DF");
		}
		if(e.getSource()==mf.b2) {
			cp.card.show(cp, "LF");
		}		
	}

	
}


package com.sist.client;
import java.awt.*;
import java.awt.event.*; // 버튼 처리 후 기능
import javax.swing.*;
import com.sist.common.*;
/*
 * 	 자바 패키지 ==> java(JDK1.0~) => Java1 
 * 				javax(JDK1.2~) => Java2(SUN)
 * 				JDK1.8(Oracle) => JavaScript 자체 제어 , 람다식(함수포인터) ->
 * 				==============
 * 				WEB에서만 사용이 가능 ==> ES5 => ES6 => ES8 
 * 								   ==================  람다식
 * 
 * 	 기존 클래스 사용하는 방법
 * 		=> 포함 ==> 있는 그대로(변경없이)
 * 		=> 상속 ==> 필요한 부분을 변경해서 사용 가능(오버라이딩)
 * 
 */
public class RecipeMainFrame extends JFrame implements ActionListener {
	// 배치
	CardLayout card=new CardLayout();
	Login login=new Login();
	JoinForm join=new JoinForm();
	RecipeManager rm=new RecipeManager();
	public RecipeMainFrame() {
		// GUI의 화면 디자인 , 변수 초기화 , 데이터베이스 연결 , 서버 연결  , 쓰레드 동작
		// Layout => 화면 배치
		setLayout(card);
		// 화면추가
		add("RM",rm);
		add("LOGIN",login);
		add("JOIN",join);
		setSize(1024,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		login.b2.addActionListener(this);
		join.b3.addActionListener(this);
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new RecipeMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2) {
			card.show(getContentPane(), "JOIN");
		}
		else if(e.getSource()==join.b3) {
			card.show(getContentPane(), "LOGIN");
		}
	}
	
}

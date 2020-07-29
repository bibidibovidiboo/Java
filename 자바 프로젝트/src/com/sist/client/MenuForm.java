// 메뉴
package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class MenuForm extends JPanel {
	JButton b1,b2,b3,b4,b5,b6;
	// 버튼 초기화
	public MenuForm() {
		b1=new JButton("홈");
		b2=new JButton("도서추천");
		b3=new JButton("맛집추천");
		b4=new JButton("음악추천");
		b5=new JButton("영화예약");
		b6=new JButton("종료");
		setLayout(new GridLayout(6, 1, 8, 8)); 
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
	}
}

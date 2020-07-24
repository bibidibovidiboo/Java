// 메뉴바
package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class MenuForm extends JPanel {
	JButton b1,b2,b3,b4,b5,b6;
	// 버튼 초기화
	public MenuForm() {
		b1=new JButton("홈");
		b2=new JButton("추천여행지");
		b3=new JButton("여행후기");
		b4=new JButton("여행예약");
		b5=new JButton("채팅방");
		b6=new JButton("마이페이지");
		setLayout(new GridLayout(6, 1, 8, 8)); 
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
	}
}

// 메뉴바
package com.sist.client2;
import java.awt.*;
import javax.swing.*;
public class MenuForm extends JPanel {
	JButton b1,b2;
	// 버튼 초기화
	public MenuForm() {
		b1=new JButton("인기여행지");
		b2=new JButton("추천여행지");
		setLayout(new GridLayout(1, 2, 10, 1)); // 레이아웃

		add(b1);
		add(b2);	
		
	}
}

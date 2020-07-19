// 인기여행지 
package com.sist.client2;
import java.awt.*;
import javax.swing.*;
public class PopularForm extends JLabel  {
	JLabel la[] = new JLabel[9];
	// 라벨로 그리드 생성
	public PopularForm() {
		setLayout(new GridLayout(3,3,3,3));
	
		for(int i=0; i<9; i++) {
			la[i] = new JLabel();
			la[i].setOpaque(true);
			la[i].setBackground(Color.pink);
			add(la[i]);
		}
	  
		setSize(700, 700);
		setVisible(true);

	}

 }

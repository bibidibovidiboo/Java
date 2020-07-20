// 추천여행지 
package com.sist.client2;
import java.awt.*;
import javax.swing.*;
public class RecommendForm extends JLabel  {
	JLabel la[] = new JLabel[9];
	// 라벨로 그리드 생성
	public RecommendForm() {
		setLayout(new GridLayout(3,3,3,3));
	
		for(int i=0; i<9; i++) {
			la[i] = new JLabel();
			la[i].setOpaque(true);
			la[i].setBackground(Color.orange);
			add(la[i]);
		}
	  
		setVisible(true);

	}

}
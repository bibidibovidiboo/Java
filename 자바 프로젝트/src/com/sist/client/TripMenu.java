// 상단 여행지 메뉴 
package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class TripMenu extends JPanel {
	JLabel[][] trip=new JLabel[3][3];
	JPanel pan=new JPanel();
	JButton b1=new JButton("인기여행지");
	JButton b2=new JButton("추천여행지");
	TripMenu(){
		setLayout(null);
		pan.setLayout(new GridLayout(3,3,0,0));
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				trip[i][j]=new JLabel();
			
				pan.add(trip[i][j]);
			}
		}
		
		// 여행지 그리드 위치
		pan.setBounds(250, 130, 700, 700);
		add(pan);

		// 이전 - 다음 버튼 생성
		JPanel p=new JPanel();
		
		// 버튼 사이즈 변경
		b1.setPreferredSize(new Dimension(90, 25));
		b2.setPreferredSize(new Dimension(90, 25));
		
		p.add(b1);
		p.add(b2);
		
		p.setBounds(200, 90, 300, 30);
		add(p);
	
	}
	
}
// 상단 여행지 버튼
package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class TripList extends JPanel {
	// JLabel ==> 구분 , 이미지 출력
		JLabel[][] trip=new JLabel[3][3];
	JPanel pan=new JPanel();
	JButton b1=new JButton("인기여행지");
	JButton b2=new JButton("추천여행지");
	TripList(){
		setLayout(null);
	
		pan.setLayout(new GridLayout(3,3,2,2));
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				trip[i][j]=new JLabel();
			
				pan.add(trip[i][j]);
			}
		}
		
		// 윈도우창 배치
		pan.setBounds(80, 70, 800, 800);
		add(pan);

		
		// 이전 - 다음 버튼 생성
		JPanel p=new JPanel();
		// 버튼 사이즈 변경
		b1.setPreferredSize(new Dimension(90, 25));
		b2.setPreferredSize(new Dimension(90, 25));
		
		p.add(b1);
		p.add(b2);
		
		p.setBounds(35, 25, 300, 30);
		add(p);
	
	}
	
}
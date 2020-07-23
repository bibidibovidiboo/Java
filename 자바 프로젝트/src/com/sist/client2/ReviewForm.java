// 3번째 - 여행후기
package com.sist.client2;
import java.awt.*;
import javax.swing.*;
public class ReviewForm extends JPanel {
		JLabel photo = new JLabel("사진");
		JLabel title = new JLabel("여행제목");
		JLabel group = new JLabel("여행종류");
		JLabel date = new JLabel("날짜");
		JLabel content = new JLabel("내용");
		JLabel la1,la2,la3,la4,b5;
	
		ReviewForm(){
			setLayout(null);
			
			//사진
			photo.setOpaque(true);
			photo.setBackground(Color.green);
			photo.setBounds(0, 0, 200, 150);
			add(photo);
			
			// 여행제목
			title.setFont(new Font("맑은 고딕",Font.BOLD,15));
			title.setOpaque(true);
			title.setBackground(Color.pink);
			// setLayout(null);
			title.setBounds(250,0,450,25);
			add(title);
			
			//여행 종류 
			group.setFont(new Font("맑은 고딕",Font.BOLD,15));
			group.setOpaque(true);
			group.setBackground(Color.pink);
			// setLayout(null);
			group.setBounds(250,40,200,25);
			add(group);
			
			//날짜
			date.setFont(new Font("맑은 고딕",Font.BOLD,15));
			date.setOpaque(true);
			date.setBackground(Color.pink);
			// setLayout(null);
			date.setBounds(500,40,200,25);
			add(date);
			
			//내용
			content.setFont(new Font("맑은 고딕",Font.BOLD,15));
			content.setOpaque(true);
			content.setBackground(Color.pink);
			// setLayout(null);
			content.setBounds(250,80,450,50);
			add(content);
			
			
		}
}
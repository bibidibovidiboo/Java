// 3��° - �����ı�
package com.sist.client2;
import java.awt.*;
import javax.swing.*;
public class ReviewForm extends JPanel {
		JLabel photo = new JLabel("����");
		JLabel title = new JLabel("��������");
		JLabel group = new JLabel("��������");
		JLabel date = new JLabel("��¥");
		JLabel content = new JLabel("����");
		JLabel la1,la2,la3,la4,b5;
	
		ReviewForm(){
			setLayout(null);
			
			//����
			photo.setOpaque(true);
			photo.setBackground(Color.green);
			photo.setBounds(0, 0, 200, 150);
			add(photo);
			
			// ��������
			title.setFont(new Font("���� ���",Font.BOLD,15));
			title.setOpaque(true);
			title.setBackground(Color.pink);
			// setLayout(null);
			title.setBounds(250,0,450,25);
			add(title);
			
			//���� ���� 
			group.setFont(new Font("���� ���",Font.BOLD,15));
			group.setOpaque(true);
			group.setBackground(Color.pink);
			// setLayout(null);
			group.setBounds(250,40,200,25);
			add(group);
			
			//��¥
			date.setFont(new Font("���� ���",Font.BOLD,15));
			date.setOpaque(true);
			date.setBackground(Color.pink);
			// setLayout(null);
			date.setBounds(500,40,200,25);
			add(date);
			
			//����
			content.setFont(new Font("���� ���",Font.BOLD,15));
			content.setOpaque(true);
			content.setBackground(Color.pink);
			// setLayout(null);
			content.setBounds(250,80,450,50);
			add(content);
			
			
		}
}
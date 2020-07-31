// 탭 나누기
package com.sist.client;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import com.sist.data.*; // 다른패키지는 꼭 import 해야 쓸 수 있음 ★
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.net.*; // url
public class ListForm extends JPanel {
	JButton b1,b2,b3,b4,b5,b6;

	public ListForm() {
		setLayout(null); // FlowLayout => null 사용자 정의 배치
		b1=new JButton("현재상영영화");
		b2=new JButton("개봉상영영화");
		b3=new JButton("박스오피스(주간)");
		b4=new JButton("박스오피스(월간)");
		b5=new JButton("박스오피스(연간)");
		
		
		JPanel p=new JPanel(); // 탭
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		
		p.setBounds(10, 25, 900, 35);
		add(p);
	
		JLabel test=new JLabel();
		test.setBounds(30, 50, 900, 35);
		test.setBackground(Color.red);
		add(test);

		
		

	
	
		}
}

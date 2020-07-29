package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class MenuForm extends JPanel {
	JButton b1,b2,b3,b4,b5,b6,b7;
	//버튼초기화, 출력위치 지정(배치)=> 생성자
	public MenuForm()
	{
		//setBackground(Color.orange); //배치확인용
		b1=new JButton("홈");
		b2=new JButton("영화찾기");
		b3=new JButton("영화예매");
		b4=new JButton("영화추천");
		b5=new JButton("뉴스");
		b6=new JButton("영화뮤직");
		b7=new JButton("종료");
		
		setLayout(new GridLayout(7,1,5,5));  //메뉴를 가로로 배치하려면 안해도 됨. 세로로 배치하기 위함 GridLayout(7,1,horizontal,vertical)
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		
		
		
	}

	

}
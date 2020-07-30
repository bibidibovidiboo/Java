// 메인페이지
package com.sist.test;
import javax.swing.*;

import com.sist.test.ControlPanel;

import java.awt.*; // Color , Layout
import java.awt.event.*; // interface
public class ClientMainFrame extends JFrame implements ActionListener {
	JLabel title=new JLabel("영화 예매 & 추천 프로그램",JLabel.CENTER); 
	MenuForm mf=new MenuForm(); // 메뉴
	MovieForm hf=new MovieForm(); // 홈
	BookForm bf=new BookForm(); // 도서추천
	FoodForm vf=new FoodForm(); // 맛집추천
	ChatForm cf=new ChatForm(); // 채팅
	MusicForm sf=new MusicForm(); // 음악
	ControlPanel cp=new ControlPanel(); // 컨트롤패널
	
	// 생성자
	public ClientMainFrame() {
		setLayout(null); // 사용자 정의로 배치 
		
		// 타이틀
		title.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
		title.setBounds(10, 15, 1400, 100);
		add(title);
		
		// 메뉴창
		mf.setBounds(15, 110, 110, 300);
		add(mf);

		// 출력 화면
		cp.setBounds(150, 110, 1200, 550);
		add(cp);
		
		// 채팅홈
		cf.setBounds(150, 650, 1200, 200);
		add(cf);
		
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		mf.b4.addActionListener(this);
		
		//  윈도우창
		setSize(1400,900); // 크기
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x버튼 누르면 종료
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new ClientMainFrame();
	}
	
	
	// 버튼 눌렀을 때 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "HF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "BF");
		}
		else if(e.getSource()==mf.b3)
		{
			cp.card.show(cp, "VF");
		}
		else if(e.getSource()==mf.b4)
		{
			cp.card.show(cp, "SF");
		}		
	}	
}

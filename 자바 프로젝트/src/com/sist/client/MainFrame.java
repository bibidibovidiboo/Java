// 메인페이지
package com.sist.client;
import javax.swing.*;

import com.sist.client.ControlPanel;

import java.awt.*; // Color , Layout
import java.awt.event.*; // interface
public class MainFrame extends JFrame implements ActionListener {
	JLabel search=new JLabel("하나투어",JLabel.CENTER);
	SearchForm sf=new SearchForm();
	MenuForm mf=new MenuForm(); // 메뉴창
	HomeForm hf=new HomeForm(); // 인기 여행지
	RecommendForm rf=new RecommendForm(); // 추천 여행지
	ReviewFromList vf=new ReviewFromList();
	ControlPanel cp=new ControlPanel(); // 컨트롤패널
	// 생성자
	public MainFrame() {
		setLayout(null); // 사용자 정의로 배치 
		
		// 검색창
		search.setFont(new Font("맑은 고딕", Font.BOLD, 20)); // 폰트
		search.setOpaque(true); // 라벨 초기화
		// search.setBackground(Color.pink); // 라벨 배경
		search.setBounds(20, 80, 110, 50); // 사이즈 
		add(search);
		
		// 메뉴창
		mf.setBounds(20, 150, 110, 300);
		add(mf);

		// 출력 화면
		cp.setBounds(250, 150, 900, 500);
		add(cp);
		
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		
		//  윈도우창
		setSize(1200,800); // 크기
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x버튼 누르면 종료
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		// UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new MainFrame();
	}
	
	// 버튼 눌렀을 때 이동한다
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "HF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "RF");
		}
		else if(e.getSource()==mf.b3)
		{
			cp.card.show(cp, "VF");
		}
		
	}
	
}

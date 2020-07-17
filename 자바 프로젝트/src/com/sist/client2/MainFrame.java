// 메인페이지
package com.sist.client2;
import javax.swing.*;

import java.awt.*; // Color , Layout
import java.awt.event.*; // interface

public class MainFrame extends JFrame implements ActionListener {
	JLabel search=new JLabel("검색창",JLabel.CENTER); 
	MenuForm mf=new MenuForm(); // 메뉴창
	// 생성자
	public MainFrame() {
		// 검색창
		search.setFont(new Font("맑은 고딕", Font.PLAIN, 30)); // 폰트
		search.setOpaque(true); // 라벨 초기화
		search.setBackground(Color.green); // 라벨 배경
		search.setBounds(10, 15, 1170, 80); // 사이즈 
		setLayout(null); // 사용자 정의로 배치 
		
		add(search);
		
		// 메뉴창
		mf.setBounds(10, 110, 200, 30);
		add(mf);
		
	
		//  윈도우창
		setSize(1200,900); // 크기
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x버튼 누르면 종료
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new MainFrame();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}

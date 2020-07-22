// CGV 상세페이지 예제
package com.sist.cgv;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CGVMainFrame extends JFrame {
	CardLayout card=new CardLayout();
	MovieListPanel mp=new MovieListPanel();
	public CGVMainFrame() {
		setLayout(card); // 바꿔놓고 시작
		add("MP",mp);
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 이거 안주면 계속 메모리 누적돼서
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CGVMainFrame();
	}

}

package com.sist.client;
import java.awt.*;
import java.awt.event.*; // ��ư ó�� �� ���
import javax.swing.*;
import com.sist.common.*;
/*
 * 	 �ڹ� ��Ű�� ==> java(JDK1.0~) => Java1 
 * 				javax(JDK1.2~) => Java2(SUN)
 * 				JDK1.8(Oracle) => JavaScript ��ü ���� , ���ٽ�(�Լ�������) ->
 * 				==============
 * 				WEB������ ����� ���� ==> ES5 => ES6 => ES8 
 * 								   ==================  ���ٽ�
 * 
 * 	 ���� Ŭ���� ����ϴ� ���
 * 		=> ���� ==> �ִ� �״��(�������)
 * 		=> ��� ==> �ʿ��� �κ��� �����ؼ� ��� ����(�������̵�)
 * 
 */
public class RecipeMainFrame extends JFrame implements ActionListener {
	// ��ġ
	CardLayout card=new CardLayout();
	Login login=new Login();
	JoinForm join=new JoinForm();
	RecipeManager rm=new RecipeManager();
	public RecipeMainFrame() {
		// GUI�� ȭ�� ������ , ���� �ʱ�ȭ , �����ͺ��̽� ���� , ���� ����  , ������ ����
		// Layout => ȭ�� ��ġ
		setLayout(card);
		// ȭ���߰�
		add("RM",rm);
		add("LOGIN",login);
		add("JOIN",join);
		setSize(1024,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		login.b2.addActionListener(this);
		join.b3.addActionListener(this);
	}

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new RecipeMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2) {
			card.show(getContentPane(), "JOIN");
		}
		else if(e.getSource()==join.b3) {
			card.show(getContentPane(), "LOGIN");
		}
	}
	
}

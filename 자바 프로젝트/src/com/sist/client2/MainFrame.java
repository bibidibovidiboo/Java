// ����������
package com.sist.client2;
import javax.swing.*;

import java.awt.*; // Color , Layout
import java.awt.event.*; // interface

public class MainFrame extends JFrame implements ActionListener {
	JLabel search=new JLabel("�˻�â",JLabel.CENTER); 
	MenuForm mf=new MenuForm(); // �޴�â
	// ������
	public MainFrame() {
		// �˻�â
		search.setFont(new Font("���� ���", Font.PLAIN, 30)); // ��Ʈ
		search.setOpaque(true); // �� �ʱ�ȭ
		search.setBackground(Color.green); // �� ���
		search.setBounds(10, 15, 1170, 80); // ������ 
		setLayout(null); // ����� ���Ƿ� ��ġ 
		
		add(search);
		
		// �޴�â
		mf.setBounds(10, 110, 200, 30);
		add(mf);
		
	
		//  ������â
		setSize(1200,900); // ũ��
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x��ư ������ ����
		
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

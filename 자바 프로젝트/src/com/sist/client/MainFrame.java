// ����������
package com.sist.client;
import javax.swing.*;

import com.sist.client.ControlPanel;

import java.awt.*; // Color , Layout
import java.awt.event.*; // interface
public class MainFrame extends JFrame implements ActionListener {
	JLabel search=new JLabel("�ϳ�����",JLabel.CENTER);
	SearchForm sf=new SearchForm();
	MenuForm mf=new MenuForm(); // �޴�â
	HomeForm hf=new HomeForm(); // �α� ������
	RecommendForm rf=new RecommendForm(); // ��õ ������
	ReviewFromList vf=new ReviewFromList();
	ControlPanel cp=new ControlPanel(); // ��Ʈ���г�
	// ������
	public MainFrame() {
		setLayout(null); // ����� ���Ƿ� ��ġ 
		
		// �˻�â
		search.setFont(new Font("���� ���", Font.BOLD, 20)); // ��Ʈ
		search.setOpaque(true); // �� �ʱ�ȭ
		// search.setBackground(Color.pink); // �� ���
		search.setBounds(20, 80, 110, 50); // ������ 
		add(search);
		
		// �޴�â
		mf.setBounds(20, 150, 110, 300);
		add(mf);

		// ��� ȭ��
		cp.setBounds(250, 150, 900, 500);
		add(cp);
		
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		
		//  ������â
		setSize(1200,800); // ũ��
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x��ư ������ ����
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		// UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new MainFrame();
	}
	
	// ��ư ������ �� �̵��Ѵ�
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

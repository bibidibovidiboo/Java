// ����������
package com.sist.test;
import javax.swing.*;

import com.sist.test.ControlPanel;

import java.awt.*; // Color , Layout
import java.awt.event.*; // interface
public class ClientMainFrame extends JFrame implements ActionListener {
	JLabel title=new JLabel("��ȭ ���� & ��õ ���α׷�",JLabel.CENTER); 
	MenuForm mf=new MenuForm(); // �޴�
	MovieForm hf=new MovieForm(); // Ȩ
	BookForm bf=new BookForm(); // ������õ
	FoodForm vf=new FoodForm(); // ������õ
	ChatForm cf=new ChatForm(); // ä��
	MusicForm sf=new MusicForm(); // ����
	ControlPanel cp=new ControlPanel(); // ��Ʈ���г�
	
	// ������
	public ClientMainFrame() {
		setLayout(null); // ����� ���Ƿ� ��ġ 
		
		// Ÿ��Ʋ
		title.setFont(new Font("���� ���", Font.PLAIN, 40));
		title.setBounds(10, 15, 1400, 100);
		add(title);
		
		// �޴�â
		mf.setBounds(15, 110, 110, 300);
		add(mf);

		// ��� ȭ��
		cp.setBounds(150, 110, 1200, 550);
		add(cp);
		
		// ä��Ȩ
		cf.setBounds(150, 650, 1200, 200);
		add(cf);
		
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		mf.b4.addActionListener(this);
		
		//  ������â
		setSize(1400,900); // ũ��
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x��ư ������ ����
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new ClientMainFrame();
	}
	
	
	// ��ư ������ �� 
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

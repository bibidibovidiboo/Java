// ����������
package com.sist.client2;
import javax.swing.*;
import com.sist.client2.ControlPanel;
import java.awt.*; // Color , Layout
import java.awt.event.*; // interface
public class MainFrame extends JFrame implements ActionListener {
	JLabel search=new JLabel("�˻�â",JLabel.CENTER); 
	SearchForm sf=new SearchForm();
	MenuForm mf=new MenuForm(); // �޴�â
	PopularForm pf=new PopularForm(); // �α� ������
	RecommendForm rf=new RecommendForm(); // ��õ ������
	ControlPanel cp=new ControlPanel(); // ��Ʈ���г�
	// ������
	public MainFrame() {
		// �˻�â
		search.setFont(new Font("���� ���", Font.PLAIN, 30)); // ��Ʈ
		search.setOpaque(true); // �� �ʱ�ȭ
		search.setBackground(Color.green); // �� ���
		search.setBounds(250, 15, 700, 70); // ������ 
		setLayout(null); // ����� ���Ƿ� ��ġ 
		
		add(search);

		// �޴�â
		mf.setBounds(250, 110, 200, 30);
		add(mf);
		
		// �α⿩���� �г� 
		pf.setBounds(250, 150, 700, 700);
		add(pf); 
		
		// ��õ������ �г�
		rf.setBounds(250, 150, 700, 700);
		add(rf); 
		
		// ��� ȭ��
		cp.setBounds(250, 150, 700, 700);
		add(cp);
		// setSize(1000, 700);
		// setVisible(true);
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		
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
	
	// ��ư ������ �� �̵�
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "PF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "RF");
		}
	}
	

}

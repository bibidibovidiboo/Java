// ��� ������ ��ư
package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class TripList extends JPanel {
	// JLabel ==> ���� , �̹��� ���
		JLabel[][] trip=new JLabel[3][3];
	JPanel pan=new JPanel();
	JButton b1=new JButton("�α⿩����");
	JButton b2=new JButton("��õ������");
	TripList(){
		setLayout(null);
	
		pan.setLayout(new GridLayout(3,3,2,2));
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				trip[i][j]=new JLabel();
			
				pan.add(trip[i][j]);
			}
		}
		
		// ������â ��ġ
		pan.setBounds(80, 70, 800, 800);
		add(pan);

		
		// ���� - ���� ��ư ����
		JPanel p=new JPanel();
		// ��ư ������ ����
		b1.setPreferredSize(new Dimension(90, 25));
		b2.setPreferredSize(new Dimension(90, 25));
		
		p.add(b1);
		p.add(b2);
		
		p.setBounds(35, 25, 300, 30);
		add(p);
	
	}
	
}
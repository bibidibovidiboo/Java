// 1��° - Ȩȭ��
package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class HomeForm extends JPanel  {
	JLabel la[] = new JLabel[8];
	// �󺧷� �׸��� ����
	public HomeForm() {
		setLayout(new GridLayout(2,4,3,3));
	
		for(int i=0; i<8; i++) {
			la[i] = new JLabel();
			la[i].setOpaque(true);
			la[i].setBackground(Color.orange);
			add(la[i]);
		}
	  
		// setVisible(true);
		// setBackground(Color.black);
		// setSize(900,900);
		
	}
	
 }

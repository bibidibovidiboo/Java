// �޴�
package com.sist.test;
import java.awt.*;
import javax.swing.*;
public class MenuForm extends JPanel {
	JButton b1,b2,b3,b4,b5,b6;
	// ��ư �ʱ�ȭ
	public MenuForm() {
		b1=new JButton("Ȩ");
		b2=new JButton("������õ");
		b3=new JButton("������õ");
		b4=new JButton("������õ");
		b5=new JButton("��ȭ����");
		b6=new JButton("����");
		setLayout(new GridLayout(6, 1, 8, 8)); 
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
	}
}

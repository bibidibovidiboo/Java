// �� ������
package com.sist.client;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import com.sist.data.*; // �ٸ���Ű���� �� import �ؾ� �� �� ���� ��
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.net.*; // url
public class ListForm extends JPanel {
	JButton b1,b2,b3,b4,b5,b6;

	public ListForm() {
		setLayout(null); // FlowLayout => null ����� ���� ��ġ
		b1=new JButton("����󿵿�ȭ");
		b2=new JButton("�����󿵿�ȭ");
		b3=new JButton("�ڽ����ǽ�(�ְ�)");
		b4=new JButton("�ڽ����ǽ�(����)");
		b5=new JButton("�ڽ����ǽ�(����)");
		
		
		JPanel p=new JPanel(); // ��
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		
		p.setBounds(10, 25, 900, 35);
		add(p);
	
		JLabel test=new JLabel();
		test.setBounds(30, 50, 900, 35);
		test.setBackground(Color.red);
		add(test);

		
		

	
	
		}
}

// ä��
package com.sist.client;
import java.awt.Color;
// 1465, 200
import javax.swing.*;
import javax.swing.table.*;
public class ChatForm extends JPanel {
	JTextPane ta;
	JTextField tf;
	JComboBox box;
	JTable table;
	DefaultTableModel model;
	JButton b1,b2;
	public ChatForm()
	{
		
		setLayout(null);
		ta=new JTextPane();
		ta.setEditable(false);
		JScrollPane js=new JScrollPane(ta);
		js.setBounds(0, 30, 800, 120);
		add(js);
		tf=new JTextField();
		tf.setBounds(0, 160, 690, 30);
		add(tf);
		
		box=new JComboBox();
		box.addItem("black");
		box.addItem("red");
		box.addItem("blue");
		box.addItem("green");
		box.addItem("gray");
		box.addItem("yellow");
		box.addItem("cyan");
		
		box.setBounds(695, 160, 105, 29);
		add(box);
		
		String[] col= {"ID","��ȭ��","����"};
		String[][] row=new String[0][3];
		model=new DefaultTableModel(row, col);
		table=new JTable(model);
		JScrollPane js1=new JScrollPane(table);
		js1.setBounds(810,30,390,120);
		add(js1);
		
		JPanel p=new JPanel();
		b1=new JButton("��������");
		b2=new JButton("����������");
		p.add(b1);
		p.add(b2);
		p.setBounds(871, 155, 500, 35);
		add(p);

	}
}
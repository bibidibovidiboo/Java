/*	<  �ڹٿ��� ������ �������̽�  >
 *  1. Window (javax.swing)
 *  	ActionListener :��ư,�޴�,text���� ����
 *  		= actionPerfoemed()
 *		MouseListener : ���콺 ����, JTable , JLable
 *			= mouseClicked()
 *			= mouseReleased()
 *			= mousePressed()
 *			= mouseEntered()
 *			= mouseExited() 
 *		MouseMotionListener 
 *			= mouseMoved()
 *			= mouseDragged()
 *		KeyLinstener : Ű����
 *			= keyPressed()
 *			= keyRealeased()
 *			= keyTyped()
 *		FocusListener
 *			= focusLost()
 *			= focusGained()
 *		ItemListener			
 *			= ComboBox , JList
 *			= itemStateChanged()
 *  2. �����ͺ��̽� ����
 *  	Connection
 *  	Statement
 *  	ResultSet
 *  
 */
package com.sist.inter;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class MainClass2 extends JFrame implements ActionListener,MouseListener,ItemListener{
	JButton b1;
	JTextField tf;
	JLabel la;
	JComboBox box;
	//  �ʱ�ȭ => �޸𸮿� ���� (������)
	public MainClass2() {
		b1=new JButton("Ŭ��");
		tf=new JTextField();
		la=new JLabel(new ImageIcon("c:\\javaDev\\dino.jpg"));
		box=new JComboBox();
		box.addItem("ȫ�浿");
		box.addItem("�ɺ���");
		box.addItem("������");
		
		add("West",b1);
		add("Center",la);
		add("South",tf);
		add("North",box);
		// East , West
		
		// ȭ�� ũ�� 
		setSize(450, 500);
		setVisible(true);
		
		// �̺�Ʈ ���
		// b1�̶�� ��ư�� Ŭ���ϸ� => actionPerformed() ȣ��
		b1.addActionListener(this); // this => �ڽ� (MainClass2)
		tf.addActionListener(this); // actionPerformed()
		la.addMouseListener(this);
	}
	public static void main(String[] args) {
		new MainClass2();
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la) {
			if(e.getClickCount()==2) {
				JOptionPane.showMessageDialog(this, "�󼼺���� �̵�");
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			JOptionPane.showMessageDialog(this, "��ư Ŭ��!!"); 
			// ���⿡ this ��� null ���� �ƹ������� => this = �� �����쿡 �����
		}
		else if(e.getSource()==tf) // ���� ���� �� �̺�Ʈ
		{
			String msg=tf.getText();
			JOptionPane.showMessageDialog(this, msg);
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box) {
			String name=(String)box.getSelectedItem();
			// (String) ����ȯ
			JOptionPane.showMessageDialog(this, name);
		}
	}
}









package com.sist.io;
import java.util.*;
import java.io.*;
// ���� ���ε� (���� Copy)
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass5 extends JFrame implements ActionListener {
	JTextField tf=new JTextField(25); // ( ) => ũ�� 
	JButton b=new JButton("���ϼ���");
	public MainClass5() {
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b);
		add("Center",p);
		setSize(450,250);
		setVisible(true);
		b.addActionListener(this); // this : ����Ŭ���� �ȿ� �ִ� 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass5();
	}
	
	// ��ư Ŭ�� �� ���
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) // b��ư�� Ŭ���ߴٸ�
		{	
			// ������ �� ������ ������ �ҷ��´�
			JFileChooser jc=new JFileChooser(); // ���� ã�� 
			if(jc.showOpenDialog(this)==jc.APPROVE_OPTION) {
				tf.setText(jc.getSelectedFile().getPath());
				try {
					// ���⼭���� ���� ���ͼ� ��� �� p.880
					FileInputStream fis=new FileInputStream(tf.getText());
					FileOutputStream fos=new FileOutputStream("c:\\upload\\"+jc.getSelectedFile().getName());
					// jc.getSelectedFile().getName() => ���ϸ� �����ؼ� upload�� ī�ǵ�
					
					int i=0;
					byte[] buffer=new byte[1024]; // [1024] byte
					while((i=fis.read(buffer ,0, 1024))!=-1) {
						fos.write(buffer, 0, i); // i=> ���� ����Ʈ��
					}
					fis.close();
					fos.close();
					JOptionPane.showMessageDialog(this, "���� ���ε� �Ϸ�"); // �������
				}catch (Exception ex) {
					
				}
			}
		}
	}

}
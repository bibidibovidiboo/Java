// �޴���
package com.sist.client2;
import java.awt.*;
import javax.swing.*;
public class MenuForm extends JPanel {
	JButton b1,b2;
	// ��ư �ʱ�ȭ
	public MenuForm() {
		b1=new JButton("�α⿩����");
		b2=new JButton("��õ������");
		setLayout(new GridLayout(1, 2, 10, 1)); // ���̾ƿ�

		add(b1);
		add(b2);	
		
	}
}

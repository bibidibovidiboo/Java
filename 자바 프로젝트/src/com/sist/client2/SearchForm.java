// �˻�â
package com.sist.client2;
import java.awt.Color;
import javax.swing.*;
public class SearchForm extends JPanel {
	 JComboBox box;
	 
	 public SearchForm() {
		 box=new JComboBox();
		 box.addItem("��õ/�������");
		 box.addItem("�λ����");
		 box.addItem("�뱸���");
		 box.addItem("�������");
		 box.addItem("û�����");
		 box.addItem("�������");
		 box.addItem("������");
		   
		 box.setBounds(200, 15, 200, 70);
		 add(box);

	 }

}

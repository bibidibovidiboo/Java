// Ȩȭ�� �׸���
package com.sist.client;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.sist.data.*;
public class MusicalForm extends JPanel{
	JButton b1,b2;
	JPanel p=new JPanel();
	MusicalCard[] mc=new MusicalCard[10];
	ClientMainFrame c; 
	public MusicalForm(ClientMainFrame c) {
		this.c=c;
		setLayout(new BorderLayout());
		b1=new JButton("��");
		b2=new JButton("��");
		
		p.setLayout(new GridLayout(2, 5, 6, 6));
		
		musicalPrint(1);
		
		add("West",b1);
		add("Center",p);
		add("East",b2);
				
	}
	// ������ => ClientMainFrame���� musicalprint�� ȣ��
	public void musicalPrint(int page) {
		MusicalManager m=new MusicalManager();
		ArrayList<MusicalVO> list=m.musicalListData(page); 
		int i=0;
		for(MusicalVO vo:list) {
			mc[i]=new MusicalCard(vo.getTitle(), vo.getPoster());
			p.add(mc[i]);
			mc[i].addMouseListener(c); 
			i++;
		}
	}
}
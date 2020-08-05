// ���� ��������
package com.sist.client;
import com.sist.data.*;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
import java.util.*;

public class MangoDetailForm extends JPanel{
		
		JLabel poster=new JLabel();
		JLabel la1=new JLabel();
		JLabel[] la=new JLabel[7];
	
		JButton b1,b2;
		public MangoDetailForm()
		{
			setLayout(null);
			poster.setBounds(10, 30, 230, 230);
			add(poster);
			la1.setBounds(265, 15, 400, 45);
			la1.setFont(new Font("���� ���",Font.BOLD,20));
			add(la1);
			JPanel p=new JPanel();
			p.setLayout(new GridLayout(7,1,5,5));
			String[] str= {"����","�ּ�","��ȭ��ȣ","����","����","����","�����ð�"};
			for(int i=0;i<7;i++)
			{
				la[i]=new JLabel(str[i]);
				la[i].setFont(new Font("���� ���",Font.BOLD,15));
				p.add(la[i]);
			}
			p.setBounds(265, 70, 400, 300);
			add(p);
			
			b1=new JButton("����");
			b2=new JButton("���");
			b1.setBackground(Color.red);
			b2.setBackground(Color.green);
			JPanel p2=new JPanel();
			p2.add(b1);
			p2.add(b2);
			p2.setBounds(210, 400, 200, 35);
			add(p2);	
		}
		
		public void detailPrint(int fno)
		{
			MangoManager m=new MangoManager();
			MangoVO vo=m.mangoDetailData(fno);
			la1.setText(vo.getTitle());
			try
			{
				URL url=new URL(vo.getPoster());
				Image img=ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight());
				poster.setIcon(new ImageIcon(img));
			}catch(Exception ex) {}
			
			la[0].setText("���� : "+vo.getScore());
			la[1].setText("�ּ� : "+vo.getAddress());
			la[2].setText("��ȭ��ȣ : "+vo.getTel());
			la[3].setText("���� : "+vo.getType());
			la[4].setText("���� : "+vo.getPrice());
			la[5].setText("���� : "+vo.getParking());
			la[6].setText("�����ð� : "+vo.getTime());
		
		}
}
// ������ ��������
package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.net.*;
import com.sist.data.MusicalManager;
import com.sist.data.MusicalVO;
public class MusicalDetailForm extends JPanel {
	JLabel poster=new JLabel();
	JLabel la1=new JLabel();
	JLabel[] la=new JLabel[6];
//	JTextPane ta=new JTextPane(); 
	JButton b1;
	public MusicalDetailForm() {
		setLayout(null);
		
		poster.setBounds(110, 50, 400, 450);
		add(poster);
		
		la1.setBounds(580, 55, 550, 45);
		la1.setFont(new Font("���� ���",Font.PLAIN,30));
		add(la1);
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(6,1,5,5)); // �Ȱ��� ����̶� �׸��� ���̾ƿ�
		for(int i=0;i<6;i++) {
			String[] str= {
					"���","�⿬","�Ⱓ","�������","�����ð�","����"};
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("���� ���",Font.PLAIN,20)); 
			p.add(la[i]);
		}
		p.setBounds(580, 125, 530, 290);
		add(p);
		
//		ta.setEditable(false);
//		JScrollPane js=new JScrollPane(ta);
//		js.setBounds(50, 410, 600, 100);
//		add(js);
		
		b1=new JButton("�����ϱ�");
		b1.setBackground(Color.red);
		b1.setBounds(580, 455, 110, 40);
		add(b1);

	}
	public void datailPrint(int mno) {
		MusicalManager m=new MusicalManager();
		MusicalVO vo=m.musicalDetailDate(mno);
		la1.setText(vo.getTitle()); // Ÿ��Ʋ���
		try{
			URL url=new URL(vo.getPoster()); // url �б�
			Image img=ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight());
			poster.setIcon(new ImageIcon(img)); 
			
		}catch (Exception ex) {
			
		}
		
		la[0].setText("��� / "+vo.getPlace());
		la[1].setText("�⿬ / "+vo.getActor());
		la[2].setText("�Ⱓ / "+vo.getPeriod());
		la[3].setText("������� / "+vo.getGrade());
		la[4].setText("�����ð� / "+vo.getTime());
		la[5].setText("���� / "+vo.getHost());
//		ta.setText(vo.getStory());
		
	}
}

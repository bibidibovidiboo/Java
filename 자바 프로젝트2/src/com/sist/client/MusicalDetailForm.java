package com.sist.client;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import com.sist.data.MusicalManager;
import com.sist.data.MusicalVO;
public class MusicalDetailForm extends JPanel {
	JLabel poster=new JLabel();
	JLabel la1=new JLabel();
	JLabel[] la=new JLabel[6];
	JTextPane ta=new JTextPane(); 
	JButton b1;
	public MusicalDetailForm() {
		setLayout(null);
		
		poster.setBounds(800, 40, 350, 400);
		add(poster);
		
		la1.setBounds(50, 30, 600, 45);
		la1.setFont(new Font("���� ���",Font.BOLD,35));
		add(la1);
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(6,1,5,5)); // �Ȱ��� ����̸� �׸��� ���̾ƿ�
		for(int i=0;i<6;i++) {
			String[] str= {
					"����","�⿬","�帣","���","������","����"};
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("���� ���",Font.PLAIN,23)); // �ȿ� ���� ����ũ��
			p.add(la[i]);
		}
		p.setBounds(50, 90, 500, 290);
		add(p);
		
		ta.setEditable(false);
		JScrollPane js=new JScrollPane(ta);
		js.setBounds(50, 410, 600, 100);
		add(js);
		
		b1=new JButton("�����ϱ�");
		b1.setBackground(Color.red);
		b1.setBounds(800, 460, 110, 40);
		add(b1);

	}
	public void MusicaldatailPrint(int mno) {
		MusicalManager m=new MusicalManager();
		MusicalVO vo=m.MusicalDetailDate(mno);
		la1.setText(vo.getTitle()); // Ÿ��Ʋ���
		try{
			URL url=new URL(vo.getPoster()); // url �б�
			Image img=ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight());
			poster.setIcon(new ImageIcon(img)); 
			
		}catch (Exception ex) {
			
		}
		
		la[0].setText("�帣 / "+vo.getInfo());
		la[1].setText("�ð� / "+vo.getInfo());
		la[2].setText("��� / "+vo.getInfo());
		la[3].setText("��� / "+vo.getPlace());
		la[4].setText("�Ⱓ / "+vo.getPeriod());
		la[5].setText("�⿬ / "+vo.getActor());
		ta.setText(vo.getTime());
		
	}
}

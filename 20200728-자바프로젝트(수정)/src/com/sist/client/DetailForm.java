package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.net.*;
import com.sist.data.MovieManager;
import com.sist.data.MovieVO;
public class DetailForm extends JPanel {
	JLabel poster=new JLabel();
	JLabel la1=new JLabel();
	JLabel[] la=new JLabel[7];
	JTextPane ta=new JTextPane(); // JTextArea���� �̰� ����
	JButton b1,b2; // �����ϱ� , ���
	public DetailForm() {
		setLayout(null);
		poster.setBounds(10, 15, 350, 450);
		
		add(poster);
		
		la1.setBounds(365, 15, 500, 45);
		la1.setFont(new Font("���� ���",Font.BOLD,35));
		add(la1);
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(7,1,5,5)); // �Ȱ��� ����̸� �׸��� ���̾ƿ����� 
		for(int i=0;i<7;i++) {
			String[] str= {
					"����","�⿬","�帣","���","������","����","����"};
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("���� ���",Font.PLAIN,25)); // �ȿ� ���� ����ũ��
			p.add(la[i]);
		}
		p.setBounds(365, 80, 500, 290);
		add(p);
		
		ta.setEditable(false);
		JScrollPane js=new JScrollPane(ta);
		js.setBounds(10, 470, 855, 150);
		add(js);
		
		b1=new JButton("����");
		b2=new JButton("���");
		b1.setBackground(Color.pink);
		b2.setBackground(Color.green);
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.setBounds(365, 385, 200, 35);
		add(p2);
		
		// setSize(900, 670); // JFrame 

	}
	public void datailPrint(int mno) {
		MovieManager m=new MovieManager();
		MovieVO vo=m.movieDetailDate(mno);
		la1.setText(vo.getTitle()); // Ÿ��Ʋ���
		try{
			URL url=new URL(vo.getPoster()); // url �б�
			Image img=ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight());
			poster.setIcon(new ImageIcon(img));
			// la1 => �� ũ�⿡ �°� 
			
		}catch (Exception ex) {
			
		}
		
		la[0].setText("����:"+vo.getDirector());
		la[1].setText("�⿬:"+vo.getActor());
		la[2].setText("�帣:"+vo.getGenre());
		la[3].setText("���:"+vo.getGrade());
		la[4].setText("����:"+vo.getRegdate());
		la[5].setText("����:"+vo.getScore());
		la[6].setText("����:"+vo.getShowUser());
		ta.setText(vo.getStory());
		
	}
}

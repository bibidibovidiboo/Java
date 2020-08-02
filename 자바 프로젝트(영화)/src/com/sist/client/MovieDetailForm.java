// ��ȭ ��������
package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.net.*;
import com.sist.data.MovieManager;
import com.sist.data.MovieVO;
public class MovieDetailForm extends JPanel {
	JLabel poster=new JLabel();
	JLabel la1=new JLabel();
	JLabel[] la=new JLabel[7];
	JTextPane ta=new JTextPane(); 
	JButton b1;
	public MovieDetailForm() {
		setLayout(null);
		
		poster.setBounds(800, 40, 350, 400);
		add(poster);
		
		la1.setBounds(50, 30, 600, 45);
		la1.setFont(new Font("���� ���",Font.BOLD,35));
		add(la1);
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(7,1,5,5)); // �Ȱ��� ����̸� �׸��� ���̾ƿ�
		for(int i=0;i<7;i++) {
			String[] str= {
					"����","�⿬","�帣","���","������","����","����"};
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
	public void datailPrint(int mno) {
		MovieManager m=new MovieManager();
		MovieVO vo=m.movieDetailDate(mno);
		la1.setText(vo.getTitle()); // Ÿ��Ʋ���
		try{
			URL url=new URL(vo.getPoster()); // url �б�
			Image img=ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight());
			poster.setIcon(new ImageIcon(img)); 
			
		}catch (Exception ex) {
			
		}
		
		la[0].setText("���� / "+vo.getDirector());
		la[1].setText("�⿬ / "+vo.getActor());
		la[2].setText("�帣 / "+vo.getGenre());
		la[3].setText("��� / "+vo.getGrade());
		la[4].setText("���� / "+vo.getRegdate());
		la[5].setText("���� / "+vo.getScore());
		la[6].setText("���� / "+vo.getShowUser());
		ta.setText(vo.getStory());
		
	}
}

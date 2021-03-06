// 뮤지컬 상세페이지
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
	JButton b1;
	public MusicalDetailForm() {
		setLayout(null);
		
		poster.setBounds(100, 50, 400, 450);
		add(poster);
		
		la1.setBounds(560, 55, 550, 45);
		la1.setFont(new Font("맑은 고딕",Font.PLAIN,30));
		add(la1);
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(6,1,5,5)); // 똑같은 모양이라 그리드 레이아웃
		for(int i=0;i<6;i++) {
			String[] str= {
					"장소","출연","기간","관람등급","공연시간","주최"};
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("맑은 고딕",Font.PLAIN,20)); 
			p.add(la[i]);
		}
		p.setBounds(560, 125, 530, 290);
		add(p);

		b1=new JButton("예매하기");
		b1.setBackground(Color.red);
		b1.setBounds(560, 455, 100, 40);
		add(b1);

	}
	public void datailPrint(int mno) {
		MusicalManager m=new MusicalManager();
		MusicalVO vo=m.musicalDetailDate(mno);
		la1.setText(vo.getTitle()); // 타이틀출력
		try{
			URL url=new URL(vo.getPoster()); // url 읽기
			Image img=ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight());
			poster.setIcon(new ImageIcon(img)); 
			
		}catch (Exception ex) {
			
		}
		
		la[0].setText("장소 / "+vo.getPlace());
		la[1].setText("출연 / "+vo.getActor());
		la[2].setText("기간 / "+vo.getPeriod());
		la[3].setText("관람등급 / "+vo.getGrade());
		la[4].setText("공연시간 / "+vo.getTime());
		la[5].setText("주최 / "+vo.getHost());
		
	}
}

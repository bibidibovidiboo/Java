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
	JTextPane ta=new JTextPane(); // JTextArea보다 이게 좋음
	JButton b1,b2; // 예매하기 , 목록
	public DetailForm() {
		setLayout(null);
		poster.setBounds(10, 15, 350, 450);
		
		add(poster);
		
		la1.setBounds(365, 15, 500, 45);
		la1.setFont(new Font("맑은 고딕",Font.BOLD,35));
		add(la1);
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(7,1,5,5)); // 똑같은 모양이면 그리드 레이아웃으로 
		for(int i=0;i<7;i++) {
			String[] str= {
					"감독","출연","장르","등급","개봉일","평점","누적"};
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("맑은 고딕",Font.PLAIN,25)); // 안에 내용 글자크기
			p.add(la[i]);
		}
		p.setBounds(365, 80, 500, 290);
		add(p);
		
		ta.setEditable(false);
		JScrollPane js=new JScrollPane(ta);
		js.setBounds(10, 470, 855, 150);
		add(js);
		
		b1=new JButton("예매");
		b2=new JButton("목록");
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
		la1.setText(vo.getTitle()); // 타이틀출력
		try{
			URL url=new URL(vo.getPoster()); // url 읽기
			Image img=ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight());
			poster.setIcon(new ImageIcon(img));
			// la1 => 라벨 크기에 맞게 
			
		}catch (Exception ex) {
			
		}
		
		la[0].setText("감독:"+vo.getDirector());
		la[1].setText("출연:"+vo.getActor());
		la[2].setText("장르:"+vo.getGenre());
		la[3].setText("등급:"+vo.getGrade());
		la[4].setText("개봉:"+vo.getRegdate());
		la[5].setText("평점:"+vo.getScore());
		la[6].setText("누적:"+vo.getShowUser());
		ta.setText(vo.getStory());
		
	}
}

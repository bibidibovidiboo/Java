// 맛집 상세페이지
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
			la1.setFont(new Font("맑은 고딕",Font.BOLD,20));
			add(la1);
			JPanel p=new JPanel();
			p.setLayout(new GridLayout(7,1,5,5));
			String[] str= {"평점","주소","전화번호","종류","가격","주차","영업시간"};
			for(int i=0;i<7;i++)
			{
				la[i]=new JLabel(str[i]);
				la[i].setFont(new Font("맑은 고딕",Font.BOLD,15));
				p.add(la[i]);
			}
			p.setBounds(265, 70, 400, 300);
			add(p);
			
			b1=new JButton("예매");
			b2=new JButton("목록");
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
			
			la[0].setText("평점 : "+vo.getScore());
			la[1].setText("주소 : "+vo.getAddress());
			la[2].setText("전화번호 : "+vo.getTel());
			la[3].setText("종류 : "+vo.getType());
			la[4].setText("가격 : "+vo.getPrice());
			la[5].setText("주차 : "+vo.getParking());
			la[6].setText("영업시간 : "+vo.getTime());
		
		}
}
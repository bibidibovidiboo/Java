// 음악 상세페이지
package com.sist.client;
import com.sist.data.*;

import java.awt.*;
import java.net.URL;

import javax.swing.*;

import java.util.*;

public class MusicDetailForm extends JPanel {
	JLabel poster = new JLabel();
	JLabel la1 = new JLabel();
	JLabel[] la = new JLabel[7];
	
	JButton b1, b2;
	public MusicDetailForm()
	{
		setLayout(null);
		  poster.setBounds(10,30,230,230);

		  add(poster);
		  la1.setBounds(265,15,400,45);

		  la1.setFont(new Font("맑은 고딕", Font.BOLD,20));
		  
		  add(la1);
		  JPanel p=new JPanel();
		  p.setLayout(new GridLayout(7,1,5,5));
		  String [] str= {"아티스트","앨범종류","발매일","스타일","기획사","유통시간","재생시간",};
		  for(int i=0;i<7;i++)
		  {
			  la[i]=new JLabel(str[i]);
			  la[i].setFont(new Font("맑은 고딕", Font.BOLD,15));
			  p.add(la[i]);
			  
		  }
		  p.setBounds(265,70,400,300);
		  add(p);
	}
	 public void detailPrint(int mno)
	   {
		   MusicManager m=new MusicManager();
		   MusicVO vo=m.musicDetailData(mno);
		   la1.setText(vo.getTitle());
		   try
		   {
			   URL url=new URL(vo.getCover( ));
			   Image img=ClientMainFrame.getImage(new ImageIcon(url),
					   		poster.getWidth(), poster.getHeight());
			   poster.setIcon(new ImageIcon(img));
			   
		   }catch(Exception ex) {}
		   
		   la[0].setText("아티스트:"+vo.getArtist());
		   la[1].setText("앨범 종류:"+vo.getKinds());
		   la[2].setText("발매일:"+vo.getRelease());
		   la[3].setText("스타일:"+vo.getGenre());
		   la[4].setText("기획사:"+vo.getCompany());
		   la[5].setText("유통사:"+vo.getDistributor());
		   la[6].setText("재생시간:"+vo.getTime());
		 
	   }
}

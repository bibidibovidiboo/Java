// 도서 상세페이지
package com.sist.client;
import com.sist.data.*;
import java.awt.*;
import java.net.URL;

import javax.swing.*;


import com.sist.data.BookManager;
import com.sist.data.BookVO;

import java.util.*;
public class BookDetailForm extends JPanel{
	JLabel poster=new JLabel();
	JLabel la1=new JLabel(); // 책제목
	JLabel[] la=new JLabel[4]; // 책 정보-저자,출판사,가격,형태사항
	JButton b1,b2;
	public BookDetailForm()
	{
		setLayout(null);
		poster.setBounds(10, 30, 230, 300);
		
		add(poster);
		la1.setBounds(265, 15, 400, 45);
		
		la1.setFont(new Font("맑은 고딕",Font.BOLD,20));
		add(la1);
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(4,1,5,5));
		String[] str= {"저자","출판사","가격","형태사항"};
		for(int i=0;i<4;i++)
		{
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("맑은 고딕",Font.BOLD,15));
			p.add(la[i]);
		}
		p.setBounds(265, 70, 400, 300);
		add(p);		
		
		b1=new JButton("장바구니");
		b2=new JButton("바로구매");
		b1.setBackground(Color.red);
		b2.setBackground(Color.green);
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.setBounds(240, 400, 200, 35);
		add(p2);
	}
	public void detailPrint(int mno)
	{
		BookManager m=new BookManager();
		BookVO vo=m.bookDetailData(mno);
		la1.setText(vo.getTitle());
		try
		{
			URL url=new URL(vo.getPoster());
			Image img=ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight());
			poster.setIcon(new ImageIcon(img));
		}catch(Exception ex) {}
		
		la[0].setText("저자:"+vo.getAuthor());
		la[1].setText("출판사:"+vo.getPublish());
		la[2].setText("가격:"+vo.getCost());
		la[3].setText("형태사항:"+vo.getInfo());
		
	}

}

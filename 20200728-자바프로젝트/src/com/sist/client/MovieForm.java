// 푸드카테고리 뿌릴 곳 
package com.sist.client;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.sist.data.*;
public class MovieForm extends JPanel{
	JButton b1,b2;
	JPanel p=new JPanel();
	MovieCard[] mc=new MovieCard[10];
	ClientMainFrame c; 
	public MovieForm(ClientMainFrame c) {
		this.c=c;
		setLayout(new BorderLayout());
		b1=new JButton("◀");
		b2=new JButton("▶");

		p.setLayout(new GridLayout(2, 5, 5, 5));
		
		moviePrint(1);
		
		add("West",b1);
		add("Center",p);
		add("East",b2);
	}
	// 페이지 => ClientMainFrame에서 Movieprint로 호출
	public void moviePrint(int page) {
		MovieManager m=new MovieManager();
		ArrayList<MovieVO> list=m.movieListData(page); 
		int i=0;
		for(MovieVO vo:list) {
			mc[i]=new MovieCard(vo.getTitle(), vo.getPoster());
			p.add(mc[i]);
			mc[i].addMouseListener(c); // MouseListener
			i++;
		}
	}
}
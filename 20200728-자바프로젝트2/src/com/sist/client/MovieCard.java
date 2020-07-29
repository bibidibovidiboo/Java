package com.sist.client;

import javax.swing.JPanel;
import java.awt.*;
import java.net.*;
public class MovieCard extends JPanel{
	String title,poster;
	Image img;
	public MovieCard(String title,String poster)
	{
		this.title=title;
		this.poster=poster;
		try
		{
			img=Toolkit.getDefaultToolkit().getImage(new URL(poster));
		}catch(Exception ex) {}
		setToolTipText(title); //커서 말풍선
	}
	public void paint(Graphics g) //그림위에 글자 삽입
	{
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}

}
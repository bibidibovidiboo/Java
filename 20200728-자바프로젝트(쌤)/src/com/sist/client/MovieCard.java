package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.URL;
public class MovieCard extends JPanel {
	String title,poster;
	Image img;
	public MovieCard(String title,String poster) { // 제목 & 포스터
		this.title=title;
		this.poster=poster;
		try {
			img=Toolkit.getDefaultToolkit().getImage(new URL(poster));
		}catch(Exception e) {}
			setToolTipText(title); 
		}
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, getWidth(),getHeight(), this);
			
		}	
	
}

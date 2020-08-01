package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.URL;
public class MusicalCard extends JPanel {
	String title,poster;
	Image img;
	public MusicalCard(String title,String poster) { 
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
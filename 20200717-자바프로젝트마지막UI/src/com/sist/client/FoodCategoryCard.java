package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.URL;
public class FoodCategoryCard extends JPanel {
	String title,subject,poster;
	Image img;
	public FoodCategoryCard(String title,String subject,String poster) {
		this.title=title;
		this.subject=subject;
		this.poster=poster;
		try {
			img=Toolkit.getDefaultToolkit().getImage(new URL(poster));
		}catch(Exception e) {}
	
		}
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, getWidth(),getHeight(), this);
			g.setColor(Color.white);
			g.setFont(new Font("���� ����", Font.BOLD, 15));
			g.drawString(title, 50, 150);
			g.drawString(subject, 100, 190);
		
		}	
	
}

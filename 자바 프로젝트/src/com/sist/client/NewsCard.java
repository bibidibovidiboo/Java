package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import com.sist.data.NewsVO;
public class NewsCard extends JPanel{
    JLabel poster=new JLabel();
    JLabel title=new JLabel();
    JTextPane tp=new JTextPane();
    JLabel author=new JLabel();
    
    public NewsCard()
    {
    	setLayout(null);
    	poster.setBounds(0,0, 380, 160);
    	add(poster);
    	title.setBounds(320, 0, 900, 35);
    	add(title);
    	JScrollPane js=new JScrollPane(tp);
    	js.setBounds(320, 32, 800, 100);
    	add(js);
    	author.setBounds(320, 130, 900, 35);
    	add(author);
    }
    // 값을 채운다
    public void newsPrint(NewsVO vo){
    	try
    	{
    		URL url=new URL(vo.getPoster());
    		Image img=ClientMainFrame.getImage(new ImageIcon(url),300 , 150);
    		poster.setIcon(new ImageIcon(img));
    		title.setText(vo.getTitle());
    		tp.setText(vo.getContent());
    		author.setText(vo.getAuthor());
    	}catch(Exception ex) {}
    }
}

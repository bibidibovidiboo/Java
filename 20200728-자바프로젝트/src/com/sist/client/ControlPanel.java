package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class ControlPanel extends JPanel {
	CardLayout card=new CardLayout();
	ListForm lf=new ListForm();
	DetailForm df=new DetailForm();
	MovieForm ff;
	ClientMainFrame c;
	NewsForm nf=new NewsForm();
	public ControlPanel(ClientMainFrame c) {
		this.c=c;
		ff=new MovieForm(c);
		setLayout(card);
		add("FF",ff); // movieform
		add("DF",df); // detailform
		add("NF",nf); // newsform
		add("LF",lf);
		
	}
}

// ��Ʈ���г�
package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class ControlPanel extends JPanel {
	CardLayout card=new CardLayout();
	DetailForm df=new DetailForm(); // �󼼺���
	BookForm bf=new BookForm(); // ����
	FoodForm of=new FoodForm(); // ����
	MusicForm sf=new MusicForm(); // ����
	NewsForm nf=new NewsForm(); // ����
	MovieForm ff; // Ȩȭ��
	ClientMainFrame c; // ����

	public ControlPanel(ClientMainFrame c) {
		this.c=c;
		ff=new MovieForm(c);
		setLayout(card);
		
		add("FF",ff); // Ȩ
		add("DF",df); // ��
		add("BF",bf); // ����
		add("OF",of); // ����
		add("SF",sf); // ����	
		add("NF",nf); // ����
		
		
		
	}
}

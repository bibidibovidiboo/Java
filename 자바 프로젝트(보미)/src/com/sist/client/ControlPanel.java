// 컨트롤패널
package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class ControlPanel extends JPanel {
	CardLayout card=new CardLayout();
	MusicalDetailForm df=new MusicalDetailForm(); // 상세보기
	BookForm bf=new BookForm(); // 도서
	FoodForm of=new FoodForm(); // 맛집
	MusicForm sf=new MusicForm(); // 음악
	NewsForm nf=new NewsForm(); // 뉴스
	MusicalForm ff; // 홈화면
	ClientMainFrame c; // 메인

	public ControlPanel(ClientMainFrame c) {
		this.c=c;
		ff=new MusicalForm(c);
		setLayout(card);
		
		add("FF",ff); // 홈
		add("DF",df); // 상세
		add("BF",bf); // 도서
		add("OF",of); // 맛집
		add("SF",sf); // 음악	
		add("NF",nf); // 뉴스

	}
}

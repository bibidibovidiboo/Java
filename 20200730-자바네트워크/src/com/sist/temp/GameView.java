package com.sist.temp;
import java.awt.*;
import javax.swing.*;
public class GameView extends JPanel {
	Image img;
	// int x=850,y=500;
	HorseThread[] ht=new HorseThread[5];
	public GameView() {
		img=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\pika.gif");
		
			ht[0]=new HorseThread(850,690);
			ht[1]=new HorseThread(850,570);
			ht[2]=new HorseThread(850,450);
			ht[3]=new HorseThread(850,330);
			ht[4]=new HorseThread(850,210);
			
			for(int i=0;i<5;i++) {
				ht[i].start();
			}
		}
	
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, getWidth(), getHeight());
		for(int i=0;i<5;i++) {
			g.drawImage(img, ht[i].x,ht[i].y, 150, 100, this);
		}
	}
	
	// 멤버 클래스 ( & 익명의 클래스 ) ==> 내부클래스
	class HorseThread extends Thread{
		int x,y;
		public HorseThread(int x,int y) {
			this.x=x;
			this.y=y;
		}
		// 쓰레드 동작 메소드
		public void run()
		{
			while(true) {
				try {
					x-=5;
					if(x<-150) { 
						interrupt(); // 쓰레드 종료
					}
						
					int a=(int)(Math.random()*101);
					Thread.sleep(a);
				}catch (Exception ex) {}
			}
		}
	}
}

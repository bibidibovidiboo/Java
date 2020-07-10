// < 조건문 예제  >
// 나중에 더 배워서 게임 짤거라 아직은 잘 몰라도 됨 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GameMain extends JFrame implements KeyListener {
	GameView gv=new GameView(); 
	public GameMain()
	{
		// 생성자 ==>
		add("Center",gv);
		setSize(1024, 768);
		setVisible(true);
		
		addKeyListener(this);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameMain gm=new GameMain();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==this)
		{
			if(e.getKeyCode()==KeyEvent.VK_UP){
				gv.y-=5;
				if(gv.y<0)
					gv.y=768;
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN)
			{
				gv.y+=5;
				if(gv.y>768)
					gv.y=0;
			}
			if(e.getKeyCode()==KeyEvent.VK_LEFT)
			{
				gv.x-=5;
				if(gv.x<0)
					gv.x=1024;
			}
			if(e.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				gv.x+=5;
				if(gv.x>1024)
					gv.x=0;
			}
			if(e.getKeyCode()==KeyEvent.VK_ESCAPE)
			{
				System.exit(0);
			}
			gv.repaint();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
	
}

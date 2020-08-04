// 메인
package com.sist.client;
import javax.swing.*;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import com.sist.common.Function;
import java.awt.*; 
import java.awt.event.*;// interface
import java.io.*;
import java.net.*;
import java.util.*;
public class ClientMainFrame extends JFrame implements ActionListener,MouseListener,Runnable {
	JLabel title=new JLabel("JAVA PROJECT",JLabel.CENTER); 
	MenuForm mf=new MenuForm(); // 메뉴
	ChatForm cf=new ChatForm(); // 채팅
	Login login=new Login(); // 로그인
	ControlPanel cp; // 컨트롤패널
	
	int curpage=1; // 첫페이지
	int totalpage=9; // 마지막페이지
	
	// 네트워크
	Socket s; // 연결 기계 
	OutputStream out; // 서버로 요청값 전송
	BufferedReader in; // 서버로부터 값을 받아오는 클래스

	//  윈도우 창 띄우기
	public ClientMainFrame() {
		cp=new ControlPanel(this); // 현재 떠있는 창으로 이동
		// 타이틀
		title.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		title.setBounds(10, 7, 1400, 100);
		setLayout(null); 
		add(title);
		
		// 메뉴 
		mf.setBounds(18, 110, 110, 300);
		add(mf);
		
		// 채팅
		cf.setBounds(160, 650, 1200, 200);
		add(cf);
		
		// 출력화면
		cp.setBounds(160, 110, 1200, 550);
		add(cp);
		
		// 윈도우창
		setSize(1400,900);
		// setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);// X버튼 클릭시 종료X
		
		// 메뉴버튼 눌렀을 때 
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		mf.b4.addActionListener(this);
		mf.b5.addActionListener(this);
		mf.b6.addActionListener(this); // 종료
		
		cp.ff.b1.addActionListener(this); // 이전버튼
		cp.ff.b2.addActionListener(this); // 다음버튼
		
		// 로그인 처리 
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		// 채팅
		cf.tf.addActionListener(this);

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new ClientMainFrame();
	}
	
	// 이미지 크기 조절 
	public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
				
		// 카드 레이아웃
		if(e.getSource()==mf.b1) {
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2) {
			cp.card.show(cp, "BF");
		}
		else if(e.getSource()==mf.b3) {
			cp.card.show(cp, "OF");
		}
		else if(e.getSource()==mf.b4) {
			cp.card.show(cp, "SF");
		}
		else if(e.getSource()==mf.b5) {
			cp.card.show(cp, "NF");
		}
		
		// 홈 이전버튼
		else if(e.getSource()==cp.ff.b1) {
			
			if(curpage>1) {
				curpage--;
				cp.ff.p.removeAll(); // JPanel의 모든 기능을 삭제
				cp.ff.musicalPrint(curpage);
				cp.ff.repaint(); // paint 다시 호출
				cp.ff.p.validate(); // JPanel의 원래 기능을 재배치
			}		
		}
		
		// 홈 다음버튼
		else if(e.getSource()==cp.ff.b2) {
			if(curpage<totalpage) {
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.musicalPrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}
		// 로그인
		else if(e.getSource()==login.b1)
		{
			String id=login.tf1.getText();
			if(id.length()<1)// ID가 입력하지 않을 경우
			{
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, "대화명을 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected())
				sex="남자";
			else
				sex="여자";
			
			// 서버로 입력받은 데이터 전송 
			try
			{
				// 연결  => 서버에 대한 정보를 가지고 있다 
				s=new Socket("localhost",3355);
				// 송수신 위치 확인
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
				
				// 로그인 요청 (서버로 전송되는 부분)
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex){}
			    
			    //서버에서 전송하는 데이터를 읽어서 출력 
			    new Thread(this).start();
			    // run()의 위치 확인 ==> 자신의 클래스안에 존재 => (this)
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cf.tf)// 채팅 
		{
			String color=cf.box.getSelectedItem().toString();
			String msg=cf.tf.getText();
			if(msg.length()<1)
				return;
			// 데이터를 서버로 전송 
			try
			{
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex){}
			
			    cf.tf.setText("");
		}
		else if(e.getSource()==mf.b6)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(e.getSource()==cp.ff.mc[i]) {
				if(e.getClickCount()==2) { 
					int a=(i+1)+((curpage*10)-10);				
					cp.df.datailPrint(a);
					cp.card.show(cp,"DF"); 
					break;
				}
			}
		}		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 서버에서 들어오는 데이터를 받아서 처리 
		try
		{
			while(true)
			{
				String msg=in.readLine();
				System.out.println("server=>"+msg);
				StringTokenizer st=
						  new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				   case Function.MYLOG:
				   {
					   setTitle(st.nextToken());
					   login.setVisible(false);// 로그인창
					   setVisible(true);// 영화창 (Main) 
				   }
				   break;
				   case Function.LOGIN:
				   {
					   // 테이블에 출력 
					   String[] data= {
						  st.nextToken(), // id
						  st.nextToken(), // name
						  st.nextToken() // sex
					   };
					   cf.model.addRow(data);
				   }
				   break;
				   case Function.CHAT:
				   {
					     initStyle();
					     append(st.nextToken(),st.nextToken());
				   }
				   break;
				   case Function.EXIT:
				   {
					   String id=st.nextToken();
					   for(int i=0;i<cf.model.getRowCount();i++)
					   {
						   String mid=cf.model.getValueAt(i,0).toString();
						   if(id.equals(mid))
						   {
							   cf.model.removeRow(i);
							   break;
						   }
					   }
				   }
				   break;
				   case Function.MYEXIT:
				   {
					   dispose();// 윈도우 메모리 해제 
					   System.exit(0);// 프로그램 종료 
				   }
				   break;
				}
			}
		}catch(Exception ex) {}
	}
    public void initStyle()
    {
    	Style def=StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
    	Style red=cf.ta.addStyle("red", def);
    	StyleConstants.setForeground(red, Color.red);
    	
    	Style blue=cf.ta.addStyle("blue", def);
    	StyleConstants.setForeground(blue, Color.blue);
    	
    	Style green=cf.ta.addStyle("green", def);
    	StyleConstants.setForeground(green, Color.green);
    	
    	Style yellow=cf.ta.addStyle("yellow", def);
    	StyleConstants.setForeground(yellow, Color.yellow);
    	
    	Style gray=cf.ta.addStyle("gray", def);
    	StyleConstants.setForeground(gray, Color.gray);
    	
    	Style cyan=cf.ta.addStyle("cyan", def);
    	StyleConstants.setForeground(cyan, Color.cyan);
    }
    public void append(String msg,String color)
    {
    	try
    	{
    		Document doc=cf.ta.getDocument();
    		doc.insertString(doc.getLength(), msg+"\n", cf.ta.getStyle(color));
    	}catch(Exception ex) {}
    }
}
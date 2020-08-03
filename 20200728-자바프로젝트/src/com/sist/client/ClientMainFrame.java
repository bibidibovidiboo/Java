/*	< 채팅창 만들기  >
 * 	윈도우 => JFrame
 * 	윈도우와 관련된 클래스를 읽어온다
 * 	
 * 	/ 재사용
 * 	= 상속 (is-a) : 기존의 클래스를 변경해서 사용
 * 	public class ClientMainFrame extends JFrame
 * 				 ===============
 * 				 JFrame의 기능을 전체 가지고 온다
 * 	class A 
 * 	{
 * 		O X W
 * 	}
 * 	class B 
 * 	{
 * 		O X W
 * 	}
 * 	= 포함 (has-a) : 기존의 클래스를 변경없이 사용
 * 	public class ClientMainFrame {
 * 		JFrame f=new JFrame();
 * 	}
 *   
 *  ==============================================
 *  
 *  윈도우 크기 결정 => 생성자에서 사용
 * 	 클래스에서 생성자 사용 => 선언이 아니라 => 구현할 때
 * 	 예) 
 * 		데이터베이스 : 오라클연결
 * 		네트워크 : 셋팅 => IP,PORT => 핸드폰 (개통)
 * 		웹 : 쿠키에서 값 읽기 => 자동로그인
 * 
 */	
package com.sist.client;
import javax.swing.*;

import com.sist.common.Function;

import java.awt.*; // Color , Layout
import java.awt.event.*; // interface
import java.io.*;
import java.net.*;
import java.util.*;
/*
 * 	1. 사용자가 서버에 요청
 *  2. 서버에서 들어오는 응답을 받아서 출력 (쓰레드) => 자동화
 *  
 */
public class ClientMainFrame extends JFrame implements ActionListener,MouseListener,Runnable {
	JLabel title=new JLabel("영화 예매 & 추천 프로그램",JLabel.CENTER); // 가운데정렬
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	Login login=new Login();
	ControlPanel cp;
	// 멤버변수 => 프로그램 종료할 때 까지 안지워져서 여기서 선언
	int curpage=1; // 첫페이지
	int totalpage=16; // 마지막페이지
	// 네트워크 관련 프로그램
	Socket s; // 연결 기계
	OutputStream out; // 서버로 요청값 전송 => 로그인,채팅문자열,종료...
	BufferedReader in; // 서버로부터 값을 받아오는 클래스 ==> 쓰레드

	//  윈도우 창 띄우기
	public ClientMainFrame() {
		cp=new ControlPanel(this); // 현재떠있는 창으로 가려면 계속 this
		
		title.setFont(new Font("맑은 고딕", Font.BOLD, 45));
		// title.setOpaque(true); // 투명도
		// title.setBackground(Color.PINK); => 주석처리 한 이유 : 일단 칸 배열하려고 배경셋팅함
		title.setBounds(10, 15, 1570, 100);
		setLayout(null); // JFrame (BorderLayout) 사용자 정의로 배치 => null
		// 추가 => add()
		add(title);
		// 메뉴 배치
		mf.setBounds(10, 120, 100, 300);
		add(mf);
		// 채팅홈
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// 출력화면
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		
		setSize(1600,1000);
		// setVisible(true); 로그인창 띄우려고 주석처리 
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // x버튼 누르면 종료안되게
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b5.addActionListener(this); // mf = 메뉴
		
		// 이전다음버튼
		cp.ff.b1.addActionListener(this); // 이전
		cp.ff.b2.addActionListener(this); // 다음

		cp.df.b2.addActionListener(this); // 목록
		
		// 영화 찾기 
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.b6.addActionListener(this);
		cp.lf.tf.addActionListener(this);
		
		// 로그인 처리
		login.b1.addMouseListener(this);
		login.b2.addMouseListener(this);
		
		// 종료
		mf.b7.addActionListener(this);
		
		// 채팅
		cf.tf.addActionListener(this);

		/*
		for(int i=0;i<10;i++) {
			cp.ff.mc[i].addMouseListener(this);
			// mc => 영화하나 
		}
		*/
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new ClientMainFrame();
	}
	// 이미지 크기 조절 (공통 사용 메소드-static)
	public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// 홈버튼
		if(e.getSource()==mf.b1) {
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2) {
			cp.card.show(cp, "LF");
		}
		else if(e.getSource()==mf.b5) {
			cp.card.show(cp, "NF");
		}
		else if(e.getSource()==cp.df.b2) {
			cp.card.show(cp, "FF"); // 목록 누르면 내가 보던 페이지로 넘어감
		}
		
		// 이전버튼
		else if(e.getSource()==cp.ff.b1) {
			
			if(curpage>1) {
				curpage--;
				cp.ff.p.removeAll(); // JPanel의 모든 기능을 삭제
				cp.ff.moviePrint(curpage);
				cp.ff.repaint(); // paint 다시 호출
				cp.ff.p.validate(); // JPanel의 원래 기능을 재배치
			}
				
		}
		// 다음버튼
		else if(e.getSource()==cp.ff.b2) {
			if(curpage<totalpage) {
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}
		//  영화 찾기
		else if(e.getSource()==cp.lf.b1) {
			cp.lf.movieAllDate(1);
		}
		else if(e.getSource()==cp.lf.b2) {
			cp.lf.movieAllDate(2);
		}
		else if(e.getSource()==cp.lf.b3) {
			cp.lf.movieAllDate(3);
		}
		else if(e.getSource()==cp.lf.b4) {
			cp.lf.movieAllDate(4);
		}
		else if(e.getSource()==cp.lf.b5) {
			cp.lf.movieAllDate(5);
		}
		// 검색버튼 누르기 or 엔터쳤을 때 둘다 동작 ↓ => 처리하는 내용이 같을때 동시에 가능 
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf) {
			// 1. 입력된 값 읽기
			String ss=cp.lf.tf.getText(); // list폼안에 tf 값 가져와라
			if(ss.length()<1) {
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요"); // this => ClientMainFrame
				cp.lf.tf.requestFocus(); // 커서
				return; //  메소드 종료
				
			}
			cp.lf.movieFindDate(ss);
		}
		
		else if(e.getSource()==login.b1) {
			String id=login.tf1.getText();
			if(id.length()<1) { // id를 입력하지 않을 경우
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			String name=login.tf2.getText();
			if(name.length()<1) {
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
			try {
				// 연결
				s=new Socket("localhost",3355);
				// 송수신 위치 확인
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
				
				// 로그인 요청
				out.write((Function.LOGIN+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex) {}
			
			// 서버에서 전송하는 데이터를 읽어서 출력
			new Thread(this).start();
			// run()의 위치 확인 ==> 자신의 클래스 안에 존재 => (this)
			
		}
		else if(e.getSource()==login.b2) {
			System.exit(0);
		}
		else if(e.getSource()==cf.tf) { // 채팅
			String msg=cf.tf.getText();
			if(msg.length()<1) 
				return;
			// 데이터를 서버로 전송
				try {
					out.write((msg+"\n").getBytes());
				}catch (Exception ex) {}
					cf.tf.setText("");
				
			}
				else if(e.getSource()==mf.b7) {
					try {
						out.write((Function.EXIT+"|\n").getBytes());
					}catch (Exception ex) {}
				}
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(e.getSource()==cp.ff.mc[i]) {
				if(e.getClickCount()==2) { // 2 => 더블클릭
					int a=(i+1)+((curpage*10)-10);
					// JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.datailPrint(a);
					cp.card.show(cp,"DF"); // default로 바꿔라
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
		try {
			while(true) {
				String msg=in.readLine();
				System.out.println("server=>"+msg);
				StringTokenizer st=new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol) {
				case Function.MYLOG:
				{
					setTitle(st.nextToken());
					login.setVisible(false); // 로그인창
					setVisible(true); // 
				}
				break;
				case Function.LOGIN:
				{
					// 테이블에 출력
					String[] data= {
							st.nextToken(), // id
							st.nextToken(), // name
							st.nextToken(), // sex
							
					};
					cf.model.addRow(data);
				}
				break;
				case Function.CHAT:
				{
					cf.ta.append(st.nextToken()+"\n");
				}
				break;
				case Function.EXIT:
				{
					String id=st.nextToken();
					for(int i=0;i<cf.model.getRowCount();i++) {
						String mid=cf.model.getValueAt(i, 0).toString();
						if(id.equals(mid)) {
							cf.model.removeRow(i);
							break;
						}
					}
				}
				break;
				case Function.MYEXIT:
				{
					dispose(); // 윈도우 메모리 해제
					System.exit(0); // 프로그램종료
				}				
				break;
				}
			}
		}catch (Exception ex) {
		}
	}
	
}

package com.sist.net;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Client extends JFrame implements Runnable,ActionListener {
	JTextArea ta;
	JTextField tf;
	JButton b1,b2;
	// 네트워크 관련 라이브러리
	Socket s; // 연결기계(전화기)
	BufferedReader in;
	OutputStream out;
	
	public Client() {
		ta=new JTextArea();
		ta.setEditable(true);
		JScrollPane js=new JScrollPane(ta);
		tf=new JTextField(30);
		tf.setEditable(false);
		b1=new JButton("접속");
		b2=new JButton("종료");
		
		JPanel p=new JPanel();
		p.add(tf);p.add(b1);
		p.add(b2);
		
		add("Center",js);
		add("South",p);
		setSize(450,500);
		setVisible(true);
		
		b1.addActionListener(this); // 접속
		b2.addActionListener(this); // 종료
		tf.addActionListener(this); // 엔터 => 입력된 값을 서버로 전송
		
	}
	// 서버에서 들어오는 결과값을 받아서 출력
	public void run() {
		try {
			while(true) {
				String msg=in.readLine();
				ta.append(msg+"\n");
			}

		}catch (Exception ex) {
			// ex.getMessage();
		}
	}
	public static void main(String[] args) {
		/*try {
			Socket s=new Socket("211.238.142.203",7777);
		}catch (Exception ex) {
		}
		*/
		new Client();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			try {
				s=new Socket("211.238.142.204",5454);
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				// 서버에서 값을 읽어온다
				out=s.getOutputStream();
				// 서버로 값을 보낼 때 사용
				tf.setEditable(true);
				b1.setEnabled(false);
			}catch (Exception ex) {}
			    new Thread(this).start();
			}
			else if(e.getSource()==tf) {
				try {
					String msg=tf.getText();
					if(msg.length()<1) return;
					out.write((msg+"\n").getBytes());
					tf.setText("");
				}catch (Exception ex) {}				
		}
	}
}

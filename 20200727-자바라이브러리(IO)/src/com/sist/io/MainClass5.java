package com.sist.io;
import java.util.*;
import java.io.*;
// 파일 업로드 (파일 Copy)
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass5 extends JFrame implements ActionListener {
	JTextField tf=new JTextField(25); // ( ) => 크기 
	JButton b=new JButton("파일선택");
	public MainClass5() {
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b);
		add("Center",p);
		setSize(450,250);
		setVisible(true);
		b.addActionListener(this); // this : 본인클래스 안에 있다 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass5();
	}
	
	// 버튼 클릭 시 기능
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) // b버튼을 클릭했다면
		{	
			// 열었을 때 선택한 파일을 불러온다
			JFileChooser jc=new JFileChooser(); // 파일 찾기 
			if(jc.showOpenDialog(this)==jc.APPROVE_OPTION) {
				tf.setText(jc.getSelectedFile().getPath());
				try {
					// 여기서부터 웹에 나와서 기억 ★ p.880
					FileInputStream fis=new FileInputStream(tf.getText());
					FileOutputStream fos=new FileOutputStream("c:\\upload\\"+jc.getSelectedFile().getName());
					// jc.getSelectedFile().getName() => 파일명 선택해서 upload에 카피됨
					
					int i=0;
					byte[] buffer=new byte[1024]; // [1024] byte
					while((i=fis.read(buffer ,0, 1024))!=-1) {
						fos.write(buffer, 0, i); // i=> 읽은 바이트수
					}
					fis.close();
					fos.close();
					JOptionPane.showMessageDialog(this, "파일 업로드 완료"); // 여기까지
				}catch (Exception ex) {
					
				}
			}
		}
	}

}
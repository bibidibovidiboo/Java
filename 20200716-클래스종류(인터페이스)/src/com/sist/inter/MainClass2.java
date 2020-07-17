/*	<  자바에서 지원한 인터페이스  >
 *  1. Window (javax.swing)
 *  	ActionListener :버튼,메뉴,text에서 엔터
 *  		= actionPerfoemed()
 *		MouseListener : 마우스 관련, JTable , JLable
 *			= mouseClicked()
 *			= mouseReleased()
 *			= mousePressed()
 *			= mouseEntered()
 *			= mouseExited() 
 *		MouseMotionListener 
 *			= mouseMoved()
 *			= mouseDragged()
 *		KeyLinstener : 키보드
 *			= keyPressed()
 *			= keyRealeased()
 *			= keyTyped()
 *		FocusListener
 *			= focusLost()
 *			= focusGained()
 *		ItemListener			
 *			= ComboBox , JList
 *			= itemStateChanged()
 *  2. 데이터베이스 연결
 *  	Connection
 *  	Statement
 *  	ResultSet
 *  
 */
package com.sist.inter;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class MainClass2 extends JFrame implements ActionListener,MouseListener,ItemListener{
	JButton b1;
	JTextField tf;
	JLabel la;
	JComboBox box;
	//  초기화 => 메모리에 저장 (생성자)
	public MainClass2() {
		b1=new JButton("클릭");
		tf=new JTextField();
		la=new JLabel(new ImageIcon("c:\\javaDev\\dino.jpg"));
		box=new JComboBox();
		box.addItem("홍길동");
		box.addItem("심봉사");
		box.addItem("춘향이");
		
		add("West",b1);
		add("Center",la);
		add("South",tf);
		add("North",box);
		// East , West
		
		// 화면 크기 
		setSize(450, 500);
		setVisible(true);
		
		// 이벤트 등록
		// b1이라는 버튼을 클릭하면 => actionPerformed() 호출
		b1.addActionListener(this); // this => 자신 (MainClass2)
		tf.addActionListener(this); // actionPerformed()
		la.addMouseListener(this);
	}
	public static void main(String[] args) {
		new MainClass2();
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la) {
			if(e.getClickCount()==2) {
				JOptionPane.showMessageDialog(this, "상세보기로 이동");
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			JOptionPane.showMessageDialog(this, "버튼 클릭!!"); 
			// 여기에 this 대신 null 쓰면 아무데나뜸 => this = 내 윈도우에 띄워줘
		}
		else if(e.getSource()==tf) // 엔터 쳤을 때 이벤트
		{
			String msg=tf.getText();
			JOptionPane.showMessageDialog(this, msg);
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box) {
			String name=(String)box.getSelectedItem();
			// (String) 형변환
			JOptionPane.showMessageDialog(this, name);
		}
	}
}









package com.sist.front;
import java.awt.*;
import javax.swing.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.*;
import java.text.*; // 날짜변환 => SimpleDateFormat
import com.sist.back.*;
public class BoardMainFrame extends JFrame implements ActionListener {
	
	BoardListPanel bp=new BoardListPanel();
	BoardInsertPanel bi=new BoardInsertPanel();
	JTabbedPane tp=new JTabbedPane(); // CardLayout 말고 탭이용 ★
	// 프로그램 연결 => ArrayList => BoarderManager
	BoardManager bm=new BoardManager();
	public BoardMainFrame() {
		// 탭만들기 
		tp.addTab("게시판목록", bp); // 탭 누르면 이동
		tp.addTab("글쓰기", bi); // 누르면 이동
		tp.setTabPlacement(tp.BOTTOM); // 탭을 아래로 이동
		// tp.setSelectedIndex(1); // 글쓰기가 먼저 뜨게 하려고 
		add("Center",tp);
		setSize(640,480);
		setVisible(true);
		
		bp.b.addActionListener(this); // 새글
		bi.b1.addActionListener(this); // 글쓰기
		bi.b2.addActionListener(this); // 취소
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoardMainFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bp.b) {
			// 글쓰기 화면 이동
			tp.setSelectedIndex(1);
		}
		else if(e.getSource()==bi.b1) {
			// ArrayList에 저장
			// 입력한 데이터를 읽기
			String name=bi.tf1.getText();
			String subject=bi.tf2.getText();
			String content=bi.ta.getName();
			String pwd=String.valueOf(bi.pf.getPassword());
			// password는 char[]로 되어있다 => 이부분 ★★
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			bm.insert(vo); // ArrayList에 추가
			// 목록추가 => 메소드
			listPrint();
			// 목록이동
			tp.setSelectedIndex(0);
			
		}
		else if(e.getSource()==bi.b2) { // 취소
			// 목록으로 이동
			tp.setSelectedIndex(0);
		}
		
	}
	public void listPrint() {
		// ArrayList받기
		ArrayList<BoardVO> list=bm.select();
		// 테이블에 출력
		// 테이블 지우기
		// () 출력할 갯수 ↓
		for(int i=bp.model.getRowCount()-1;i>=0;i--) {
			bp.model.removeRow(i);
		}
		// 맨마지막부터 0번이 될 때 까지 지워라 
		
		// 출력
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); // 날짜형식 ★
		// MM (월) mm (분)
		for(BoardVO vo:list) {
			String[] data= {
					String.valueOf(vo.getNo()), // 정수가 안들어가서 앞에 스트링 붙여서 형변환
					vo.getSubject(),
					vo.getName(),
					sdf.format(vo.getRegdate()), // 날짜변환 => 맨위 import
					String.valueOf(vo.getHit())
			};
			bp.model.addRow(data);
		}
	}

}
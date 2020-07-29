package com.sist.client;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.*;
import com.sist.data.*;
import com.sun.prism.Image;

import javax.swing.*;
import javax.swing.table.*;
import java.net.*;
public class ListForm extends JPanel implements MouseListener {
	JButton b1,b2,b3,b4,b5,b6;
	JTextField tf;
	JTable table;
	DefaultTableModel model;
	MovieDetailForm mdf=new MovieDetailForm();
	/*
	 * 기능 => 메소드 => 리턴형, 매개변수 
	 */
	public ListForm()
	{
		setLayout(null); //사용안하면 패널대로 일자로 배치됨(FlowLayout) => 테이블이 버튼 옆에 붙어서 출력됨
		b1=new JButton("현재상영영화");
		b2=new JButton("개봉예정영화");
		b3=new JButton("주간박스오피스");
		b4=new JButton("월간박스오피스");
		b5=new JButton("연간박스오피스");
		b6=new JButton("검색");
		tf=new JTextField(20);
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(tf);
		p.add(b6); //버튼 순서대로 
		p.setBounds(10, 25, 900, 35);
		add(p);
		String[] col= {"번호","제목","감독","장르","등급"};
		Object[][] row=new Object[0][5];
		
		//DefaultTableModel=> 오버라이딩할 메소드가 있다(익명의 클래스=>내부클래스)
		/*
		 * 내부 클래스 => 쓰레드, 네트워크
		 * =======
		 * class A
		 * {
		 * 		O P C V B
		 * 		class B => A클래스의 멤버클래스
		 * 		{
		 * 		}
		 * }
		 */
		model=new DefaultTableModel(row,col) {
			//편집방지
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			//이미지첨부
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0,columnIndex).getClass();
			}
			
		};
		
		table=new JTable(model);
		table.setRowHeight(50);
		JScrollPane js=new JScrollPane(table);
		
		js.setBounds(10, 70, 700, 550);
		add(js);
		
		
		mdf.setBounds(715, 70, 800, 650);
		add(mdf);
		movieAllData(1);
		mdf.detailPrint(1);
		
		table.addMouseListener(this);
	}
	public void movieAllData(int cno)
	{
		//데이터 가져오기
		MovieManager m=new MovieManager();
		ArrayList<MovieVO> list=m.movieAllData(cno);
		
		//테이블 한번 지우기
		//마지막부터 지운다
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		//데이터 출력
		/*
		 * java.io / java.net =>CheckException => 반드시 예외처리
		 */
		for(MovieVO vo:list)
		{
			try 
			{
				URL url=new URL(vo.getPoster());
				java.awt.Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
				Object[] data= {
					vo.getMno(),new ImageIcon(img),vo.getTitle(),vo.getDirector(),vo.getGenre(),vo.getGrade()
				};
				model.addRow(data);
			}catch(Exception ex) {}
		}
		
		
		
	}
	public void movieFindData(String ss)
	{
		//데이터 가져오기
		MovieManager m=new MovieManager();
		ArrayList<MovieVO> list=m.movieFindData(ss);
		
		//테이블 한번 지우기
		//마지막부터 지운다
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		//데이터 출력
		/*
		 * java.io / java.net =>CheckException => 반드시 예외처리
		 */
		for(MovieVO vo:list)
		{
			try 
			{
				URL url=new URL(vo.getPoster());
				java.awt.Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
				Object[] data= {
					vo.getMno(),new ImageIcon(img),vo.getTitle(),vo.getDirector(),vo.getGenre(),vo.getGrade()
				};
				model.addRow(data);
			}catch(Exception ex) {}
		}
		
		
		
	}
	//클릭시 상세보기 화면 출력하게
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row=table.getSelectedRow();//몇번째 줄 선택했는지 확인
				String mno=model.getValueAt(row, 0).toString();
				mdf.detailPrint(Integer.parseInt(mno));
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
	
}
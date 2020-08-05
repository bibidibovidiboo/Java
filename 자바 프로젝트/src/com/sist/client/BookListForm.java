// 도서 
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
public class BookListForm extends JPanel implements MouseListener {
	JButton b1,b2,b3,b4;
	JTextField tf;
	JTable table;
	DefaultTableModel model;
	BookDetailForm mdf=new BookDetailForm();
	
	public BookListForm()
	{
		setLayout(null); 
		b1=new JButton("베스트셀러");
		b2=new JButton("신간베스트");
		b3=new JButton("스테디셀러");
		b4=new JButton("검색");
		tf=new JTextField(20);
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(tf);
		p.add(b4); //버튼 순서대로 
		p.setBounds(20, 25, 1000, 35);
		add(p);
		String[] col= {"번호","표지","책제목","저자","출판사"};
		Object[][] row=new Object[0][5];

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
		
		js.setBounds(10, 70, 500, 480);
		add(js);
		
		
		mdf.setBounds(515, 70, 650, 450);
		add(mdf);
		bookAllData(1);
		mdf.detailPrint(1);
		
		table.addMouseListener(this);
	}
	public void bookAllData(int tno)
	{
		//데이터 가져오기
		BookManager m=new BookManager();
		ArrayList<BookVO> list=m.bookAllData(tno);
		
		//테이블 한번 지우기
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		for(BookVO vo:list)
		{
			try 
			{
				URL url=new URL(vo.getPoster());
				java.awt.Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
				Object[] data= {
					vo.getMno(),new ImageIcon(img),vo.getTitle(),vo.getAuthor(),vo.getPublish()};
				model.addRow(data);
			}catch(Exception ex) {}
		}
	
	}
	public void BookFindData(String ss)
	{
		//데이터 가져오기
		BookManager m=new BookManager();
		ArrayList<BookVO> list=m.bookFindData(ss);
		
		//테이블 한번 지우기
		//마지막부터 지운다
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		for(BookVO vo:list)
		{
			try 
			{
				URL url=new URL(vo.getPoster());
				java.awt.Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
				Object[] data= {
					vo.getMno(),new ImageIcon(img),vo.getTitle(),vo.getAuthor(),vo.getPublish()};
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
				int row=table.getSelectedRow(); // 몇번째 줄 선택했는지 확인
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
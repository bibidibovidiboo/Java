// 맛집
package com.sist.client;
import com.sist.data.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.table.*;
import java.net.*; //url가져오기
public class MangoListForm extends JPanel implements MouseListener{
	JButton b1,b2,b3,b4,b5;
	JTextField tf;
	JTable table;
	DefaultTableModel model;
	MangoDetailForm mdf=new MangoDetailForm();
	
	public MangoListForm()
	{
		setLayout(null); //FlowLayout (일자배치) => null : 사용자정의로 배치
		b1=new JButton("서울");
		b2=new JButton("인천");
		b3=new JButton("강원");
		b4=new JButton("부산");
		b5=new JButton("검색");
		tf=new JTextField(20);
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(tf);
		p.add(b5);
		 // add순서대로 코딩
		p.setBounds(50, 25, 1000, 35);
		add(p);
		String[] col= {"번호","","상호명","평점","종류","가격"};
		Object[][] row=new Object[0][6]; //데이터형이 여러개(string,사진)
		

		model=new DefaultTableModel(row,col) {
			@Override
			public boolean isCellEditable(int row, int column) {   // 편집 방지
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Class<?> getColumnClass(int columnIndex) {     // 이미지 첨부
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
		};
		
		
		table=new JTable(model);
		table.setRowHeight(50);
		JScrollPane js=new JScrollPane(table);
		
		js.setBounds(10, 70, 500, 480);
		add(js);
		
		
		mdf.setBounds(515, 70, 650, 450);
		add(mdf);
		mangoAllData(1);
		mdf.detailPrint(1);
		
		table.addMouseListener(this);
	
	}

	public void mangoAllData(int cno) 
	{
		// 데이터 가지고 오기
		MangoManager m=new MangoManager();
		ArrayList<MangoVO> list=m.mangoAllData(cno);
		
		// 테이블 한 번 지우기
		// 마지막부터 지운다
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}

		for(MangoVO vo:list)
		{
			try
			{	
				URL url =new URL(vo.getPoster()); //http: => url  , c:\\image => 경로명 바로 입력
				Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
				Object[] data= {
						vo.getFno(),
						new ImageIcon(img),
						vo.getTitle(),
						vo.getScore(),
						vo.getType(),
						vo.getPrice()
				};
				model.addRow(data);
			}catch(Exception ex) {}
		}
		
	}

	public void mangoFindData(String ss)
	{
		// 데이터 가지고 오기
		MangoManager m=new MangoManager();
		ArrayList<MangoVO> list=m.mangoFindData(ss);
		
		// 테이블 한 번 지우기 -> 마지막부터 지운다
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}

		for(MangoVO vo:list)
		{
			try
			{	
				URL url =new URL(vo.getPoster()); 
				Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
				Object[] data= {
						vo.getFno(),
						new ImageIcon(img),
						vo.getTitle(),
						vo.getScore(),
						vo.getType(),
						vo.getPrice()					
				};
				model.addRow(data);
			}catch(Exception ex) {}
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row=table.getSelectedRow();
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
package com.sist.inter;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
public class MainClass5 extends JFrame{
	JTable table; // 모양
	DefaultTableModel model; // 테이블 안에 있는 데이터 제어 => MV
	public MainClass5() {
		String[] col= {"이름","성별","주소"};
		Object[][] row=new Object[0][4]; // 3은 위에 3개라
		
		model=new DefaultTableModel(row, col) {
			// 원래는 표가 편집 가능한데 편집 없이 클릭 되게 바꿔줌 
			@Override 
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		// 상속 없이 재정의 

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
		};
		
		// table에 첨부
		table=new JTable(model);
		table.setRowHeight(100);
		JScrollPane js=new JScrollPane(table);
		
		// 윈도우에 추가
		add("Center",js);
		setSize(350,450);
		
		// 데이터 추가
		Object [] data= {new ImageIcon("c:\\javaDev\\a.png"),"홍길동","남자","서울"};
		model.addRow(data); // 한줄씩 생성
		model.addRow(data);
		model.addRow(data);
		setVisible(true);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass5();
	}

}

package com.sist.front;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
public class BoardListPanel extends JPanel{
     JButton b;
     JTable table; // 모양관리 ==> View 
     DefaultTableModel model; // 데이터관리 => 수정,추가,출력  => Model
     TableColumn column; // 표 윗부분 고정하려고 컬럼 만듬
     public BoardListPanel()
     {
    	 b=new JButton("새글");
    	 String[] col={"번호","제목","이름","작성일","조회수"};
    	 String[][] row=new String[0][5];
    	 // 상속이 없이 재정의가 가능한 클래스 ==> 익명의 클래스
    	 model=new DefaultTableModel(row,col) {
    		 public boolean isCellEditable(int r,int c)
    		 {
    			 return false;
    		 }
    	 };
    	 
    	 table=new JTable(model);
    	 table.getTableHeader().setBackground(Color.orange);
    	 //table.setShowVerticalLines(false);  // 표의 가로줄 없애기
    	 table.setShowGrid(false); // 표 테두리 아예 없애고
    	 table.setRowHeight(35); // 표 두께
    	 table.setSelectionForeground(Color.white); // 눌렀을 때 글씨색
    	 // table.setSelectionBackground(Color.orange); // 눌렀을 때 배경화면색
    	 table.getTableHeader().setReorderingAllowed(false); // 표의 윗부분 이동 안되게 고정
    	 JScrollPane js=new JScrollPane(table);
    	 js.getViewport().setBackground(Color.white);
    	 
    	 //배치 
    	 setLayout(null);
    	 b.setBounds(10, 15, 100, 30);
    	 js.setBounds(10, 50, 600, 380);
    	 
    	 add(b);
    	 add(js);
    	 
    	 for(int i=0;i<5;i++)
    	 {
    		 column=table.getColumnModel().getColumn(i);
    		 DefaultTableCellRenderer render=new DefaultTableCellRenderer();
    		 if(i==0)
    		 {
    			 column.setPreferredWidth(30);
    			 render.setHorizontalAlignment(JLabel.CENTER); // 가운데 배치
    		 }
    		 else if(i==1)
    		 {
    			 column.setPreferredWidth(400);
    			 render.setHorizontalAlignment(JLabel.LEFT);
    		 }
    		 else if(i==2)
    		 {
    			 column.setPreferredWidth(60);
    			 render.setHorizontalAlignment(JLabel.CENTER);
    		 }
    		 else if(i==3)
    		 {
    			 column.setPreferredWidth(80);
    			 render.setHorizontalAlignment(JLabel.CENTER);
    		 }
    		 else if(i==4)
    		 {
    			 column.setPreferredWidth(40);
    			 render.setHorizontalAlignment(JLabel.CENTER);
    		 }
    		 column.setCellRenderer(render);
    	 }
    	 
			/* 출력
			 * String[] data={"1","ArrayList 연습중입니다","홍길동","2020-07-24","0"};
			 * model.addRow(data);
			 */
     }
}
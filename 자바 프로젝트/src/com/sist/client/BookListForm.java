// ���� 
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
		b1=new JButton("����Ʈ����");
		b2=new JButton("�Ű�����Ʈ");
		b3=new JButton("���׵𼿷�");
		b4=new JButton("�˻�");
		tf=new JTextField(20);
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(tf);
		p.add(b4); //��ư ������� 
		p.setBounds(20, 25, 1000, 35);
		add(p);
		String[] col= {"��ȣ","ǥ��","å����","����","���ǻ�"};
		Object[][] row=new Object[0][5];

		model=new DefaultTableModel(row,col) {
			//��������
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			//�̹���÷��
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
		//������ ��������
		BookManager m=new BookManager();
		ArrayList<BookVO> list=m.bookAllData(tno);
		
		//���̺� �ѹ� �����
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
		//������ ��������
		BookManager m=new BookManager();
		ArrayList<BookVO> list=m.bookFindData(ss);
		
		//���̺� �ѹ� �����
		//���������� �����
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
	//Ŭ���� �󼼺��� ȭ�� ����ϰ�
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row=table.getSelectedRow(); // ���° �� �����ߴ��� Ȯ��
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
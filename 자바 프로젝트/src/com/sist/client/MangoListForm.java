// ����
package com.sist.client;
import com.sist.data.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.table.*;
import java.net.*; //url��������
public class MangoListForm extends JPanel implements MouseListener{
	JButton b1,b2,b3,b4,b5;
	JTextField tf;
	JTable table;
	DefaultTableModel model;
	MangoDetailForm mdf=new MangoDetailForm();
	
	public MangoListForm()
	{
		setLayout(null); //FlowLayout (���ڹ�ġ) => null : ��������Ƿ� ��ġ
		b1=new JButton("����");
		b2=new JButton("��õ");
		b3=new JButton("����");
		b4=new JButton("�λ�");
		b5=new JButton("�˻�");
		tf=new JTextField(20);
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(tf);
		p.add(b5);
		 // add������� �ڵ�
		p.setBounds(50, 25, 1000, 35);
		add(p);
		String[] col= {"��ȣ","","��ȣ��","����","����","����"};
		Object[][] row=new Object[0][6]; //���������� ������(string,����)
		

		model=new DefaultTableModel(row,col) {
			@Override
			public boolean isCellEditable(int row, int column) {   // ���� ����
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Class<?> getColumnClass(int columnIndex) {     // �̹��� ÷��
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
		// ������ ������ ����
		MangoManager m=new MangoManager();
		ArrayList<MangoVO> list=m.mangoAllData(cno);
		
		// ���̺� �� �� �����
		// ���������� �����
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}

		for(MangoVO vo:list)
		{
			try
			{	
				URL url =new URL(vo.getPoster()); //http: => url  , c:\\image => ��θ� �ٷ� �Է�
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
		// ������ ������ ����
		MangoManager m=new MangoManager();
		ArrayList<MangoVO> list=m.mangoFindData(ss);
		
		// ���̺� �� �� ����� -> ���������� �����
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
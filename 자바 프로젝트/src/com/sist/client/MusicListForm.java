// ����
package com.sist.client;
import com.sist.data.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.table.*;
import java.net.*;
public class MusicListForm extends JPanel implements MouseListener {
	JButton b1, b2, b3, b4 ;
	JTextField tf;
	JTable table;
	DefaultTableModel model;
	MusicDetailForm mdf=new MusicDetailForm();
	
	public MusicListForm() {
		setLayout(null);// FlowLayout -> null ����� ���� ��ġ
		b1 = new JButton("�ǽð�");
		b2 = new JButton("�ϰ�");
		b3 = new JButton("�ְ�");
		b4 = new JButton("�˻�");
		tf = new JTextField(20);
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(tf);
		p.add(b4);
		
		p.setBounds(60, 25, 1000, 35);
		add(p);
		String[] col = { "����", " ", "��", "��Ƽ��Ʈ", "�ٹ����� ", "����ð�","�帣" };
		Object[][] row = new Object[0][7];

		model = new DefaultTableModel(row, col) {
			// ������ �Ұ���
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			// �̹��� ÷��
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}

		};

		table = new JTable(model);
		table.setRowHeight(50);
		JScrollPane js = new JScrollPane(table);
		musicAllData(1);
		js.setBounds(10, 70, 500, 480);
		add(js);

		mdf.setBounds(515,70,650,450);
		add(mdf);
		musicAllData(1);
		mdf.detailPrint(1);
		
		table.addMouseListener(this);
	}

	public void musicAllData(int cno) {
		// ������ ������ ����
		MusicManager m = new MusicManager();

		ArrayList<MusicVO> list = m.MusicAllData(cno);

		// ���̺� �ѹ� �����
		// ������ ���� �����
		for (int i = model.getRowCount() - 1; i >=0; i--) {
			model.removeRow(i);

		}
		// ������ ���

		for (MusicVO vo : list) {
			try {
				URL url = new URL(vo.getCover()); // http: , c:\\image
				//System.out.println(vo.getCover());
				Image img = ClientMainFrame.getImage(new ImageIcon(url), 50, 50);

				Object[] data = { vo.getMno(),
						new ImageIcon(img), 
						//vo.getCover(), 
						vo.getTitle(), 
						vo.getArtist(),
						vo.getKinds(), 
						vo.getTime(), 
						vo.getGenre()};
				model.addRow(data);
			} catch (Exception ex) {
			}

		}
	}

	public void musicFindData(String ss)
		{
			//������ ������ ����
		MusicManager m=new MusicManager();
			
			ArrayList<MusicVO> list=m.musicFindData(ss);
			
			//���̺� �ѹ� �����
			//������ ���� �����
			for(int i=model.getRowCount()-1;i>=0;i--)
			{
				model.removeRow(i);
				
			}
			// ������ ���
			for(MusicVO vo:list)
			{
				try 
				{
					URL url=new URL(vo.getCover()); //http: , c:\\image
					Image img=ClientMainFrame.getImage(new ImageIcon(url),
							50,50);
				
				Object[] data= {
						vo.getMno(),//����
						new ImageIcon(img), //�ٹ�����
						vo.getTitle(),
						vo.getArtist(),//��Ƽ��Ʈ,����
						vo.getKinds(),// �ٹ�����,ost,�̱�
						vo.getTime(),
						vo.getGenre()
	
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
				String mno=model.getValueAt(row, 0). toString();
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
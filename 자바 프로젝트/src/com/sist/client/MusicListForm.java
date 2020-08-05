// 음악
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
		setLayout(null);// FlowLayout -> null 사용자 정의 배치
		b1 = new JButton("실시간");
		b2 = new JButton("일간");
		b3 = new JButton("주간");
		b4 = new JButton("검색");
		tf = new JTextField(20);
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(tf);
		p.add(b4);
		
		p.setBounds(60, 25, 1000, 35);
		add(p);
		String[] col = { "순위", " ", "곡", "아티스트", "앨범종류 ", "재생시간","장르" };
		Object[][] row = new Object[0][7];

		model = new DefaultTableModel(row, col) {
			// 편집이 불가능
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			// 이미지 첨부
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
		// 데이터 가지고 오기
		MusicManager m = new MusicManager();

		ArrayList<MusicVO> list = m.MusicAllData(cno);

		// 테이블 한번 지우기
		// 마지막 부터 지운다
		for (int i = model.getRowCount() - 1; i >=0; i--) {
			model.removeRow(i);

		}
		// 데이터 출력

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
			//데이터 가지고 오기
		MusicManager m=new MusicManager();
			
			ArrayList<MusicVO> list=m.musicFindData(ss);
			
			//테이블 한번 지우기
			//마지막 부터 지운다
			for(int i=model.getRowCount()-1;i>=0;i--)
			{
				model.removeRow(i);
				
			}
			// 데이터 출력
			for(MusicVO vo:list)
			{
				try 
				{
					URL url=new URL(vo.getCover()); //http: , c:\\image
					Image img=ClientMainFrame.getImage(new ImageIcon(url),
							50,50);
				
				Object[] data= {
						vo.getMno(),//순위
						new ImageIcon(img), //앨범사진
						vo.getTitle(),
						vo.getArtist(),//아티스트,가수
						vo.getKinds(),// 앨범종류,ost,싱글
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
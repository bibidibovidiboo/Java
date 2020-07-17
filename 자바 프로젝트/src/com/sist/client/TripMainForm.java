// ���� ����������
package com.sist.client;
import javax.swing.*; // ������ ���� Ŭ����
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.sist.client2.SearchForm;

import java.awt.*; // ���̾ƿ� (ȭ�� ��ġ)
import java.awt.event.*; // ��ư , �ؽ�Ʈ�� ���� => ���� (�̺�Ʈ)
import java.net.URL;
public class TripMainForm extends JFrame implements ActionListener,MouseListener{
	// menu
	SearchForm sb=new SearchForm();
	TripMenu ml=new TripMenu();
	CardLayout card=new CardLayout(); // ���̾ƿ� ȭ�� �ٲ�
	
	// ������ �ʱ�ȭ
	int curpage=1;
	int totalpage=2;
	
	TripMainForm(){
		// �˻�â (SearchBar)
		sb.setBounds(10, 10, 1465, 50);
		add(sb);
		
		// ���̾ƿ� ����
		setLayout(card);
		add("ML",ml); // ����Ʈ ���� ���

		// ������ ũ�� ����
		setSize(1200, 900);
		setVisible(true);
		
		// ����-���� ��ư
		ml.b1.addActionListener(this); 
		ml.b2.addActionListener(this); 
		
		tripPrint(1);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ml.trip[i][j].addMouseListener(this);
			}
		}
		
	}
	// ������ ���
	void tripPrint(int page) {
		TripVO[] trips=TripManager.tripListData(page);
		int k=0;
		for(TripVO vo:trips) {
			try {
				// ������ �б� => ����ó�� �ʿ�
				URL url=new URL(vo.tripimg);
				Image img=getImage(new ImageIcon(url),
								ml.trip[0][0].getWidth(),
								ml.trip[0][0].getHeight());
				ml.trip[k/3][k%3].setIcon(new ImageIcon(img));
				k++;
			} catch (Exception ex) {}
		}
		
	}

	static Image getImage(ImageIcon ii, int w, int h) {
		Image dimg = ii.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);	
		return dimg;
	}

	// ������â 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new TripMainForm(); 
		
	}

	
	// �������� ���콺 ȿ��
	// ������ �ѱ��
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// ���� ��ư
		if(e.getSource()==ml.b1) {
			if(curpage>1) {
				curpage--;
				tripPrint(curpage);
			}
		}
		// ���� ��ư
		else if(e.getSource()==ml.b2) {
			if(curpage<totalpage) {
				curpage++;
				tripPrint(curpage);
			}
		}
		
	}
	
	// ���콺 �������̵�
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
	
	// ���콺 ���� ���� ��
	@Override 
	public void mouseEntered(MouseEvent e) {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(e.getSource()==ml.trip[i][j]) {
					LineBorder line=new LineBorder(Color.orange,4);
					ml.trip[i][j].setBorder(line);
				}
			}
		}
	}
	
	@Override 
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ml.trip[i][j].setBorder(null);
			}
		}
		
	}

}

/*	< ä��â �����  >
 * 	������ => JFrame
 * 	������� ���õ� Ŭ������ �о�´�
 * 	
 * 	/ ����
 * 	= ��� (is-a) : ������ Ŭ������ �����ؼ� ���
 * 	public class ClientMainFrame extends JFrame
 * 				 ===============
 * 				 JFrame�� ����� ��ü ������ �´�
 * 	class A 
 * 	{
 * 		O X W
 * 	}
 * 	class B 
 * 	{
 * 		O X W
 * 	}
 * 	= ���� (has-a) : ������ Ŭ������ ������� ���
 * 	public class ClientMainFrame {
 * 		JFrame f=new JFrame();
 * 	}
 *   
 *  ==============================================
 *  
 *  ������ ũ�� ���� => �����ڿ��� ���
 * 	 Ŭ�������� ������ ��� => ������ �ƴ϶� => ������ ��
 * 	 ��) 
 * 		�����ͺ��̽� : ����Ŭ����
 * 		��Ʈ��ũ : ���� => IP,PORT => �ڵ��� (����)
 * 		�� : ��Ű���� �� �б� => �ڵ��α���
 * 
 */	
package com.sist.client;
import javax.swing.*;
import java.awt.*; // Color , Layout
import java.awt.event.*; // interface

public class ClientMainFrame extends JFrame implements ActionListener,MouseListener {
	JLabel title=new JLabel("��ȭ ���� & ��õ ���α׷�",JLabel.CENTER); // �������
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControlPanel cp;
	// ������� => ���α׷� ������ �� ���� ���������� ���⼭ ����
	int curpage=1; // ù������
	int totalpage=16; // ������������

	//  ������ â ����
	public ClientMainFrame() {
		cp=new ControlPanel(this); // ���綰�ִ� â���� ������ ��� this
		
		title.setFont(new Font("���� ���", Font.BOLD, 45));
		// title.setOpaque(true); // ����
		// title.setBackground(Color.PINK); => �ּ�ó�� �� ���� : �ϴ� ĭ �迭�Ϸ��� ��������
		title.setBounds(10, 15, 1570, 100);
		setLayout(null); // JFrame (BorderLayout) ����� ���Ƿ� ��ġ => null
		// �߰� => add()
		add(title);
		// �޴� ��ġ
		mf.setBounds(10, 120, 100, 300);
		add(mf);
		// ä��Ȩ
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// ���ȭ��
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		
		setSize(1600,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x��ư ������ ����
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b5.addActionListener(this); // mf = �޴�
		
		// ����������ư
		cp.ff.b1.addActionListener(this); // ����
		cp.ff.b2.addActionListener(this); // ����

		cp.df.b2.addActionListener(this); // ���
		
		// ��ȭ ã�� 
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.b6.addActionListener(this);
		cp.lf.tf.addActionListener(this);
		
		
		
		/*
		for(int i=0;i<10;i++) {
			cp.ff.mc[i].addMouseListener(this);
			// mc => ��ȭ�ϳ� 
		}
		*/
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new ClientMainFrame();
	}
	// �̹��� ũ�� ���� (���� ��� �޼ҵ�-static)
	public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// Ȩ��ư
		if(e.getSource()==mf.b1) {
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2) {
			cp.card.show(cp, "LF");
		}
		else if(e.getSource()==mf.b5) {
			cp.card.show(cp, "NF");
		}
		else if(e.getSource()==cp.df.b2) {
			cp.card.show(cp, "FF"); // ��� ������ ���� ���� �������� �Ѿ
		}
		
		// ������ư
		else if(e.getSource()==cp.ff.b1) {
			
			if(curpage>1) {
				curpage--;
				cp.ff.p.removeAll(); // JPanel�� ��� ����� ����
				cp.ff.moviePrint(curpage);
				cp.ff.repaint(); // paint �ٽ� ȣ��
				cp.ff.p.validate(); // JPanel�� ���� ����� ���ġ
			}
				
		}
		// ������ư
		else if(e.getSource()==cp.ff.b2) {
			if(curpage<totalpage) {
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}
		//  ��ȭ ã��
		else if(e.getSource()==cp.lf.b1) {
			cp.lf.movieAllDate(1);
		}
		else if(e.getSource()==cp.lf.b2) {
			cp.lf.movieAllDate(2);
		}
		else if(e.getSource()==cp.lf.b3) {
			cp.lf.movieAllDate(3);
		}
		else if(e.getSource()==cp.lf.b4) {
			cp.lf.movieAllDate(4);
		}
		else if(e.getSource()==cp.lf.b5) {
			cp.lf.movieAllDate(5);
		}
		// �˻���ư ������ or �������� �� �Ѵ� ���� �� => ó���ϴ� ������ ������ ���ÿ� ���� 
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf) {
			// 1. �Էµ� �� �б�
			String ss=cp.lf.tf.getText(); // list���ȿ� tf �� �����Ͷ�
			if(ss.length()<1) {
				JOptionPane.showMessageDialog(this, "�˻�� �Է��ϼ���"); // this => ClientMainFrame
				cp.lf.tf.requestFocus(); // Ŀ��
				return; //  �޼ҵ� ����
				
			}
			cp.lf.movieFindDate(ss);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(e.getSource()==cp.ff.mc[i]) {
				if(e.getClickCount()==2) { // 2 => ����Ŭ��
					int a=(i+1)+((curpage*10)-10);
					// JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.datailPrint(a);
					cp.card.show(cp,"DF"); // default�� �ٲ��
					break;
				}
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

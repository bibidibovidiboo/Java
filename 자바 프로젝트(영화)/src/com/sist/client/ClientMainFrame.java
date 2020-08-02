// ����
package com.sist.client;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
public class ClientMainFrame extends JFrame implements ActionListener,MouseListener {
	JLabel title=new JLabel("JAVA PROJECT",JLabel.CENTER); 
	MenuForm mf=new MenuForm(); // �޴�
	ChatForm cf=new ChatForm(); // ä��
	ControlPanel cp; // ��Ʈ���г�
	
	int curpage=1; // ù������
	int totalpage=16; // ������������

	//  ������ â ����
	public ClientMainFrame() {
		cp=new ControlPanel(this); // ���� ���ִ� â���� �̵�
		// Ÿ��Ʋ
		title.setFont(new Font("���� ���", Font.BOLD, 50));
		title.setBounds(10, 8, 1400, 100);
		setLayout(null); 
		add(title);
		
		// �޴� 
		mf.setBounds(18, 110, 110, 300);
		add(mf);
		
		// ä��
		cf.setBounds(150, 650, 1200, 200);
		add(cf);
		
		// ���ȭ��
		cp.setBounds(150, 110, 1200, 550);
		add(cp);
		
		// ������â
		setSize(1400,900);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x��ư ������ ����
		
		// �޴���ư ������ �� 
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		mf.b4.addActionListener(this);
		mf.b5.addActionListener(this);
		
		cp.ff.b1.addActionListener(this); // ������ư
		cp.ff.b2.addActionListener(this); // ������ư

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new ClientMainFrame();
	}
	
	// �̹��� ũ�� ���� 
	public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
				
		// ī�� ���̾ƿ�
		if(e.getSource()==mf.b1) {
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2) {
			cp.card.show(cp, "BF");
		}
		else if(e.getSource()==mf.b3) {
			cp.card.show(cp, "OF");
		}
		else if(e.getSource()==mf.b4) {
			cp.card.show(cp, "SF");
		}
		else if(e.getSource()==mf.b5) {
			cp.card.show(cp, "NF");
		}
		
		// Ȩ ������ư
		else if(e.getSource()==cp.ff.b1) {
			
			if(curpage>1) {
				curpage--;
				cp.ff.p.removeAll(); // JPanel�� ��� ����� ����
				cp.ff.moviePrint(curpage);
				cp.ff.repaint(); // paint �ٽ� ȣ��
				cp.ff.p.validate(); // JPanel�� ���� ����� ���ġ
			}		
		}
		
		// Ȩ ������ư
		else if(e.getSource()==cp.ff.b2) {
			if(curpage<totalpage) {
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}	
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(e.getSource()==cp.ff.mc[i]) {
				if(e.getClickCount()==2) { 
					int a=(i+1)+((curpage*10)-10);				
					cp.df.datailPrint(a);
					cp.card.show(cp,"DF"); 
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
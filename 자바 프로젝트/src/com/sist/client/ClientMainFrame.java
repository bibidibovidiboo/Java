// ����
package com.sist.client;
import javax.swing.*;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import com.sist.common.Function;
import java.awt.*; 
import java.awt.event.*;// interface
import java.io.*;
import java.net.*;
import java.util.*;
public class ClientMainFrame extends JFrame implements ActionListener,MouseListener,Runnable {
	JLabel title=new JLabel("JAVA PROJECT",JLabel.CENTER); 
	MenuForm mf=new MenuForm(); // �޴�
	ChatForm cf=new ChatForm(); // ä��
	Login login=new Login(); // �α���
	ControlPanel cp; // ��Ʈ���г�
	
	int curpage=1; // ù������
	int totalpage=9; // ������������
	
	// ��Ʈ��ũ
	Socket s; // ���� ��� 
	OutputStream out; // ������ ��û�� ����
	BufferedReader in; // �����κ��� ���� �޾ƿ��� Ŭ����

	//  ������ â ����
	public ClientMainFrame() {
		cp=new ControlPanel(this); // ���� ���ִ� â���� �̵�
		// Ÿ��Ʋ
		title.setFont(new Font("���� ���", Font.BOLD, 50));
		title.setBounds(10, 7, 1400, 100);
		setLayout(null); 
		add(title);
		
		// �޴� 
		mf.setBounds(18, 110, 110, 300);
		add(mf);
		
		// ä��
		cf.setBounds(160, 650, 1200, 200);
		add(cf);
		
		// ���ȭ��
		cp.setBounds(160, 110, 1200, 550);
		add(cp);
		
		// ������â
		setSize(1400,900);
		// setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);// X��ư Ŭ���� ����X
		
		// �޴���ư ������ �� 
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		mf.b4.addActionListener(this);
		mf.b5.addActionListener(this);
		mf.b6.addActionListener(this); // ����
		
		cp.ff.b1.addActionListener(this); // ������ư
		cp.ff.b2.addActionListener(this); // ������ư
		
		// �α��� ó�� 
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		// ä��
		cf.tf.addActionListener(this);

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
				cp.ff.musicalPrint(curpage);
				cp.ff.repaint(); // paint �ٽ� ȣ��
				cp.ff.p.validate(); // JPanel�� ���� ����� ���ġ
			}		
		}
		
		// Ȩ ������ư
		else if(e.getSource()==cp.ff.b2) {
			if(curpage<totalpage) {
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.musicalPrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}
		// �α���
		else if(e.getSource()==login.b1)
		{
			String id=login.tf1.getText();
			if(id.length()<1)// ID�� �Է����� ���� ���
			{
				JOptionPane.showMessageDialog(this, "���̵� �Է��ϼ���");
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, "��ȭ���� �Է��ϼ���");
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected())
				sex="����";
			else
				sex="����";
			
			// ������ �Է¹��� ������ ���� 
			try
			{
				// ����  => ������ ���� ������ ������ �ִ� 
				s=new Socket("localhost",3355);
				// �ۼ��� ��ġ Ȯ��
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
				
				// �α��� ��û (������ ���۵Ǵ� �κ�)
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex){}
			    
			    //�������� �����ϴ� �����͸� �о ��� 
			    new Thread(this).start();
			    // run()�� ��ġ Ȯ�� ==> �ڽ��� Ŭ�����ȿ� ���� => (this)
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cf.tf)// ä�� 
		{
			String color=cf.box.getSelectedItem().toString();
			String msg=cf.tf.getText();
			if(msg.length()<1)
				return;
			// �����͸� ������ ���� 
			try
			{
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex){}
			
			    cf.tf.setText("");
		}
		else if(e.getSource()==mf.b6)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
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

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// �������� ������ �����͸� �޾Ƽ� ó�� 
		try
		{
			while(true)
			{
				String msg=in.readLine();
				System.out.println("server=>"+msg);
				StringTokenizer st=
						  new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				   case Function.MYLOG:
				   {
					   setTitle(st.nextToken());
					   login.setVisible(false);// �α���â
					   setVisible(true);// ��ȭâ (Main) 
				   }
				   break;
				   case Function.LOGIN:
				   {
					   // ���̺� ��� 
					   String[] data= {
						  st.nextToken(), // id
						  st.nextToken(), // name
						  st.nextToken() // sex
					   };
					   cf.model.addRow(data);
				   }
				   break;
				   case Function.CHAT:
				   {
					     initStyle();
					     append(st.nextToken(),st.nextToken());
				   }
				   break;
				   case Function.EXIT:
				   {
					   String id=st.nextToken();
					   for(int i=0;i<cf.model.getRowCount();i++)
					   {
						   String mid=cf.model.getValueAt(i,0).toString();
						   if(id.equals(mid))
						   {
							   cf.model.removeRow(i);
							   break;
						   }
					   }
				   }
				   break;
				   case Function.MYEXIT:
				   {
					   dispose();// ������ �޸� ���� 
					   System.exit(0);// ���α׷� ���� 
				   }
				   break;
				}
			}
		}catch(Exception ex) {}
	}
    public void initStyle()
    {
    	Style def=StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
    	Style red=cf.ta.addStyle("red", def);
    	StyleConstants.setForeground(red, Color.red);
    	
    	Style blue=cf.ta.addStyle("blue", def);
    	StyleConstants.setForeground(blue, Color.blue);
    	
    	Style green=cf.ta.addStyle("green", def);
    	StyleConstants.setForeground(green, Color.green);
    	
    	Style yellow=cf.ta.addStyle("yellow", def);
    	StyleConstants.setForeground(yellow, Color.yellow);
    	
    	Style gray=cf.ta.addStyle("gray", def);
    	StyleConstants.setForeground(gray, Color.gray);
    	
    	Style cyan=cf.ta.addStyle("cyan", def);
    	StyleConstants.setForeground(cyan, Color.cyan);
    }
    public void append(String msg,String color)
    {
    	try
    	{
    		Document doc=cf.ta.getDocument();
    		doc.insertString(doc.getLength(), msg+"\n", cf.ta.getStyle(color));
    	}catch(Exception ex) {}
    }
}
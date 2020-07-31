package com.sist.client;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
//////////// ��Ʈ��ũ ����
import java.net.Socket;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import com.sist.common.Function;
//////////////////////////////
public class ClientMainForm extends JFrame implements ActionListener,Runnable {
	CardLayout card=new CardLayout();
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	// ��Ʈ��ũ 
	Socket s; // ����
	BufferedReader in; // �����
	OutputStream out; // ����������
	public ClientMainForm() {
		setLayout(card);
		add("LOGIN",login); // �α���â �߰�
		add("WR",wr); // �����÷����� �̵�
		
		setSize(1024, 950);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		wr.tf.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClientMainForm();
	}
	public void connection(String id,String name,String sex) {
		try {
			s=new Socket("211.238.142.203",8686);
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			out=s.getOutputStream();
			// ������ �Ǹ� �α��ο�û
			out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
		}catch (Exception ex) {}
		// ������ �Ǹ� => �����κ��� ���ø� �޴´�
		new Thread(this).start();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1) {
			String id=login.tf.getText();
			String name=login.pf.getText();
			String sex="";
			if(login.rb1.isSelected())
				sex="����";
			else 
				sex="����";
			connection(id, name, sex);
		}
		else if(e.getSource()==wr.tf) {
			// �Էµ� ������ �б�
			String msg=wr.tf.getText();
			if(msg.length()<1) return;
			
			try {
				out.write((Function.WAITCHAT+"|"+msg+"\n").getBytes()); // server�� \n ���ȱ� ������ ���⵵ �������
			}catch (Exception ex) {
			}
			
			wr.tf.setText(""); // ä���ϰ� ����ġ�� ���� ������
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				String msg=in.readLine();
				StringTokenizer st=new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch (protocol) {
				case Function.LOGIN:
				{
					String[] data= {
							st.nextToken(),
							st.nextToken(),
							st.nextToken(),
							st.nextToken()
					};
					wr.model2.addRow(data);
				}
				break;
				case Function.MYLOG:
				{
					setTitle(st.nextToken());
					card.show(getContentPane(), "WR");
				}
				break;
				case Function.WAITCHAT:
				{
					wr.bar.setValue(wr.bar.getMaximum()); // ��ũ�ѹ� �� ������ 
					wr.ta.append(st.nextToken()+"\n");
				}
				break;
				}
			}
		}catch (Exception ex) {
			// TODO: handle exception
		}
	}

}

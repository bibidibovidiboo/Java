// < ���̹���ȭ ���� - ������ >
import javax.swing.*; // ������ ���� Ŭ����
import javax.swing.border.LineBorder;

import java.awt.*; // ���̾ƿ� (ȭ�� ��ġ)
import java.awt.event.*; // ��ư , �ؽ�Ʈ�� ���� => ���� (�̺�Ʈ)
import java.net.URL;
// �ڹٿ��� �����ϴ� �������� ��� ����� ����Ѵ�
// �ڹٿ��� ����� �Ѱ��� ���� (���� ���)
public class MovieMainForm extends JFrame implements ActionListener,MouseListener{
	JMenuBar bar=new JMenuBar();
	JMenuItem home=new JMenuItem("HOME");
	JMenuItem find=new JMenuItem("ã��");
	JMenuItem exit=new JMenuItem("����");
	// ���� => �����츦 �����ش� => ������
	
	// ī�� ���̾ƿ� - ȭ�� �ٲ�
	CardLayout card=new CardLayout(); 
	MovieList ml=new MovieList();
	MovieDetail md=new MovieDetail();
	MovieFind mf=new MovieFind();
	
	int curpage=1;
	int totalpage=194;
	// ������� �ʱ�ȭ
	
	MovieMainForm(){
		// �޴� ����
		JMenu menu=new JMenu("�޴�");
		menu.add(home);
		menu.add(find);
		menu.addSeparator(); // ���м�
		menu.add(exit);
		bar.add(menu);
		
		// �����쿡 ����
		setJMenuBar(bar);
		
		// ���̾ƿ� ����
		setLayout(card);
		add("ML",ml); // ����Ʈ�� ���� ���
		add("MF",mf);
		add("MD",md);
		
		// ������ ũ�� ����
		setSize(1200, 1000);
		
		// ������ �����ش�
	
		setVisible(true);
		
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
		
		ml.b1.addActionListener(this); // ����
		ml.b2.addActionListener(this); // ����
		
		
		moviePrint(1);
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
				ml.movie[i][j].addMouseListener(this);
			}
		}
		
		

	}
	void moviePrint(int page) {
		MovieVO[] movies=MovieManager.movieListData(page);
		int k=0;
		for(MovieVO vo:movies) {
			try {
				// ������ �б� => ����ó�� �ʿ�
				URL url=new URL(vo.poster);
				Image img=getImage(new ImageIcon(url),
								ml.movie[0][0].getWidth(),
								ml.movie[0][0].getHeight());
				ml.movie[k/5][k%5].setIcon(new ImageIcon(img));
				k++;
			} catch (Exception ex) {}
		}
		// ������ �ѹ���
		ml.pla.setText(curpage+" page / "+totalpage+" pages");
	}

	
	static Image getImage(ImageIcon ii, int w, int h) {
		Image dimg = ii.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);	
		return dimg;
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMainForm(); // MovieMainForm(); (x) error => �տ� new�� �����
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==home) {
			card.show(getContentPane(), "ML");
		}
		else if(e.getSource()==find) {
			card.show(getContentPane(), "MF");
		}
		else if(e.getSource()==find) {
			System.exit(0);
		}
		
		// ���� ��ư
		else if(e.getSource()==ml.b1) {
			if(curpage>1) {
				curpage--;
				moviePrint(curpage);
			}
		}
		// ���� ��ư
		else if(e.getSource()==ml.b2) {
			if(curpage<totalpage) {
				curpage++;
				moviePrint(curpage);
			}
		}
		
	}
	// MouseListener ������ ���� �߻�޼ҵ�
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
	@Override // ���콺 ���� ���� ��
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
				if(e.getSource()==ml.movie[i][j]) {
					LineBorder line=new LineBorder(Color.orange,5);
					ml.movie[i][j].setBorder(line);
				}
			}
		}
	}
	@Override // ���콺 ���� ��
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
				ml.movie[i][j].setBorder(null);
			}
		}
		
	}

}


// < 네이버영화 예제 - 메인폼 >
import javax.swing.*; // 윈도우 관련 클래스
import javax.swing.border.LineBorder;

import java.awt.*; // 레이아웃 (화면 배치)
import java.awt.event.*; // 버튼 , 텍스트에 엔터 => 행위 (이벤트)
import java.net.URL;
// 자바에서 지원하는 윈도우의 모든 기능을 사용한다
// 자바에서 상속은 한개만 가능 (단일 상속)
public class MovieMainForm extends JFrame implements ActionListener,MouseListener{
	JMenuBar bar=new JMenuBar();
	JMenuItem home=new JMenuItem("HOME");
	JMenuItem find=new JMenuItem("찾기");
	JMenuItem exit=new JMenuItem("종료");
	// 실행 => 윈도우를 보여준다 => 생성자
	
	// 카드 레이아웃 - 화면 바꿈
	CardLayout card=new CardLayout(); 
	MovieList ml=new MovieList();
	MovieDetail md=new MovieDetail();
	MovieFind mf=new MovieFind();
	
	int curpage=1;
	int totalpage=194;
	// 명시적인 초기화
	
	MovieMainForm(){
		// 메뉴 설정
		JMenu menu=new JMenu("메뉴");
		menu.add(home);
		menu.add(find);
		menu.addSeparator(); // 구분선
		menu.add(exit);
		bar.add(menu);
		
		// 윈도우에 설정
		setJMenuBar(bar);
		
		// 레이아웃 설정
		setLayout(card);
		add("ML",ml); // 리스트를 먼저 출력
		add("MF",mf);
		add("MD",md);
		
		// 윈도우 크기 설정
		setSize(1200, 1000);
		
		// 윈도우 보여준다
	
		setVisible(true);
		
		
		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
		
		ml.b1.addActionListener(this); // 이전
		ml.b2.addActionListener(this); // 다음
		
		
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
				// 포스터 읽기 => 예외처리 필요
				URL url=new URL(vo.poster);
				Image img=getImage(new ImageIcon(url),
								ml.movie[0][0].getWidth(),
								ml.movie[0][0].getHeight());
				ml.movie[k/5][k%5].setIcon(new ImageIcon(img));
				k++;
			} catch (Exception ex) {}
		}
		// 페이지 넘버링
		ml.pla.setText(curpage+" page / "+totalpage+" pages");
	}

	
	static Image getImage(ImageIcon ii, int w, int h) {
		Image dimg = ii.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);	
		return dimg;
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMainForm(); // MovieMainForm(); (x) error => 앞에 new가 없어서임
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
		
		// 이전 버튼
		else if(e.getSource()==ml.b1) {
			if(curpage>1) {
				curpage--;
				moviePrint(curpage);
			}
		}
		// 다음 버튼
		else if(e.getSource()==ml.b2) {
			if(curpage<totalpage) {
				curpage++;
				moviePrint(curpage);
			}
		}
		
	}
	// MouseListener 눌러서 나온 추상메소드
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
	@Override // 마우스 갖다 댔을 때
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
	@Override // 마우스 놨을 때
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
				ml.movie[i][j].setBorder(null);
			}
		}
		
	}

}


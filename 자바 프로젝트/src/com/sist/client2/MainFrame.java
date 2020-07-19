// 메인페이지
package com.sist.client2;
import javax.swing.*;
import com.sist.client2.ControlPanel;
import java.awt.*; // Color , Layout
import java.awt.event.*; // interface
public class MainFrame extends JFrame implements ActionListener {
	JLabel search=new JLabel("검색창",JLabel.CENTER); 
	SearchForm sf=new SearchForm();
	MenuForm mf=new MenuForm(); // 메뉴창
	PopularForm pf=new PopularForm(); // 인기 여행지
	RecommendForm rf=new RecommendForm(); // 추천 여행지
	ControlPanel cp=new ControlPanel(); // 컨트롤패널
	// 생성자
	public MainFrame() {
		// 검색창
		search.setFont(new Font("맑은 고딕", Font.PLAIN, 30)); // 폰트
		search.setOpaque(true); // 라벨 초기화
		search.setBackground(Color.green); // 라벨 배경
		search.setBounds(250, 15, 700, 70); // 사이즈 
		setLayout(null); // 사용자 정의로 배치 
		
		add(search);

		// 메뉴창
		mf.setBounds(250, 110, 200, 30);
		add(mf);
		
		// 인기여행지 패널 
		pf.setBounds(250, 150, 700, 700);
		add(pf); 
		
		// 추천여행지 패널
		rf.setBounds(250, 150, 700, 700);
		add(rf); 
		
		// 출력 화면
		cp.setBounds(250, 150, 700, 700);
		add(cp);
		// setSize(1000, 700);
		// setVisible(true);
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		
		//  윈도우창
		setSize(1200,900); // 크기
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x버튼 누르면 종료
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new MainFrame();
	}
	
	// 버튼 눌렀을 때 이동
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "PF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "RF");
		}
	}
	

}

// < 네이버영화 - static,생성자 예제>
/*
 * 	BorderLayout
 *  FlowLayout
 *  GridLayout
 *  
 */
import java.awt.*;
import javax.swing.*;
public class MovieList extends JPanel {
	// JLabel ==> 구분 , 이미지 출력
	JLabel la=new JLabel("영화 목록",JLabel.CENTER);
	JLabel[][] movie=new JLabel[2][5];
	JLabel pla=new JLabel("0 page / 0 page");
	JPanel pan=new JPanel();
	JButton b1=new JButton("이전");
	JButton b2=new JButton("다음");
	MovieList(){
		setLayout(null);
		la.setFont(new Font("맑은 고딕",Font.BOLD,45));
		la.setBounds(10, 15, 1260, 50);
		add(la);
		
		pan.setLayout(new GridLayout(2,5,5,5));
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
				movie[i][j]=new JLabel();
				/* 영화 리스트 색 랜덤으로 넣음 (일단 섹션 보려고)
				movie[i][j].setOpaque(true);
				movie[i][j].setBackground(
						new Color((int)(Math.random()*256),
							(int)(Math.random()*256),
							(int)(Math.random()*256)));
				*/
				pan.add(movie[i][j]);
			}
		}
		
		// 배치
		pan.setBounds(10, 75, 1260, 800);
		add(pan);
		
		// 이전 - 다음 버튼 생성
		JPanel p=new JPanel();
		p.add(b1);
		p.add(pla);
		p.add(b2);
		
		p.setBounds(10, 885, 1260, 35);
		add(p);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
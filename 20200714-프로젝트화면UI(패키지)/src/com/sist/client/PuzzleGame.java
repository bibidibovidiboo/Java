// < 퍼즐게임  >
// 생성자 => 변수
// GridLayout
package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class PuzzleGame extends JFrame implements ActionListener {
	JButton b1,b2;
	JButton[][] pan=new JButton[3][3];
	int[][] panCount=new int[3][3];
	int brow=0;
	int bcol=0;
	// 0 ~ 8 난수 발생 (퍼즐이라)
	public void getRand() {
		
		int[] com=new int[9]; // 중복없는 난수값을 저장
		int su=0; // 난수발생 시 저장한 변수
		boolean bCheck=false; // 중복여부 확인
		for(int i=0;i<9;i++) {
			// 난수 발생
			bCheck=true;
			while(bCheck) {
				su=(int)(Math.random()*9); // 0~8
				bCheck=false;
				// 검색 => 저장된 데이터가 중복여부 확인
				for(int j=0;j<i;j++) {
					if(su==com[j]) //  같은 수가 저장
					{
						// while문 다시 수행
						 bCheck=true;
						 break;
					}
				}				
			} 
			com[i]=su;
			
			panCount[i/3][i%3]=su; // 1차원 함수를 바꿀 때 => 중복 X
			
			if(su==8) {
				brow=i/3;
				bcol=i%3;
			}

		}
	}
	// 배치 함수
	public void display() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==brow && j==bcol) {
					pan[i][j].setText("");
					pan[i][j].setEnabled(false);
				}
				else {
				pan[i][j].setText(String.valueOf(panCount[i][j]+1));
				pan[i][j].setEnabled(true);
				}
			}
		}
	}
	
	// 버튼 클릭

	public PuzzleGame() { // 생성자 => 클래스를 메모리에 저장할 때 가장 먼저 호출되는 메소드
		// 배치
		b1=new JButton("시작");
		b2=new JButton("종료");
		JPanel p=new JPanel();
		p.add(b1);p.add(b2);
		add("South",p);
		
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(3,3,5,5));
		int k=1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				pan[i][j]=new JButton(String.valueOf(k));
				pan[i][j].setFont(new Font("굴림체", Font.BOLD, 50)); // 폰트지정
				p2.add(pan[i][j]);
				pan[i][j].addActionListener(this);
				k++;
			}				
		}
		
		add("Center",p2);
		
		getRand();
		display();
		
		setSize(350, 400);
		setVisible(true);
		
		b1.addActionListener(this); // 이벤트 등록

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PuzzleGame(); 
		// 생성자를 호출할 때는 반드시 앞에 new를 붙어야 한다
	}
	// 종료여부 확인
	public boolean isEnd() 
	{
		int k=0;
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				if(panCount[i][j]!=k) 
					return false;
					k++;
			}
		}
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			getRand();
			display();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(e.getSource()==pan[i][j]) {
					panCount[brow][bcol]=panCount[i][j];
					panCount[i][j]=8;
					brow=i;
					bcol=j;
					if(isEnd()) {
						JOptionPane.showMessageDialog(this, "Game Over!!");
						System.exit(0); // 종료
					}

					display();
				}
			}
		
		}		
	
	}

}

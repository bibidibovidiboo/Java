// 3번째 - 여행후기 그리드
package com.sist.client;
import java.awt.GridLayout;
import javax.swing.JPanel;
public class ReviewFromList extends JPanel{
	ReviewForm[] Review_Data=new ReviewForm[3];
	ReviewFromList()
	{
		setLayout(null);
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,1,5,5));
		for(int i=0;i<3;i++)
		{
			Review_Data[i]=new ReviewForm();
			p.add(Review_Data[i]);
		}
		//p.setSize(900,500);
		p.setBounds(0,0,900,500);
		add(p);
	}
}

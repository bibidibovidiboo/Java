// 출력보려고 만든 페이지
package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;

import com.sist.data.FoodHouseVO;
import com.sist.data.MainClass3;
public class CardPrint extends JFrame {
	public CardPrint() {
		FoodHouseVO[] food=MainClass3.categoryFoodData();
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(5,2));
		add("Center",p);
		
		for(FoodHouseVO vo:food) {
			FoodListCard fc=new FoodListCard(vo); 
			p.add(fc);
		}
		setSize(1300, 1000);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CardPrint();
	}

}

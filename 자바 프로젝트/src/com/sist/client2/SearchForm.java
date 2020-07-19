// 검색창
package com.sist.client2;
import java.awt.Color;
import javax.swing.*;
public class SearchForm extends JPanel {
	 JComboBox box;
	 
	 public SearchForm() {
		 box=new JComboBox();
		 box.addItem("인천/서울출발");
		 box.addItem("부산출발");
		 box.addItem("대구출발");
		 box.addItem("무안출발");
		 box.addItem("청주출발");
		 box.addItem("제주출발");
		 box.addItem("양양출발");
		   
		 box.setBounds(200, 15, 200, 70);
		 add(box);

	 }

}

package com.sist.client2;
import java.awt.Color;
import javax.swing.*;
public class SearchForm extends JPanel {
	JTextField tf;
	public SearchForm(){
		setLayout(null);
		tf=new JTextField();
		tf.setBounds(10, 10, 500, 30);
		add(tf);
	}

}

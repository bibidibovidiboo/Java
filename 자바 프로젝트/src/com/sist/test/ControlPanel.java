// 컨트롤 패널
package com.sist.test;
import java.awt.*;
import javax.swing.*;
public class ControlPanel extends JPanel{
   CardLayout card=new CardLayout();
   MovieForm hf=new MovieForm();
   BookForm bf=new BookForm();
   FoodForm vf=new FoodForm();
   MusicForm sf=new MusicForm();
   public ControlPanel()
   {
	   setLayout(card);
	   add("HF",hf);
	   add("BF",bf);
	   add("VF",vf);
	   add("SF",sf);
   }
}
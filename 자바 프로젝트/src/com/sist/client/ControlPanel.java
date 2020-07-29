// 컨트롤 패널
package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class ControlPanel extends JPanel{
   CardLayout card=new CardLayout();
   HomeForm hf=new HomeForm();
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
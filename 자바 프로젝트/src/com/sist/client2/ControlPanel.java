// 컨트롤 패널
package com.sist.client2;
import java.awt.*;
import javax.swing.*;
public class ControlPanel extends JPanel{
   CardLayout card=new CardLayout();
   HomeForm hf=new HomeForm();
   RecommendForm rf=new RecommendForm();
   ReviewFromList vf = new ReviewFromList();
   public ControlPanel()
   {
	   setLayout(card);
	   add("HF",hf);
	   add("RF",rf);
	   add("VF",vf);
   }
}
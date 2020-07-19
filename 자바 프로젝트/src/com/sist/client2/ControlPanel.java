// 컨트롤 패널
package com.sist.client2;
import java.awt.*;
import javax.swing.*;
public class ControlPanel extends JPanel{
   CardLayout card=new CardLayout();
   PopularForm pf=new PopularForm();
   RecommendForm rf=new RecommendForm();
   public ControlPanel()
   {
	   setLayout(card);
	   add("PF",pf);
	   add("RF",rf);
   }
}
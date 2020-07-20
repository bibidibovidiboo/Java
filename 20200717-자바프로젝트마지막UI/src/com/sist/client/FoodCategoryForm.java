// 푸드카테고리 뿌릴 곳 
package com.sist.client;
import java.awt.*;
import javax.swing.*;
import com.sist.data.*;
public class FoodCategoryForm extends JPanel{
	public FoodCategoryForm() {
		setLayout(new GridLayout(2, 5, 5, 5));
		// 데이터 출력
		CategoryVO[] cate=MainClass3.categoryListDate();
		for(CategoryVO vo:cate) {
			FoodCategoryCard fc=new FoodCategoryCard(vo.getTitle(), vo.getSubject(), vo.getPoster());
			 add(fc);
		}
	}
	
}

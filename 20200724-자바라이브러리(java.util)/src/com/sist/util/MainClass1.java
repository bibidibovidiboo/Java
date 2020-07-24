/*  < StringTokenizer >
 *  ==================== 단어별로 분리
 *  	= hasMoreTokens() => 갯수를 모를 때 
 *  	= nextToken() => 한두개 자를 때
 * 
 * 	String msg="Red,Green,Blue,Black,Yellow";
 * 			
 * 	=> 	1)
 * 		StringTokenizer st=new StringTokenizer(msg,","); // 메시지를 ,를 구분으로 잘라라 
 * 	   	String color1=st.nextToken();
 * 		String color2=st.nextToken();
 * 		String color3=st.nextToken();
 * 		String color4=st.nextToken();
 * 		String color5=st.nextToken(); // 위에 갯수가 5개라 같은걸 5번 썼음
 * 		
 * 		2)
 * 		StringTokenizer st=new StringTokenizer(msg,",");
 * 		while(st.hasMoreTokens()){
 * 			String color=st.nextToken();
 * 		}
 * 
 *      StringTokenizer st=new StringTokenizer(msg); => 구분문자가 없음 공백으로 자름 #
 *      StringTokenizer st=new StringTokenizer(msg," "); => 이걸 생략해서 보통 #처럼 사용
 */
package com.sist.util;
import java.util.*;
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  msg="Red,Green,Blue,Black,Yellow";
		StringTokenizer st=new StringTokenizer(msg,",");
		// ,별로 => 단어를 추출한다 
		String color1=st.nextToken();
		String color2=st.nextToken();
		String color3=st.nextToken();
		String color4=st.nextToken();
	 	String color5=st.nextToken();
	 	//String color6=st.nextToken(); => error
	 	
	 	System.out.println(color1);
	 	System.out.println(color2);
	 	System.out.println(color3);
	 	System.out.println(color4);
	 	System.out.println(color5);
	 	//System.out.println(color6);
	 	
	 	st=new StringTokenizer(msg,",");
	 	while(st.hasMoreTokens())
	 	{
	 		System.out.println(st.nextToken());
	 	}
	}

}
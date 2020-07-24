package com.sist.util;
import java.util.*;
public class MainClass3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5]; // 5~14
		
		String day="";
		// ¡é resDay.length¸¦ ¾´ ÀÌÀ¯ : ¸î°³°¡ ¹ß»ıµÉÁö ¸ô¶ó¼­ 
		for(int i=0;i<resDay.length;i++) {
			resDay[i]=r.nextInt(31)+1; // 31±îÁö ³ª¿À°Ô ÇÏ·Á°í +1
			day+=resDay[i]+"|";
			
		}
		day=day.substring(0,day.lastIndexOf("|")); // ¸Ç¸¶Áö¸· Á¦°Å	
		//  ¡è ÀÌ°Ô ¾øÀ¸¸é ¸Ç ¸¶Áö¸·¿¡ |°¡ ¾È¾ø¾îÁü
		System.out.println(day);	
		
		// ³¯Â¥º°·Î ºĞ¸®
		String[] resDays=day.split("\\|"); // regex => Á¤±Ô½ÄÀ» ½á¾ßÇÔ
		// ¤¤ split ¾È¿¡´Â Á¤±Ô½ÄÀÌ µé¾î°¡¾ßÇØ¼­ ("|") ÀÌ·¸°Ô ¾µ ¼ö x / Âü°íp.507
		// ÀÌ·±°Ô ÀÍ¼÷ÇÏÁö ¾Ê¾Æ¼­ split º¸´Ù´Â ´çºĞ°£ StringTokenizer¸¦ »ç¿ëÇØ¶ó
		/* 	< Á¤±Ô½Ä ±âÈ£  >
		 * 	^ => ½ÃÀÛ¹®ÀÚ  ^A = StartsWith¿Í µ¿ÀÏ / ^[°¡-ÆR] ^[A-Za-z] ^[0-9]
		 * 									 [^°¡-ÆR] => Á¦¿Ü ==> ÇÑ±ÛÀ» Á¦¿ÜÇÑ
		 * 				   				   / Áö´Ï¹ÂÁ÷ 
		 * 								   => 3»ó½Â => [^°¡-ÆR] ==> 3¸¸ °¡Á®¿È
		 * 								   => 1ÇÏ°­ => [^0-9]
		 * 	$ => ³¡¹®ÀÚ 	A$
		 *  . => ÀÓÀÇÀÇ ÇÑ±ÛÀÚ (¸ğµç ±ÛÀÚ) ==> \\;
		 *  | => ¼±ÅÃ
		 *  ? => ÀÖÀ¸¸é Ãâ·Â , ¾øÀ¸¸é ¹ÌÃâ·Â
		 */
		for(String s:resDays) {
			System.out.println(s);
		}
		System.out.println("========StringTokenizer========");
		StringTokenizer st=new StringTokenizer(day,"|");
		// ¸î°³ÀÎÁö ¸ô¶ó¼­ hasMortTokens ½èÀ½
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
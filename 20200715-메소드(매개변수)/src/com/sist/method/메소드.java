/*	< 메소드  >
 * 	 = 리턴값
 * 	 = 매개변수 : 애매한 경우
 * 	   printf("%d%d%d",10,20,30)
 * 	   printf("%d%f%s",100.10.5,"")
 * 	   ========================== 가변매개변수
 * 	   String...a
 * 	   Oject...obj
 *  
 */
package com.sist.method;
public class 메소드 {
	public static void concat(String s,String...s1) {
		for(String ss:s1) {
			s+=ss;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concat("Hello","홍길동","심청이","박문수","춘향이","이순신");
		/*
		 * Object o=10; Object o1=0.5; Object o2='A'; 
		 * Object o3="aaaa"; Object o4=new
		 * 메소드();
		 */
	}

}

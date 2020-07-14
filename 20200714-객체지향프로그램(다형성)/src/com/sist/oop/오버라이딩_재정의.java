/*	 < 오버라이딩  >
 * 	1. 반드시 상속관계
 * 	2. 메소드명이 동일
 * 	3. 메개변수가 동일 (갯수,데이터형)
 * 	4. 리턴형도 동일 
 *  5. 접근지정어는 확장 , 축소할 수 없다	
 *	   =========
 *	    public > protected > default > private
 *	    ===========================================
 *				   같은 클래스   같은 패키지  다른패키지  모든클래스
 *		===========================================
 *		private		 O		O		O		O
 *		===========================================
 *		default		 O		O		O		X		
 *		===========================================
 *		protected	 O		O		X		X		
 *		===========================================
 *		public		 O		X		X		X
 *		===========================================
 *
 *	   => class A 
 *		{
 *			private void display(){}
 *		}
 *		class B extends A {
 *			1. private void display(){}
 *			2. void display(){}
 *			3. protected void display(){}
 *			4. public void display(){}
 *		}
 *
 *		class A
 *		{
 *			private int a;
 *			// setter // getter
 *		}
 *		class B {
 *		}
 *
 */
package com.sist.oop;
public class 오버라이딩_재정의 {
	
	private void pub() {
		// TODO Auto-generated method stub

	}

}

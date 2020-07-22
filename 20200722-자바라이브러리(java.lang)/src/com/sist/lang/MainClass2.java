package com.sist.lang;
class Change {
	int x,y; 
	/*  자동초기화 (지역변수)
	 * 	int => 0 으로 자동초기화
	 * 	String => null
	 * 	class => null
	 * 	double => 0.0
	 * 	boolean => false
	 */
}
// Change => x=0,y=0 (초기화)
public class MainClass2 {
	/*
	 * 	 int x=10;
	 * 	 int y=20; x=20,y=10 하고싶으면  
	 * 	
	 * 	 x=y; x=20;
	 *   y=x; y=20;
	 *   
	 *   int temp=x; => temp=10 => 임시변수 설정
	 *   x=y; => x=20
	 *   int a=10;
	 *   
	 *   a=20;
	 */
	public void swap2(Change c) {
		int temp=c.x;
		c.x=c.y;
		c.y=temp;
	}
	public void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp; //  x,y값 교환
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2();
		int x=10;
		int y=20;
		System.out.println("변경전:x="+x+",y="+y);
		m.swap(x, y);
		System.out.println("변경후:x="+x+",y="+y);
		
		Change ccc=new Change();
		ccc.x=10;
		ccc.y=20;
		System.out.println("변경전:c.x="+ccc.x+",c.y="+ccc.y);
		m.swap2(ccc);
		System.out.println("변경전:c.x="+ccc.x+",c.y="+ccc.y);
		// 일반변수는 넘어가도 안바뀌는데 클래스는 가능하다 
		// String은 클래스인데도 일반변수 취급해서 안바뀐다 
	}
}
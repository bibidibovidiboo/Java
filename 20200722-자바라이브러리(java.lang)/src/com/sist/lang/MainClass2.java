package com.sist.lang;
class Change {
	int x,y; 
	/*  �ڵ��ʱ�ȭ (��������)
	 * 	int => 0 ���� �ڵ��ʱ�ȭ
	 * 	String => null
	 * 	class => null
	 * 	double => 0.0
	 * 	boolean => false
	 */
}
// Change => x=0,y=0 (�ʱ�ȭ)
public class MainClass2 {
	/*
	 * 	 int x=10;
	 * 	 int y=20; x=20,y=10 �ϰ������  
	 * 	
	 * 	 x=y; x=20;
	 *   y=x; y=20;
	 *   
	 *   int temp=x; => temp=10 => �ӽú��� ����
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
		b=temp; //  x,y�� ��ȯ
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2();
		int x=10;
		int y=20;
		System.out.println("������:x="+x+",y="+y);
		m.swap(x, y);
		System.out.println("������:x="+x+",y="+y);
		
		Change ccc=new Change();
		ccc.x=10;
		ccc.y=20;
		System.out.println("������:c.x="+ccc.x+",c.y="+ccc.y);
		m.swap2(ccc);
		System.out.println("������:c.x="+ccc.x+",c.y="+ccc.y);
		// �Ϲݺ����� �Ѿ�� �ȹٲ�µ� Ŭ������ �����ϴ� 
		// String�� Ŭ�����ε��� �Ϲݺ��� ����ؼ� �ȹٲ�� 
	}
}
/*	< �޼ҵ�  >
 * 	 = ���ϰ�
 * 	 = �Ű����� : �ָ��� ���
 * 	   printf("%d%d%d",10,20,30)
 * 	   printf("%d%f%s",100.10.5,"")
 * 	   ========================== �����Ű�����
 * 	   String...a
 * 	   Oject...obj
 *  
 */
package com.sist.method;
public class �޼ҵ� {
	public static void concat(String s,String...s1) {
		for(String ss:s1) {
			s+=ss;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concat("Hello","ȫ�浿","��û��","�ڹ���","������","�̼���");
		/*
		 * Object o=10; Object o1=0.5; Object o2='A'; 
		 * Object o3="aaaa"; Object o4=new
		 * �޼ҵ�();
		 */
	}

}

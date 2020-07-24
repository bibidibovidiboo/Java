/*	 < java.lang >
 *     ==========
 *      String / StringBuffer
 *      =======
 *       1) ���ڿ��� �ּҴ�  "Hello" , "Java"...
 *       2) char[] => �����ϴ� Ŭ���� 
 *       ==================================== 
 *       3) �ֿ� ���(�޼ҵ�)
 *       =================
 *        1. length() : ������ ���� 
 *        2. trim()   : �¿��� �������� 
 *        3. substring() : ���ں��� 
 *        4. indexOf() , lastIndexOf() => ������ ��ġ 
 *        5. equals() : ����� ���ڸ� �� 
 *        6. ã�� ==> 
 *            ���� : contains   ===> LIKE
 *            ���� : startsWith
 *            ��    : endsWith
 *        ====================== �ν��Ͻ� �޼ҵ�
 *        7. static �޼ҵ� : valueOf() => ��� �⺻���� ���ڿ��� ��ȯ 
 *        
 *        String s1="Hello"
 *          s1.length()
 *        String s2="Hello Java"
 *          s2.length()
 *          
 *        String.valueOf()
 *                       
 */
package com.sist.string;
public class MainClass {
	public static void main(String[] args) {
		// 1 ~ 4 
		String s="background-image: url(' https://mp-seoul-image-production-s3.mangoplate.com/d8e852bf7058841a7a0694af93af1b9a.jpg ');";
		String temp=s.substring(s.indexOf("'")+1,s.lastIndexOf("'")); // ' ' �̰� ������
		System.out.println(temp.trim()); // trim => ����������
		
		String ss="�� ������ ��� ���� ���� ���Ҿ��!! �䵵 �ʹ� ���� ������ �� ���پ����ְ� ī�� �ǹ��� �ʹ� ������� �Ϻ����� ġ������ �Ƹ޸�ī�� �̷��� ��";
		if(ss.length()>20) {
			String sss=ss.substring(0,20)+"..."; // 0���� 20���� ����ض� => ���ڼ��� ���� substring ��
			System.out.println(sss);
		}
		// 5 
		String s1="Hello";
		String s2="Hello";
		String s3=new String("hello");
		/*
		if(s1==s3) {
			System.out.println("s1==s3");
		}else {
			System.out.println("s1!=s3");
		}
		
		equalsIgnoreCase : ��ҹ��� ������ ���� => �˻�
		equals : ��ҹ��� ���� => �α��� , ���̵��ߺ�
		
		*/
		if(s1.equalsIgnoreCase(s3)) {
			System.out.println("s1==s3");
		}else {
			System.out.println("s1!=s3");
		}
		
	}
}
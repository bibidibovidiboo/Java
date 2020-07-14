/*	< �����ε�  >
 *  �ڹ� 
 *   1��°�� => package�� (�ѹ��� ����� ����)
 *   2��°�� => import (������ ����� ����)
 *   3��°�� => 
 *   public class className{
 *   	�ʿ��� ���� ���� => �������
 *   	������ ���� �ʱ�ȭ => ������
 *   	��� => �޼ҵ�
 *   }
 * 
 * 	 ===> �ٸ� Ŭ������ ���ÿ���
 * 		  import com.sist.opp.* => ������ \\�� �ƴ϶� .���� ǥ��
 * 
 * 		    ��Ű��
 * 			com.ȸ���.��ɸ� => com.sist.client , com.sist.server
 * 			org.������.��ɸ� => org.springframework.web.servlet.view*
 * 
 * 		    ĸ��ȭ
 * 		 	= ������ private
 * 			= �޼ҵ�� public ==> ���� (getter/setter)
 * 		    ���
 * 			= extends : ������ Ŭ������ ����� ������ �´�
 * 						���� ��Ӹ� ����
 * 		    ������
 *			= ���� , �߰� 
 *
 *		  =================================== ���������� �ƴ϶� ������� 
 * 	
 *	   �����ε� (�����ڿ��� �ַ� ���)
 *	 	= ���� �޼ҵ������ �������� ����� �����
 *		  1. �Ű������� �ٸ��� (������ ���������� �ٸ���)
 *		  2. �������� �������
 *		  3. ���� Ŭ���������� ����� 
 *
 *		  plus() : 
 *		  int + int =====> plusInt(int a,int b)
 *		  double + double ===> plusDouble(double d,double 1)
 *		  int + double ==> plusIntDouble(int a,double d)
 *		  String + String ==> plusString(String s1,String s2)
 *		  float + double
 *		  long + int
 *		  int + char
 *		  char + double
 *		  String + char
 */
// ��κ��� �޼ҵ�� �ν��Ͻ� 
// static => ���� , ������� �� �� X   
//			  �ȿ� �ν��Ͻ� ���� �� X
// �ν��Ͻ� => ������� �� �� O 
package com.sist.oop;
class Calc{
	// �ν��Ͻ� �޼ҵ� : new ��� �� ���� ���� ����Ǵ� �޼ҵ�
	public void plus(int a,int b) {
		System.out.printf("%d+%d=%d\n",a,b,a+b);
	}
	public void plus(double a,double b) {
		System.out.printf("%f+%f=%f\n",a,b,a+b);
	}
	public void plus(String a,String b) {
		System.out.printf("%s+%s=%s\n",a,b,a+b);
	}
	public double plus(double c,char d) {
		return d+c;
	}
}
public class �����ε�_�ߺ��޼ҵ����� {
	int a=10;
	static int b=20;
	public void disp1() {
		System.out.println(this.a); 
		System.out.println(this.b);
		// this�� �浹�� ������ ������ ����
		// this = �����ε�_�ߺ��޼ҵ�����()�� Ŭ���� 
	}
	public static void disp2() {
		System.out.println(b);
		�����ε�_�ߺ��޼ҵ����� aa=new �����ε�_�ߺ��޼ҵ�����();
		System.out.println(aa.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cc=new Calc(); // �޼ҵ� ��ü�� ����
		cc.plus("Hello", "Java");
		cc.plus(100, 200);
		System.out.println(b);
		
		�����ε�_�ߺ��޼ҵ����� aa=new �����ε�_�ߺ��޼ҵ�����();
		System.out.println("aa="+aa);	
		System.out.println(aa.a);
	}
	
}

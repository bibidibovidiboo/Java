/*	< �������ڿ� �����ε�  >
 * 	display(int, int)
 *  display(String, String, int)
 *  display(String, int, double)
 *  
 *  => display (Object...arg)
 *  
 *  display(int,int)
 *  display(int,int,int)
 *  display(int,int,int)
 *  
 *  ==> display(int...arg)
 *  
 *  �����ε����� �������ڸ� �� ���� �����
 *  
 */
package com.sist.method;
import java.lang.reflect.Method;
class A{
	public void display1(String name) {
		System.out.println("Hello~~\n"+name);
	}
	public void display2(String name) {
		System.out.println("Hello~~\n"+name);
	}
}
public class �޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A a=new A();
		// a.display("�̺���");
		try {
			Class clsName=Class.forName("com.sist.method.A");
			Object obj=clsName.newInstance();
			// A a=(A)obj; // ����ȯ
			// a.display("��û��"); 
			Method[] method=clsName.getDeclaredMethods();
			for(Method m:method) {
				System.out.println(m.getName());
			}
		} catch(Exception ex) {}
	}

}











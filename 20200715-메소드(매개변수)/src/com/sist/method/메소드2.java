/*	< 가변인자와 오버로딩  >
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
 *  오버로딩보다 가변인자를 더 많이 사용함
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
public class 메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A a=new A();
		// a.display("이보미");
		try {
			Class clsName=Class.forName("com.sist.method.A");
			Object obj=clsName.newInstance();
			// A a=(A)obj; // 형변환
			// a.display("심청이"); 
			Method[] method=clsName.getDeclaredMethods();
			for(Method m:method) {
				System.out.println(m.getName());
			}
		} catch(Exception ex) {}
	}

}











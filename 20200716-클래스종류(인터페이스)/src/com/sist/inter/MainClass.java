/*	< �������̽�  >
 * 	 - �߻�Ŭ������ ����(�߻�Ŭ������ ������ ����)
 * 	 - �̿ϼ��� Ŭ���� => �ڽ��� �޸� �Ҵ��� �� �� ���� (������ Ŭ������ ���ؼ� �޸� �Ҵ�)
 * 	 - �߻� Ŭ����(���� ���) , �������̽�(���� ���)
 *   - ��� �޼ҵ尡 abstract => ���� ����
 *     ***JDK 1.8 => default �޼ҵ带 �̿��ؼ� �޼ҵ� ������ ����
 *   - ���� (�߻�Ŭ����:������� , �������̽�: ���������)
 * 	   int a; ==> int a=10;
 * 	 - interface A 
 * 	   {
 * 		  // ����
 * 		   int a=10; ===> JVM (public static final int a=10)
 * 		    
 * 		  // �޼ҵ�
 * 		  void aaa(); ====> JVM (public abstract void aaa());
 * 
 * 		  int bbb();
 * 	
 * 		  interface A {
 * 			 (public abstract) void aaa();
 * 		  }
 *  	  => ���� 
 *  	  class B implements A {
 *  		void aaa(){
 *  		}
 *  	  }
 * 	 
 * 		   �������̵� :
 * 		  1) ��Ӱ���
 * 		  2) �޼ҵ���� ����
 * 		  3) �ް����� ����
 * 		  4) �������� ����
 * 		  5) ���������� => Ȯ�� , ���(x)
 * 
 * 		  public > protected > default > private
 * 
 *  	  *** �������̽��� ����� ��� �޼ҵ��  public�̴� 	
 * 		  *** �������̽��� ����� ��� ������  public�̴�(���)
 * 
 * 		    ��� :
 * 		   	�������̽� ==> �������̽�
 * 				extends
 * 			�������̽� ==> Ŭ����
 * 				implements
 *  		Ŭ���� ==> �������̽�
 * 				error
 * 			
 * 			interface A
 * 			   K  L
 * 			interface B extends B
 * 				P => K L 
 * 			class C implements B
 * 				P
 * 				K	
 * 				L �����Ѵ� 
 * 			===================================
 * 			interface A
 * 			interface B
 * 			class C implements A,B => ���߻��
 * 			===================================
 * 			interface A
 * 			class B
 * 			class C extends B implement A 
 * 					========  ===========
 * 			�� �������̽��� ��� �޼ҵ尡 ������ �ȵȴ�
 * 
 */
// �������̽��� Ŭ������ ��
package com.sist.inter;
interface ���� {
	void eat();
	// JDK 1.8 => ������ �޼ҵ� ���� (default)
	default void run() {
		System.out.println("�׹߷� �ȴ´�");
	}
}
class �� implements ����{
	public void eat() {
		System.out.println("�Ұ��� �Դ´�");
	}
}
class �� implements ����{
	public void eat() {
		System.out.println("������ �Դ´�");
	}
}
class ���� implements ����{
	public void eat() {
		System.out.println("�������� �Դ´�");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���� ani=new ��();
		ani.eat();
		ani=new ��();
		ani.eat();
		ani=new ����();
		ani.eat();
		
	}

}

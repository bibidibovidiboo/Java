// < �κ� ó��  > 
package com.sist.exception;
public class MainClass3 {
	public static void main(String[] args) {
		// �κ������� try�� ����� �� �ִ� �ڡ�
		try {
			  for(int i=1;i<=10;i++) {
				  try {
				  System.out.println("i="+i);
				  int a=i/(int)(Math.random()*3); // error
				  System.out.println("a="+a);
				  }catch(Exception e) {
					  System.out.println("for�� i++�� �̵�");
				  } // for�� �ȿ� try-catch�� ������ for������ �ö�
			  }
		}catch(Exception e) {
			System.out.println("���� �߻�");
		}
		System.out.println("���α׷� ���� ����!!");
	}
}

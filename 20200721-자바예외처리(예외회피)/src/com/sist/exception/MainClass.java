// ����ȸ�� +
package com.sist.exception;
public class MainClass {
	// ArithmeticException => 0�� ���� ������ �߻� �� �� �ִ� �˷��� 
	public int div(int a,int b) throws Exception {
		return a/b; // 0���� ������ ������ �߻��� �� �ִ�
	}
	// ArithmeticException => RuntimeException / main���� ������ ���� (����ó�� ���Ѱ� �ƴ�)
	// Exception ���� �ȿ� �ִ°� �ݵ�� ����ó���� �ؾ��Ѵ� �ڡ�
	public static void main(String[] args) {
		MainClass m=new MainClass();
		int res=0;
		try {
			res = m.div(10, 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(res);
				
	}
}
// 예외회피 +
package com.sist.exception;
public class MainClass {
	// ArithmeticException => 0이 들어가면 에러가 발생 할 수 있다 알려줌 
	public int div(int a,int b) throws Exception {
		return a/b; // 0으로 나누면 에러가 발생할 수 있다
	}
	// ArithmeticException => RuntimeException / main에서 생략이 가능 (예외처리 안한게 아님)
	// Exception 영역 안에 있는건 반드시 예외처리를 해야한다 ★★
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
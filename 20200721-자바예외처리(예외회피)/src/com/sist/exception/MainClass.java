/*	< 예외회피  > 
 *      = 에러에 대한 예측이 가능하게 만든다 
 *        대부분의 프로그램은 => 직접처리 (try~catch)
 *        ==> API(자바,라이브러리)
 *      = 프로그래머가 예외처리를 각자 프로그램에 맞게 처리 유도 
 *      = 형식)
 *         메소드() throws 예측한 예외 클래스 등록 
 *         예) 순서없이 나열이 가능 
 *            public void display() throws Exception,ArrayIndexOutOfBoundsException,NumberFormatException
 *            {
 *            }
 *         ==> 예외처리는 호출하는 메소드에서 처리 
 */
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
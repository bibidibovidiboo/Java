package com.sist.exception;
// 프로그래머가 직접 제작하지는 않지만 => 외부라이브러리
public class MainClass1 {
	public void display() throws ArrayIndexOutOfBoundsException,ArithmeticException,
	NumberFormatException,Exception {
		
	}
	// public static void main(String[] args) throws Exception {} => main에 처리 ①
	public static void main(String[] args) {
		/* ②
		MainClass1 m=new MainClass1();
		try {
			m.display();
		} catch(RuntimeException e) { 
			
		} catch(Exception e) {
		}
		*/
		// ③
		MainClass1 m=new MainClass1();
		try {
			m.display();
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException |
			 	NumberFormatException e) { // 얘네는 생략이 가능 => 밑에 Exception에서 처리 
			e.printStackTrace();
		} catch (Exception e) {
			
		}
	}
}

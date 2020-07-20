package com.sist.exception;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		}catch(ArithmeticException e) {
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}catch(NumberFormatException e) {
		 // 웹에서 주로  error	
		}
		
		try {
			
		}catch(RuntimeException e) {}
			
		try {
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | 
				NumberFormatException e) // 이렇게 |로 묶을 수 있음
		{
			
		}
		
	}
}

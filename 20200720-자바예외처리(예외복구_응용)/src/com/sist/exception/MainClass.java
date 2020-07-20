/* < 예외처리  >
 *  
 */
package com.sist.exception;
import javax.swing.*;

import jdk.nashorn.internal.ir.CatchNode;
public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String num1=JOptionPane.showInputDialog("첫번째 정수 입력:");
		String num2=JOptionPane.showInputDialog("두번째 정수 입력:");
		// 배열에 첨부 
		int[] arr=new int[2];
		// 문자열을 정수로 변환
		arr[0]=Integer.parseInt(num1); // 숫자 ==> "10" "1 0" "10" 
		arr[0]=Integer.parseInt(num2);
		
		int result=arr[0]/arr[1];
		System.out.println("result="+result);
	
		}catch(NumberFormatException e) {
			System.out.println("정수만 입력");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위 초과");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없다");
		}catch(RuntimeException e) { // 
		e.printStackTrace(); // 에러난 부분 보여줌 
	
	}System.out.println("처음부터 다시 입력!!");
	
	}
}

/* < ����ó��  >
 *  
 */
package com.sist.exception;
import javax.swing.*;

import jdk.nashorn.internal.ir.CatchNode;
public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String num1=JOptionPane.showInputDialog("ù��° ���� �Է�:");
		String num2=JOptionPane.showInputDialog("�ι�° ���� �Է�:");
		// �迭�� ÷�� 
		int[] arr=new int[2];
		// ���ڿ��� ������ ��ȯ
		arr[0]=Integer.parseInt(num1); // ���� ==> "10" "1 0" "10" 
		arr[0]=Integer.parseInt(num2);
		
		int result=arr[0]/arr[1];
		System.out.println("result="+result);
	
		}catch(NumberFormatException e) {
			System.out.println("������ �Է�");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭���� �ʰ�");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� ����");
		}catch(RuntimeException e) { // 
		e.printStackTrace(); // ������ �κ� ������ 
	
	}System.out.println("ó������ �ٽ� �Է�!!");
	
	}
}

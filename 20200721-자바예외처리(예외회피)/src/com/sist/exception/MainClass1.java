package com.sist.exception;
// ���α׷��Ӱ� ���� ���������� ������ => �ܺζ��̺귯��
public class MainClass1 {
	public void display() throws ArrayIndexOutOfBoundsException,ArithmeticException,
	NumberFormatException,Exception {
		
	}
	// public static void main(String[] args) throws Exception {} => main�� ó�� ��
	public static void main(String[] args) {
		/* ��
		MainClass1 m=new MainClass1();
		try {
			m.display();
		} catch(RuntimeException e) { 
			
		} catch(Exception e) {
		}
		*/
		// ��
		MainClass1 m=new MainClass1();
		try {
			m.display();
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException |
			 	NumberFormatException e) { // ��״� ������ ���� => �ؿ� Exception���� ó�� 
			e.printStackTrace();
		} catch (Exception e) {
			
		}
	}
}

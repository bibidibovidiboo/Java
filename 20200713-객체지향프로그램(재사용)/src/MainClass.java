/*	< ����  >
 * 	������ ������� Ŭ������ ��� (�ݺ� �ڵ��� ����)
 * 	1) ��� (is-a)
 * 	�̹� ������� ����� �����ؼ� ���
 * 	public class MyWindow extends JFrame
 * 						  ==============
 * 						    Ȯ��� Ŭ����	 
 * 	2) ���� (has-a)
 *  �̹� ������� ����� �����ؼ� ���
 *  public class MyWindow {
 *  	JFrame f=new JFrame();
 *  }
 *  
 *  / ��� 
 *  AŬ������ ������ �ִ� ��� ���� ���  => �ڡ�  ���� (private , static , ������)
 *  
 *  public class A {
 *  	String name;
 *  	int age;
 *  	public void display();  
 *  }
 *  
 *  public class B extends A {
 *  	int age;
 *  	public void display(); 
 *  }
 *  
 *  
 *  
 */
import javax.swing.*;
public class MainClass extends JFrame {
	// extends String => X ����� �� ���� class ==> final class
	// final class : scanner , String , math ��� 
	/*
	 * public MainClass() { } 
	 * �����ڴ� �������̸� public �޼ҵ�� �����  
	 * 
	 */
	 public MainClass() {
		 // ���
		 super.setSize(300, 300);
		 this.setVisible(true);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

}

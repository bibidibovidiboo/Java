// java.util : ���α׷����� ���� ����ϴ� Ŭ������ ����
// java.util : �ݵ�� import�� ����Ѵ�
// �ʱ� +
package com.sist.util;
import java.util.*;
public class MainClass {
	public void random() {
		Random r=new Random();
		int a=r.nextInt(101); // int a=(int)(Math.random()*101) => ������
		// 0 ~ 100 => 0���Ͷ� �׻� ���� �ϳ� �� ���� ( ) �ȿ� �ִ´� 
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new => �����Ѵٴ� �ǹ�
		MainClass m=new MainClass(); // m=> random()�� �����
		m.random(); 
		MainClass m1=new MainClass(); // m1=> random()�� ����� ==> ���ε��� ����&�۵� (�ν��Ͻ�)
		m1.random();
		
		// ���� �޸� ������ static�� �Ἥ public void random() �� ��ٸ� 
		// MainClass.random(); �� �Ἥ �ҷ��� �� ���� 
		// ����� ���� �޼ҵ�� �ڵ� ȣ���� ���� 
		// ȣ���� �ȵǸ� ������ �ȵż� �� �ҷ��;� �Ѵ� �ڡ� ==> �� main�� �ڵ����� ȣ�� 
		
	}
	
}

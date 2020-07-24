/*
 *   < Collection >  
 *   =========== �ڷᱸ��
 *   �޸� �����ؼ� ���� ���ϰ� ��� ����   => ������ => �迭
 *   => ���Ǵ� ���α׷� : �����=> CURD -> ���� : �޸� 
 *   										��� ������ ������ ����  -> ���������������� ���� �ʿ�
 *      CURD => �б�, ����, ����, ���� ���尹��
 *      ���̺귯�� => ��� ������ ���� => ǥ��ȭ
 *      �б� : get()
 *      ���� : size()
 *      ���� : set()
 *      ���� : remove()
 *      ���� : add()
 *   - ����
 *    1) ������ ���� �ߺ��� ������ �߰�   
 *       List(�������̽�) ==========> �����ͺ��̽�
 *         => ������ Ŭ����
 *            ArrayList**  : �񵿱�
 *            Vector**   : ����ȭ
 *            LinkedList
 *            Queue
 *            Stack
 *    2) ������ ���� �ߺ��� ���� ������ �߰� ===> Ž����
 *    	 Set
 *        	  HashSet
 *            TreeSet
 *    3) Ű, ������ ==> �� ���� ���ÿ� ���� ===> Ŭ���� ����
 *       Map
 *            Hashtable
 *            HashMap**
 *  
 */
package com.sist.collection;
import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		// �߰�
		/*
		list.add(10); // 0
		list.add(10.5); // 1
		list.add("ȫ�浿"); // 2
		list.add('A'); // 3
		
		// �� �б�
		int a=(int)list.get(0); // (int) �������� => ����ȯ
		double d=(double)list.get(1);
		String s=(String)list.get(2);
		char c=(char)list.get(3);
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(s);
		System.out.println(c);
		*/
		// ������ �ٲ� �̰� �� ���� => ���������� ���缭 �����
		list.add("ȫ�浿"); //0
		// list.add("������"); 1
		list.add("��û��"); //1 ==> 2�� 
		list.add("�̼���"); //2 => ���� �����Ǹ� #
		list.add("�ڹ���"); //3 => 2��  ==> 3��
		list.add("������"); //4 => 3��  ==> 4��
		
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		list.remove(2); // 2�� �̼��� ���� => ������� ������ �ߴܵǴ°� �ƴ϶� ������ ��ȣ�� �ٲ� #
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		list.add(1, "������"); // 1�� ��ġ�� �긦 ��� (�ε�����ȣ = 1�� ����)
		/*	
		 * 	����	==> 3 �߰�
		 * 	0		0
		 * 	1		1,  
		 *  2		2
		 *  3		=> 3�߰�
		 *  4		4
		 *  		5
		 *  
		 *  ����  ==> 2����
		 *  0		0
		 *  1		1
		 *  2		=> 2 ����
		 *  3		2
		 *  4		3
		 *  
		 *  �߰��ǰų� �������� �˾Ƽ� ���ִ� �迭 �Ƚᵵ �� ==> �˾Ƽ� �ٲ��ִ� ���� �ڡ�
		 *   
		 */
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
	}

}
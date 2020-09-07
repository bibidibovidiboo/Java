/*   
 * 	  ArrayList ���� , Vector ���� , Map
 * 
 *	 	 List
 * 		======
 * 		  |
 * 		--------------------------------
 * 		ArrayList Vector    LinkedList
 * 		---------------------
 * 		���� ���� : ����ȭ / �񵿱�ȭ
 * 
 *   => ArrayList�� ���ټ��� ���Ƽ� ���� ����Ѵ� �ڡ�
 *      
 */
package com.sist.lib;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
public class MainClass2 {
	 public static void main(String[] args) {
		// ArrayList<String> names=new ArrayList<String>();
		// Vector<String> names=new Vector<String>(); 
		LinkedList<String> names=new LinkedList<String>();
		
		// ArrayList �ϳ��� �˸� Vector , LinkedList �� ��� ���� => �޼ҵ尡 ���� �ڡ�
		// �߰�,���� �� �ӵ��� ���� ���� �� =>  LinkedList
		// => �޸� �ȿ��� ���ڿ��� ���� 
		
		names.add("ȫ�浿"); // �ε��� ��ȣ 0
		names.add("��û��"); // 1
		names.add("�̼���"); // 2
		names.add("������"); // 3
		names.add("������"); // 4 
		
		System.out.println("����� ����:"+names.size());
		System.out.println("=======================");
		// size => ���� ���� ���� �� ���� 
		// ��� => for�� �����ϱ� �� , �ҽ��� �����ϰ� �ϱ� ����
		
		// �� i<names.size => ������ �����ϱ� ������ �̷��� �� 
		for(int i=0;i<names.size();i++) {
			// �����͸� ���� �� 
			String name=names.get(i);
			// ���ϴ� ��ġ�� ����� ������ �б�
			
			System.out.println(name+":"+i); // �ε����� �ڵ� ���� => 0�� ���� ����
		}
		
		// ���ϴ� ��ġ�� ���
		// add() => 5
		// add(index,"��")
		
		System.out.println("==============�������� �߰�");
		
		// �߰� 
		names.add(3,"��������"); // �߰��� 3�� ���������� �߰��ϴ� �ڿ� �ε��� �˾Ƽ� �����
		for(int i=0;i<names.size();i++) {
			// �����͸� ���� �� 
			String name=names.get(i);
			// ���ϴ� ��ġ�� ����� ������ �б�
			
			System.out.println(name+":"+i);			
		}
		
		System.out.println("================�̼��� ����");
		
		// ���� 
		names.remove(2);
		for(int i=0;i<names.size();i++) {
			// �����͸� ���� �� 
			String name=names.get(i);
			// ���ϴ� ��ġ�� ����� ������ �б�
			
			System.out.println(name+":"+i); 
		 
		}
		
		System.out.println("==============��������=>�ڹ���");
		
		// ����
		names.set(2, "�ڹ���"); // �������� => �ڹ��� 
		for(int i=0;i<names.size();i++) {
			// �����͸� ���� �� 
			String name=names.get(i);
			// ���ϴ� ��ġ�� ����� ������ �б�
			
			System.out.println(name+":"+i); 
		 
		}
		names.clear(); // ��ü����  , �Ѱ������� remove
		System.out.println("����� ����:"+names.size());
		
	 }
}
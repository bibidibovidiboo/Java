/*	< ĸ��ȭ �ڵ� >
 * 	����(���,����) ==> private ==>  setter / getter 
 * 	�޼ҵ� ==> public
 * 	������ ==> public
 * 
 */
package server;
import client.Student;
public class SchoolSystem {
	public void display() {
		Student s=new Student();
		s.name="�̺���";
		s.setHakbun(2);
		s.setSubject("����");
		s.setTel("010-1111-1111");
		System.out.println("�̸�:"+s.name);
		System.out.println("��ȭ:"+s.getTel());
		System.out.println("����:"+s.getSubject());
		System.out.println("�й�:"+s.getHakbun());
	}
	// static�� �ƴѰ� new �̿��ؼ� ����� ȣ���ؾ���
	// ���� - setter , �о���� - getter
	public static void main(String[] args) {
		SchoolSystem ss=new SchoolSystem();
		ss.display();
	}
		
}

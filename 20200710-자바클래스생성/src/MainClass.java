/*	< Ŭ����  >
 * 	 ���� : �������� ���� �� �� (�ݵ�� �������� ���� ������)
 * 	 				   ==> �߻�ȭ 
 * 	 ��) 
 * 		��ȭ ���� 
 * 		=======
 * 		��ȭ�� , ���� , �⿬ , �帣 , ���� , �ٰŸ� 	
 * 
 * 	 ������ ���� (p.246)
 * 		���α׷��� ���� 
 * 	 	====================================================
 * 	 	- ������� => new�� ����� ������ ���� ����Ǵ� ���� (�ν��Ͻ� ����)
 * 		  *** �޸� ��������� ���� => new�� �̿��� �� ���������
 * 		  *** heap : ���α׷��Ӱ� �����ϴ� ���� (�ڵ�ó���� �ȵȴ�)
 * 					  �޸𸮸� ������� ���� ��� (����ó��,GC)
 *   	- �������� => �޸𸮰� �Ѱ� => �������� ���Ǵ� ���� (���� ����) ==> static
 *   	  *** �����Ϸ��� ������ �� �� �ڵ����� ����
 *   	  *** �޼ҵ念��(static,�޼ҵ�)
 *   	- �������� => �������� , �Ű�����
 *    	  *** �޸𸮰� �����Ǵ� ���� => �޼ҵ� ȣ�� �� 
 * 		  *** �޸𸮰� ��ü ���� {}�� ����� �ڵ� ȸ�� ==> stack(LIFO)
 * 		  int a;
 * 		  int b;
 * 		  int c; => ����
 * 
 * 		- ������ 
 * 		  => ��������� �ʱⰪ �ο�
 * 		  => ����� �̿��ϰų� ���� �б�...
 *  	          �����ϰ� �����Ͱ��� ������ �� �� , ����
 * 			 => ���� (�ڵ����� �����Ϸ��� �߰�=> default������ => �Ű������� ���� ������)
 * 			 => �����ڴ� �ݵ�� �ʿ��ϴ�
 * 			 => �޸𸮿� ����(Ŭ����) ==> ȣ��Ǵ� �޼ҵ�
 * 				========
 * 				new ������() => �ѹ��� ȣ���Ѵ� ==> this (�ڽŰ� ������)
 * 
 * 		- �޼ҵ� : ���
 * 		    ����� / ������
 * 		    ������ �޼ҵ��(�Ű�����...) => �����
 * 	      {
 * 			  ������
 * 		  }
 * 		  ====> �����+������ = ����
 * 		 	�޼ҵ� ����  >
 * 			 - �ν��Ͻ� �޼ҵ� : Ŭ�������� ���� ����ϴ� �޼ҵ�
 * 			 - ���� �޼ҵ� : static => ��� Ŭ������ �������� ���Ǵ� �޼ҵ�
 * 			 - �߻� �޼ҵ� : ����θ� ���� (p.377)
 * 			                         ������ �ȵ� �޼ҵ� => ���α׷��Ӱ� ���� �� ���
 *
 */
class Student{
	// �л� 1�� ���� ���� ==> �޸� ���� ������ ���� �� �ִ� (new)
	String name;
	String subject;
	int year;
	static String school; // �޸𸮿� ����
	Student(){};
		
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static���� ���
		Student.school="SIST";
		Student s=new Student(); // name,year,subject =>  ���� (s��� �ּҿ� ����)
		System.out.println(s);
		
		// student@7852e922
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		s.name="ȫ�浿";
		s.subject="���߰�";
		s.year=3;
		
		// �޼ҵ嵵 ����
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		Student s1=new Student();
		System.out.println(s1); // 0
		s1.name="��û��";
		s1.subject="�����";
		s1.year=2;
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.year);
		System.out.println(Student.school);
		
		String ss="Hello Java";
		ss.replace('H','K');
		String ss1="123456789";
		String.valueOf(10); // static �޼ҵ�		

	}

}

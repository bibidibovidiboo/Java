/*	< �񱳿�����  >
 * 	���� => 
 * 		��� : ������� �� �� ����
 * 				int + int = int
 * 			double + int = double
 * 			float + long = float
 * =================================
 * 		�� : true/false
 * 		��: true/false
 * ================================= ���ǹ� (if)
 * 		���� : 
 * 	�񱳿����� : ���� ���� �� => ����, �Ǽ�, ����, �� 
 * 						���ڿ��� ���� �� ����   ex) "Hello"=="Hello"  (X)  => equals() ���
 * 						���ڿ��� �����ϴ� �������� => string
 * 						char c='Hello' (x)
 * 						string s="Hello" (o)
 * 		1) ���� 
 * 			== : ����
 * 			!= : ���� �ʴ�
 * 			<  : �۴�
 * 			>  : ũ��
 * 			<= : �۰ų� ����
 * 			>= : ũ�ų� ����
 * 		2) ����� : boolean
 *	
 */
public class ���׿�����_�񱳿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		char c='A';
		System.out.println(c++);
		System.out.println(c);
		System.out.println(b++==a);
		System.out.println(10==20);
		System.out.println(10!=20);
		System.out.println(10<10);
		System.out.println(10>10);
		System.out.println(10<=10);
		System.out.println(10>=10);
		
		System.out.println('A'==65);
		//char�� ���� ����� ������ ��ȯ�ȴ�

	}

}

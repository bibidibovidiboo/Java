/*  < ���� 15��  >
 * 	���� ==> �Ѱ��� �����͸� ����
 * 			����, �Ǽ�, ����, true/false
 * 			==> �޸� ũ�� ����
 * 				=======
 * 				�ڹٿ��� �޸� ũ�⸦ ���� ==> �⺻��
 * 			==> ��������(�ڷ���)
 * 				�Ǽ� : double(8byte),float(4byte)
 * 				==============================
 * 				default : double
 * 				���� : byte (1byte)
 * 					 short (2byte)
 * 					 int (4byte)
 * 					 long (8byte)
 * 
 * 					 200000000000L
 * 				���� : char(2byte) 0~65535 => Unicode
 * 				�� : boolean(1byte) =>  true/false
 * 
 */
import java.util.*;
public class ����15 {
	// 2�ڸ� ����(10~99) ���̸� �Է¹ް�, ���� �ڸ��� ���� �ڸ��� ������ �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ��غ���.
	// ex. 2�ڸ� �� ����(10~99):77 > "Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�."
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("(10~99):89>");
		a=scan.nextInt();
		if(a%11==0) 
		{
			System.out.println("10�ڸ��� 1�ڸ��� ����");
		}
		else 
		{
			System.out.println("10�ڸ��� 1�ڸ��� �ٸ���");
		} 
		
		// ���Ŀ�  string ������� ����
		
		/*	Console
		 *  (10~99):89> 77
		 *	10�ڸ��� 1�ڸ��� ����
		 */
	}	
}

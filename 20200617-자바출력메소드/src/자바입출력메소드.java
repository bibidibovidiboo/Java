/*  < �����  >
 * 
 *	class Scanner{
 *	}
 *
 */
import java.util.*; // Scanner => ������ ������� �ڹ������� �о� �´�
public class �ڹ�����¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է°� �ޱ�
		/*
		 * System.out.println("���� �Է�:"); //ln�� print�� \n�� �� �������� 
		 * System.out.print("���� �Է�:\n"); 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�Ǽ� �Է�:"); // \n, \t
		double a=scan.nextDouble();
		// double �Ǽ� a=100 a=100.0
		// char a=97 ==> a='a'
		System.out.println("a="+a);
		
		/* 
		 *	Console�� double �Է� ��
		 *	�Ǽ� �Է�:
		 *	100
		 *	a=100.0
		 * 
		 *	%d => ����
		 * 	%f => �Ǽ�
		 *	%c => ����
		 *	%s => ���ڿ�
		 * 
		 */	
		//System.out.println(~100);
		System.out.println(Integer.toBinaryString(240)); // ������
		System.out.println(Integer.toHexString(240)); // 16����
		System.out.println(Integer.toOctalString(240)); // 8����
		
		/*
		 *	111000
		 *	f0
		 *	360
		 */
		
		System.out.println(0xf0); // 16����
		System.out.println(0360); // 8����
		System.out.println(0b11110000); // 2����
		System.out.println(~100); // ����ǥ��
		
		// ����� �� : ���� �κ��� �̰� �����̱��� 0x�� ������ 16�����̴ٵ� �������� �˸�� (p.42 ~ 54)
	
	}

}

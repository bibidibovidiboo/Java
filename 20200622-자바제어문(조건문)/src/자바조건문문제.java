/*	< ���� if ���� >
 *	1.  ������ �Է¹޾Ƽ�
 *		¦������ Ȧ������ Ȯ�� => 10�� ¦����, 11�� Ȧ���� if ~ else
 */
import java.util.*;
public class �ڹ����ǹ����� {
	static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� 1�� 	
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		// Ű����� �Էµ� ���� �ޱ�
		int a=scan.nextInt(); // �ʱ� ����
		
		// ¦�� / Ȧ��
		if(a%2==0) // true�� ����
			 System.out.println(a+"��(��) ¦���Դϴ�");
		else // false�� �� ����
			System.out.println(a+"��(��) Ȧ���Դϴ�");
		
	}

}

// < ���� 12�� >
// ����ڷκ��� �ΰ��� ������ �Է� �޾Ƽ� ������ ���� ������ ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
// ���� 14��>
// �ΰ��� ������ �Է� �޾Ƽ� ù° ���� ��° ���� ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
/*	���� ����
 * 	==> ����ó��
 *  ==> ó�� ��� ���
 */
import java.util.*;
public class ����12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� => �޸� ������
		
		int a=0,b=0; // �������� - ������ �ʱ�ȭ (���Ƿ�)
		Scanner scan=new Scanner(System.in);
		System.out.println("�ΰ��� ����:");
		
		// ����ڰ� �Է��� ���� ������ ����
		a=scan.nextInt();
		b=scan.nextInt();
		
		// ���
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b); // 14�� ���� 
		
		/* Console
		 * �ΰ��� ����:
		 * 100 200
		 * -100
         * 20000
         * 100
		 */
	}
}

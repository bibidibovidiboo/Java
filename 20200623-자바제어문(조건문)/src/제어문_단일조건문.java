/*  < ���ǹ�  >
 * 	�ڹٿ��� �����ϴ� ��� (��-��)
 * 	= ���ǹ� , ���ù�
 *  	***= ���� ���ǹ� : if
 *  		����) 
 *  			code=187351
 *  			if(���ǹ�) ==> ���ǹ��� �ݵ�� (����,��,��)
 *  			{ 
 *  				������ true�� ���� �����ϴ� ����
 *  			}
 * 		***= ���� ���ǹ� : if ~ else
 * 			����)
 * 				====> �α��� ó��, ID �ߺ�üũ
 * 				if(���ǹ�)
 * 				{
 * 					������ true�� ��쿡 ó������
 * 				}
 * 				else
 * 				{
 * 					������ false�� ��쿡 ó�� ����
 * 				}
 * 		***= ���� ���ǹ� : if ~ else if ~ else if ~ else
 * 			 ����)
 * 				if(���ǹ�)
 * 				{
 * 					������ true�� �����ϴ� ����
 * 					=> ������ ���� 
 * 				}
 * 			    else if(���ǹ�)
 * 				{
 * 					������ true�� �����ϴ� ���� 
 * 					=> ������ ����		
 * 				}
 * 				else 
 * 				{
 * 					������ true�� �����ϴ� ����
 * 				}
 * 
 *		= ���ù� : switch ~ case
 * 	= �ݺ���
 * 		***= �ݺ�Ƚ���� ������ ��� (for)
 * 		***= �ݺ�Ƚ���� ������ �ȵ� ��� (while)
 * 		= �ݵ�� �ѹ� �̻� ���� (do~while)
 * 	= �ݺ����
 * 		***= break : �ݺ��� ����
 * 		= continue : Ư���κ��� ����
 */
import java.util.*;
public class ���_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		// a,b => ����ڰ� �Է�
		// c => �������� ����
		char op='+';
		Scanner scan=new Scanner(System.in);
		// ������� �Է°��� �޴´�
		System.out.println("ù��° ���� �Է�:");
		a=scan.nextInt();
		
		System.out.println("�ι�° ���� �Է�:");
		b=scan.nextInt();
		// '+' => "+" 
		System.out.println("������(+,-,*,/):");
		op=scan.next().charAt(0);
		// "+" => 'x'
		// Scanner => char�� �޾Ƽ� ó���ϴ� ����� ���� => ���ڿ�
		// System.in => ����ó���� �ؾ��Ѵ�
		
		// ����ó��
		if(op=='+')
		{
			System.out.printf("%d+%d=%d\n",a,b,a+b);
		}
		if(op=='-')
		{
			System.out.printf("%d+%d=%d\n",a,b,a-b);
		}
		if(op=='*')
		{
			System.out.printf("%d+%d=%d\n",a,b,a*b);
		}
		if(op=='/')
		{
			// ���� ó�� ==> ���������� ó�� 
			if(b==0) // b�� 0�̸� ������ ���� ������ ������� ������ �ɾ���
			{
				System.out.println("0���� ���� �� �����ϴ�");
			}
			else
			{
				System.out.printf("%d/%d=%.2f\n",a,(double)b,a/(double)b);
				// �Ҽ��� ���ϰ� ���� �� �־ double�� �߰�����
			}
		}
			
		System.out.println("���α׷� ����");

	} // main ==> end ===> ������ ������ ���α׷��� ����ȴ�
	  // main : ���α׷� ���� , ���� �޼ҵ�
	  // ���α׷� ==> Ŭ���� (1) ==> ������
	

}

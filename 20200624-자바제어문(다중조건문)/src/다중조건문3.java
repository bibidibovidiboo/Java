/* < ��Ģ����  > 
 * 	����
 * 	 => ���� 2��
 * 	 => ������ ( +,-,*,/ ) 
 */
import java.util.*;
public class �������ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� 
		// ���� 2��
		int a=0,b=0;
		// char 1�� (������ �޴�)
		char op='+';
		
		// ������� �Է°��� �޴´�
		Scanner scan=new Scanner(System.in);
		System.out.println("�ΰ��� ���� �Է�(90 100):");
		a=scan.nextInt();
		b=scan.nextInt();
		
		// �����ڸ� �Է�
		System.out.println("������ �Է�(+,-,*,/):");
		op=scan.next().charAt(0); // charAt : ĳ���ͷ� �ٲ㼭 ��
		
		if(op=='+') {	
			System.out.printf("%d+%d=%d\n",a,b,a+b); // %d+%d=%d�� ���� \n�� �ٹٲ�
		}
		else if(op=='-') {
			System.out.printf("%d+%d=%d\n",a,b,a-b);
		}
		else if(op=='*') {
			System.out.printf("%d+%d=%d\n",a,b,a*b);
		}
		else if(op=='/') {
			if(b==0) {
				System.out.println("0���� ���� �� �����ϴ�");
			}
			else {
				System.out.printf("%d+%d=%.2f\n",a,b,a/(double)b); // a/(double)b : �Ǽ��� ���
			}
		}
		else {
			// ������ ���� �ٸ� ���ڸ� �Է� ���� �� ó�� 
			// �׻� �ʿ��Ѱ� �ƴ� -> ���� ���� ��Ȯ�Ѱ� �ʿ������ �Է��̶� �ʿ�
			System.out.println("�߸��� ������ �Է��Դϴ�!!");
		}
		
	}

}

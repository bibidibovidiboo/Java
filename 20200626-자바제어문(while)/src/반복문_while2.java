//  < ���ĺ� ����  >	
//  ����ڰ� ���ĺ��� �Է��ϸ� B ==> AB
// 	D => ABCD
// 	char ==> scan.next().charAt(0) // char �޾Ƽ� ó�� (nextInt����)
//
//	"ABCDE"	=> scan.next()
//	 =====
//   'A' => charAt(0)
//	 'B' => charAt(1)
//
//   ������ �����ٴ°� 1.�������̰� 2.������ �־����
// 	 112111311114111115
// 	  ���� ������ �־�� => �ݺ��� ����� ���� ==> �� �����̴�
import java.util.*;
public class �ݺ���_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� , �޴º��� => ����2���� �ʿ��ϴ�
		char user; // �ʱⰪ - char user=' '�� ����
		// while ==> ������ false �� �� ���� �����ϴ� ���� : ��������
		char c='A';
		// ���� �����ϴ� ���
		Scanner scan=new Scanner(System.in);
		System.out.print("���ĺ��Է�(�빮��):");
		user=scan.next().charAt(0);
		
		while(c<=user) {
			System.out.print(c);
			c++;
		}

	}

}

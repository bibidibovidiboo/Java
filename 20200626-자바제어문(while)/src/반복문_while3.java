/*   < ��ҹ��� ����  >
 *   �������� 
 *   ======
 *      ���� 
 *       = byte(-128~127) 
 *       = int(-21��4õ~21��4õ)
 *       = long
 *      �Ǽ�
 *       = double
 *      ����
 *       = char 
 *      �� 
 *       = boolean(true/false)
 *   ======================= �⺻�� 
 * 
 * 	 ������ ���� : �迭 , Ŭ����
 * 	 ==========
 * 		���ڿ� ���� ���� => String
 * 		����) 
 * 			char c='A' => ���� �Ѱ��� ����
 * 			String s="ABCDEFG" ==> ��,������ (��� ������ ���ڿ�)
 * 			====== =
 * 			�������� ����
 * 
 * 			==> String : Ŭ����
 * 				��� (����)
 * 				=> ���� ����
 * 				String s="ABCDEF";
 * 				s.length() => 6 // ���ڰ���
 * 			 ==> s.charAt(0) ==> 'A'
 */
// ����� ���ڿ��� �Է�
// �빮�� ���� , �ҹ��� ����
import java.util.Scanner;
public class �ݺ���_while3 {
		// ���� -> char , ���ڿ� -> String ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABCDEFG"; // ���� ������ ����
		// System.out.println(s);
		Scanner scan=new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���>>");
		s=scan.nextLine(); // String���� �������� ����
		// �Է��ϰ� ����ġ�� -> nextLine() , ���� ���� �� -> next()
		System.out.println(s);
		// System.out.println("����:"+s.length());
		
		int a=0, b=0;
		// a => �ҹ��� ����
		// b => �빮�� ����
		int i=0; // ������ ������ŭ �����ϴ� ���� => ��������
		// 0������ �����ϴ� �ֵ��� <= (x) , < (o) => 0������ �����ϸ� �ϳ��� �۴� ��
		// �� i<=s.length() (x)
		// i<s.length() ���� ������ŭ ���� 
		
		while(i<s.length()) {
			char c=s.charAt(i); // i ���¿� ���� ��ҹ��� ��� 
			if(c>='A' && c<='Z') 
				b++;
			if(c>='a' && c<='z')
				a++;
		
			i++;
		}
		System.out.println("�빮�� ����:"+b);
		System.out.println("�ҹ��� ����:"+a);
	}
}

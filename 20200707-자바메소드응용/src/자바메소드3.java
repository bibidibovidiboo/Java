/*	< �޼ҵ� ����  >
 *  ����� �����Է� => ¦�� , Ȧ��
 * 	�޼ҵ� 2�� �ʿ� => �Էºκ� , ¦���� Ȧ����
 *  --------------------------------------
 * 	�޼ҵ� => ����� => ���ϰ�
 * 		        �޼ҵ� ��ü���� ��� => ���ϰ�(x) void
 * 	1) => �Է�
 *  2) => �Է� ó��
 *  3) => ��� ��� ==> ��¸� �ϸ� �Ǵϱ�  void / �Ѱ��� ���� ����
 * 
 * 
 */
import java.util.*;
public class �ڹٸ޼ҵ�3 {
	// �����͸� �޾Ƽ� �Ѱܾ��ؼ� �Ű������� �ʿ����� ��
	static int userInput() {
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		int num=scan.nextInt();
		
		return num; // �� �Է��ؼ� �ѱ� ���� �ʿ��ؼ� num ���� ����  
	}  
	// �� 
	static void process(int num) {
		if(num%2==0) {
			System.out.println(num+"��(��) ¦���Դϴ�");
		}
		else {
			System.out.println(num+"��(��) Ȧ���Դϴ�");
		}
		
	}
    // ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=userInput();
		process(num);
	}

}

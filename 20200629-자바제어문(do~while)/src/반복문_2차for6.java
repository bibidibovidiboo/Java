/*  < �ݺ��� ���� >
 * 	*
 *  **
 *  ***
 *  ****
 *  *****
 *  => ����ڰ� �Է��� ����
 *  => p.163 
 */
import java.util.*;
public class �ݺ���_2��for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p.163 ���� ���� 
		// ����� �Է°� 
		/*int user=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		// user�� ����
		user=scan.nextInt();
		for(int i=1;i<=user;i++) 
		{
			for(int j=1;j<=user+1-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/		// p.165 ����
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}
	}
}

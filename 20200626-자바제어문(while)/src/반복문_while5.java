/* 	< while�� >
 *  for���̳� while���� ���� �����ϴ� ������ �ʿ�
 * 	������ Ƚ���� �������� for , Ƚ���� ����������  while�� ���� ������ ������ 
 *  ������ �̷��� ����ϴ°� �ƴ��� ����Ѵ� ��
 *  �ʱⰪ ������ �߿��ϴ� ��
 *  
 * 	������ >
 * 	1) while���� ������ ���� ��� error => for(;;) for���� ����
 * 	   while() => ���ǽ��� ����
 * 		{
 * 		} =====> �����߻�
 * 	2) while���� ���ѷ���
 * 		=> for(;;) => while(true) : ���� ���� ����
 * 		
 * 		for(int i=0;i<10;i++)
 * 
 * 		int i=0;
 * 		while(i<10)	
 * 		{
 * 			i++
 * 		}
 * 
 * 
 * 		int i=5;
 * 		while(--i!=0) ==> i>=0 ( ������ ���� �̷��� ���ô� )
 * 		{
 * 			System.out.println(i); 
 * 			i--;
 * 		}
 */
// 5 ~ 1~5 5�� ���� �ʿ�
import java.util.*;
public class �ݺ���_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0; // ����ڰ� ��û�� ����
		int i=1; // ����ڰ� ��û�� �������� ���� (��������) 0���� 1�� ���� 
		int sum=0; // ����(��)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�:");
		user=scan.nextInt();
		// i��  user���� ������
		while(i<=user) {
			sum+=i;
			i++;
		}
		// i=6
		
		System.out.println("sum="+sum); // ��������� ������ �ۿ��� 
		
		i=1; // �ʱⰪ ����
		System.out.println("i="+i);
		while(i<=5) {
			System.out.print(i);
			i++; // while(i<=10) �س��� i+=2 �ϸ� 2�� ������ 
			// ������  i++�� �ƴ϶� �ǳʶ� �� �ִܰ� ������� ��
		}
		
		// i=6 
		System.out.println();
		i=5; // �ʱⰪ ����
		while(i>=1) {
			System.out.print(i);
			i--;
		}
		// i=0
		// ������ ������ ��� ������ �� �� �ִ�
		
		// int j=i; => ���� �Ϸ���  for�� �ۿ� �����
		
		for(int j=1;j<=10;j++) {
			
		} // j�� {} ������ �޸𸮿��� ����� ��
		// System.out.println(j);

	}

}

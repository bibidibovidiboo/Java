/*  < ���ǹ� ����  >
 * 	�ΰ��� ������ �޾Ƽ�
 * 	�ִ밪,�ּҰ�
 * 
 * 	int a,b
 * 	int max,min
 */
import java.util.*;
public class �ڹ����ǹ�����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		/*
		 * System.out.print("�ΰ��� ������ �Է�:(100 80)"); int a=scan.nextInt(); int
		 * b=scan.nextInt();
		 * 
		 * int max,min;
		 * 
		 * if(a>b) { max=a; min=b; } else { max=b; min=a; }
		 * 
		 * System.out.println("max="+max); System.out.println("min="+min);
		 */
		
		// ������ �Է��� �޾Ƽ� ���밪�� ����ϴ� ���α׷�
		// 1, -1 ==> 1
		System.out.println("���� �Է�:");
		int a=scan.nextInt();
		System.out.println("���밪:"+Math.abs(a)); // ���밪 ���
		if(a<0) // 0 ���� ������ -1�� ������
		{
			System.out.println(-1*a);
		}
		else
		{
			System.out.println(a);
		}
		
		
		
		
		
	
	}

}

/*	< ���ǹ� ����  >
 *  ���ǹ� ���� 1�� ����
 * 	����� �Է� ==> 0,1,2
 * 
 * 	=> 0�̸� => ����
 * 	=> 1�̸� => ����
 * 	=> 2�̸� => ��
 * 
 */
import java.util.*;
public class �ڹ����ǹ�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("����(0),����(1),��(2) �Է�:");
		int user=scan.nextInt();
		
		/*	
		 * int a=scan.nextInt();
		 * System.out.print("���� �Է�:");
		 * if(a==0) { System.out.println("����"); } if(a==1) { System.out.println("����"); }
		 * if(a==2) { System.out.println("��"); }
		 */
		
		if(user==0)
		{
			System.out.println("Player:����");
		}
		if(user==1)
		{
			System.out.println("Player:����");
		}
		if(user==2)
		{
			System.out.println("Player:��");
		}
		
		// ��ǻ�Ͷ� �ϴ� �� 
		int com=(int)(Math.random()*3);
		// 			  ===============
		//			  0.0 ~ 0.99 * 3 ==> 0.0 ~ 2.9.. ==> 0~2
		// == ����, �Ǽ�, ������ ��쿡�� ����� ����
		// "" ���ڿ��� ==���� �񱳰� �Ұ��� => equals()
		// if�� �ȿ��� ��, ��, ���������ڸ� �ַ� ����
		
		if(com==0)
		{
			System.out.println("��ǻ��:����");
		}
		if(com==1)
		{
			System.out.println("��ǻ��:����");
		}
		if(com==2) {
			System.out.println("��ǻ��:��");
		}
		
		// ����� ��
		/*
		 *	��ǻ�� : com
		 *	  ���� => 0
		 *		����� : user 
		 *		���� => 0 => 0
		 *		���� => 1 => (-1)
		 *		�� => 2 => (-2)
		 * 	  ���� => 1
		 * 		����� : user
		 * 		���� => 0 => 1
		 * 		���� => 1 => 0
		 * 		�� => 2 => (-1)
		 * 	 �� => 2
		 * 		����� : user	-2,1
		 * 		���� => 0 => (2)	-1,2
		 * 		���� => 1 => 1
		 * 		�� => 2 => 0
		 * 
		 */
		// �ٿ������°� �ϴ� ���� �ȴ� (�ڿ�����)
		if(com-user==-2 || com-user==1)
		{
			System.out.println("Computer Win!!");
		}
		if(com-user==-1 || com-user==2)
		{
			System.out.println("Player Win!!");
		}
		if(com-user==0)
		{
			System.out.println("����!!");
		}
		
		
		// ��ǻ�Ͱ� ������ ��
		// �ߺ� ���ǹ�
		/* 
		 * if(com==0) { if(user==0) { System.out.println("����!!"); } if(user==1) {
		 * System.out.println("Player Win!!"); } if(user==2) {
		 * System.out.println("Computer Win!!"); } } // ��ǻ�Ͱ� ������ �� if(com==1) {
		 * if(user==0) { System.out.println("Computer Win!!"); } if(user==1) {
		 * System.out.println("����!!"); } if(user==2) {
		 * System.out.println("Player Win!!"); }
		 * 
		 * } // ��ǻ�Ͱ� ���� �� if(com==2) { if(user==0) { System.out.println("Player Win!!");
		 * } if(user==1) { System.out.println("Computer Win"); } if(user==2) {
		 * System.out.println("����!!"); } }
		 */
		
	}

}

/*	< ���� >
 * 	1��)
 * 	A
 *  AB
 *  ABC
 *  ABCD
 *  ABCDE
 * 	============= ���� �ʱⰪ�� ��ġ
 * 	2��)
 * 	ABCDE
 * 	ABCD
 * 	ABC
 *  AB
 *  A
 * 	
 * 	����>
 * 	�ټ�(i)	���ĺ�(j)
 * 	1		  5		====> i+j=6 ===> j=6-i (2�� ���ǰ�)
 *  2         4
 *  3         3
 *  4         2
 * 	5         1
 * 
 *  3��)
 * 	1####
 * 	#2###
 *  ##3##
 *  ###4#
 *  ####5
 * 
 * 	4��)
 * 	25 24 24 22 21
 * 	20 19 18 17 16
 *  15 14 13 12 11
 *  10  9  8  7  6 
 *  5   4  3  2  1  
 */

public class �ݺ���_2��for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======= 1�� =======");
		// 1��
		char c='A';
		for(int i=1;i<=5;i++) {
			c='A'; // �̰� �ȳ����� ���������� ���
			for(int j=1;j<=i;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
		System.out.println("======= 2�� =======");
		
		// 2��
		c='A';
		// i=1  => j=1,j=5 (6-i)
		// i=2  => j=1,j=4 
		for(int i=1;i<=5;i++) {
			c='A'; // �̰� �ȳ����� ���������� ���
			for(int j=1;j<=6-i;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		
		}
		System.out.println("======= 3�� =======");
		
		// 3��
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				// ���
				if(i==j)
					System.out.print(i);
				else
					System.out.print("#");
			}
			// �������
			System.out.println();
		}
		
		System.out.println("======= 4�� =======");
		
		// 4��
		int k = 25;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%2d\t",k);
				k--;
			} 
			System.out.println();		
		}
		System.out.println();
		
		System.out.println("======= 4�� ���� =======");
		
		// 4�� ����
		k = 1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%2d\t",k);
				k++;
			} 
			System.out.println();		
		}
		System.out.println();
		
		/*  ���� >
		 * 	5��)
		 * 	*****
		 * 	 ****
		 *    ***
		 *     **
		 *      *
		 *      
		 *  6��)
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****
		 *  ==================
		 *  
		 *  5�� ����)
		 *  �ټ�(i)  ����(j) ��ǥ(k)
		 *   1       0      5
		 *   2       1      4
		 *   3       2      3
		 *   4       3      2
		 *   5       4      1
		 *   
		 *  6�� ����)
		 *  �ټ�(i)  ����(j) ��ǥ(k)   => i=l k<=i
		 *   1       4      1
		 *   2       3      2
		 *   3       2      3
		 *   4       1      4
		 *   5       0      5
		 *
		 *   7��)
		 *          1
   		 *	       22
  		 *   	  333
 		 *	     4444
		 *	    55555
		 */
		
		System.out.println("======= 5�� =======");
		
		// 5��
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i-1;j++) 
			{
				System.out.print(" ");
			}
			for(k=1;k<=6-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println("======= 6�� =======");
		
		// 6��	
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5-i;j++) 
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();		
		}
		
		System.out.println("======= 7�� =======");
		
		// 7�� 
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5-i;j++) 
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(i);
			}
			System.out.println();		

		}
		
	}
}
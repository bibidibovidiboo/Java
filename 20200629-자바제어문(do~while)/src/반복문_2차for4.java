/*	< 문제 >
 * 	1번)
 * 	A
 *  AB
 *  ABC
 *  ABCD
 *  ABCDE
 * 	============= 변수 초기값의 위치
 * 	2번)
 * 	ABCDE
 * 	ABCD
 * 	ABC
 *  AB
 *  A
 * 	
 * 	수열>
 * 	줄수(i)	알파벳(j)
 * 	1		  5		====> i+j=6 ===> j=6-i (2번 조건값)
 *  2         4
 *  3         3
 *  4         2
 * 	5         1
 * 
 *  3번)
 * 	1####
 * 	#2###
 *  ##3##
 *  ###4#
 *  ####5
 * 
 * 	4번)
 * 	25 24 24 22 21
 * 	20 19 18 17 16
 *  15 14 13 12 11
 *  10  9  8  7  6 
 *  5   4  3  2  1  
 */

public class 반복문_2차for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======= 1번 =======");
		// 1번
		char c='A';
		for(int i=1;i<=5;i++) {
			c='A'; // 이거 안넣으면 순차적으로 출력
			for(int j=1;j<=i;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
		System.out.println("======= 2번 =======");
		
		// 2번
		c='A';
		// i=1  => j=1,j=5 (6-i)
		// i=2  => j=1,j=4 
		for(int i=1;i<=5;i++) {
			c='A'; // 이거 안넣으면 순차적으로 출력
			for(int j=1;j<=6-i;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		
		}
		System.out.println("======= 3번 =======");
		
		// 3번
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				// 출력
				if(i==j)
					System.out.print(i);
				else
					System.out.print("#");
			}
			// 다음출력
			System.out.println();
		}
		
		System.out.println("======= 4번 =======");
		
		// 4번
		int k = 25;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%2d\t",k);
				k--;
			} 
			System.out.println();		
		}
		System.out.println();
		
		System.out.println("======= 4번 역순 =======");
		
		// 4번 역순
		k = 1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%2d\t",k);
				k++;
			} 
			System.out.println();		
		}
		System.out.println();
		
		/*  문제 >
		 * 	5번)
		 * 	*****
		 * 	 ****
		 *    ***
		 *     **
		 *      *
		 *      
		 *  6번)
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****
		 *  ==================
		 *  
		 *  5번 설명)
		 *  줄수(i)  공백(j) 별표(k)
		 *   1       0      5
		 *   2       1      4
		 *   3       2      3
		 *   4       3      2
		 *   5       4      1
		 *   
		 *  6번 설명)
		 *  줄수(i)  공백(j) 별표(k)   => i=l k<=i
		 *   1       4      1
		 *   2       3      2
		 *   3       2      3
		 *   4       1      4
		 *   5       0      5
		 *
		 *   7번)
		 *          1
   		 *	       22
  		 *   	  333
 		 *	     4444
		 *	    55555
		 */
		
		System.out.println("======= 5번 =======");
		
		// 5번
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
	
		System.out.println("======= 6번 =======");
		
		// 6번	
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
		
		System.out.println("======= 7번 =======");
		
		// 7번 
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
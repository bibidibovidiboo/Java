/*	1��)
 * 	1
 * 	2 2 
 *  3 3 3 
 *  4 4 4 4 
 *  5 5 5 5 5 
 *  
 *  1�� for ===> 5 ==> 1~5
 *  2�� for ===> 1-1 , 2-2 , 3-3 , 4-4 , 5-5
 *  1 1    ===> i=j ==> j<=i
 *  2 2 
 *  3 3 
 *  4 4 
 *  5 5
 *  
 *  1
 *  12
 *  123
 *  1234
 *  12345 
 *
 *	11111
 *  2222
 *  333
 *  44
 *  5
 */
public class �ݺ���_2��for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1��
		for(int i=1;i<=5;i++) // �ټ�
		{ 
			 for(int j=1;j<=i;j++) {
				 System.out.print(j);
			 }
			 // ���� ���
			 System.out.println();
		}
		

	}
}

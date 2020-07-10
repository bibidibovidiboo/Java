/* < 반복문 문제  >
 * 1번)
 * 1 1 1 1 1 
 * 2 2 2 2 2 
 * 3 3 3 3 3 
 * 4 4 4 4 4 
 * 5 5 5 5 5 
 * 
 * 2번)
 * A A A A A 
 * B B B B B
 * C C C C C 
 * D D D D D 
 * E E E E E 
*
 */
public class 반복문_2차for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번
		for(int i=1;i<=5;i++) 
		{
			//  출력
			for(int j=1;j<=5;j++) {
				System.out.printf("%2d\t",i);
			}
				System.out.println();
		}
		System.out.println();
		// 2번
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%2c\t",i+64); // 숫자를 알파벳으로 바꿀 때 ★
			}
			System.out.println();
		}

	}

}

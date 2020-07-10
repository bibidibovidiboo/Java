/*	< 별출력 문제  >
 * 	**********
 * 	**********
 * 	**********
 * 	**********
 * 	**********
 */
public class 반복문_2차for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("**********"); 
		// 5번 반복 => 이렇게 코딩할 순 있으나 비효율적
		// 아래처럼 출력하는게 효율적임
		System.out.println("===== for =====");
		for(int i=1;i<=5;i++) {
			System.out.println("**********"); 
		}
		System.out.println("============");
		// 2번방법
		System.out.println("**********");
		for(int i=1;i<=10;i++) {
			System.out.print("*"); // 별을 10개씩 출력해라 
		}
		
		// 3번방법 : 2중 for문으로 출력
		System.out.println("\n====== 2차 for ======"); 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {		
				System.out.print("*");
			}
			// 다음줄에 출력
			System.out.println();
		}
	}
}

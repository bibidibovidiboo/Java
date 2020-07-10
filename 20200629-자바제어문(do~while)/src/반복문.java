/*	< do-while문 >
 * 
 * 	반복문 => 반드시 한번 이상을 수행해야 할 때 (do~while)
 * 	형식 >
 * 		초기값 ==> int i=1; ①
 * 		do{
 * 				↓
 * 			반복 수행문장 출력
 * 			System.out.print(i+" "); ②
 * 				↓
 * 			증가식
 * 			i++; ③
 * 				↓ ==> false면 종료, true면 ②로 이동
 * 		  } while(조건식); ==> i<=5; ④
 * 
 * 		i=1
 * 		  1 i++ (i=2) ==> i<=5 비교 true => do 안으로 이동
 * 		i=2
 * 		  1 2 i++ (i=3) ==> i<=5 비교 true => do 안으로 이동
 * 		i=3
 * 		  1 2 3 i++ (i=4) ==> i<=5 비교 true => do 안으로 이동
 * 		i=4
 * 		  1 2 3 4 i++ (i=5) ==> i<=5 비교 true => do 안으로 이동
 * 		i=5
 * 		  1 2 3 4 5 i++ (i=6) ==> i<=5 비교 false => 종료
 * 
 * 
 */
public class 반복문 {

	public static void main(String[] args) {
		// 초기값
		int i=1; // 루프변수 => 횟수지정
		do {
			System.out.println(i+" "); // 반복 실행문장 (여러문장 실행이 가능)
			i++; // i가 5가 될 때 까지 증가 => 횟수지정
		}while(i<=5);
		// ==> i=6
		System.out.println("\n===== while =======");
		// 초기값
		i=1; // int j=1;
		while(i<=5) { 
			System.out.print(i+" ");
			i++;
		}
		// i=6
		System.out.println("\n====== for =======");
		for(i=1;i<=5;i++) {
			System.out.println(i+" ");
		}	
	}
}
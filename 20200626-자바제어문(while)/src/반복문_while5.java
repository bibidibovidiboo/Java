/* 	< while문 >
 *  for문이나 while문은 서로 변경하는 연습이 필요
 * 	보통은 횟수가 정해지면 for , 횟수가 안정해지면  while을 쓰는 경향이 있으나 
 *  무조건 이렇게 써야하는건 아님을 기억한다 ★
 *  초기값 설정은 중요하다 ★
 *  
 * 	주의점 >
 * 	1) while문은 조건이 없는 경우 error => for(;;) for문은 가넝
 * 	   while() => 조건식이 없다
 * 		{
 * 		} =====> 오류발생
 * 	2) while에서 무한루프
 * 		=> for(;;) => while(true) : 가장 많이 등장
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
 * 		while(--i!=0) ==> i>=0 ( 가독성 좋게 이렇게 씁시다 )
 * 		{
 * 			System.out.println(i); 
 * 			i--;
 * 		}
 */
// 5 ~ 1~5 5번 증가 필요
import java.util.*;
public class 반복문_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0; // 사용자가 요청한 변수
		int i=1; // 사용자가 요청한 변수까지 증가 (루프변수) 0보단 1이 편함 
		int sum=0; // 누적(합)
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		user=scan.nextInt();
		// i가  user까지 가야함
		while(i<=user) {
			sum+=i;
			i++;
		}
		// i=6
		
		System.out.println("sum="+sum); // 최종결과값 보려고 밖에둠 
		
		i=1; // 초기값 설정
		System.out.println("i="+i);
		while(i<=5) {
			System.out.print(i);
			i++; // while(i<=10) 해놓고 i+=2 하면 2씩 증가함 
			// 무조건  i++가 아니라 건너뛸 수 있단걸 명심하자 ★
		}
		
		// i=6 
		System.out.println();
		i=5; // 초기값 설정
		while(i>=1) {
			System.out.print(i);
			i--;
		}
		// i=0
		// 재사용할 변수를 계속 만들어가며 할 수 있다
		
		// int j=i; => 재사용 하려면  for문 밖에 써야함
		
		for(int j=1;j<=10;j++) {
			
		} // j는 {} 끝나면 메모리에서 사라짐 ★
		// System.out.println(j);

	}

}

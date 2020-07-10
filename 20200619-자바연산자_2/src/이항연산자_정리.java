/*	< 이항연산자 정리  >
 * 	응용시 많이 사용하는 연산자
 * 		=> 증감연산자 (++,--)
 * 		=> 산술연산자 (+,-,*,/,)
 * 		=> 비교연산자, 논리연산자
 * 		=> 대입(=,+=,-=)
 * 
 * 		=> 기타연산자
 * 			=> 삼항연산자 => if~else => 게임
 * 				조건 ? 값1:값2
 * 				=> true => 값1
 * 				=> false => 값2
 */
import java.util.*; //정수를 입력받아서 짝수/홀수

//import java.lang* => System, String, Math는 자동으로 사용할 수 있어서 생략가능
public class 이항연산자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan=new Scanner(System.in);
		//system.in : 키보드 입력
		//system.out : 화면
		
		//System.out.println("정수 입력:");
		// 입력받은 정수를 저장
		//int a=scan.nextInt();
		
		//System.out.println(a%2==0?"짝수입니다":"홀수입니다");
		int a=(int)(Math.random()*100)+1;
		//	  ====  =================  =
		//		2	       1		   3
		/*
		 *  연산자 우선순위
		 *  	1) ()
		 *  	2) 단항연산자
		 *  	3) 이항연산자
		 *  (math.random()*100)
		 *  =============  ===
		 *  0.0~0.99       100  => 0.0~99.0
		 *  (int)(0.0~99.0) => (0~99)+1 =>1~100
		 *  
		 *  
		 */
				
		System.out.println("a="+a);
			  System.out.println(a%2==0?"짝수입니다":"홀수입니다");

	}

}

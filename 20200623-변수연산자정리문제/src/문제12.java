// < 문제 12번 >
// 사용자로부터 두개의 정수를 입력 받아서 뺄셈과 곱셈 연산의 결과를 출력하는 프로그램을 작성하시오
// 문제 14번>
// 두개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 출력하는 프로그램을 작성하시오
/*	변수 선언
 * 	==> 연산처리
 *  ==> 처리 결과 출력
 */
import java.util.*;
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언 => 메모리 기억공간
		
		int a=0,b=0; // 변수설정 - 변수의 초기화 (임의로)
		Scanner scan=new Scanner(System.in);
		System.out.println("두개의 정수:");
		
		// 사용자가 입력한 값을 변수에 대입
		a=scan.nextInt();
		b=scan.nextInt();
		
		// 출력
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b); // 14번 문제 
		
		/* Console
		 * 두개의 정수:
		 * 100 200
		 * -100
         * 20000
         * 100
		 */
	}
}

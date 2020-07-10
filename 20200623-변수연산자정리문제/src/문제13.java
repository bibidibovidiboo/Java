// < 문제 13번 >
// 사용자로부터 세개의 정수를 입력받은 다음에 곱과 합을 순서대로 진행해서 그 결과를 출력하는 프로그램을 작성해보자
// 예를 들어 사용자로부터 순서대로 입력받은 세개의 정수가 1,2,3이라면 1*2+3의 계산결과를 출력하는 프로그램 작성하시오
import java.util.*;
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.print("세개의 정수 입력:");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		System.out.println(a*b+c);
		
		/* Console
		 * 세개의 정수 입력:10 20 30 
		 * 230
		 */
	}
}

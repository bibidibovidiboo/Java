/*	< 단일 if 예제 >
 *	1.  정수를 입력받아서
 *		짝수인지 홀수인지 확인 => 10은 짝수다, 11은 홀수다 if ~ else
 */
import java.util.*;
public class 자바조건문문제 {
	static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1번 	
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		// 키보드로 입력된 정수 받기
		int a=scan.nextInt(); // 초기 셋팅
		
		// 짝수 / 홀수
		if(a%2==0) // true면 수행
			 System.out.println(a+"는(은) 짝수입니다");
		else // false일 때 수행
			System.out.println(a+"는(은) 홀수입니다");
		
	}

}

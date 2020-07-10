/* < 사칙연산  > 
 * 	변수
 * 	 => 정수 2개
 * 	 => 연산자 ( +,-,*,/ ) 
 */
import java.util.*;
public class 다중조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 
		// 정수 2개
		int a=0,b=0;
		// char 1개 (연산을 받는)
		char op='+';
		
		// 사용자의 입력값을 받는다
		Scanner scan=new Scanner(System.in);
		System.out.println("두개의 정수 입력(90 100):");
		a=scan.nextInt();
		b=scan.nextInt();
		
		// 연산자를 입력
		System.out.println("연산자 입력(+,-,*,/):");
		op=scan.next().charAt(0); // charAt : 캐릭터로 바꿔서 들어감
		
		if(op=='+') {	
			System.out.printf("%d+%d=%d\n",a,b,a+b); // %d+%d=%d는 형식 \n는 줄바꿈
		}
		else if(op=='-') {
			System.out.printf("%d+%d=%d\n",a,b,a-b);
		}
		else if(op=='*') {
			System.out.printf("%d+%d=%d\n",a,b,a*b);
		}
		else if(op=='/') {
			if(b==0) {
				System.out.println("0으로 나눌 수 없습니다");
			}
			else {
				System.out.printf("%d+%d=%.2f\n",a,b,a/(double)b); // a/(double)b : 실수값 대비
			}
		}
		else {
			// 연산자 외의 다른 문자를 입력 했을 때 처리 
			// 항상 필요한건 아님 -> 계산기 같이 정확한건 필요없으나 입력이라 필요
			System.out.println("잘못된 연산자 입력입니다!!");
		}
		
	}

}

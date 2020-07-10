/*  < 조건문  >
 * 	자바에서 지원하는 제어문 (웹-앱)
 * 	= 조건문 , 선택문
 *  	***= 단일 조건문 : if
 *  		형식) 
 *  			code=187351
 *  			if(조건문) ==> 조건문은 반드시 (부정,비교,논리)
 *  			{ 
 *  				조건이 true일 때만 수행하는 문장
 *  			}
 * 		***= 선택 조건문 : if ~ else
 * 			형식)
 * 				====> 로그인 처리, ID 중복체크
 * 				if(조건문)
 * 				{
 * 					조건이 true일 경우에 처리문장
 * 				}
 * 				else
 * 				{
 * 					조건이 false일 경우에 처리 문장
 * 				}
 * 		***= 다중 조건문 : if ~ else if ~ else if ~ else
 * 			 형식)
 * 				if(조건문)
 * 				{
 * 					조건이 true면 수행하는 문장
 * 					=> 문장을 종료 
 * 				}
 * 			    else if(조건문)
 * 				{
 * 					조건이 true면 수행하는 문장 
 * 					=> 문장을 종료		
 * 				}
 * 				else 
 * 				{
 * 					조건이 true면 수행하는 문장
 * 				}
 * 
 *		= 선택문 : switch ~ case
 * 	= 반복문
 * 		***= 반복횟수가 지정된 경우 (for)
 * 		***= 반복횟수가 지정이 안된 경우 (while)
 * 		= 반드시 한번 이상 수행 (do~while)
 * 	= 반복제어문
 * 		***= break : 반복을 종료
 * 		= continue : 특정부분을 제외
 */
import java.util.*;
public class 제어문_단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		// a,b => 사용자가 입력
		// c => 연산결과를 저장
		char op='+';
		Scanner scan=new Scanner(System.in);
		// 사용자의 입력값을 받는다
		System.out.println("첫번째 정수 입력:");
		a=scan.nextInt();
		
		System.out.println("두번째 정수 입력:");
		b=scan.nextInt();
		// '+' => "+" 
		System.out.println("연산자(+,-,*,/):");
		op=scan.next().charAt(0);
		// "+" => 'x'
		// Scanner => char을 받아서 처리하는 기능이 없다 => 문자열
		// System.in => 예외처리를 해야한다
		
		// 연산처리
		if(op=='+')
		{
			System.out.printf("%d+%d=%d\n",a,b,a+b);
		}
		if(op=='-')
		{
			System.out.printf("%d+%d=%d\n",a,b,a-b);
		}
		if(op=='*')
		{
			System.out.printf("%d+%d=%d\n",a,b,a*b);
		}
		if(op=='/')
		{
			// 오류 처리 ==> 정상적으로 처리 
			if(b==0) // b가 0이면 오류가 나기 때문에 나누기는 조건을 걸어줌
			{
				System.out.println("0으로 나눌 수 없습니다");
			}
			else
			{
				System.out.printf("%d/%d=%.2f\n",a,(double)b,a/(double)b);
				// 소수점 이하가 나올 수 있어서 double을 추가해줌
			}
		}
			
		System.out.println("프로그램 종료");

	} // main ==> end ===> 메인이 끝나야 프로그램이 종료된다
	  // main : 프로그램 시작 , 종료 메소드
	  // 프로그램 ==> 클래스 (1) ==> 여러개
	

}

/*	< 메소드 >
 * 	1) 자동으로 메모리에 저장 => 정적 메소드
 * 	    => 형식 
 * 		static 리턴형(결과값) 메소드명(매개변수...)
 * 		{
 *     		return 값
 *     	}
 * 	2) 프로그래머가 메모리를 만든 다음에 저장 => 인스턴스 메소드
 * 		=> new 연산자를 이용하면 저장이 가능
 * 		=> 프로그램의 중심
 * 		리턴형(결과값) 메소드명(매개변수) 
 * 		{
 *			return 값	
 *		}
 *  3) 메소드의 선언부만 사용 => 추상 메소드
 * 	        리턴형(결과값) 메소드명(매개변수...); => 추상클래스(인터페이스)
 * 
 * 	- 형태  
 * 	1. 메소드 형태
 * 	      선언부 => 메모리에 저장이 안된다
 * 	      구현부 => 메모리에 저장 => 필요한 위치에서 사용이 가능
 * 	
 * 	      리턴형 메소드명 (매게변수...) => 선언부
 * 	      구현부
 * 	   {
 *			가공(처리)
 * 			return 결과값
 * 	   }
 * 		
 * 	      결과값이 없는 경우에는 return을 생략이 가능
 * 	   => JVM => 자동으로 return을 추가
 * 	   return : 메소드가 종료하는 시점 ==> 모든 메소드에는  return이 존재***
 * 	
 * 	   => 리턴형 (결과값) => 결과값은 반드시 한개만 설정
 * 						 기본형 (정수,실수...)
 * 						 데이터가 여러개일 경우
 * 						=================
 * 						 => 데이터를 모아서 한번에 전송 (배열,클래스)
 * 	   => 사용자 입력값 (매개변수,인자,인수) => 사용자 요청값 
 * 		  = 한개일 수 있고 여러개 일 수도 있다 ===> 매개변수는 3개이상 초과(X) 
 * 									   ========== 배열 , 클래스
 * 		  ex) 10명의 국어점수 => 평균 
 * 			  (int a1,.....int a10) =>  (int[] kor)
 * 		
 * 	   => return문 : 모든 메소드에서 반드시 사용 => 메소드 종료 
 * 		    위치는 상관이 없다 (맨앞도 가능)
 * 		    예외) 결과값이 없는 경우에는 생략이 가능
 * 
 * 		
 *    - 결과값 ? (리턴값,반환값) 사용자로부터 받는 값?(매개변수,인자,인수...)
 *    사용자로부터 정수를 입력을 받아서 => 해당 구구단을 출력
 *    
 *    1) 결과값(O) , 매개변수(O) => 구구단을 묶어서 넘겨준다 ->  String
 *    2) 결과값(X) , 매개변수(O) => 메소드 안에서 출력*** -> void 
 *    ↓ 밑에서 예제실습  
 */

import java.util.*;
public class 자바메소드1 {
	
	// 1. String
	static String gugudan(int dan){
		// 출력
		String gu="";
		for(int i=1;i<=9;i++) {
			gu+=dan+"*"+i+"="+dan*i+"\n"; // ＃과 결과값이 같음
		}
		return gu; // string이라 return 무조건 넣어야함
	}
	// int dan은 밑에 쓰면 오류 나는데 매개변수 형태가 다르면 이름 같기 가능 (double dan)
	
	
	// 2. void ★ 둘다 쓸 수 있지만 하나 쓴다면 이걸 쓰는게 편함 
	static void gugudan2(int dan) {
		// 구구단 만들기
		// 전체 처리 ==> 출력
		for(int i=1;i<=9;i++) {
			System.out.printf("%d*%d=%d\n",dan,i,dan*i); // 구구단 출력기능 #
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scan=new Scanner(System.in);
		// System.out.print("정수 입력:");
		// int dan=scan.nextInt();
		// 구구단을 출력할 때 메소드 호출
		// gugudan2(dan);
		// gugudan2(3);
		// gugudan2(7);
		// 위에 string은 출력만 해준거라 여기서 받는 string 필요
		// String gu=gugudan(9); // 메소드 수행 후에 결과값을 넘겨주고
		// 다음문장으로 넘어간다
		// System.out.println(gu);
		
		/* 추가
		for(int i=2;i<=9;i++) {
			gugudan2(i);
		} 
		*/
		
		for(int i=2;i<=9;i++) {
			String gu=gugudan(i); // 반복적인 기능을 제거
			System.out.println(gu);
		}
		return; // 메소드의 종료 ==> 자동추가 
	}

}
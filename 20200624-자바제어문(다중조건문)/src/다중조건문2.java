/* < 다중조건문 예제  >
 *  각 달의 마지막 날짜 
 *  6 => 30 / 7 => 31
 *
 * 	31 , 28 , 31 , 30 , 31 , 30 
 * 	31 , 31 , 30 , 31 , 30 , 31
 */

import java.util.*;
public class 다중조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=0;
		
		// 사용자의 입력값을 받는다
		Scanner scan=new Scanner(System.in); 
		/*
		 *	정수 ==> nextInt() //
		 *	문자열 ==> next(),nextLine() // 주로 얘네 많이 사용
		 *	실수 ==> nextDouble()
		 *	논리 ==> nextBoolean()
		 */
		
		System.out.print("원하는 월을 입력(1~12):");
		// 메모리에 저장 ==> 변수
		month=scan.nextInt();
		
		// 가공 ==> 연산자 , 제어문 ==> 메소드
		
		/* 1번 방식> 이렇게 할 수 있지만 너무 길어서 줄이는게 필요하다
		if(month==1)
			System.out.println("1월은 31일까지 있습니다");
		else if(month==2)
			System.out.println("2월은 28일까지 있습니다");
		else if(month==3)
			System.out.println("3월은 31일까지 있습니다");
		else if(month==4)
			System.out.println("4월은 30일까지 있습니다");
		else if(month==5)
			System.out.println("5월은 31일까지 있습니다");
		else if(month==6)
			System.out.println("6월은 30일까지 있습니다");
		else if(month==7)
			System.out.println("7월은 31일까지 있습니다");
		else if(month==8)
			System.out.println("8월은 31일까지 있습니다");
		else if(month==9)
			System.out.println("9월은 30일까지 있습니다");
		else if(month==10)
			System.out.println("10월은 31일까지 있습니다");
		else if(month==11)
			System.out.println("11월은 30일까지 있습니다");
		else if(month==12)
			System.out.println("12월은 31일까지 있습니다");
			
		// 여기에 else를 쓴다면 13을 입력했을 때 나올 문구를 적어준다 
		// 사용자가 실수할 것을 고려하여 오류처리를 해준다
		*/
		/* ==> 최적화 , 가독성
				   ===== 유지보수
				   ==> 소스코딩 적다 
		 */
		
		// 2번 방식> 1번을 조건문을 걸어서 줄임
		/* if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 ||month==12)
		{
			System.out.println(month+"월은 31일까지 있습니다");
		}
		else if(month==4 || month==6 || month==9 || month==11)
		{
			System.out.println(month+"월은 30일까지 있습니다");
		}
		else if(month==2)
		{
			System.out.println(month+"월은 28일까지 있습니다");
		}
		*/
		
		// 3번 방식> 위에꺼를 더 간단하게 바꿈 -> 조건이 많은걸 else로 뺀다
		if(month==4 || month==6 || month==9 || month==11)
		{
			System.out.println(month+"월은 30일까지 있습니다");
		}
		else if(month==2)
		{
			System.out.println(month+"월은 28일까지 있습니다");
		}
		else // 31일이 제일 많기 때문에  else로 바꾼다 
		{
			System.out.println(month+"월은 31일까지 있습니다");
		}
		
	}

}

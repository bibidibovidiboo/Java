/*	< 조건문 예제  >
 *  조건문 문제 1과 동일
 * 	사용자 입력 ==> 0,1,2
 * 
 * 	=> 0이면 => 가위
 * 	=> 1이면 => 바위
 * 	=> 2이면 => 보
 * 
 */
import java.util.*;
public class 자바조건문문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2) 입력:");
		int user=scan.nextInt();
		
		/*	
		 * int a=scan.nextInt();
		 * System.out.print("정수 입력:");
		 * if(a==0) { System.out.println("가위"); } if(a==1) { System.out.println("바위"); }
		 * if(a==2) { System.out.println("보"); }
		 */
		
		if(user==0)
		{
			System.out.println("Player:가위");
		}
		if(user==1)
		{
			System.out.println("Player:바위");
		}
		if(user==2)
		{
			System.out.println("Player:보");
		}
		
		// 컴퓨터랑 하는 것 
		int com=(int)(Math.random()*3);
		// 			  ===============
		//			  0.0 ~ 0.99 * 3 ==> 0.0 ~ 2.9.. ==> 0~2
		// == 정수, 실수, 문자일 경우에는 사용이 가능
		// "" 문자열은 ==으로 비교가 불가능 => equals()
		// if문 안에는 비교, 논리, 부정연산자를 주로 쓴다
		
		if(com==0)
		{
			System.out.println("컴퓨터:가위");
		}
		if(com==1)
		{
			System.out.println("컴퓨터:바위");
		}
		if(com==2) {
			System.out.println("컴퓨터:보");
		}
		
		// 결과를 비교
		/*
		 *	컴퓨터 : com
		 *	  가위 => 0
		 *		사용자 : user 
		 *		가위 => 0 => 0
		 *		바위 => 1 => (-1)
		 *		보 => 2 => (-2)
		 * 	  바위 => 1
		 * 		사용자 : user
		 * 		가위 => 0 => 1
		 * 		바위 => 1 => 0
		 * 		보 => 2 => (-1)
		 * 	 보 => 2
		 * 		사용자 : user	-2,1
		 * 		가위 => 0 => (2)	-1,2
		 * 		바위 => 1 => 1
		 * 		보 => 2 => 0
		 * 
		 */
		// 줄여나가는건 일단 몰라도 된다 (뒤에나옴)
		if(com-user==-2 || com-user==1)
		{
			System.out.println("Computer Win!!");
		}
		if(com-user==-1 || com-user==2)
		{
			System.out.println("Player Win!!");
		}
		if(com-user==0)
		{
			System.out.println("비겼다!!");
		}
		
		
		// 컴퓨터가 가위일 때
		// 중복 조건문
		/* 
		 * if(com==0) { if(user==0) { System.out.println("비겼다!!"); } if(user==1) {
		 * System.out.println("Player Win!!"); } if(user==2) {
		 * System.out.println("Computer Win!!"); } } // 컴퓨터가 바위일 때 if(com==1) {
		 * if(user==0) { System.out.println("Computer Win!!"); } if(user==1) {
		 * System.out.println("비겼다!!"); } if(user==2) {
		 * System.out.println("Player Win!!"); }
		 * 
		 * } // 컴퓨터가 보일 때 if(com==2) { if(user==0) { System.out.println("Player Win!!");
		 * } if(user==1) { System.out.println("Computer Win"); } if(user==2) {
		 * System.out.println("비겼다!!"); } }
		 */
		
	}

}

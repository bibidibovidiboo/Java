/* 	< 윤년 구하기  >
 * 	사용자가 ==> 년도를 입력 ==> 윤년여부 확인 // 달력만들기 할 때 나옴
 * 	= 4년마다 => 2월 (29)  year%4
 * 	= 100년마다 제외  year%400
 * 	= 400년마다   year%400
 * 	====================
 * 
 */
import java.util.*;
public class 자바선택조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		// 입력한 값을 받는다 ==> year에 저장
		year=scan.nextInt();
		
		// 윤년 여부를 확인 (알고리즘) ==> 공식(암기)
		// 범위, 기간 포함 ==> &&
		// 범위, 기간 포함이 안될 경우 ==> ||
		// 제외 => &&
		if((year%4==0 && year%100!=0)||(year%400==0))  // 윤년이라면 // 4년마다 && 100년마다 제외
		{
			System.out.println(year+"는(은) 윤년입니다");
		}
		
		else // 윤년이 아니라면 
		{
			System.out.println(year+"는(은) 윤년이 아니다");
		}
	}
}
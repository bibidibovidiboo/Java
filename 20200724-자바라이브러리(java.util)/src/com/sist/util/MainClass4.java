// Calendar => 요일 , 마지막 날짜
// 날짜 관련
package com.sist.util;
import java.util.*;
public class MainClass4 {
	 public static void main(String[] args) {
		// 클래스 생성
		Calendar cal=Calendar.getInstance(); // new 안씀 , 싱글턴 패턴 => 메모리를 한개만 생성
		// 시스템의 실제 날짜를 읽어온다
		/* 
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); // MONTH는 0번부터 시작이라 +1함
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1); // WEEK는 1번부터 시작이라 -1
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		*/
		String[] strWeek= {"일","월","화","수","목","금","토"};
		
		// System.out.println(strWeek[week]+"요일");
		// System.out.println(cal.getActualMaximum(Calendar.DATE)); // 31일 출력됨
		
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		
		System.out.println("월 입력:");
		int month=scan.nextInt();
		
		// System.out.println("일 입력:");
		// int day=scan.nextInt();
		
		System.out.println("=====================");
		
		// Calendar cal=Calendar.getInstance()
		// ㄴ 얘는 하루만 출력해서 다 출력하도록 밑에처럼 바꿔줬음 
		cal.set(Calendar.YEAR,year); // calender.year을 바꿈
		cal.set(Calendar.MONTH,month-1); // 
		cal.set(Calendar.DATE,1);
		// ㄴ cal.set(Calendar.DATE,day); => day 대신 1을 쓴 이유 : 1부터 시작이라서  
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); 
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1); 
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		
		System.out.println(strWeek[week]+"요일");	
	}
}

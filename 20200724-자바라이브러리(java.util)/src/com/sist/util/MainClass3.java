package com.sist.util;
import java.util.*;
public class MainClass3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5]; // 5~14
		
		String day="";
		// ↓ resDay.length를 쓴 이유 : 몇개가 발생될지 몰라서 
		for(int i=0;i<resDay.length;i++) {
			resDay[i]=r.nextInt(31)+1; // 31까지 나오게 하려고 +1
			day+=resDay[i]+"|";
			
		}
		day=day.substring(0,day.lastIndexOf("|")); // 맨마지막 제거	
		//  ↑ 이게 없으면 맨 마지막에 |가 안없어짐
		System.out.println(day);	
		
		// 날짜별로 분리
		String[] resDays=day.split("\\|"); // regex => 정규식을 써야함
		// ㄴ split 안에는 정규식이 들어가야해서 ("|") 이렇게 쓸 수 x / 참고p.507
		// 이런게 익숙하지 않아서 split 보다는 당분간 StringTokenizer를 사용해라
		/* 	< 정규식 기호  >
		 * 	^ => 시작문자  ^A = StartsWith와 동일 / ^[가-힣] ^[A-Za-z] ^[0-9]
		 * 									 [^가-힣] => 제외 ==> 한글을 제외한
		 * 				   				   / 지니뮤직 
		 * 								   => 3상승 => [^가-힣] ==> 3만 가져옴
		 * 								   => 1하강 => [^0-9]
		 * 	$ => 끝문자 	A$
		 *  . => 임의의 한글자 (모든 글자) ==> \\;
		 *  | => 선택
		 *  ? => 있으면 출력 , 없으면 미출력
		 */
		for(String s:resDays) {
			System.out.println(s);
		}
		System.out.println("========StringTokenizer========");
		StringTokenizer st=new StringTokenizer(day,"|");
		// 몇개인지 몰라서 hasMortTokens 썼음
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
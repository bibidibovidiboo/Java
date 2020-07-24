/*	 < java.lang >
 *     ==========
 *      String / StringBuffer
 *      =======
 *       1) 문자열은 주소다  "Hello" , "Java"...
 *       2) char[] => 제어하는 클래스 
 *       ==================================== 
 *       3) 주요 기능(메소드)
 *       =================
 *        1. length() : 문자의 갯수 
 *        2. trim()   : 좌우의 공백제거 
 *        3. substring() : 문자분해 
 *        4. indexOf() , lastIndexOf() => 문자의 위치 
 *        5. equals() : 저장된 문자를 비교 
 *        6. 찾기 ==> 
 *            포함 : contains   ===> LIKE
 *            시작 : startsWith
 *            끝    : endsWith
 *        ====================== 인스턴스 메소드
 *        7. static 메소드 : valueOf() => 모든 기본형을 문자열로 변환 
 *        
 *        String s1="Hello"
 *          s1.length()
 *        String s2="Hello Java"
 *          s2.length()
 *          
 *        String.valueOf()
 *                       
 */
package com.sist.string;
public class MainClass {
	public static void main(String[] args) {
		// 1 ~ 4 
		String s="background-image: url(' https://mp-seoul-image-production-s3.mangoplate.com/d8e852bf7058841a7a0694af93af1b9a.jpg ');";
		String temp=s.substring(s.indexOf("'")+1,s.lastIndexOf("'")); // ' ' 이거 지워줌
		System.out.println(temp.trim()); // trim => 공백지워줌
		
		String ss="이 공간의 모든 것이 정말 좋았어요!! 뷰도 너무 좋고 정원도 잘 가꾸어져있고 카페 건물도 너무 예뻤어요 팥빙수랑 치즈케익 아메리카노 이렇게 먹";
		if(ss.length()>20) {
			String sss=ss.substring(0,20)+"..."; // 0부터 20글자 출력해라 => 글자수를 조절 substring ★
			System.out.println(sss);
		}
		// 5 
		String s1="Hello";
		String s2="Hello";
		String s3=new String("hello");
		/*
		if(s1==s3) {
			System.out.println("s1==s3");
		}else {
			System.out.println("s1!=s3");
		}
		
		equalsIgnoreCase : 대소문자 구분이 없다 => 검색
		equals : 대소문자 구분 => 로그인 , 아이디중복
		
		*/
		if(s1.equalsIgnoreCase(s3)) {
			System.out.println("s1==s3");
		}else {
			System.out.println("s1!=s3");
		}
		
	}
}
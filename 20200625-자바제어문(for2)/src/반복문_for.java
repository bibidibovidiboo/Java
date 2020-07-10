/*  < 반복문  예제 >
 * 	변수 명칭법 => 식별자
 * 	1) 알파벳(대소문자),한글로 시작
 * 	2) 숫자는 사용 가능(앞에 사용금지)
 * 	3) 키워드는 사용 할 수 없다
 * 	4) _ , $ 사용이 가능
 * 	=================== 적용 (클래스명,메소드명)
 * 
 * 	for 형식)
 * 
 * 		for(초기화 ; 조건식 ; 증감식){
 * 			반복수행 문장
 * 			실행문장
 * 		}
 * 
 * 		for(초기화 ; 조건식 ; 증감식){
 * 			반복수행 문장
 * 			실행문장
 * 		}
 */

public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("Hello!!");
			System.out.println("Java=>For");
		}
		System.out.println("==========");
		for(int i=1;i<=5;i++) {
			System.out.println("Hello!!");
		}
		System.out.println("Java=>For"); 
		
		System.out.println();
		
		// 블록 안에 소속이 아니라 for문과 상관이 없다 -> {}을 잘쓰자
		
		// 출력 ==>
		// AaBbCc
		
		// 1)
		char c='a'; // #
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+""+c++);
		}
		System.out.println(); // 줄바꿈
		
		// 2)
		// #을 없애고 c++ 대신 (char)(ch+32) 사용
		for(char ch='A';ch<='Z';ch++) {
		System.out.print(ch+""+(char)(ch+32));
		}
		
		// 3)
		/*
		char c='a'; 
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+""+c);
			c++
		}
		*/
		
		// 문제) 
		// 조건이 없이 1~10 => 홀수만 출력 => 일정간격으로
		// 1 3 5 7 9
		System.out.println();
		
		for(int i=1;i<=10;i+=2) {
			System.out.printf(i+"\t");
		}
		
		// 문제) 2 4 6 8 10 - 초기값을 2를 주면 편하다
		System.out.println();
		
		for(int i=2;i<=10;i+=2) {
			System.out.printf(i+"\t");
		}
		
		// 초기화 , 증가 , 어디까지(조건식)
		// 영문 , 알파벳 => char**
		
		// 문제) 1~5 => 1,2,3,4,5 (자주나옴)
		
		System.out.println();
		
		for(int i=1;i<=5;i+=1) {
			System.out.print(i);
			if(i<5)
				System.out.print(",");
		}
		
		// 문제) 10 ==> 1010 15 ==> 1111 / 2진법으로 표현
		
		System.out.println();
		int su=10;
		String s="";
		for(;;) {
			int a=su%2; // 2로 나눈 나머지값
			System.out.print(a);
			s+=a+"";
			su=su/2;
			if(su==0)
				break;
		}
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		// 지금은 배열을 안배워서 0101로 출력돼서 이것저것 씀 -> 지금은 몰라도 됨
		
		
		
		
		
	}

}

/*  < 입출력  >
 * 
 *	class Scanner{
 *	}
 *
 */
import java.util.*; // Scanner => 이전에 만들어진 자바파일을 읽어 온다
public class 자바입출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력값 받기
		/*
		 * System.out.println("정수 입력:"); //ln이 print에 \n을 안 쓰게해줌 
		 * System.out.print("정수 입력:\n"); 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("실수 입력:"); // \n, \t
		double a=scan.nextDouble();
		// double 실수 a=100 a=100.0
		// char a=97 ==> a='a'
		System.out.println("a="+a);
		
		/* 
		 *	Console에 double 입력 시
		 *	실수 입력:
		 *	100
		 *	a=100.0
		 * 
		 *	%d => 정수
		 * 	%f => 실수
		 *	%c => 문자
		 *	%s => 문자열
		 * 
		 */	
		//System.out.println(~100);
		System.out.println(Integer.toBinaryString(240)); // 이진법
		System.out.println(Integer.toHexString(240)); // 16진법
		System.out.println(Integer.toOctalString(240)); // 8진법
		
		/*
		 *	111000
		 *	f0
		 *	360
		 */
		
		System.out.println(0xf0); // 16진법
		System.out.println(0360); // 8진법
		System.out.println(0b11110000); // 2진법
		System.out.println(~100); // 음수표현
		
		// 기억할 것 : 진법 부분은 이게 진법이구나 0x가 붙으면 16진법이다등 이정도면 알면됨 (p.42 ~ 54)
	
	}

}

/*  < 출력 메소드  >
 *  기억할 것 : pringln, print
 *  
 * 	/ 화면 출력
 *	= System.out.println() => 다음줄에 출력
 *		예) 
 *		System.out.println("Hello");
 *		System.out.println("Java");
 *		Hello
 *		Java
 *
 *	= System.out.print() => 이어서 출력
 *      System.out.print("Hello");
 *		System.out.print("Java");
 *
 *		HelloJava 
 *
 *	= System.out.printf() : 서식이 있는 출력  ex)구구단
 *	
 *		80 80 80 240 80.0 
 *		
 *		System.out.println("80 80 80 240 80.0 B")
 *
 *		System.out.printf("%5d%5d%5d%5d%5f%5c",80,80,80,240,80.0,'B')
 *
 *		%5d	80
 *		00080	
 *		%-5d
 *		80000
 *
 *		%5.2f	80.0
 *		080.00
 * 
 */
public class 자바출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.1f",80.55);
		int a=2;
		int b=2;
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d",a,b,a*b); // JDK 1.5\
		
		/*
		 * 	%d => 정수
		 * 	%f => 실수
		 * 	%c => 문자
		 * 	%s => 문자열
		 */
	}

}

/*	< 비교연산자  >
 * 	이항 => 
 * 		산술 : 결과값을 알 수 없음
 * 				int + int = int
 * 			double + int = double
 * 			float + long = float
 * =================================
 * 		비교 : true/false
 * 		논리: true/false
 * ================================= 조건문 (if)
 * 		대입 : 
 * 	비교연산자 : 수와 수를 비교 => 정수, 실수, 문자, 논리 
 * 						문자열은 비교할 수 없음   ex) "Hello"=="Hello"  (X)  => equals() 사용
 * 						문자열을 저장하는 데이터형 => string
 * 						char c='Hello' (x)
 * 						string s="Hello" (o)
 * 		1) 종류 
 * 			== : 같다
 * 			!= : 같지 않다
 * 			<  : 작다
 * 			>  : 크다
 * 			<= : 작거나 같다
 * 			>= : 크거나 같다
 * 		2) 결과값 : boolean
 *	
 */
public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		char c='A';
		System.out.println(c++);
		System.out.println(c);
		System.out.println(b++==a);
		System.out.println(10==20);
		System.out.println(10!=20);
		System.out.println(10<10);
		System.out.println(10>10);
		System.out.println(10<=10);
		System.out.println(10>=10);
		
		System.out.println('A'==65);
		//char는 연산 수행시 정수로 변환된다

	}

}

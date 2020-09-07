/*	< 연산자  >
 *  *** 꼭 알아야하는 별표표시
 *	1. 연산자
 *		1) 연산자의 종류
 *			= 단항연산자
 *				= ***증감연산자 (++ , --)
 *				= ***부정연산자 (!)
 *				= 부호연산자 (+ , -)
 *				= ***형변환연산자 ((type))
 *						type ==> int, byte, char, double, long...
 *						(int)
 *						(byte)
 *						(char)
 *						(double)
 *						(long)
 *						==> 데이터형을 변경해서 연산처리가 가능하게 만든다
 *						(연산: 데이터형이 동일)
 *			= 이항연산자
 *				= 산술연산자 (+ , - , * , / , %) => 형변환
 *						/
 *						==> 0으로 나눌 수 없다
 *						==> 정수/정수=정수 ===> 5/2=2
 *						% => 나머지 (배수)
 *						==> 5%2 (1) 
 *						==>	5%-2 (1)
 *						==> -5%2 (-1) // 왼쪽 부호가 -여서 -1
 *						==> -5%-2 (-1) 
 *						// 항상 남는 값은 왼쪽의 부호를 따라간다
 *				= 비트연산자 ( & ㅣ ^ )
 *				= 쉬프트연산자 ( << , >> )
 *				= ***비교연산자 ( == , ㅣ= , < , > , <= , >= )
 *				= ***논리연산자 ( && , ㅣㅣ )
 *				= ***대입연산자 ( = , += , -= ... )
 *			= 삼향연산자 
 *				= 조건 ? 값1:값2
 *				    조건 : true => 값1
 *				    조건 : false => 값2
 *		2) 연산방법
 *		      단항연산자 
 *				= 증감연산자
 *				  ++ : 무조건 한개를 증가한다
 *				  -- : 무조건 한개를 감소한다
 *				    사용법
 * 					int a=10;	변수 선언
 * 					++10(X)
 * 
 * 					==> +aa(--a) : 전치연산자
 * 						a++(a--) : 후치연산자
 * 						======================> 반복문을 사용, 게임로직
 * 						예) for(int i=1;i<=10;i++)
 * 
 * 					전치연산자 : 증가한 다음에 대입
 * 					int a=10;
 * 					int b= ++a;
 * 						 == == 
 * 							++ (1번 계산)
 *							= (2번 계산)
 *			
 *					a=11 , b=11
 *					후치연산자 : 대입을 먼저하고 나중에 증가
 *					int a=10;
 *					int b = a++
 *					   ===	===
 *						1	 2
 *             			=> b=a ==> b=10
 *             			=> a++ ==> a=11
 *             		부정연산자 (true=>false,false,false=>true) ==> 1
 *             		===== 반드시 boolean을 사용한다
 *             
 *             		예)
 *             			boolean bCheck=false;
 *             
 *             			!bCheck (X)// 자동으로 안바뀜 (++ -- 증감은 자동으로 바뀜 / 얘네만 가능)
 *             			-> bCheck=!bCheck (O)
 *             
 *             		=>System.out.println(bCheck)
 *
 *		3) 연산자 우선순위	
 *
 *		(3+4)*5 ==> 23
 */
public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=100; System.out.println(a+200); System.out.println(a);
		 * 
		 * // a++ ==> a=a+1
		 * 
		 * boolean bCheck=false; System.out.println(bCheck); bCheck=!bCheck; //이걸 선언
		 * 안해주면 밑에 2개는 false로 출력 System.out.println(!bCheck); //
		 * System.out.println(!bCheck) 선언 안해도 앞에 !붙이면 true로 출력됨
		 * System.out.println(bCheck);
		 */
		
		// 전치연산
		int a=10;
		int b=++a;
		
		System.out.println("a="+a+",b="+b);
		
		// 후치연산
		
		a=10;
		b=a++;
		
		System.out.println("a="+a+",b="+b);
		
		a=10;
		b=++a + ++a + ++a + ++a;
		// 11 12 13 14 => 50
		b=a++ + a++ + a++ + a++;
		// a=14 , b=50
		System.out.println("a="+a+",b="+b);

	}
}

/*  < 이항연산자  >
 * 	'A'+'B'
 * 	=== === 66
 * 	정수변환 => 65
 * 	65=66 => 131 (int) char, short, byte => 연산 => 결과값 int
 * 
 * 	'홍' + '홍'
 * 
 * 	*** 주의점 : 데이터형을 초과하면 error가 아니라 오버플로워를 발생
 *	
 *	예)	int ==> 1~10	11 => 1
 *
 *		-128 ~ 127 ==> 128 ==> 
 *		======================
 *		0 1 1 1 1 1 1 1 ===> 127이 컴퓨터에 저장
 *		======================
 *		1 0 0 0 0 0 0 0 ===>
 *
 *		128 64 32 16 8 4 2 1
 *		1	0  0  0  0 0 0 0
 *
 *		10+10.5
 *		==
 *		10.0 ==> 같은 데이터형만 연산이 가능
 *
 *		'A'+1 ==> int
 *		====
 *		 65
 *	
 *		강제형변환
 *		(int)(10.5+10.5)
 *		===============
 *			1=> 21.0 ==> 21
 *		(int)10.5+(int)10.5 ==> 20
 *		======= =======
 *		  10      10
 *			   +
 *
 */
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * byte b1=64; 
		 * byte b2=64; 
		 * byte b3=(byte)(b1+b2); 
		 * System.out.println("b3="+b3);
		 */
		
		// 나누고 나머지 값
		int a=5;
		int b=2;
		
		System.out.println(a%b); // 5%2 ==> 1
		System.out.println(-a%b); // -5%2 ==> -1
		System.out.println(a%-b); // 5%2 ==> 1
		System.out.println(-a%-b); // -5%-2 ==> 1
		
		System.out.println((int)(10.5+10.5)); //21
		System.out.println((int)(10.5+(int)10.5)); //20 결과값이 다르다 - 형변환은 필요할 때만 한다 
				
	}

}

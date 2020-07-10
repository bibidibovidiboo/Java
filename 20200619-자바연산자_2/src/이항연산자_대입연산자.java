/*		< 대입연산자  >
 * 		대입 => 결과값을 받는다
 * 		종류)
 * 			=> int a=10 => 10을 a라는 메모리에 대입한다
 * 			복합대입연산자
 * 			op= => op(연산자)
 * 			+=
 * 				ex) int a=10;
 * 					a+=2; => a=a+2
 * 					a=12
 * 			-=
 * 				ex) int a=10;
 * 					a-=5 => a=a-5
 * 					a=5
 * 			*=
 * 				ex) int a=10;
 * 					a*=5 => a=a*5
 * 					a=50
 * 			/=
 * 			%=
 * 			&=
 * 				int a=10;
 * 					a&=3; => a=a&3
 * 					1010
 * 					0011	
 * 					====
 * 					0010   => 2 
 * 				
 * 			|=
 * 				ex) int a=10;
 * 					a|=3; => a=a|3
 * 					1010
 * 					0011	
 * 					====
 * 					1011   => 11
 * 			<<=
 * 				ex) int a=10;
 * 					a<<=3; => a<<3 =a*2의3승
 * 					a=80
 * 			>>=
 * 				ex) int a=10;
 * 					a>>=3; => a>>3 =a/2의3승
 * 					a=1
 * 
 * 			한개증가 : 증가연산자
 * 			  ++
 * 			원하는갯수만큼증가 : 복합 대입연산자
 * 			  +=5
 * 
 */
public class 이항연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		//복합대입 연산자
		//증가 => 1씩 증가(++)
		//a++;a++;a++; => a+=3
		a+=5; //a=a+5 => 15
		System.out.println("a="+a);
		
		int b=10;
		b-=5; //b=b-5 => 5
		System.out.println("b="+b);
		
		int c=10;
		c*=5;
		System.out.println("c="+c);
		
		int d=10;
		d/=3;
		System.out.println("d="+d);

	}

}

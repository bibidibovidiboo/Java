/*  < 변수  >
 *	변수 선언
 *	변수 초기화
 *	변수의 값 변경
 *
 */
public class 자바변수값변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i,j는 사용하지 않는다 (헷갈려서)
		int a=100; //상수라서 변경이 안돼서  final 붙이면 오류남 (final 붙이면 상수값)
		System.out.println("a="+a);
		a=200;
		System.out.println("a="+a);
		a=300;
		System.out.println("a="+a); //
		
		// int a =100; int b=a; 이렇게 하면 b=100 
		
		int b=200; // 정수 들어가면  int 실수는 double
		int c=b;
		// c라는 메모리에 b가 가지고 있는 값을 대입한다
		/*
		 * int b='A'; // b=65 
		 * int c=300; 
		 * int d=b+c; // 이런식으로도 쓸 수 있음
		 */
	
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		int x,y,z;
		x=y=z=100; // 초기값이 같으면 이렇게 사용 가능
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);	
		
	}
}

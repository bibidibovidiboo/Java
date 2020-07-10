 /*		< 형변환 연산자  >
  *		필요시에 데이터형을 변경해서 사용 : 강제 형변환 
  * 	
  * 	int + double = double (자동 형변환) // 시스템 상에서 자동으로 변환
  * 	===
  * 	double
  * 
  * 	char + int = int 
  * 	===
  * 	int
  * 
  * 	int + long = long
  * 	===
  * 	long
  * 
  * 	char + int + long + double = double
  *		===
  *		int
  *		=====
  *		long
  *		======double
  *		
  *		(int)double ==> int  // ( ) 안에 있는 걸로 바뀜, 큰데이터 => 작은데이터 변경 시 사용
  *		(char)int ==> char
  *	
  *		1) boolean은 제외
  *		2) int이하는 연산을 하면 결과값이 int
  *			byte+byte => int
  *			char+char => int
  *			short+short => int
  *			shar+byte+short => int 
  *
  */
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * byte b=100; 
		 * byte c=100; 
		 * int d=b+c; // byte d=(byte)(b+c); // b+c를 바이트로 바꿔라
		 */	
		
		// 자동형변환
		int a='A';	// a=65
		double d=10; //d=10.0
		// int	
		char c=65; //c='A'
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
		// 강제형변환
		int i=(int)10.5;
		int ii='A';
		System.out.println("i="+i);
		System.out.println("ii"+ii);

	}

}

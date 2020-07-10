// < 변수  >
public class 자바변수초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * int kor = 78; int eng = 85; int math = 96;
		 * 
		 * 문자열 결합 p.35 ===== 7+7+"1"+7+7 ===== 14+"1" ===== "141"+7 "1417"+7 "14177"
		 *
		 * "총점:78+85 ==> 총점:788596
		 * 
		 * // +는 더하는게 아니라 뒤에 붙여주는 개념
		 * 
		 * System.out.println("총점:" + (kor + eng + math)); // ( )괄호 먼저 실행해라 의미
		 * 
		 */
		
		int a=65;
		char c=65; // char => 문자, 숫자
		System.out.println("a="+a);
		System.out.println("c="+c);
		
		int d=1;
		int e='1';
		System.out.println("d="+d);
		System.out.println("e="+e);
		// char은 문자, 정수 취급한다
		/*
		 *	long = int
		 *	 8		4
		 *
		 *	int = long
		 *	 4     8  ===> ERROR 
		 * 
		 *	double = int, long, float
		 *	int = double(x)
		 *
		 *	예외 ==> char = int
		 * 
		 */
		
		// float f=10.6; //double이 디폴트라 다 받을 수 있음
		
		double f=10.6; 
		// double이 디폴트이라 에러남 - 더블로 고친다
		
		// byte < char < int < long < float < double
		System.out.println(100);// 100은 int
		System.out.println(10.8); // 10.8은 double
			
		double i=21400000000L;
		// folat은 많이 안쓰이고 대부분 double
		// int, long, double, boolean이 중요

		
	}

}

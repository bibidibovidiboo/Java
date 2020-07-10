/*  < 변수 사용범위  >
 * 	변수 Scope
 * 	========
 * 	변수종류
 * 	=====
 * 	= 지역변수
 * 	= 멤버변수
 * 	= 공유변수
 * 
 * 	public class A {
 * 		int a; ===> 멤버변수
 * 		static int b; ===> 공유변수 ==> JVM class를 로드할 때
 * 		==============================================
 * 		public static void main(String[] args)
 * 		{
 * 			int c; // 지역변수 ==> 
 * 		} // c변수 => main에서만 사용이 가능
 * 
 * 	}
 */
public class 변수사용범위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		for(i=1;i<=10;i++) {
			System.out.println("i="+i);
		} // i는 삭제 (메모리)
		System.out.println("i="+i);
		
		System.gc(); // 필요없는거 가져가라 (메모리 회수/가비지컬렉션)
		int j=1;
		// 변수 변경
		System.out.println("j="+j);
		
		i=1;
		for(i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		i=1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		i=1;
		
		// do-while문
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=5);
	}
}

/*  < 문제 15번  >
 * 	변수 ==> 한개의 데이터만 저장
 * 			정수, 실수, 문자, true/false
 * 			==> 메모리 크기 설정
 * 				=======
 * 				자바에서 메모리 크기를 지원 ==> 기본형
 * 			==> 데이터형(자료형)
 * 				실수 : double(8byte),float(4byte)
 * 				==============================
 * 				default : double
 * 				정수 : byte (1byte)
 * 					 short (2byte)
 * 					 int (4byte)
 * 					 long (8byte)
 * 
 * 					 200000000000L
 * 				문자 : char(2byte) 0~65535 => Unicode
 * 				논리 : boolean(1byte) =>  true/false
 * 
 */
import java.util.*;
public class 문제15 {
	// 2자리 정수(10~99) 사이를 입력받고, 십의 자리와 일의 자리가 같은지 판별하여 출력하는 프로그램을 작성해보자.
	// ex. 2자리 수 정수(10~99):77 > "Yes! 10의 자리와 1의 자리가 같습니다."
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("(10~99):89>");
		a=scan.nextInt();
		if(a%11==0) 
		{
			System.out.println("10자리와 1자리가 같다");
		}
		else 
		{
			System.out.println("10자리와 1자리가 다르다");
		} 
		
		// 추후에  string 사용방법도 배운다
		
		/*	Console
		 *  (10~99):89> 77
		 *	10자리와 1자리가 같다
		 */
	}	
}

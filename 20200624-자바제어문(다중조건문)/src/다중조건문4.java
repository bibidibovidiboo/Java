/*	< 다중 if문 문제  >
 * 
 *	문제 1번)
 * 	사용자 => 정수입력 (1~12)
 * 	12,1,2 => 겨울입니다
 * 	3,4,5, => 봄입니다
 * 	if(month==3 || month==4 || month==5) -> 내가 코딩한 방식
 * 	if(month>=3 && month<=5) -> 이것도 가능 
 * 	6,7,8 => 여름입니다
 * 	9,10,11 => 가을입니다
 * 
 *  =======================
 *  문제 2번)
 *  문자를 입력을 받아서 char ch
 *  	= 숫자 ch>='0' && ch<='9'
 *  	= 알파벳 ch>='A' && ch<='Z' || ch>='a' && ch<='z'
 *  	= 한글 ch>='가' && ch<='힣' // 힣이 한글 마지막 글자임
 *  	= 특수문자
 */
import java.util.*;
public class 다중조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 문제 1번)
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력 (1~12):");
		int month=scan.nextInt();
		
		if(month==12 || month==1 || month==2) {
			System.out.println(month+"월은 겨울입니다");
		}
		else if(month==3 || month==4 || month==5) {
			System.out.println(month+"월은 봄입니다");
		}
		else if(month==6 || month==7 || month==8) {
			System.out.println(month+"월은 여름입니다");
		}
		else if(month==9 || month==10 || month==11) {
			System.out.println(month+"월은 가을입니다");
		}
		else {
			System.out.println("잘못된 입력입니다");
		} */
		
		// 문제 2번
		char ch='A'	; // 변수선언
		
		Scanner scan=new Scanner(System.in);
		System.out.println("문자를 입력하시오:");
		ch=scan.next().charAt(0); // nextInt 대신 문자는 이걸 사용해야함
		
		if(ch>='0' && ch<='9') {
			System.out.println(ch+"는(은) 숫자입니다");
		}
		else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			System.out.println(ch+"는(은) 알파벳입니다");
		}
		else if(ch>='가' && ch<='힣') {
			System.out.println(ch+"는(은) 한글입니다");
		}
		else {	
			System.out.println(ch+"는(은) 특수문자입니다");
		}
	} 

}

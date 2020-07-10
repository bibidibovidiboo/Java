//  < 알파벳 예제  >	
//  사용자가 알파벳을 입력하면 B ==> AB
// 	D => ABCD
// 	char ==> scan.next().charAt(0) // char 받아서 처리 (nextInt같은)
//
//	"ABCDE"	=> scan.next()
//	 =====
//   'A' => charAt(0)
//	 'B' => charAt(1)
//
//   루프를 돌린다는건 1.순차적이고 2.패턴이 있어야함
// 	 112111311114111115
// 	  일정 패턴이 있어야 => 반복문 사용이 가능 ==> 즉 수열이다
import java.util.*;
public class 반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증가변수 , 받는변수 => 변수2개가 필요하다
		char user; // 초기값 - char user=' '도 가능
		// while ==> 조건이 false 될 때 까지 변경하는 변수 : 루프변수
		char c='A';
		// 변수 설정하는 방법
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳입력(대문자):");
		user=scan.next().charAt(0);
		
		while(c<=user) {
			System.out.print(c);
			c++;
		}

	}

}

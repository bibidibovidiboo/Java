/*	< 메소드 예제  >
 *  사용자 정수입력 => 짝수 , 홀수
 * 	메소드 2개 필요 => 입력부분 , 짝수냐 홀수냐
 *  --------------------------------------
 * 	메소드 => 결과값 => 리턴값
 * 		        메소드 자체에서 출력 => 리턴값(x) void
 * 	1) => 입력
 *  2) => 입력 처리
 *  3) => 결과 출력 ==> 출력만 하면 되니까  void / 넘겨줄 값이 없음
 * 
 * 
 */
import java.util.*;
public class 자바메소드3 {
	// 데이터를 받아서 넘겨야해서 매개변수가 필요했음 ①
	static int userInput() {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		
		return num; // ↓ 입력해서 넘길 값이 필요해서 num 변수 생성  
	}  
	// ② 
	static void process(int num) {
		if(num%2==0) {
			System.out.println(num+"는(은) 짝수입니다");
		}
		else {
			System.out.println(num+"는(은) 홀수입니다");
		}
		
	}
    // 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=userInput();
		process(num);
	}

}

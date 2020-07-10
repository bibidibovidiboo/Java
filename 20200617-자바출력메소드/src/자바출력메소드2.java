// < 출력 메소드  >
// 하나씩 쓰는게 원칙인데 너무 길면 *로 사용가능 (import java.util.Scanner을 수정함)
// 기억할 것 : \n, \t
// sanner 당분간 쓸 것 
import javax.swing.JOptionPane;
import java.util.*; 
public class 자바출력메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \n은 newLine => 새로운 줄에 출력 *
		// \t는 텝 => 일정 간격 *
		/*
		 * System.out.printf("%d*%d=%d\n",2,2,4); System.out.printf("%d*%d=%d",2,3,6);
		 */

		Scanner scan=new Scanner(System.in);
		// new는 클래스를 저장
		
		/*
		 * Scanner : 데이터형
		 * scan : 변수
		 * new : 메모리에 저장
		 * Scanner(System.in) : 초기화
		 */
		
		System.out.print("1' 정수 입력:");
		int a=scan.nextInt(); // 입력된 정수를 읽어와서 a라는 메모리에 저장
		// System.out.print("2' 정수 입력:"); 
		int b=scan.nextInt();
		
		// 출력 - 하나 입력하고 저장하고 엔터치면 결과출력
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		// JOptionPane.showInputDialog("정수");
		
		// 엔터랑 공백 동시에 출력할 때는 띄어쓰기
		
		// Scanner => 도스에서만 사용

	}

}

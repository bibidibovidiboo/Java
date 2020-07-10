/*  < 정수 예제  >
 *  if - switch 둘다 짤 수 있어야함
 * 	case 정수 => case 1:
 * 	case 문자 => case 'A':
 * 	case 문자열 => case "+": case "LOGIN" "CHAT" ...
 * 
 */
import java.util.*;
public class 선택문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		int result=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 2개 입력(3 5):");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("연산자 입력(+,-,*,/):");
		// String op=scan.next(); swith(op) 
		// 이렇게도 가능한데 아직 String 안배워서 swith(scan.next())로 썼음
		switch(scan.next()) {
			case "+":
				System.out.printf("%d+%d=%d\n",a,b,a+b);
				break;
			case "-":
				System.out.printf("%d+%d=%d\n",a,b,a-b);
				break;
			case "*":
				System.out.printf("%d+%d=%d\n",a,b,a*b);
				break;
			case "/":
				// case 안에 if문도 쓸 수 있으며 나누기는 항상 신경쓰기 (0으로 못나눔)
				if(b==0) {
					System.out.println("0으로 나눌 수 없습니다");
				}
				else {
					
				}
				System.out.printf("%d+%d=%d\n",a,b,a/b);
				break;
			default:
				System.out.println("잘못된 연산자 입니다!!");
		}
	}

}

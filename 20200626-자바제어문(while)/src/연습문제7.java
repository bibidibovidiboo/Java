// < 연습문제 7 >
import java.util.*;
public class 연습문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("점수 입력:");
		a=scan.nextInt();
			if(a>=60) {
				System.out.print("합격");
			}
			else {
				System.out.print("불합격");
			}		
	}
}

//  < 조건문 예제 >
/* 		정수 3개를 입력받아서 총점, 평균,
 * 		학점 => 60이상 D, 70이상 C, 80이상 B, 90이상 A, 나머지는 F
 * 
 * 		60이상 => D
 * 		70	=> C
 *  	80  => B
 *  	90	=> A
 *  	나머지는 F
 *  
 *  	국어점수 : 80
 *  	영어점수 : 80
 *  	수학점수 : 80
 *  
 *  	총점 : 240
 *  	평균 : 80.0
 *  	학점 : B
 * */
import java.util.*; //Scanner 클래스를 가지고 온다
public class 자바조건문문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scan ==> 여러번 받을 수 있다
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수 영어점수 수학점수 입력:");
		// 키보드로 입력된 정수를 받기
		
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		char score='A';
		// avg=85
		if(avg>=90 && avg<100)
		{
				score='A';
		}
		//	포함
		if(avg>=80 && avg<90)
		{
				score='B';
		}
		
		if(avg>=70 && avg<80)
		{
				score='C';
		}
		
		// 포함
		if(avg>=60 && avg<70)
		{
				score='D';
		}
		if(score<60)
		{
			score='F';
		}
		
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f%n",avg); // 소수점 줄일 때
		System.out.println("학점:"+score);
		
		
	}

}

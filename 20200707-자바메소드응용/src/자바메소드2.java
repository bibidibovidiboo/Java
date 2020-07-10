// < 평균구하기 메소드 예제 >
// 국어 영어 수학 => 총점 , 평균 , 학점
// 메소드가 4개가 필요
import java.util.*;
public class 자바메소드2 {
	// 입력
	static int userInput(String subject) {
		Scanner scan=new Scanner(System.in);
		System.out.println(subject+"점수 입력:");
		int score=scan.nextInt();
		return score;
	}
	
	// 총점구하기 - total을 매개변수로 넣음
	static int total(int kor,int eng,int math) {
		return kor+eng+math;
	}
	// 평균 구하기
	// total을 받아서 넣는게 편해서 사용 
	static void avg(int total) {
		System.out.printf("평균:%.2f\n",total/3.0);
	}
	// 학점 구하기 
	/*
	// char로 구하기 #2
	static char score(int kor,int eng,int math) {
		char c=' '; 
		int score=(kor+eng+math)/3;
		if(score>=90) {
			c='A';
		}
		else if(score>=80)
			c='B';
		else if(score>=70)
			c='C';
		else if(score>=60)
			c='D';
		else 
			c='F';
		return c;
	}
	*/
	// void 쓰기 #2
	static void hakjum(int total) {
		int avg=total/3;
		if(avg>=90)
			System.out.println("A학점");
		else if(avg>=80)
			System.out.println("B학점");
		else if(avg>=70)
			System.out.println("C학점");
		else if(avg>=60)
			System.out.println("D학점");
		else 
			System.out.println("F학점");
	}

	// 호출
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=userInput("국어");
		int eng=userInput("영어");
		int math=userInput("수학");
		int total=total(kor,eng,math); // 변수명,메소드 같아도됨
		
		// 출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점"+total);
		avg(total);
		hakjum(total);
		
		// #1
		// char c=score(kor,eng,math);
		// System.out.println("학점:"+c);
	}

}

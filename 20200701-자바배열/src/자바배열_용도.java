/*  < 가위바위보 >
 *  0 => 가위
 *  1 => 바위
 *  2 => 보
 */
import java.util.*;
public class 자바배열_용도 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 컴퓨터 => 난수 (뭐가 나올지 아무도 모름)
		int com=(int)(Math.random()*3); // 0~2
		
		// 사용자 입력
		Scanner scan=new Scanner(System.in);
		System.out.print("0(가위),1(바위),2(보):");
		int user=scan.nextInt();
		
		// ★★★ 배열써서 3줄 줄이기
		String[] result= {"가위","바위","보"}; // 2글자 이상이면 문자열 
		System.out.println("컴퓨터:"+result[com]);
		System.out.println("Player:"+result[com]);

		// 입력된 결과를 확인 => 가위바위보
		
		/* 이걸 간결하게 3줄 배열로 줄여보자 => ★★★
		if(com==0)
			System.out.println("컴퓨터:가위");
		else if(com==1)
			System.out.println("컴퓨터:바위");
		else if (com==2)
			System.out.println("컴퓨터:보");
		
		if(user==0)
			System.out.println("Player:가위");
		else if(user==1)
			System.out.println("Player:바위");
		else if (user==2)
			System.out.println("Player:보");
		*/
		
	}

}
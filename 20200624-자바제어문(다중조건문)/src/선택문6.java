/* < switch 중첩 - 가위바위보 >
 * 	if(조건문)
 * 	{
 * 		if(조건문){
 * 		}
 * 		else {
 * 		}
 * 	}
 * 
 *    switch(정수)
 *    {
 *       case 1:
 *         switch(정수)
 *         {
 *           case 'A':
 *         }
 *    }   
 *    => computer => 가위 
 *                      = 가위
 *                      = 바위
 *                      = 보
 */
import java.util.*;
public class 선택문6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위바위보
		int user=0;
		int com=(int)(Math.random()*3); // 0,1,2 가위바위보 준비한다
		// 			  ==============
		/*					1    =
		 * 						 2
		 * 	=====
		 * 	  3
		 * 
		 *	  1. Math.random() => 0.0~0.99 => 0.0~2.9...  // 3을 곱해서 
		 *	  0~2  // int 줘서 형변환 시켜서 소수점 지움
		 *	  0 : 가위
		 *	  1 : 바위
		 *	  2 : 보 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2):");
		
		user=scan.nextInt(); // 사용자 설정
		
		// 결과값 출력 - switch 중첩
		// switch 중첩 (하드코딩법) - 근데 일단은 이렇게 해야함
		/*
		switch (com) {
		case 0:
			switch(user) {
			case 0:
				System.out.println("컴퓨터:가위,사용자:가위");
				System.out.println("비겼다!!");
				break;
			case 1:
				System.out.println("컴퓨터:가위,사용자:바위");
				System.out.println("사용자 Win!!");
				break;
			case 2:
				System.out.println("컴퓨터:가위,사용자:보");
				System.out.println("컴퓨터 Win!");
				break;
			}
			break;
		case 1:
			switch(user) {
			case 0:
				System.out.println("컴퓨터:바위,사용자:가위");
				System.out.println("컴퓨터 Win");
				break;
			case 1:
				System.out.println("컴퓨터:바위,사용자:바위");
				System.out.println("비겼다!!");
				break;
			case 2:
				System.out.println("컴퓨터:바위,사용자:보");
				System.out.println("사용자 Win");
				break;
			}
			break;
		case 2:
			switch(user) {
			case 0:
				System.out.println("컴퓨터:보,사용자:가위");
				System.out.println("사용자 Win");
				break;
			case 1:
				System.out.println("컴퓨터:보,사용자:바위");
				System.out.println("컴퓨터 Win!!");
				break;
			case 2:
				System.out.println("컴퓨터:바위,사용자:보");
				System.out.println("비겼다!!");
				break;
			}
			break;
		default:
			break;
		}
		
		 // 밑에 알고리즘 풀이
		    가위 (0) // COM
		    가위(0)  = 0
		    바위(1)  = -1 ==> USER
		    보(2)   = -2 COM
		    
		    바위 (1) // COM
		    가위(0)  = 1 COM
		    바위(1)  = 0
		    보(2)  = -1 ==> USER
		    
		    보 (2) // COM
		    가위(0)  = 2 USER
		    바위(1)  = 1 COM
		    보(2)  = 0
		    
		*/
		//  배열을 배우면 바로 가능 - 아직은 위에처럼 하는게 편할 수 있음
		String[] str= {"가위","바위","보"};
		System.out.println("컴퓨터:"+str[com]+",사용자:"+str[user]);
		switch(com-user) {
		case 2: 
		case -1:
			System.out.println("사용자 Win!!");
			break;
		case 1: 
		case -2:
			System.out.println("컴퓨터 Win!!");
			break;
		default:
			System.out.println("비겼다!!");
		}
	}
}
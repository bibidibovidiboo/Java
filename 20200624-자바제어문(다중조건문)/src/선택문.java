/*  < 선택문  > 
 * 	  => switch(정수,문자,문자열)
 * 		{ 
 * 			// 정수
 * 			case 정수값 : => : // 세미클론 말고 클론(:) 찍어야함
 * 				처리문장
 * 				==> if(조건){처리}
 * 			case 정수값 :
 * 				처리문장    ===> 중복된 값은 사용할 수 없다	
 * 		}
 * 
 * 		switch(a)
 * 		{
 * 			case 1:
 * 			case 1: ==> error 중복된 값은 사용할 수 없다
 * 
 * 			if(a==1){System.out.println(1);}
 * 			if(a==1){System.out.println("일");} => error 
 * 
 * 			if(a==1){
 * 				System.out.println(1);
 * 				System.out.println("일");
 * 			}
 * 			
 * 			// 사용자 => 정수=1
 * 			switch(정수) => break가 없는 경우에는 모든 문장을 수행
 * 			{ 
 * 				case 1:
 * 					처리문장1
 *  		    case 2:
 * 					처리문장2
 * 					break;
 *   		    case 3:
 * 					처리문장3
 * 			}
 * 
 * 		}
 * 
 */
import java.util.*;
public class 선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수(1~5):");
		select=scan.nextInt();
		/*
		if(select==1 || select==2) 
		위아래가 같은 의미이다 
		case 2:
		System.out.println("1번~2번을 입력하였습니다");
		break;
		*/
		// 종료 시점
		switch(select) {
		// 라벨은 꼭 따로줘야한다 (라벨:case)
		case 1:
			//System.out.println("1번~2번을 입력하였습니다");
			// break; // switch문 종료한다
		case 2:
			System.out.println("1번~2번을 입력하였습니다");
			break;
		case 3:
			System.out.println("3번을 입력하였습니다");
			break;
		case 4:
			System.out.println("4번을 입력하였습니다");
			break;
		case 5:
			System.out.println("5번을 입력하였습니다");
			break;
		default: 
			System.out.println("1~5번까지만 사용하세요"); // 마지막은 break 안걸어도 가능 (=else)
		}

	}
	
}

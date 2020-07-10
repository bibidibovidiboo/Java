/*		< for 문  >
 * 		반복문 - for , while , do~while
 * 		=== 프로그래머의 사용빈도
 * 		for : 반복 횟수가 있는 경우에 주로 사용
 *		while : 반복 횟수가 없는 경우에 주로 사용
 * 			===> for <==> while ,  다중조건문 <==> 선택문
 * 		do~while : 조건을 나중에 검색 => 한번 이상은 반드시 수행
 * 
 * 		1) for
 * 			형식>
 * 				1.==> 1부터 시작
 * 				2.==> 10이 될 때 까지 
 * 				3.=> 증가 ==> i++
 * 				for(int i=1;1<=10;1++){
 * 					반복 수행문장 : 10번을 수행하는 문장
 * 				}
 * 
 * 				=> 초기값 , 조건식 , 수행문장 , 증가식 
 * 						 =====  ======  =====
 * 
 *						 = true => 반복
 *						 = false => 종료
 *
 *				==> 실제 형식
 *					for(초기값 (변수) ; 조건(비교,논리,부정 연산자); 증가(증감))
 * 									====
 * 									반드시 true/false
 * 					=> 출력 ==> 1~10
 * 					   for(int i=1;i<=10;i++)
 * 					       출력 ==> 10~1
 * 					   for(int i=10;i>=1;i--) => sort
 * 					
 * 				=> for 실행순서
 * 						①  →  ②    ④   false => for 종료
 * 				   for(초기값;조건식;증감식)
 * 				   {	true면 ↓ ③ ↗
 * 						       반복 수행문장
 * 				   }
 * 					
 * 					1 ==> 2 ==> 3 ==> 4 
 * 						  2 ==> 3 ==> 4 ( false 나올 때까지 반복)
 * 
 * 				// 주의점 : 조건식이  false가 없으면 => 무한루프가 된다
 * 
 */
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 ==> 출력 -> 명령문이 반복
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		// for문으로 바꿔주면 ↓
		System.out.println("==== 반복문 ====");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}

	}

}

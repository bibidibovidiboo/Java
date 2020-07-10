/*	  < 메소드  >
 *    프로그램 (저장된 데이터 + 명령문)
 *    변수 -> 배열 -> 클래스 -> 파일 -> 데이터베이스
 *    명령문 ==> 메소드 (한 개의 기능) ==> 클래스 ==> 패키지 ==> .jar(라이브러리)
 *    
 *    메소드 >
 *     - 사용자 정의 메소드
 *         형식) 
 *              반환형 메소드명(매개변수..)
 *              {
 *              	return 값; => 값=반환형
 *                  반환형이 없는 경우에는 void 사용 => return 생략 가능
 *              }   
 *              ==> 메소드 안에서 처리 -> 출력  ==> 일반 도스
 *              ==> 메소드 안에서 처리 -> 결과값 전송 ==> 웹, 윈도우     
 *         호출)
 *              메소드명(값,값)
 *              	=> void method(int a, int b)
 *              메소드를 호출하고 메소드 수행 종료 (return) => 다시 호출된 위치로 돌아온다
 *              
 *              int method()
 *              => int a=method()
 *              String method(int a)
 *              => String s=method(10) => int a=10
 *              double random()
 *              String substring(int s,int e)
 *              boolean equals(String s)
 *              void println()
 *              
 *              	반환값(리턴형)		 매개변수
 *             			O			  O     String substring(int s, int e)
 *             			O			  X		int length()
 *             								double random()
 *             			X(void)		  O		system.out.println(String s)		
 *             			X(void)		  X		system.out.println()
 *             
 *     - 라이브러리 메소드
 *     
 *     
 *    메소드 : 특정 작업을 수행하기 위한 컴퓨터의 명령문의 집합
 *           *** 한가지 일만 수행
 *           *** 세분화 작업 => 재사용 목적 => import
 *           
 *           목적 : 재사용성, 중복된 코드 제거
 *           사용법 : 구조화 (단락(기능)) 
 *           
 *           예) 숫자 야구 게임
 *              = 3자리 정수의 난수 발생
 *              = 사용자에게 입력 요청
 *              = 난수와 사용자 입력값 비교
 *              = 힌트 
 *              = 정답일 경우에 종료
 *              = 다시 게임을 할지 여부 확인 
 *              
 * 	     실행형식  : 메소드가 종료해야 다른 문장을 수행한다             
 */
/*		꼭 들어가야할 것 ★
 *      1) 목록출력
 *      2) 찾기(검색)
 *      3) 수정
 *      4) 삭제
 *      5) 추가
 *      6) 상세보기
 *      =============> 웹사이트 
 */

public class 자바메소드1 {
	static void aaa()
	{
		System.out.println("aaa() 호출 시작.."); //1
		bbb(); // ==>  bbb()로 이동
		System.out.println("aaa() 호출 종료.."); //8
	}
	static void bbb()
	{
		System.out.println("bbb() 호출 시작.."); //2
		ccc();
		System.out.println("bbb() 호출 종료.."); //7
	}
	static void ccc()
	{
		System.out.println("ccc() 호출 시작.."); //3
		ddd();
		System.out.println("ccc() 호출 종료.."); //6
	}
	static void ddd()
	{
		System.out.println("ddd() 호출 시작.."); //4
		System.out.println("ddd() 호출 종료.."); //5
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa(); // main => 시작하는 메소드를 호출 (시작점만 호출)
	}

}
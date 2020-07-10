/*	< 배열  >
 * 	배열 => 용도별로 묶어서 사용한다
 * 	==== 선언 데이터[] 배열명;
 * 			 ===== 기본형
 * 			 byte[] b => File 전송
 * 			 String[] s => 문자열이 많은 경우 (이름,주소,전화번호)
 * 			 int[] i => 성적계산 , 통계
 *			 double[] d => 통계 , 빈도수 , 레이팅
 *			 boolean[] b => 존재여부
 */
public class 자바배열_용도4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {
				"lemon",
				"apple",
				"peach",
				"watermelon",
				"tomato",
				"kiwi",
				"banana",
		};
		// 1) 과일명 중에 가장 짧은 과일은?
		// 전체 과일 출력
		System.out.println("====== 전체 과일명 ======");
		for(String ss:s) 
		// index가 존재하지 않는다 , 값을 변경할 수 없다 ★★★  => 변경하려면 일반 for문 써야함
		{
			System.out.println(ss);
		}
		
		System.out.println("=====================");
		System.out.println("과일명 중에 가장 짧은 과일은?");
		
		int min=100; // 왜 100? 최소값 구해야해서 임의로 설정한것 
		for(String ss:s)
		{
			int len=ss.length(); // 문자열 => 문자의 갯수 (length())
			if(min>len)
				min=len;
		}
		
		// 출력
		for(String ss:s) {
			if(ss.length()==min) {
				System.out.println(ss);
			}

		}
		
		// 2) 가장 긴 과일은 과일은?
		
		System.out.println("=====================");
		System.out.println("과일명 중에 가장 긴 과일은?");
		
		int max=0;
		
		for(String ss:s)
		{
			int len=ss.length(); // 문자열 => 문자의 갯수 (length())
			if(max<len)
				max=len;
		}
		
		// 출력
		for(String ss:s) {
			if(ss.length()==max) {
				System.out.println(ss);
			}

		}	
		System.out.println("=====================");
		
		/*  3) 문자 갯수 확인 ==> 비밀번호
		 * 	문자열 =>
		 * 	String ==> char[] ==>  시작번호가 ==> 0
		 *  "Hello Java"
		 *  0123456789
		 */
		
		String msg="Hello Java"; // charAt() => 문자열에서 원하는 문자추출
		// 시작번호는 0부터 시작
		System.out.println("5번째 문자가?");
		for(int i=0;i<msg.length();i++) {
			System.out.println(msg.charAt(i)); // 한글자씩 가져오려면 char
		}
		// 배열은 0부터 시작이라 항상 1이 작음

	} //
}

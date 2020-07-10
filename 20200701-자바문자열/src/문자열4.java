// < String >
// p.209 String 클래스의 주요 메서드
// 시작문자열 : startsWith()
// 끝나는 문자열 : endsWidth()
import java.util.*;
public class 문자열4 {
	// 예외처리 throws Exception
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] data= {
				"Java Program",
				"Oracle Program",
				"JSP Program",
				"Oracle AND Java",
				"Java AND JSP",
				"Ajax Program",
				"Spring AND Mobile",
				"Kotlin Program",
				"XML AND Annotation",
				"Java AND JQuery",
		};
		// startsWith
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String ss=scan.nextLine(); // next()=> 공백(enter,space) , nextLine => 다음줄(enter)
		for(String s:data) {
			if(s.startsWith(ss) || s.endsWith(ss)) // 시작하는거 || 들어가는거 전부 
			{
				System.out.println(s); // 검색어 입력하면 원하는 문구 들어간 문장 출력해줌
				Thread.sleep(500); // 하나 출력하고 0.5초 뒤에 출력 (1/1000단위) 
			} 
		}

	} //

}

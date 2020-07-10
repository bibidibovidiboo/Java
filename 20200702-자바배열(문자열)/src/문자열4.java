/*	< split > ★중요
 *  split() : => String[]
 *	문자를 구분해서 자르는 역할
 * 
 *  주의점>
 *  ?와 같은 정규표현식은 쓸 수 없음 => 쓰려면  \\뒤에 써야함 => \\?
 *  정규표현식 참고) p.505
 *  https://highcode.tistory.com/6
 */
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="밑반찬,메인반찬,국/탕,찌개,디저트,면/만두,밥/죽/떡,퓨전,김치/젓갈,장류,양념/소스/잼,양식,샐러드,스프,빵,과자,차/음료/술,기타";
		String[] arr = msg.split(","); // ,별로 나눠달라고 요청
		// 전체를 가져와서 ,별로 나눠서 써줌 => 일반문자열을 배열로 변경해줌 , 콤마(,) 구분문자만 있으면 언제든 배열로 만들어줌
		// 문자일 때만 사용이 가능하다
		for(String s:arr) {
			System.out.println(s);
		}
		
	
	}
}

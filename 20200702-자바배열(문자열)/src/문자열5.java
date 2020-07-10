// < valueOf >
/* 	valueOf() => 모든 데이터형을 문자열로 변환
 * 	valueOf(10) => "10"
 *  valueOf(true) => "true"
 *  char[] c = {'H','e','l','l','o;};
 *  valueOf(c) ==> "Hello"
 */
public class 문자열5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c={'H','e','l','l','o'};
		String msg = String.valueOf(c);
		System.out.println(msg);
		// ㄴ 캐릭터를 문자열로 바꿀 때 사용 , char[] ==> String
		String ss="Hello Java!!";
		char[] cc=ss.toCharArray();  // ss.toChartArray => 인스턴스 함수*
		// ㄴ 문자열을 캐릭터로 바꿀 때 사용 , String ==> char[]		
		
		int a=10;
		int b=20;
		System.out.println(String.valueOf(a)+String.valueOf(b));
		// string으로 바뀐거라 10+20=30 추출이 아니라 문자열 결합이라 1020
		// valueOf 쓰는순간 모두 문자열로 변환된다 ★★
		// String 그대로 쓰는 static 함수 *
	}

}

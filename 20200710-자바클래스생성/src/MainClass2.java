/*	< 클래스 구성요소  >
 * 	메소드 : 기능 , 행위 , 동작
 * 	자판기 )
 * 	  동전,음료수
 * 	  동전투입 시 처리
 * 	  버튼 누를 때 처리 
 * 	
 * 	 public static void main(String[] args) O
 *   static public void main(String[] args) O => 순서변경 가능
 *   public void main(String[] args) X => static 빠지면 안됨
 *   static void main(String[] args) X => public 빠지면 안됨
 *   public static void main(String[] a) O => 변수명 맘대로 줘도됨
 *   
 */
public class MainClass2 {
	public static void main(String[] a) {
		// ↑ (String[] args) 자리에 변수 a를  넣어도 된다 
		System.out.println("aaa");
		
		/*
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		*/

	}

}

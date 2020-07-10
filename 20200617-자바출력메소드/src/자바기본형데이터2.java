/*		< 기본형  >
 *		특수문자 중 4가지는 기억할 것 
 *		\t
 * 		\n
 * 		\"
 * 		\\
 * 		double d=123456.78
 * 		int a= (int)((d-123456)*100)
 * 
 * 		퍼블릭 클래스 자바기본형{
 * 			퍼블릭 스태틱 보이드 메인(스트링[] 매개)
 * 			{
 * 			}		
 *		}	=> 다국어 유니코드 (참고)
 *
 */
public class 자바기본형데이터2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("C:\\javaDev\\javaStudy\\20200617-자바출력메소드\\src\\자바기본형데이터2.java");
		// 역슬래쉬 2개를 줘야 /로 출력됨
		System.out.println("\"홍길동\""); // "홍길동" 따옴표도 넣으려면 역슬래쉬 넣어줘야함
		System.out.print("Hello\t"); // Hello 뒤에 \t를 넣으면 줄이 바뀜
		System.out.print("Java!!");
		
		float d=123456.78F;
		int a= (int)((d-123456)*100);
		System.out.println(a);
	}

}

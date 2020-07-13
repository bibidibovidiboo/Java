/* 	< 캡슐화  >
 * 	
 * 	회원가입 , 게시판 , 영화정보
 * 	= id
 *  = password
 *  = 이름 , 나이 , 전화 , 주소
 *  = 제목 , 내용 , 비밀번호 , 번호
 *  = 번호 , 영화명 , 출연 , 감독 , 등급 , 장르
 *  
 * 	===========> 캡슐화 (경계구분)
 * 	회원가입
 *   = id
 *   = password
 *   = 이름 , 나이 , 전화 , 주소	 
 * 	====================== 
 * 	영화정보
 *	 = 번호 , 영화명 , 출연 , 감독 , 등급 , 장르
 * 	======================
 * 	게시판
 *   = 제목 , 내용 , 비밀번호 , 번호
 *   
 */
class Member {
	// 인스턴스 변수 => 저장 (new)
	private String name; // 접근이 불가능 (Member클래서 내에서만 접근가능)
	public int age; // 접근이 가능 (같은 폴더 안이면 가능 )
	protected String addr; // 접근이 가능
	String tel; // 접근이 가능
	
	// 필요하면 변수를 사용이 가능하게 만든다
	public void setName(String n) { // 메모리에 저장 ==> 자동생성  lombok
		name=n;
	}
	
	public String getName() {
		 return name;
	}	
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Member에 저장되어 있는 변수에 접근
		
		// Member를 저장
		Member m=new Member(); 
		// 변수값 지정
		// m.name="홍길동"; => 오류뜸 ==> private 이라서 
		m.setName("홍길동");
		m.age=30;
		m.addr="서울";
		m.tel="010-1111-2222";
		
		// 출력
		System.out.println("이름:"+m.getName());
		System.out.println("나이:"+m.age);
		System.out.println("주소:"+m.addr);
		System.out.println("전화:"+m.tel);
		
	}

}

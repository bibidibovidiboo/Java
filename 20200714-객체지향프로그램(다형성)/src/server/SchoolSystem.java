/*	< 캡슐화 코딩 >
 * 	변수(멤버,공유) ==> private ==>  setter / getter 
 * 	메소드 ==> public
 * 	생성자 ==> public
 * 
 */
package server;
import client.Student;
public class SchoolSystem {
	public void display() {
		Student s=new Student();
		s.name="이보미";
		s.setHakbun(2);
		s.setSubject("영업");
		s.setTel("010-1111-1111");
		System.out.println("이름:"+s.name);
		System.out.println("전화:"+s.getTel());
		System.out.println("과목:"+s.getSubject());
		System.out.println("학번:"+s.getHakbun());
	}
	// static이 아닌건 new 이용해서 만들고 호출해야함
	// 저장 - setter , 읽어오기 - getter
	public static void main(String[] args) {
		SchoolSystem ss=new SchoolSystem();
		ss.display();
	}
		
}

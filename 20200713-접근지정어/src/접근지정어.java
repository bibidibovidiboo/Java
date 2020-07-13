//  0713) 접근지정어 - 캡슐화 - 재사용 - 응용 - 프로젝트
/*	< 접근지정어  >
 * 	
 * 	변수 => 읽기(저장된 데이터 읽기) , 쓰기(메모리에 저장)
 * 
 * 	메소드 >
 * 	읽기 : getter() => 저장된 데이터 값 읽기
 * 	쓰기 : setter() => 변수값을 저장
 * 
 * 	private String name;
 * 
 *  캡슐화 방식 => 데이터를 보호하는 목적
 *  
 *  ==> setter
 *  public void setName(String name) {
 *		this.name=name;
 *	}
 *  ==> getter
 *  public String getName(){
 *  	return name;
 *  }
 *  	
 */
import lombok.Getter;
import lombok.Setter;
@Getter 
@Setter
class Student {
	private int hakbun;
	private String name;
	private String sex;
	public int getHakbun() {
		return hakbun;
	}
	/* 라이브러리 안쓰면 이렇게 써야 사용가능
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	*/
}
public class 접근지정어 {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		
}

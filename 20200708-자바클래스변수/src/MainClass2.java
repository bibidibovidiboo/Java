// < 다음 영화 예제  >
// public 설명 ★★
// class가 여러개 가능 , public class가 저장명이 된다 (public은 하나만 가능) 
// public은 안써도 됨 => 그럴 때는 main이 들어있는 class가 저장명이 된다
// 사용자가 직접 데이터형을 만든다
class MovieInfo{
	// 멤버변수 , 인스턴스 변수 (클래스 마다 따로 들어가는 변수)
	// 인스턴스 변수 ==>  메모리 공간을 생성   => new
	String title;
	String director;
	String actor;
	double reserve;
	int rank;
	static String site_name;
}
// MovieInfo m1=new MovieInfo() => 즉 통으로 묶어서 new로 만들어서 사용 ★
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieInfo m1=new MovieInfo();
		// m1 메모리에 저장되어 있는 변수의 초기값 설정 
		// int m1=0 ; 
		// m1,m2,m3 이렇게 하나하나 입력 비효율적 => 배열로 잡기 ==> MovieInfo[] m=new MovieInfo()
		// MovieInfo => 우리가 만든 데이터형 , 즉 int 같은 의미 
		m1.title="#살아있다";
		m1.director="조일형";
		m1.actor="유아인, 박신혜";
		m1.reserve=17.3;
		m1.rank=1;
		m1.site_name="cgv";
		
		MovieInfo m2=new MovieInfo();
		m2.title="다크 나이트 라이즈";
		m2.director="크리스토퍼 놀란";
		m2.actor="크리스찬 베일, 마이클 케인, 게리 올드만, 앤 해서웨이, 톰 하디, 마리옹 꼬띠아르";
		m2.reserve=7.5;
		m2.rank=2;
		m2.site_name="롯데시네마";
		
		MovieInfo m3=new MovieInfo();
		m3.title="원 데이";
		m3.director="론 쉐르픽";
		m3.actor="앤 해서웨이, 짐 스터게스";
		m3.reserve=1.3;
		m3.rank=3;
		m3.site_name="메가박스";
		
		MovieInfo.site_name="서울극장"; // 클래스 이름을 통해 접근이 가능 (static) ex.랜덤함수
		
		System.out.println("영화관:"+m1.site_name);
		m3.title="결백";
		System.out.println("영화제목:"+m1.title);
		System.out.println("영화제목:"+m3.title);
	}

}












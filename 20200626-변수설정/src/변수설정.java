// < 변수 예제 - 다음영화  >
// 영화 => 정보 저장하는 변수
// 변수 => 변경이 가능
/* 	위대한 쇼맨(2017)상영중
	The Greatest Showman 평점 09 . 9
	뮤지컬/드라마
	미국
	2017.12.20 개봉 2020.05.21 (재개봉)
 	104분, 12세이상관람가
	감독 마이클 그레이시 주연 휴 잭맨, 잭 에프론
	예매 5위 누적관객1,667,104명 
  	
  	야구소녀(2019)상영중
	Baseball Girl 평점 08 . 5
	드라마
	한국
	2020.06.18 개봉
 	105분, 12세이상관람가
	감독 최윤태 주연 이주영
	예매 7위 누적관객21,783명 
*/
public class 변수설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제목
		String title="위대한 쇼맨(2017)";
		boolean isOpen=true;
		double score=9.9;
		String na="미국";
		String genre="뮤지컬/드라마";
		String regdate="2020.05.21";
		String director="마이클 그레이시";
		String actor="휴 잭맨,잭 에프론";
		int time=104;
		int grade=12;
		int rank=5;
		int showUser=1667104;
		
		// 상세보기 출력
		System.out.println("======== 영화정보 ========");
		System.out.print("영화명"+title);
		System.out.println(""+(isOpen==true?"상영중":"미개봉")); // 삼항연산자
		System.out.println("기타:"+na+" "+grade+"세이상 관람가");
		System.out.println("시간:"+time+"분");
		System.out.println("개봉일:"+regdate+"개봉");
		System.out.println("감독:"+director);
		System.out.println("출연:"+actor);
		System.out.println("순위:"+rank);
		System.out.println("누적관객수:"+showUser);
		
		title="야구소녀(2019)";
		isOpen=true;
		score=8.5;
		na="한국";
		genre="드라마";
		regdate="2020.06.18";
		director="최윤태";
		actor="이주영";
		time=105;
		grade=12;
		rank=7;
		showUser=21783;
		
		System.out.println("======== 영화정보 ========");
		System.out.print("영화명"+title);
		System.out.println(""+(isOpen==true?"상영중":"미개봉")); // 삼항연산자
		System.out.println("기타:"+na+" "+grade+"세이상 관람가");
		System.out.println("시간:"+time+"분");
		System.out.println("개봉일:"+regdate+"개봉");
		System.out.println("감독:"+director);
		System.out.println("출연:"+actor);
		System.out.println("순위:"+rank);
		System.out.println("누적관객수:"+showUser);
	}

}

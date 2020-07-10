/*  < 다음 영화 메소드 예제 >
 *  영화를 선택
 *  ========
 *   현재상영영화
 *   개봉예정영화
 *   박스오피스(주간)
 *   박스오피스(월간)
 *   박스오피스(연간)
 */
 // 아직은 잘 몰라도 됨
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class 자바메소드4 {
	static int menuSelect() {
		Scanner scan=new Scanner(System.in);
		System.out.println("메뉴를 선택하세요(1~5):");
		int no=scan.nextInt(); // 사용자 입력받을값
		return no;
	}
	// 메뉴는 보여만 주는거라 void , 계속 돌아가게 해야함 => while문 사용
	static void menu() {
		System.out.println("====== MENU ======");
		System.out.println("1.현재상영영화");
		System.out.println("2.개봉예정영화");
		System.out.println("3.박스오피스(주간)");
		System.out.println("4.박스오피스(월간)");
		System.out.println("5.박스오피스(연간)");
		System.out.println("6.종료");
		System.out.println("==================");
	}
	// menu 주소 받기
	// 네트워크 , 인터넷 주소 불러올 때 예외처리가 필요 ↓
	static void movieData(int no) throws Exception {
		String[] site= {
				"https://movie.daum.net/premovie/released",
				"https://movie.daum.net/premovie/scheduled",
				"https://movie.daum.net/boxoffice/weekly",
				"https://movie.daum.net/boxoffice/monthly",
				"https://movie.daum.net/boxoffice/yearly"
		};
		String[] subject= {
				"현재상영영화",
				"개봉예정영화",
				"박스오피스(주간)",
				"박스오피스(월간)",
				"박스오피스(연간)"
		};
		
		// 출력
		System.out.println("★★★★★★"+subject[no-1]+"★★★★★");

		Document doc=Jsoup.connect(site[no-1]).get();
		Elements title=doc.select("div.info_tit a.name_movie");
		for(int i=0;i<title.size();i++) {
			System.out.println((i+1)+"."+title.get(i).text());
		}
	}
	// 출력
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		while(true) {
			menu();
			int no=menuSelect();
			
			if(no==6) // 6번이면 끝나도록
			{	
				System.out.println("프로그램 종료");
				break;
			}
			movieData(no);
		}
	}
}
/*  < 지니차트 예제  >
 *  지니차트 데이터 긁기 실습예제 (아직은 몰라도됨-프로젝트 때)
 *  참고 >
 *  예외처리 => 에러방지
 *  => 에러 => 직접처리 => try ~ catch
 *  => 에러 => 회치(시스템에 맡긴다) => throws
 */
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class 자바메소드2 {
	// 예외처리를 반드시 해야하는 부분들이 있음 => 뒤에 배움	
	static String[] genieMusicDate() throws Exception {
		String[] data=new String[50];
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title=doc.select("td.info a.title");
		for(int i=0;i<50;i++) {
			data[i]=title.get(i).text();
		}
		return data;
	}
	static String[] genieMusicFind(String ss) throws Exception {
		String[] data=genieMusicDate();
		int k=0;
		for(String title:data) {
			if(title.contains(ss)) {
				k++;
			}
		}	
		String[] find=new String[k]; // 배열설정
		k=0;
		for(String title:data) {
			if(title.contains(ss)) {
				find[k]=title;
				k++;
			}
		}	
		return find;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] data=genieMusicDate();
		for(String title:data) {
			System.out.println(title);
		}
		System.out.println("============================");
		Scanner scan=new Scanner(System.in);
		System.out.print("곡명을 입력하세요:");
		String ss=scan.nextLine();
		String[] fd=genieMusicFind(ss);
		for(String title:fd) {
			System.out.println(title);
		}
 	}
}

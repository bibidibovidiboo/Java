/*  < ���� ��ȭ �޼ҵ� ���� >
 *  ��ȭ�� ����
 *  ========
 *   ����󿵿�ȭ
 *   ����������ȭ
 *   �ڽ����ǽ�(�ְ�)
 *   �ڽ����ǽ�(����)
 *   �ڽ����ǽ�(����)
 */
 // ������ �� ���� ��
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class �ڹٸ޼ҵ�4 {
	static int menuSelect() {
		Scanner scan=new Scanner(System.in);
		System.out.println("�޴��� �����ϼ���(1~5):");
		int no=scan.nextInt(); // ����� �Է¹�����
		return no;
	}
	// �޴��� ������ �ִ°Ŷ� void , ��� ���ư��� �ؾ��� => while�� ���
	static void menu() {
		System.out.println("====== MENU ======");
		System.out.println("1.����󿵿�ȭ");
		System.out.println("2.����������ȭ");
		System.out.println("3.�ڽ����ǽ�(�ְ�)");
		System.out.println("4.�ڽ����ǽ�(����)");
		System.out.println("5.�ڽ����ǽ�(����)");
		System.out.println("6.����");
		System.out.println("==================");
	}
	// menu �ּ� �ޱ�
	// ��Ʈ��ũ , ���ͳ� �ּ� �ҷ��� �� ����ó���� �ʿ� ��
	static void movieData(int no) throws Exception {
		String[] site= {
				"https://movie.daum.net/premovie/released",
				"https://movie.daum.net/premovie/scheduled",
				"https://movie.daum.net/boxoffice/weekly",
				"https://movie.daum.net/boxoffice/monthly",
				"https://movie.daum.net/boxoffice/yearly"
		};
		String[] subject= {
				"����󿵿�ȭ",
				"����������ȭ",
				"�ڽ����ǽ�(�ְ�)",
				"�ڽ����ǽ�(����)",
				"�ڽ����ǽ�(����)"
		};
		
		// ���
		System.out.println("�ڡڡڡڡڡ�"+subject[no-1]+"�ڡڡڡڡ�");

		Document doc=Jsoup.connect(site[no-1]).get();
		Elements title=doc.select("div.info_tit a.name_movie");
		for(int i=0;i<title.size();i++) {
			System.out.println((i+1)+"."+title.get(i).text());
		}
	}
	// ���
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		while(true) {
			menu();
			int no=menuSelect();
			
			if(no==6) // 6���̸� ��������
			{	
				System.out.println("���α׷� ����");
				break;
			}
			movieData(no);
		}
	}
}
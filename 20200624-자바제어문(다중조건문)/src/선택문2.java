// < ��ȭ ����  >
import java.util.*;
public class ���ù�2 {
	// ����ó�� - throws Exception & runtime ���°� ������ �� ���󵵵�
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int menu=0;
		Scanner scan=new Scanner(System.in);
		System.out.println(
				"===== �޴� =====\n"
				+"Ȩ(1)\n����󿵿�ȭ(2)\n����������ȭ(3)\n�ڽ����ǽ�(4)\n"
				+"��ȭ����(5)\n��ȭ����(6)\n"
				+"=============="
		);
		System.out.println("�޴� �����ϼ���?");
		menu=scan.nextInt();
		//
		switch(menu) {
		
			case 1:
				Runtime.getRuntime().exec("C:\\Program Files\\internet explorer\\iexplore.exe https://movie.daum.net/main/new#slide-2-0");
				break; // �̰� ������ ���� ���ư�
			case 2:
				Runtime.getRuntime().exec("C:\\Program Files\\internet explorer\\iexplore.exe https://movie.daum.net/moviedb/main?movieId=126126");
				break;
			case 3:
				Runtime.getRuntime().exec("C:\\Program Files\\internet explorer\\iexplore.exe https://movie.daum.net/moviedb/main?movieId=129134");
				break;
			case 4:
				Runtime.getRuntime().exec("C:\\Program Files\\internet explorer\\iexplore.exe https://movie.daum.net/moviedb/main?movieId=125255");
				break;
			case 5:
				Runtime.getRuntime().exec("C:\\Program Files\\internet explorer\\iexplore.exe https://movie.daum.net/moviedb/main?movieId=128636");
				break;
			case 6:
				Runtime.getRuntime().exec("C:\\Program Files\\internet explorer\\iexplore.exe https://movie.daum.net/moviedb/main?movieId=53080");
				break;
			default:
				System.out.println("�޴��� �������� �ʽ��ϴ�");
		}
		
		
		
	}
}

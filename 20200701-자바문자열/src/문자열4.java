// < String >
// p.209 String Ŭ������ �ֿ� �޼���
// ���۹��ڿ� : startsWith()
// ������ ���ڿ� : endsWidth()
import java.util.*;
public class ���ڿ�4 {
	// ����ó�� throws Exception
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] data= {
				"Java Program",
				"Oracle Program",
				"JSP Program",
				"Oracle AND Java",
				"Java AND JSP",
				"Ajax Program",
				"Spring AND Mobile",
				"Kotlin Program",
				"XML AND Annotation",
				"Java AND JQuery",
		};
		// startsWith
		Scanner scan=new Scanner(System.in);
		System.out.print("�˻��� �Է�:");
		String ss=scan.nextLine(); // next()=> ����(enter,space) , nextLine => ������(enter)
		for(String s:data) {
			if(s.startsWith(ss) || s.endsWith(ss)) // �����ϴ°� || ���°� ���� 
			{
				System.out.println(s); // �˻��� �Է��ϸ� ���ϴ� ���� �� ���� �������
				Thread.sleep(500); // �ϳ� ����ϰ� 0.5�� �ڿ� ��� (1/1000����) 
			} 
		}

	} //

}

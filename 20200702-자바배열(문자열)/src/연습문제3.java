// < ����  >
// PPT ������ ����
import java.util.*;
public class ��������3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String course[] = {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int jumsu[]= {95,88,76,62,55};
		
		// �Է°� �ޱ�
		Scanner scan=new Scanner(System.in); 
		
		boolean bCheck=false;
		while(true) {
			bCheck=false; // ** �ٽø���
			System.out.print("���� �Է�:");
			String subject=scan.nextLine();
			if(subject.equals("�׸�")) {
				break;
			}
			for(int i=0;i<course.length;i++) {
				if(subject.equals(course[i])) 
				{
					bCheck=true;
					System.out.println(jumsu[i]); 
				} 
				/*
				else {
				System.out.println("���� �����Դϴ�!!"); 
				} 
				���⿡ ������  else�� 5�� ���� �� �����Ƿ� �ۿ���  if�� �����ؾ��� �ڡ�
				 */
			}
			if(bCheck==false) {
				System.out.println("���� �����Դϴ�!!");
			}
			// �ȳ����� ���⼭ ������  false�� ���� �ö󰡸� �ȵż� ** �ٽ� ����
		}
	
	} 
}
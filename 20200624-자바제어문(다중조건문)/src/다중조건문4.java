/*	< ���� if�� ����  >
 * 
 *	���� 1��)
 * 	����� => �����Է� (1~12)
 * 	12,1,2 => �ܿ��Դϴ�
 * 	3,4,5, => ���Դϴ�
 * 	if(month==3 || month==4 || month==5) -> ���� �ڵ��� ���
 * 	if(month>=3 && month<=5) -> �̰͵� ���� 
 * 	6,7,8 => �����Դϴ�
 * 	9,10,11 => �����Դϴ�
 * 
 *  =======================
 *  ���� 2��)
 *  ���ڸ� �Է��� �޾Ƽ� char ch
 *  	= ���� ch>='0' && ch<='9'
 *  	= ���ĺ� ch>='A' && ch<='Z' || ch>='a' && ch<='z'
 *  	= �ѱ� ch>='��' && ch<='�R' // �R�� �ѱ� ������ ������
 *  	= Ư������
 */
import java.util.*;
public class �������ǹ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���� 1��)
		Scanner scan=new Scanner(System.in);
		System.out.println("�����Է� (1~12):");
		int month=scan.nextInt();
		
		if(month==12 || month==1 || month==2) {
			System.out.println(month+"���� �ܿ��Դϴ�");
		}
		else if(month==3 || month==4 || month==5) {
			System.out.println(month+"���� ���Դϴ�");
		}
		else if(month==6 || month==7 || month==8) {
			System.out.println(month+"���� �����Դϴ�");
		}
		else if(month==9 || month==10 || month==11) {
			System.out.println(month+"���� �����Դϴ�");
		}
		else {
			System.out.println("�߸��� �Է��Դϴ�");
		} */
		
		// ���� 2��
		char ch='A'	; // ��������
		
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�:");
		ch=scan.next().charAt(0); // nextInt ��� ���ڴ� �̰� ����ؾ���
		
		if(ch>='0' && ch<='9') {
			System.out.println(ch+"��(��) �����Դϴ�");
		}
		else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
			System.out.println(ch+"��(��) ���ĺ��Դϴ�");
		}
		else if(ch>='��' && ch<='�R') {
			System.out.println(ch+"��(��) �ѱ��Դϴ�");
		}
		else {	
			System.out.println(ch+"��(��) Ư�������Դϴ�");
		}
	} 

}

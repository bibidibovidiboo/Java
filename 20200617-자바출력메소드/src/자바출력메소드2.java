// < ��� �޼ҵ�  >
// �ϳ��� ���°� ��Ģ�ε� �ʹ� ��� *�� ��밡�� (import java.util.Scanner�� ������)
// ����� �� : \n, \t
// sanner ��а� �� �� 
import javax.swing.JOptionPane;
import java.util.*; 
public class �ڹ���¸޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \n�� newLine => ���ο� �ٿ� ��� *
		// \t�� �� => ���� ���� *
		/*
		 * System.out.printf("%d*%d=%d\n",2,2,4); System.out.printf("%d*%d=%d",2,3,6);
		 */

		Scanner scan=new Scanner(System.in);
		// new�� Ŭ������ ����
		
		/*
		 * Scanner : ��������
		 * scan : ����
		 * new : �޸𸮿� ����
		 * Scanner(System.in) : �ʱ�ȭ
		 */
		
		System.out.print("1' ���� �Է�:");
		int a=scan.nextInt(); // �Էµ� ������ �о�ͼ� a��� �޸𸮿� ����
		// System.out.print("2' ���� �Է�:"); 
		int b=scan.nextInt();
		
		// ��� - �ϳ� �Է��ϰ� �����ϰ� ����ġ�� ������
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		// JOptionPane.showInputDialog("����");
		
		// ���Ͷ� ���� ���ÿ� ����� ���� ����
		
		// Scanner => ���������� ���

	}

}

/*  < ����  >
 *	���� => �ʱ�ȭ
 *	1) ���� ó��
 *	   int a=100;
 * 	2) ���� => Ű���忡�� �޾Ƽ� ����
 * 	3) ������ ���� ���� (����) => ����, �ζ�
 *  4) �Է�â�� ���� ���� �޴� ���
 * 
 * 	==> ���� ���ÿ� �ʱⰪ �ο� ==> �����ڿ�
 * 		int a=100;
 * 
 *  ==> �����ϰ� ���߿� �ʱⰪ �ο� ==> ����ڿ�
 *    	int a;
 *  	a=200;
 */		
// String, System, Math => java, lang ������ ����
import java.util.*;
public class �ڹٺ����ʱ�ȭ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		System.out.println("a="+a);
		
		int b;
		b=200;
		System.out.println("b="+b);
		
		// ���⼭���ʹ� �ϴ� ���� �� �ڿ� ���
		
		int c; //98.5 => 98
		c=(int)(Math.random()*100)+1; // ���� => ����ó��
		// ==========================================0.0~0.99 => *100 => 0.0~99.0 => int 0~99
		System.out.println("c"+c);
		
		int d;
		Scanner scan=new Scanner(System.in);
		// system.in => Ű���� �Է°��� �о� �´�
		System.out.println("�����Է�");
		d=scan.nextInt();
		
		System.out.println("d="+d);

	}

}

/*  < ��� �޼ҵ�  >
 *  ����� �� : pringln, print
 *  
 * 	/ ȭ�� ���
 *	= System.out.println() => �����ٿ� ���
 *		��) 
 *		System.out.println("Hello");
 *		System.out.println("Java");
 *		Hello
 *		Java
 *
 *	= System.out.print() => �̾ ���
 *      System.out.print("Hello");
 *		System.out.print("Java");
 *
 *		HelloJava 
 *
 *	= System.out.printf() : ������ �ִ� ���  ex)������
 *	
 *		80 80 80 240 80.0 
 *		
 *		System.out.println("80 80 80 240 80.0 B")
 *
 *		System.out.printf("%5d%5d%5d%5d%5f%5c",80,80,80,240,80.0,'B')
 *
 *		%5d	80
 *		00080	
 *		%-5d
 *		80000
 *
 *		%5.2f	80.0
 *		080.00
 * 
 */
public class �ڹ���¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.1f",80.55);
		int a=2;
		int b=2;
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d",a,b,a*b); // JDK 1.5\
		
		/*
		 * 	%d => ����
		 * 	%f => �Ǽ�
		 * 	%c => ����
		 * 	%s => ���ڿ�
		 */
	}

}

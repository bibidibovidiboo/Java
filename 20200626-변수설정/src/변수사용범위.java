/*  < ���� ������  >
 * 	���� Scope
 * 	========
 * 	��������
 * 	=====
 * 	= ��������
 * 	= �������
 * 	= ��������
 * 
 * 	public class A {
 * 		int a; ===> �������
 * 		static int b; ===> �������� ==> JVM class�� �ε��� ��
 * 		==============================================
 * 		public static void main(String[] args)
 * 		{
 * 			int c; // �������� ==> 
 * 		} // c���� => main������ ����� ����
 * 
 * 	}
 */
public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		for(i=1;i<=10;i++) {
			System.out.println("i="+i);
		} // i�� ���� (�޸�)
		System.out.println("i="+i);
		
		System.gc(); // �ʿ���°� �������� (�޸� ȸ��/�������÷���)
		int j=1;
		// ���� ����
		System.out.println("j="+j);
		
		i=1;
		for(i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		i=1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		i=1;
		
		// do-while��
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=5);
	}
}

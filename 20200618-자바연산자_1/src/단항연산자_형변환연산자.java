 /*		< ����ȯ ������  >
  *		�ʿ�ÿ� ���������� �����ؼ� ��� : ���� ����ȯ 
  * 	
  * 	int + double = double (�ڵ� ����ȯ) // �ý��� �󿡼� �ڵ����� ��ȯ
  * 	===
  * 	double
  * 
  * 	char + int = int 
  * 	===
  * 	int
  * 
  * 	int + long = long
  * 	===
  * 	long
  * 
  * 	char + int + long + double = double
  *		===
  *		int
  *		=====
  *		long
  *		======double
  *		
  *		(int)double ==> int  // ( ) �ȿ� �ִ� �ɷ� �ٲ�, ū������ => ���������� ���� �� ���
  *		(char)int ==> char
  *	
  *		1) boolean�� ����
  *		2) int���ϴ� ������ �ϸ� ������� int
  *			byte+byte => int
  *			char+char => int
  *			short+short => int
  *			shar+byte+short => int 
  *
  */
public class ���׿�����_����ȯ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * byte b=100; 
		 * byte c=100; 
		 * int d=b+c; // byte d=(byte)(b+c); // b+c�� ����Ʈ�� �ٲ��
		 */	
		
		// �ڵ�����ȯ
		int a='A';	// a=65
		double d=10; //d=10.0
		// int	
		char c=65; //c='A'
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
		// ��������ȯ
		int i=(int)10.5;
		int ii='A';
		System.out.println("i="+i);
		System.out.println("ii"+ii);

	}

}

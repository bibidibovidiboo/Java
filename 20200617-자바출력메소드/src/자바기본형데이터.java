/*		< �⺻��  >
 * 		����� �� : ������ �����ϰ� ����ȯ�� �߿� 	
 *
 *		�ڹ�	=>	�⺻��
 *			 �ڹٿ� �����ϴ� ��������
 *			���� ==> boolean ==> �� : true/falsd : if(���ǹ�)�� ����� �� �ַ� ����ϴ�
 *												    ��������
 *		====>	upcasting   (�ڵ�����ȯ)										    �� 
 *		byte < short(char) < int < long < float < double *�߿�
/*		<===	downcasting (��������ȯ)
 *		double d='a';	==> d=97.0 
 *		char c='a'
 *		int i='A'	==> i=65
 * 
 * 		byte b1=10;
 * 		byte b2=20;
 * 		byte b3=b1+b2; // ���� : byte+byte => int�� �ٲ����� (����ȯ�� �ʿ���)
 * 
 * 		byte a=10;
 * 		byte b=30;
 * 		bute c=(byte)(a*b)
 * 
 * 		=>	(int)10.5+(int)10.5 => 20
 * 			(int)(10.5+10.5) ==> 21
 */
public class �ڹٱ⺻�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��� ���
		/*
	   	boolean b1=false;//False(x) �ҹ��ڷθ� ���� ==> 1byte
		System.out.println("b="+b1);
		b1=true;
		System.out.println("b="+b1);
		System.out.println(Integer.toBinaryString(300));
		byte a=10;
		byte b=30;
		int c=(a*b);
		
		System.out.println("c="+c);
		*/
		
		System.out.println('A');
		System.out.println((int)'��');
		// 126191261912619 ������
		System.out.println((char)12619);
		// �����ڴ� ���ڹ�ȣ�� ������ �ִ� (char�� ���������� �ν��Ѵ�)		
	}
}

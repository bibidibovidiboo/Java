// < valueOf >
/* 	valueOf() => ��� ���������� ���ڿ��� ��ȯ
 * 	valueOf(10) => "10"
 *  valueOf(true) => "true"
 *  char[] c = {'H','e','l','l','o;};
 *  valueOf(c) ==> "Hello"
 */
public class ���ڿ�5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c={'H','e','l','l','o'};
		String msg = String.valueOf(c);
		System.out.println(msg);
		// �� ĳ���͸� ���ڿ��� �ٲ� �� ��� , char[] ==> String
		String ss="Hello Java!!";
		char[] cc=ss.toCharArray();  // ss.toChartArray => �ν��Ͻ� �Լ�*
		// �� ���ڿ��� ĳ���ͷ� �ٲ� �� ��� , String ==> char[]		
		
		int a=10;
		int b=20;
		System.out.println(String.valueOf(a)+String.valueOf(b));
		// string���� �ٲ�Ŷ� 10+20=30 ������ �ƴ϶� ���ڿ� �����̶� 1020
		// valueOf ���¼��� ��� ���ڿ��� ��ȯ�ȴ� �ڡ�
		// String �״�� ���� static �Լ� *
	}

}

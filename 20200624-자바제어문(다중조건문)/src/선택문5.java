// < ���ù�  >
public class ���ù�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		 // {int a=10;} �̷��� a�� ������� -> ��� �ȿ����� �� �� �ִ� , {} �������� �� �� �ִ�
		switch(a) {
		case 10:
		{
			int b=100;
			System.out.println("a="+a+",b="+b);
			break;
		}
		case 11: // case ���̿� {} �־ �Ȱ��� ������ ��밡�� (��������=��Ϻ���) -> �ڵ����� �����
			{
			int b=200;
			System.out.println("a="+a+",b="+b);
			break;
		}
		}
	}

}

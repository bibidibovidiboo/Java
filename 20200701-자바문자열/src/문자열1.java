/*  < ���ڿ�  > 
 * 	���ڿ� �� : equals()
 *	================== (==)
 *	����ã�� : contains() 
 * 	���۹��ڿ� : startsWith()
 *	������ ���ڿ� : endsWidth()
 *	���ڿ� �ڸ��� : substring()
 * 	������ , �ڽ���
 * 	���� ���� : charAt()
 *	������ ���� : length() 
 *  ���鹮�� ���� : trim()
 * 	������ ��ġ ã�� : indexOf() , lastIndexOf()
 *		aaa.java
 *	����ȯ : valueOf()
 */
// �α��� ó��
import java.util.Scanner;
public class ���ڿ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// id , pwd
		final String ID="admin"; // final�� ���̸� ����X
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ID�� �Է�:");
		String id=scan.nextLine();
		System.out.print("��й�ȣ �Է�:");
		String pwd=scan.nextLine();
		//  ==�� �⺻��(int) �̷� ��鸸 �� �� ���� => �������� equals ������ �������
		//  ��� - ���̵� �´��� Ʋ������ ���
		/*
		 * 	equals : ��ҹ��� �����ؼ� ��
		 * 	equalsIgnoreCase : ��ҹ��� ���о��� ��
		 * 
		 */
		if(id.equals(ID) && pwd.equals(PWD)) {
			System.out.println("�α��εǾ����ϴ�!!");
		}
		else {
			System.out.println("ID�� ��й�ȣ�� Ʋ���ϴ�!!");
		}
	
	}

}

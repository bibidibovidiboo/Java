/*		< ��������  >
 * 		�������� (&&(����), ||(����))  => if���� �ַ� ���
 * 				======		=====
 * 				�� �� true		�Ѱ��̻� true
 * 				&& => ������ �Ⱓ�� �����ϴ� ��쿡 ���
 * 				|| => ������ �Ⱓ�� ����� ��쿡 ���
 * 
 * 				jumsu>=90 (&&) jumsu<=100
 * 				jumsu<=0  (||) jumsu>100
 * 
 * 							  &&    ||
 * 				true   true  true  true  => &&�� �Ѵ� true�϶��� true
 * 				true   False False true => ||�� �ϳ��� true���� true
 * 				False  true  False true
 * 				False  False False False
 * 
 * 				6<5 && 10==10
 * 				false && true  => false
 * 
 * 				ȿ������ ����
 * 				int a=10;
 * 				int b=9;
 * 				a<b && ++b==a => false
 * 				b=?9 =(!!!&&������ ���� ������ false�̸� �޺κ� ������ ���� �ʴ´�)
 * 					  (!!!||������ ���� ������ true�� �޺κ� ������ ���� �ʴ´�)	=> ȿ������ ���� =>���� �캯�� ++��--�� ������� ���� �� ������ ����!!
 */
public class ���׿�����_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1='A';
		int i=65;
		char c2='B';
		boolean bcheck=c1==i || ++c1==c2;
		System.out.println(bcheck); //=> �Ҹ� �Ⱦ��� �ý��ƿ��� �ٷ� c1==i || ++c1==c2 �־ ����ص� ��
		System.out.println(c1);

	}

}

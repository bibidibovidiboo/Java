/*  < ���� ��ȭ ����  >
 *  - ��ȭ 
 * 	1. ��ȭ��
 *  2. �⿬
 *  3. ����
 *  4. ������
 *  5. ����
 *  ============> 5�� 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title={
				"#����ִ�",
				"��ũ ����Ʈ ������",
				"�� ����",
				"�㽩: ������ �ٲ� ��ź����",
				"���"
				};
		String[] actor=
			{
				"������, �ڽ���",
				"ũ������ ����, ����Ŭ ����, �Ը� �õ常, �� �ؼ�����, �� �ϵ�, ������ ����Ƹ�",
				"�� �ؼ�����, �� ���ͰԽ�",
				"�������� �׷�, ���� Ű���, ���� �κ�",
				"������, ������, ����ȣ"
			};
		String[] director=
			{
				"������",
				"ũ�������� ���",
				"�� ������",
				"���� ��ġ",
				"�ڻ���"
			};
		double[] reserve=
			{
					17.3,7.5,1.3,12.1,1.0
			};
		int[] rank={1,2,3,4,5};
		// �迭 ==> index
		for(int i=0;i<5;i++) {
			System.out.println("��ȭ��:"+title[i]);
			System.out.println("����:"+director[i]);
			System.out.println("�⿬:"+actor[i]);
			System.out.println("������:"+reserve[i]);
			System.out.println("��ȭ����:"+rank[i]);
			System.out.println("====================");
		}
	
	}

}

// < ��� ����  >
public class ��������2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 3�ǹ�����
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		for(int i:arr) {
			if(i%3==0) {
				System.out.println("3�� ����Դϴ�");
			}
		}
		*/
		
		// ���� >
		// ������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ�
		// �����Ͽ� �迭�� �����϶� �׸��� �迭�� �� ���ڵ�� ����� ����϶�
		
		int[] arr=new int[10]; // 10���� �޸� ���� ����
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*10)+1; // 1~10���� �����ϰ� ���� 
		}
		// ����� ���ϱ�
		
		int total=0;
		for(int i:arr) {
			total+=i;
		}
		System.out.println("���:"+total/10.0);

	} //

}

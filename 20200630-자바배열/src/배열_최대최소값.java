/*	< �迭�� Ȱ�� >
 * 	������ ���� => 5���� ������ ��
 * 	�ִ밪 , �ּҰ� ���ϴ� ���α׷� 
 */
public class �迭_�ִ��ּҰ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� 5���� �����ϴ� ������ ����� ==> �迭
		int[] arr=new int[5]; // 0 0 0 0 0 
		// 5���� ���� ����
		for(int i=0;i<5;i++) {
			// ���� = 0 ..... 
			arr[i]=(int)(Math.random()*100)+1; 
			// ������ ���� => �������ϱ� 100 , +1 => 1~100���� ���� �Է�
		}
		
		// ��� p.196
		// int i==> index�� �ƴ϶� => ���� ����� ���� ����
		for(int i:arr) {
			System.out.print(i+" "); // �Ź� �ٸ��� ���
		}
		
		System.out.println("\n======���======");
		// �ּҰ� ���� ����
		int min=100; // ���� ū ������ �ʱ�ȭ
		// �ִ밪 ���� ����
		int max=1; // ���� ���� ������ �ʱ�ȭ
		
		// �ּҰ�
		for(int i=0;i<5;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}	
		}
		
		System.out.println("�ּҰ�:"+min);
		System.out.println("�ִ밪:"+max);
		
		
		
		
		
		
	}

}












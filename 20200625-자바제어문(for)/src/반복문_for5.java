// < �ݺ��� ����  >
// 1) 1~100������ ==> ¦���� ��,Ȧ���� �� 
// 2) 1~100������ ==> 3�� ����� ��, 5�� ����� ��, 7����� ���� ���
// 3) 100~999������ ==> 7�� ����� ����
// 4) 1-2+3-4+5-6-8+9-10 ����� ��� 
public class �ݺ���_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1�� - �ߺ��� ��� ���� if ��밡��
		int odd=0,even=0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) 
				even+=i;
			else 
				odd+=i;
		}
		System.out.println("1~100���� ¦�� ��:"+even);
		System.out.println("1~100���� Ȧ�� ��:"+odd);
		
		// 2��
		int a=0,b=0,c=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0) 
				a+=i;
			if(i%5==0) 
				b+=i;
			if(i%7==0) 
				c+=i;
		}
		// 3,5,7�� ����� �ߺ��� �ֱ� ������ else�� �ƴ϶� �ܵ� if�� �����
		
		System.out.println("1~100���� 3�� ����� ��:"+a);
		System.out.println("1~100���� 5�� ����� ��:"+b);
		System.out.println("1~100���� 7�� ����� ��:"+c);
		
		// 3�� 
		int count=0;
		
		for(int i=100;i<=999;i++) {
			if(i%7==0) 
				count++; // count++ �� ���� / count+=i �� ������ �� ����ϴ� ��  (���� ���� ��)
		}
		System.out.println("100~999������ 7�� ����� ����:"+count);
	
		// 4��
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) 
				sum-=i;
			else
				sum+=i;
		}
		System.out.println("1-2+3-4+5-6-8+9-10:"+sum);
	
		// �ڡڡ١ڡڡ١ڡڡ١ڡڡ١ڡڡ� 
		for(int i=0;i<12;i++) {
			if(i%3==0 && i!=0)
				System.out.print("��");
			else
				System.out.print("��");
		}
		
		// for���� ������ �־�� ����� �� �ִ�
		// ������ ������ �׳� ����Ѵ� 
		
		/*
		 *	System.out.println("��");
		 *	System.out.println("��");
		 *	�ڡڡ١ڡڡ١ڡڡ١ڡڡ١ڡڡ� --> ���� �־  for�� ��밡��
		 *  �ڡڡڡ١ڡڡ١ڡڡ١ڡڡ١ڡڡ� --> ���� ���  for�� ���X
		 */

	}
}

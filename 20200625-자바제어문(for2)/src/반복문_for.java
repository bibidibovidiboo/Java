/*  < �ݺ���  ���� >
 * 	���� ��Ī�� => �ĺ���
 * 	1) ���ĺ�(��ҹ���),�ѱ۷� ����
 * 	2) ���ڴ� ��� ����(�տ� ������)
 * 	3) Ű����� ��� �� �� ����
 * 	4) _ , $ ����� ����
 * 	=================== ���� (Ŭ������,�޼ҵ��)
 * 
 * 	for ����)
 * 
 * 		for(�ʱ�ȭ ; ���ǽ� ; ������){
 * 			�ݺ����� ����
 * 			���๮��
 * 		}
 * 
 * 		for(�ʱ�ȭ ; ���ǽ� ; ������){
 * 			�ݺ����� ����
 * 			���๮��
 * 		}
 */

public class �ݺ���_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("Hello!!");
			System.out.println("Java=>For");
		}
		System.out.println("==========");
		for(int i=1;i<=5;i++) {
			System.out.println("Hello!!");
		}
		System.out.println("Java=>For"); 
		
		System.out.println();
		
		// ��� �ȿ� �Ҽ��� �ƴ϶� for���� ����� ���� -> {}�� �߾���
		
		// ��� ==>
		// AaBbCc
		
		// 1)
		char c='a'; // #
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+""+c++);
		}
		System.out.println(); // �ٹٲ�
		
		// 2)
		// #�� ���ְ� c++ ��� (char)(ch+32) ���
		for(char ch='A';ch<='Z';ch++) {
		System.out.print(ch+""+(char)(ch+32));
		}
		
		// 3)
		/*
		char c='a'; 
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+""+c);
			c++
		}
		*/
		
		// ����) 
		// ������ ���� 1~10 => Ȧ���� ��� => ������������
		// 1 3 5 7 9
		System.out.println();
		
		for(int i=1;i<=10;i+=2) {
			System.out.printf(i+"\t");
		}
		
		// ����) 2 4 6 8 10 - �ʱⰪ�� 2�� �ָ� ���ϴ�
		System.out.println();
		
		for(int i=2;i<=10;i+=2) {
			System.out.printf(i+"\t");
		}
		
		// �ʱ�ȭ , ���� , ������(���ǽ�)
		// ���� , ���ĺ� => char**
		
		// ����) 1~5 => 1,2,3,4,5 (���ֳ���)
		
		System.out.println();
		
		for(int i=1;i<=5;i+=1) {
			System.out.print(i);
			if(i<5)
				System.out.print(",");
		}
		
		// ����) 10 ==> 1010 15 ==> 1111 / 2�������� ǥ��
		
		System.out.println();
		int su=10;
		String s="";
		for(;;) {
			int a=su%2; // 2�� ���� ��������
			System.out.print(a);
			s+=a+"";
			su=su/2;
			if(su==0)
				break;
		}
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		// ������ �迭�� �ȹ���� 0101�� ��µż� �̰����� �� -> ������ ���� ��
		
		
		
		
		
	}

}

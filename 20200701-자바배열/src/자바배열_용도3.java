//  < 2���� ��� >
//  ����ڰ� �Է� (����) ==> 2���� ���
//  bit ==> 16bit ==> 32767
//  17�� ���� ==> 01(16)
//  0000 0000 0000 1010   10 
//  =================== | 
//  ��״� �뵵�� ���Ƽ� �迭�� ���� �ڡ� �迭�� ����
/*  
 * 	��>
 *	�뷡���� , ������ , �ٹ� , ������ , ���� => �迭�� ����
 * 	=> 50�� ==> 250��
 * 	
 * 	  < ����  >
 * 		���
 * 		����
 * 		�ݺ� = for (Ƚ���� ���� => �ڵ�����)
 *         = while ( ��������� �ݵ�� �Է� )
 *      ������ => ��������� , ����
 *		���ǹ� => �� , ���� , �� (if,for����,while����) 
 */
import java.util.*; // 
public class �ڹٹ迭_�뵵3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16];
		// 0,1�� ����
		// ����ڰ� ��û�� ���� 
		int user=0;
		int index=15; // ������ �ڿ������� �ϰ��� -> 16 �ں��Ͷ� index�� 15 // �迭����
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է�(0~32767):");
		user=scan.nextInt();
		System.out.println("======= Lib�̿� ======");
		System.out.println(Integer.toBinaryString(user));
		//  ���̺귯�� ���� ó�� 
		
		while(true) // ������� => break ������ ���ѷ��� ���ư�
		{
			binary[index]=user%2; // 2�γ����� 
			user=user/2; //  1/2=0 �̷������� �ٽ� �����ϴ°� 2���� ���ϴ¹��
			if(user==0)break; // 0�̵Ǹ� ������
			index--;
			
		}
		
		// ��� ���
		for(int i=0;i<16;i++) {
			if(i%4==0 && i!=0)  // i%4==0 && i!=0 �̷� �����ִ� ������ �ض� �ڡ�
				System.out.print(" ");
				System.out.print(binary[i]);			
			// 4�� ����ϰ� �������� ���� (0%4=0)
		}
	
	}
}

/*  < ���� ���ǹ�  >
 * 	���� ���ǹ� => ������ ���� ��쿡 ���
 * 	======= ������ �´� ���常 ���� (1���� ����)
 * 
 * 	int a=15;
 * 
 *  1) 1���� ����
 * 	if(a%3==0)
 * 		System.out.println("3�� ���"); ==> ����
 * 	 else if(a%5==0)
 *  	System.out.println("5�� ���");
 *   else if(a%7==0)
 *  	System.out.println("7�� ���");\ *   
 *  
 * 	2) ���� ���� ����
 *  if(a%3==0)
 * 		System.out.println("3�� ���"); => ����
 * 	================================
 *   else if(a%5==0)	
 *  	System.out.println("5�� ���"); => ����
 *  ================================
 *   else if(a%7==0)
 *  	System.out.println("7�� ���");
 * 	
 * 	 ����)
 * 		if(���ǽ�){
 * 			������ true�� �����ϴ� ����
 * 			���� �Ŀ� ����
 * 		}
 *   	else if(���ǽ�){
 *   		������ true�� �����ϴ� ����
 * 			���� �Ŀ� ����
 *   	}
 *   	else if(���ǽ�){
 *   		������ true�� �����ϴ� ����
 * 			���� �Ŀ� ����
 *   	}
 *   	else if(���ǽ�){
 *   		������ true�� �����ϴ� ����
 * 			���� �Ŀ� ����
 *   	}
 *   	else {
 *   		�ش� ������ ���� ��쿡 �����ϴ� ����
 *   	}
 * 		============= ����
 * 
 * 	// ���� ��� ==>
 * 
 * 		3���� ������ �޾Ƽ�  -> ������ �ʿ�
 * 		���� , ��� , ���� ==> ���
 * 
 */
import java.util.*;
public class �������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� => ��������� ����
		int kor=0,eng=0,math=0; // �ʱⰪ -> ������ 0�� �ʿ�� ������ ���� 0�̳� 0.0�� �ش�
		int total=0; // ������ �ʱⰪ
		double avg=0.0; // ��� �ʱⰪ
		char hakjum='A'; // ���� �ʱⰪ
		
		// �Է��� �޴´� => ������ ���� 
		Scanner scan=new Scanner(System.in);
		System.out.println("���� ���� �Է�:");
		kor=scan.nextInt(); // Ű����� �Է��� ������ �о�´�
		System.out.println("���� ���� �Է�:");
		eng=scan.nextInt();
		System.out.println("���� ���� �Է�:");
		math=scan.nextInt();
		
		// 1. ���� => �����ڷ� ����
		total=kor+eng+math;
		
		// 2. ��� => �Ҽ����� �ʿ��ؼ� �Ǽ��� ����
		avg=total/3.0;
		
		// 3. ����
		if(avg>=90) 
			hakjum='A';
		else if(avg>=80)
			hakjum='B';
		else if(avg>=70)
			hakjum='C';
		else if(avg>=60)
			hakjum='D';
		else 
			hakjum='F';
		
		// 4. ó���� �Ϸ� => ȭ�鿡 ���
		System.out.println("===== ���� =====");
		System.out.println("���� ����:"+kor);
		System.out.println("���� ����:"+eng);
		System.out.println("���� ����:"+math);
		System.out.println("����:"+total);
		System.out.printf("���:%.2f\n",avg); 
		// %.2f\n : �Ҽ��� 2�ڸ����� ��� -> printf�� �ַ� �Ҽ��� ��� �� ���
		System.out.println("����:"+hakjum);
		
		/*  ó�� �޼ҵ� : ������ ���� -> ������ ���� -> ȭ�鿡 ���
		*	1) ������ ���� 
		*	==============
		*		1. ����ڰ� ��û ==> �ַ� ���
		*		2. File �б�
		*		3. ����Ŭ ����
		*		4. ���� �ִ� ������ �б�
		*	
		*	2) �����(user) ��û�� �������� ==> ������ ����
		*
		* 	3) ����ڿ��� ������ �����͸� ���
		*/

	}

}

//  < ���ǹ� ���� >
/* 		���� 3���� �Է¹޾Ƽ� ����, ���,
 * 		���� => 60�̻� D, 70�̻� C, 80�̻� B, 90�̻� A, �������� F
 * 
 * 		60�̻� => D
 * 		70	=> C
 *  	80  => B
 *  	90	=> A
 *  	�������� F
 *  
 *  	�������� : 80
 *  	�������� : 80
 *  	�������� : 80
 *  
 *  	���� : 240
 *  	��� : 80.0
 *  	���� : B
 * */
import java.util.*; //Scanner Ŭ������ ������ �´�
public class �ڹ����ǹ�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scan ==> ������ ���� �� �ִ�
		Scanner scan=new Scanner(System.in);
		System.out.println("�������� �������� �������� �Է�:");
		// Ű����� �Էµ� ������ �ޱ�
		
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		char score='A';
		// avg=85
		if(avg>=90 && avg<100)
		{
				score='A';
		}
		//	����
		if(avg>=80 && avg<90)
		{
				score='B';
		}
		
		if(avg>=70 && avg<80)
		{
				score='C';
		}
		
		// ����
		if(avg>=60 && avg<70)
		{
				score='D';
		}
		if(score<60)
		{
			score='F';
		}
		
		System.out.println("����:"+total);
		System.out.printf("���:%.2f%n",avg); // �Ҽ��� ���� ��
		System.out.println("����:"+score);
		
		
	}

}

// < ��ձ��ϱ� �޼ҵ� ���� >
// ���� ���� ���� => ���� , ��� , ����
// �޼ҵ尡 4���� �ʿ�
import java.util.*;
public class �ڹٸ޼ҵ�2 {
	// �Է�
	static int userInput(String subject) {
		Scanner scan=new Scanner(System.in);
		System.out.println(subject+"���� �Է�:");
		int score=scan.nextInt();
		return score;
	}
	
	// �������ϱ� - total�� �Ű������� ����
	static int total(int kor,int eng,int math) {
		return kor+eng+math;
	}
	// ��� ���ϱ�
	// total�� �޾Ƽ� �ִ°� ���ؼ� ��� 
	static void avg(int total) {
		System.out.printf("���:%.2f\n",total/3.0);
	}
	// ���� ���ϱ� 
	/*
	// char�� ���ϱ� #2
	static char score(int kor,int eng,int math) {
		char c=' '; 
		int score=(kor+eng+math)/3;
		if(score>=90) {
			c='A';
		}
		else if(score>=80)
			c='B';
		else if(score>=70)
			c='C';
		else if(score>=60)
			c='D';
		else 
			c='F';
		return c;
	}
	*/
	// void ���� #2
	static void hakjum(int total) {
		int avg=total/3;
		if(avg>=90)
			System.out.println("A����");
		else if(avg>=80)
			System.out.println("B����");
		else if(avg>=70)
			System.out.println("C����");
		else if(avg>=60)
			System.out.println("D����");
		else 
			System.out.println("F����");
	}

	// ȣ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=userInput("����");
		int eng=userInput("����");
		int math=userInput("����");
		int total=total(kor,eng,math); // ������,�޼ҵ� ���Ƶ���
		
		// ���
		System.out.println("��������:"+kor);
		System.out.println("��������:"+eng);
		System.out.println("��������:"+math);
		System.out.println("����"+total);
		avg(total);
		hakjum(total);
		
		// #1
		// char c=score(kor,eng,math);
		// System.out.println("����:"+c);
	}

}

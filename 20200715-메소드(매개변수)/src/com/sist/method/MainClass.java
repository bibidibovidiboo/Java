package com.sist.method;
class AA{
	public void AA() // void�� �پ �����ڰ� �ƴ� => �Ϲ� �ν��Ͻ� �޼ҵ�
	{
		System.out.println("AA() Call...");
		// void => ������ (������� �������� �ʴ´�)
	}
	// �������� �������� �ʴ´� : Ư���޼ҵ� => �޸𸮿� ����
	public AA() {
		 System.out.println("AA() Call...");
	}
	// ����� => �ʱ�ȭ ��� => ������
	// �����ڿ� �ʱ�ȭ ���� ��ӵ��� �ʴ´� (����� ���)
	
}
public class MainClass {
	AA a=new AA(); // ������ ��  X
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=new AA(); 
		a.AA();
	}

}

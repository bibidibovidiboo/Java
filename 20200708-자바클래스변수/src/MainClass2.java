// < ���� ��ȭ ����  >
// public ���� �ڡ�
// class�� ������ ���� , public class�� ������� �ȴ� (public�� �ϳ��� ����) 
// public�� �Ƚᵵ �� => �׷� ���� main�� ����ִ� class�� ������� �ȴ�
// ����ڰ� ���� ���������� �����
class MovieInfo{
	// ������� , �ν��Ͻ� ���� (Ŭ���� ���� ���� ���� ����)
	// �ν��Ͻ� ���� ==>  �޸� ������ ����   => new
	String title;
	String director;
	String actor;
	double reserve;
	int rank;
	static String site_name;
}
// MovieInfo m1=new MovieInfo() => �� ������ ��� new�� ���� ��� ��
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieInfo m1=new MovieInfo();
		// m1 �޸𸮿� ����Ǿ� �ִ� ������ �ʱⰪ ���� 
		// int m1=0 ; 
		// m1,m2,m3 �̷��� �ϳ��ϳ� �Է� ��ȿ���� => �迭�� ��� ==> MovieInfo[] m=new MovieInfo()
		// MovieInfo => �츮�� ���� �������� , �� int ���� �ǹ� 
		m1.title="#����ִ�";
		m1.director="������";
		m1.actor="������, �ڽ���";
		m1.reserve=17.3;
		m1.rank=1;
		m1.site_name="cgv";
		
		MovieInfo m2=new MovieInfo();
		m2.title="��ũ ����Ʈ ������";
		m2.director="ũ�������� ���";
		m2.actor="ũ������ ����, ����Ŭ ����, �Ը� �õ常, �� �ؼ�����, �� �ϵ�, ������ ����Ƹ�";
		m2.reserve=7.5;
		m2.rank=2;
		m2.site_name="�Ե��ó׸�";
		
		MovieInfo m3=new MovieInfo();
		m3.title="�� ����";
		m3.director="�� ������";
		m3.actor="�� �ؼ�����, �� ���ͰԽ�";
		m3.reserve=1.3;
		m3.rank=3;
		m3.site_name="�ް��ڽ�";
		
		MovieInfo.site_name="�������"; // Ŭ���� �̸��� ���� ������ ���� (static) ex.�����Լ�
		
		System.out.println("��ȭ��:"+m1.site_name);
		m3.title="���";
		System.out.println("��ȭ����:"+m1.title);
		System.out.println("��ȭ����:"+m3.title);
	}

}












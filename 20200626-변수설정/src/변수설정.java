// < ���� ���� - ������ȭ  >
// ��ȭ => ���� �����ϴ� ����
// ���� => ������ ����
/* 	������ ���(2017)����
	The Greatest Showman ���� 09 . 9
	������/���
	�̱�
	2017.12.20 ���� 2020.05.21 (�簳��)
 	104��, 12���̻������
	���� ����Ŭ �׷��̽� �ֿ� �� ���, �� ������
	���� 5�� ��������1,667,104�� 
  	
  	�߱��ҳ�(2019)����
	Baseball Girl ���� 08 . 5
	���
	�ѱ�
	2020.06.18 ����
 	105��, 12���̻������
	���� ������ �ֿ� ���ֿ�
	���� 7�� ��������21,783�� 
*/
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����
		String title="������ ���(2017)";
		boolean isOpen=true;
		double score=9.9;
		String na="�̱�";
		String genre="������/���";
		String regdate="2020.05.21";
		String director="����Ŭ �׷��̽�";
		String actor="�� ���,�� ������";
		int time=104;
		int grade=12;
		int rank=5;
		int showUser=1667104;
		
		// �󼼺��� ���
		System.out.println("======== ��ȭ���� ========");
		System.out.print("��ȭ��"+title);
		System.out.println(""+(isOpen==true?"����":"�̰���")); // ���׿�����
		System.out.println("��Ÿ:"+na+" "+grade+"���̻� ������");
		System.out.println("�ð�:"+time+"��");
		System.out.println("������:"+regdate+"����");
		System.out.println("����:"+director);
		System.out.println("�⿬:"+actor);
		System.out.println("����:"+rank);
		System.out.println("����������:"+showUser);
		
		title="�߱��ҳ�(2019)";
		isOpen=true;
		score=8.5;
		na="�ѱ�";
		genre="���";
		regdate="2020.06.18";
		director="������";
		actor="���ֿ�";
		time=105;
		grade=12;
		rank=7;
		showUser=21783;
		
		System.out.println("======== ��ȭ���� ========");
		System.out.print("��ȭ��"+title);
		System.out.println(""+(isOpen==true?"����":"�̰���")); // ���׿�����
		System.out.println("��Ÿ:"+na+" "+grade+"���̻� ������");
		System.out.println("�ð�:"+time+"��");
		System.out.println("������:"+regdate+"����");
		System.out.println("����:"+director);
		System.out.println("�⿬:"+actor);
		System.out.println("����:"+rank);
		System.out.println("����������:"+showUser);
	}

}

// < ���ĺ�  >
// A-Z���� ���
public class �ݺ���_for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ĺ��� char ���°� ���ϴ�
		// ������ ��ġ�� ������� ���� ���� �޶��� �� �ִ�
		char ch; // for���� �������� ������ ���� �����س��� ���� (�ݺ���)
		for(ch='A';ch<='Z';ch++) {
			System.out.print(ch);
		} // �빮�� - ch�� �޸𸮿��� �������
		System.out.println(); // ���ٶ��
		
		for(ch='a';ch<='z';ch++) {
			System.out.print(ch);
		} // �ҹ���
		// for���� {}�� �ٲ�� �������� ���� �� �� �ִ�

		for(int i=10;i>=1;i--) {
			System.out.println(i);
		} // �������ε� ��°���
		
		System.out.println("===============");
		
		// ���� 2���� ���������� ������ 1���� �����ϴ� - �߾Ⱦ���
		for(int i=1,j=10;i<=10;i++,j--){
			System.out.println("i="+i+",j="+j);
		}

	}

}

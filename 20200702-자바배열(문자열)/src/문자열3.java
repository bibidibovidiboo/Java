/* < IndexOf >
 * 	IndexOf , lastIndexOf => ������ ��ġ ã�� => ����
 *  ���� �ڸ��� => substring() �� �ȿ� ���� �� ���� ������
 */
public class ���ڿ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="fsdfsa.jfsdjfjsjdfjsdfjsdfj.java";
		// �տ��� . ã�� �� IndexOf , �ڿ��� . ã�� �� lastIndexOf ��
		System.out.println(msg.indexOf(".")); // 0���� �����ؼ� 6
		System.out.println(msg.lastIndexOf("."));
		System.out.println("Ȯ����:"+msg.substring(msg.lastIndexOf(".")+1)); 
		// substring() �ȿ����� �� �� ������ ��°�� �ְ� 0���� �����̶� +1 ���� 
	}
}

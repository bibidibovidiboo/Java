/*	< String >
 * 	���ڿ��� ������ �� �ִ� ���� : String
 * 	String : �Ϲݺ����� ����
 * 			  Ŭ������ ���� => ���(�޼ҵ�)
 * 
 * 			  �ֿ� ���
 *  		 = ���ڿ� �� : equals()
 *     		 = ���� ���� : contains()
 *           = ���ڿ� �߿� �Ѱ� ���� : charAt()
 *           = ����� ������ ���� : length()
 *           = ���� �ڸ��� : substring()
 *           = ã�� ������ ��ġ : indexOf() , lastIndexOf()
 *           = ��� ���������� ���ڿ��� ��ȯ => valueOf() ex.valueOf(2) => "2"
 *           = ���� ���� ���� : trim() => �¿츸 ����
 *           	"Hello Java" => "Hello Java"
 *           = ���ڿ� => char[] => toCharArray[]
 * 			 = startsWith , endsWith => �˻��� ���� �� ���̾�
 * 
 *           ==========================================
 *           Wrapper Class
 *         	 =============
 *         	  �⺻�� ������ (����,�Ǽ�,����,��)
 *         	 int => Integer => "2" -> 2 => parseInt("2") => 2 / p.179
 *           "10" + "100" ==> 110
 *           ================= 10100
 *         	 double => Double Boolean , Float , Byte...
 */
/*  < substring >
 * 
 * 	substring : �ʿ��� ���ڸ� ���� => ���¼� �м�(���,�λ�,�����)
 *	
 * 	"Hello Java" => String => char[]
 * 	//  �ڸ��� ������ ���� �޶� 2���� ��
 *  substring(int start) ���⼭���� �߶��
 *  substring(int start,int end) ������ ����  
 */
public class ���ڿ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String msg="0123456789";
		// System.out.println(msg.substring(5)); // msg�� 5������ �߶��
		// System.out.println(msg.substring(3)); // msg�� 3������ �߶��
		// System.out.println(msg.substring(3,6)); 
		// �� 345 ��� , �������� ��� X => ���� ������ �չ����� ��� ��
		
		String msg="100-010";
		//          0123456
		System.out.println(msg.substring(0,3)); // 100
		System.out.println(msg.substring(4,7)); // 010
		System.out.println(msg.substring(4)); // �� �̷��� �ص��� 010
	}
}


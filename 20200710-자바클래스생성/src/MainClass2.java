/*	< Ŭ���� �������  >
 * 	�޼ҵ� : ��� , ���� , ����
 * 	���Ǳ� )
 * 	  ����,�����
 * 	  �������� �� ó��
 * 	  ��ư ���� �� ó�� 
 * 	
 * 	 public static void main(String[] args) O
 *   static public void main(String[] args) O => �������� ����
 *   public void main(String[] args) X => static ������ �ȵ�
 *   static void main(String[] args) X => public ������ �ȵ�
 *   public static void main(String[] a) O => ������ ����� �൵��
 *   
 */
public class MainClass2 {
	public static void main(String[] a) {
		// �� (String[] args) �ڸ��� ���� a��  �־ �ȴ� 
		System.out.println("aaa");
		
		/*
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		*/

	}

}

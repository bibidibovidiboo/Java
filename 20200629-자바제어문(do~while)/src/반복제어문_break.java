/*	 < �ݺ���� > 
 * 	 = break ==> �ݺ����� ������ ��
 * 	 = continue ==> Ư���κ��� �����ϰ� ���� ���
 *   = ���ǹ��� ���� ����Ѵ� (if)
 *   = ** break , continue�� �Ѱ��� �ݺ����� ���� �� �� �ִ� 
 *     ** break => �ݺ��� ��ü(for,do~while,while),switch
 *     ** continue => �ݺ��������� ����� ����
 * 	   ** return => ���� (�޼ҵ� ����) / break�� ��� ����
 */
public class �ݺ����_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// return; // return�� ���� ��쿡 JVM �� �ڵ����� �߰� 
		// 1~10���� ��� ==> 5�� �� ���� ==> break;
		for(int i=1;i<=10;i++) {
			// 5�϶�
			System.out.print(i+" "); // ���⿡ �θ� 5���� ���
			if(i==5) 
				// ����
				break; // i==5�� ���� => �ݺ��� �ߴ�*
			// System.out.print(i+" "); ���⿡ �θ� 4���� ��� => ��ġ Ȯ���� �߿��ϴ�
		}
		
		System.out.println("\n======= continue ======");
		// 1~10���� Ȧ���� ���
		// ���ǹ�
		for(int i=1;i<=10;i++) {
			if(i%2!=0)  // i%2==0 (¦��) / i%2!=0 (Ȧ��)
						// i%2==1 (Ȧ��) / !(i%2==0) (Ȧ��)
						// �������� ��찡 �־ �м� �� �� �־�� �Ѵ� 
				System.out.print(i+" ");
		}
		// ���� => 2
		System.out.println("\n====== 2�� ���� ======");
		for(int i=1;i<=10;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println("\n======= continue ======");
		// continue ���
		
		/*  < ������ >
		 * 	break => while , for , do~while�� ����
		 * 	continue => while(���ǽ����� �̵�) , 
		 * 				for(���������� �̵�)
		 * 	
		 * 	for(int i=1;i<=10;i++) 
		 * 	{
		 * 		if(i==6)
		 * 		continue; ==> i<=10 �� �������� �ö󰡼� ���ѷ����� �ɸ� 
		 * 		i++;
		 * 	}
		 * 
		 * 	while(true)
		 *	{
		 * 		==> ó������ �ٽ� ������ ��� (�߸��� �Է�)
		 * 	}
		 * 
		 */
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				continue; // ¦���� �����ϰ� Ȧ�� ��� => i++ �̵�
			 	// ���������� �̵�
			System.out.print(i+" ");
			
		}
		
		// �̰� �̴�� �����ϸ� ���ѷ��� �ɸ� 
		System.out.println("\n======= while ======");
		int i=1;
		while(i<=10) {
			if(i%2==0)
				continue; // for�� �ȿ��� ���̾� 
			System.out.println(i+" ");
			i++;
		}
	
	}
}

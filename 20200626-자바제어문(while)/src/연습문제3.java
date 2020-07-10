// < ¿¬½À¹®Á¦ 3 >
public class ¿¬½À¹®Á¦3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 0;
		int B = 0;
		
		for(int i=1;i<=30;i++) {
			if(i%2==0) {
				A+=i;
			}
			else {
				B+=i;
			}
		}
		System.out.println("Â¦¼öÇÕ:"+A);
		System.out.println("È¦¼öÇÕ:"+B);
		
		System.out.println("==============");
		
		
		A = 0;
		B = 0;
		
		int i=1;
		while(i<=30) {
			if(i%2==0) {
				A+=i;
			}
			else {
				B+=i;
			}
			i++;
		}
		System.out.println("Â¦¼öÇÕ:"+A);
		System.out.println("È¦¼öÇÕ:"+B);

	}

}

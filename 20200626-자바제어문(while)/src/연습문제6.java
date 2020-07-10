// < 연습문제 6 >
public class 연습문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i=1;i<=100;i++) {
			if(i%11==0) {
				System.out.print(i+"\t");
			}
		}
		
		System.out.println();

		int i=1;
		while(i<=100) {
			if(i%11==0) {
				System.out.print(i+"\t");
			}
			i++;
		}
	}
}

// < 연습문제 4 >
public class 연습문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+"\t");
			}
		}
		
		System.out.println();
		
		int i=1;
		while(i<=100) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+"\t");
			}
			i++;
		}
		
	}

}

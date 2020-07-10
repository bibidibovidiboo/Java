// < 연습문제 2 >
public class 연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 0;
		
		for(int i=100;i<=999;i++) {
			if(i%4!=0) {
				count++;
				sum+=i;
			}
		}
		System.out.println("갯수:"+count);
		System.out.println("합:"+sum);
		
		System.out.println("==============");
		
		sum=0;
		count=0;
		
		int i=100;
		while(i<=999) {
			if(i%4!=0) {
				count++;
				sum+=i;
			}
			i++;
		}
		System.out.println("갯수:"+count);
		System.out.println("합:"+sum);
		

	}

}

// < 연습문제 5 >
public class 연습문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count7 = 0;
		int count9 = 0;
		
		for(int i=1;i<=1000;i++) {
			if(i%7==0) {
				count7+=i;
			}
			if(i%9==0) {
				count9+=i;
			}
		}
		System.out.println("7의 배수:"+count7);
		System.out.println("9의 배수:"+count9);
		System.out.println("7의 배수+9의 배수:"+count7+count9);
	
		System.out.println("===============");
	
		count7 = 0;
		count9 = 0;
		
		int i=1;
		while(i<=1000) {
			if(i%7==0) {
				count7+=i;
			}
			if(i%9==0) {
				count9+=i;
			}
			i++;
		}
		System.out.println("7의 배수:"+count7);
		System.out.println("9의 배수:"+count9);
		System.out.println("7의 배수+9의 배수:"+count7+count9);
				
	}
	

}

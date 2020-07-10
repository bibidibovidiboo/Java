// < 반복문 예제  >
// 1) 1~100까지의 ==> 짝수의 합,홀수의 합 
// 2) 1~100까지의 ==> 3의 배수의 합, 5의 배수의 합, 7배수의 합을 출력
// 3) 100~999까지의 ==> 7의 배수의 갯수
// 4) 1-2+3-4+5-6-8+9-10 결과값 출력 
public class 반복문_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1번 - 중복이 없어서 다중 if 사용가능
		int odd=0,even=0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) 
				even+=i;
			else 
				odd+=i;
		}
		System.out.println("1~100까지 짝수 합:"+even);
		System.out.println("1~100까지 홀수 합:"+odd);
		
		// 2번
		int a=0,b=0,c=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0) 
				a+=i;
			if(i%5==0) 
				b+=i;
			if(i%7==0) 
				c+=i;
		}
		// 3,5,7의 배수는 중복이 있기 때문에 else가 아니라 단독 if를 써야함
		
		System.out.println("1~100까지 3의 배수의 합:"+a);
		System.out.println("1~100까지 5의 배수의 합:"+b);
		System.out.println("1~100까지 7의 배수의 합:"+c);
		
		// 3번 
		int count=0;
		
		for(int i=100;i<=999;i++) {
			if(i%7==0) 
				count++; // count++ 는 갯수 / count+=i 는 증가할 때 사용하는 것  (합을 구할 때)
		}
		System.out.println("100~999까지의 7의 배수의 갯수:"+count);
	
		// 4번
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) 
				sum-=i;
			else
				sum+=i;
		}
		System.out.println("1-2+3-4+5-6-8+9-10:"+sum);
	
		// ★★☆★★☆★★☆★★☆★★☆ 
		for(int i=0;i<12;i++) {
			if(i%3==0 && i!=0)
				System.out.print("☆");
			else
				System.out.print("★");
		}
		
		// for문은 패턴이 있어야 사용할 수 있다
		// 패턴이 없으면 그냥 출력한다 
		
		/*
		 *	System.out.println("★");
		 *	System.out.println("☆");
		 *	★★☆★★☆★★☆★★☆★★☆ --> 패턴 있어서  for문 사용가능
		 *  ★★★☆★★☆★★☆★★☆★★☆ --> 패턴 없어서  for문 사용X
		 */

	}
}

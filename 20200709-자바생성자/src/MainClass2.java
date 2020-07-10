// < 생성자  >
// 차량 => 색상 , 연비 , 연도
public class MainClass2 {
	// 변수선언
	int a=10;
	int b=20;
	MainClass2(){
		a=100;
		b=200; // 고정
	}
	//  사용자가 직접 =>  a,b값을 주는 경우
	MainClass2(int c,int d){
		a=c;
		b=d; // 필요하면 수정가능
	}
	public static void main(String[] args) {
		MainClass2 m=new MainClass2();
		System.out.println("a="+m.a);
		System.out.println("b="+m.b);
		
		MainClass2 m1=new MainClass2(1000,2000);
		System.out.println("a="+m1.a);
		System.out.println("b="+m1.b);	
		
		MainClass2 m2=new MainClass2(10000,20000);
		System.out.println("a="+m2.a);
		System.out.println("b="+m2.b);
	}
	
}

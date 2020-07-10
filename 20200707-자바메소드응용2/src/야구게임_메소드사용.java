// < 야구게임 메소드  >
import java.util.Scanner;
public class 야구게임_메소드사용 {

	static int[] getRand() {
		int[] com=new int[3];
		int su=0;
		boolean bCheck=false;
		for(int i=0;i<3;i++) {
			bCheck=true;
			while(bCheck) {
				// 난수발생
				su=(int)(Math.random()*9)+1; // 1~9
				bCheck=false;
				// while 종료 조건
				// 체크
				for(int j=0;j<i;j++) {
					if(com[j]==su) {
						bCheck=true;
						break;
					}
				}
			}
			com[i] = su;
		}
		return com;
	}
	
	static int[] userInput() {
			int[] user=new int[3];
		
			Scanner scan=new Scanner(System.in);
			while(true) {
				System.out.print("세자리 정수를 입력:");
				int input=scan.nextInt();
			
				//  오류처리  => 세자리 정수가 입력이 안된 경우
				if(input<100 || input>999) {
					System.out.println("잘못된 입력입니다!!");
					// 처음으로 이동
					continue; 
				}
		
			// 369 ==> 369/100 ==> 3
			user[0]=input/100;
			user[1]=(input%100)/10; // 368%100 ==> 68/10 ==> 6
			user[2]=input/10;
			
			// 두번째 오류
			if(user[0]==user[1]||user[1]==user[2]||user[1]==user[2]) {
				System.out.println("중복된 정수는 사용 할 수 없습니다");
				continue;
			}
			// 세번째 오류
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0은 사용할 수 없습니다");
				continue;
			}
			break;
		}
		return user;
	}
	static void hint(int [] com,int[] user) {
		int s=0,b=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(com[i]==user[j]) {
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		//  힌트
		System.out.printf("Input Number:%d,Result:%dS-%dB\n",
				user[0],user[1],user[2],s,b);
		
		if(isEnd(s)) {
			System.out.println("Game Over!!");
			System.exit(0);
			// break;
		}

	}
	// 종료
	static boolean isEnd(int s) {
		if(s==3) 
			return true;
		else
			return false;
	}
	
	static void process() {
		
		int[] com=getRand();
		while(true) {
			int[] user=userInput();
			hint(com, user);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}

/*	 < 반복제어문 > 
 * 	 = break ==> 반복문을 종료할 때
 * 	 = continue ==> 특정부분을 제외하고 싶은 경우
 *   = 조건문과 같이 사용한다 (if)
 *   = ** break , continue는 한개의 반복문만 제어 할 수 있다 
 *     ** break => 반복문 전체(for,do~while,while),switch
 *     ** continue => 반복문에서만 사용이 가능
 * 	   ** return => 보류 (메소드 종료) / break와 기능 같음
 */
public class 반복제어문_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// return; // return에 없는 경우에 JVM 이 자동으로 추가 
		// 1~10까지 출력 ==> 5일 때 종료 ==> break;
		for(int i=1;i<=10;i++) {
			// 5일때
			System.out.print(i+" "); // 여기에 두면 5까지 출력
			if(i==5) 
				// 종료
				break; // i==5면 종료 => 반복문 중단*
			// System.out.print(i+" "); 여기에 두면 4까지 출력 => 위치 확인이 중요하다
		}
		
		System.out.println("\n======= continue ======");
		// 1~10까지 홀수만 출력
		// 조건문
		for(int i=1;i<=10;i++) {
			if(i%2!=0)  // i%2==0 (짝수) / i%2!=0 (홀수)
						// i%2==1 (홀수) / !(i%2==0) (홀수)
						// 여러개의 경우가 있어서 분석 할 수 있어야 한다 
				System.out.print(i+" ");
		}
		// 증가 => 2
		System.out.println("\n====== 2씩 증가 ======");
		for(int i=1;i<=10;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println("\n======= continue ======");
		// continue 사용
		
		/*  < 차이점 >
		 * 	break => while , for , do~while이 동일
		 * 	continue => while(조건식으로 이동) , 
		 * 				for(증가식으로 이동)
		 * 	
		 * 	for(int i=1;i<=10;i++) 
		 * 	{
		 * 		if(i==6)
		 * 		continue; ==> i<=10 이 조건으로 올라가서 무한루프가 걸림 
		 * 		i++;
		 * 	}
		 * 
		 * 	while(true)
		 *	{
		 * 		==> 처음부터 다시 수행할 경우 (잘못된 입력)
		 * 	}
		 * 
		 */
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				continue; // 짝수만 제외하고 홀수 출력 => i++ 이동
			 	// 증가식으로 이동
			System.out.print(i+" ");
			
		}
		
		// 이거 이대로 실행하면 무한루프 걸림 
		System.out.println("\n======= while ======");
		int i=1;
		while(i<=10) {
			if(i%2==0)
				continue; // for문 안에서 많이씀 
			System.out.println(i+" ");
			i++;
		}
	
	}
}

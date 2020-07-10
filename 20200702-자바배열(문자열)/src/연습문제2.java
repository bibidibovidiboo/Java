// < 평균 문제  >
public class 연습문제2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 3의배수출력
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		for(int i:arr) {
			if(i%3==0) {
				System.out.println("3의 배수입니다");
			}
		}
		*/
		
		// 문제 >
		// 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게
		// 생성하여 배열에 저장하라 그리고 배열에 든 숫자들과 평균을 출력하라
		
		int[] arr=new int[10]; // 10개의 메모리 공간 생성
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*10)+1; // 1~10까지 랜덤하게 설정 
		}
		// 평균을 구하기
		
		int total=0;
		for(int i:arr) {
			total+=i;
		}
		System.out.println("평균:"+total/10.0);

	} //

}

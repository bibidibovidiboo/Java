/*  < 단일조건문  >
 *	1) 단일 조건문은 여러개를 사용해도 처음부터 마지막까지 수행된다
 *  2) {}을 생략할 때는 수행문장이 1개일 경우
 * 
 */
public class 자바단일조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15; // 3배수, 5배수, 7배수 
		if(a%3==0) // 여기서 ; 찍으면 안됨 // 1) ;를 찍으면 if 문장이 종료
			System.out.println(a+"는 3의 배수입니다"); // 2) 단독 실행문장이 된다 
		System.out.println("if(a%3==0) 수행문장"); // {} 열고 안닫으면 이건 무조건 실행됨*
		// 한문장
		/// * => if와 상관 없이 실행하려면 ; 찍고 밑에  출력하면 무조건 실행된다 
		
		if(a%5==0)
			System.out.println(a+"는 5의 배수입니다");
		// 한문장
		
		if(a%5==0) // a를 5으로 나눴을 때 나머지가 0인 조건을 찾는 if문 => 즉 배수를 찾아줌
			System.out.println(a+"는 7의 배수입니다");
		// 한문장 
		/// 전부 따로 작동하는 독립문장
	}

}
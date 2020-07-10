// < 알파벳  >
// A-Z까지 출력
public class 반복문_for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 알파벳은 char 쓰는게 편하다
		// 변수의 위치가 어딘지에 따라 값이 달라질 수 있다
		char ch; // for문이 여러개면 변수를 먼저 선언해놓고 가능 (반복시)
		for(ch='A';ch<='Z';ch++) {
			System.out.print(ch);
		} // 대문자 - ch는 메모리에서 사라진다
		System.out.println(); // 한줄띄기
		
		for(ch='a';ch<='z';ch++) {
			System.out.print(ch);
		} // 소문자
		// for문은 {}이 바뀌면 변수명을 같게 쓸 수 있다

		for(int i=10;i>=1;i--) {
			System.out.println(i);
		} // 역순으로도 출력가능
		
		System.out.println("===============");
		
		// 변수 2개도 가능하지만 조건은 1개만 가능하다 - 잘안쓴다
		for(int i=1,j=10;i<=10;i++,j--){
			System.out.println("i="+i+",j="+j);
		}

	}

}

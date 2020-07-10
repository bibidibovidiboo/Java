/*		< 논리연산자  >
 * 		논리연산자 (&&(직렬), ||(병렬))  => if문에 주로 사용
 * 				======		=====
 * 				두 개 true		한개이상 true
 * 				&& => 범위나 기간을 포함하는 경우에 사용
 * 				|| => 범위나 기간을 벗어나는 경우에 사용
 * 
 * 				jumsu>=90 (&&) jumsu<=100
 * 				jumsu<=0  (||) jumsu>100
 * 
 * 							  &&    ||
 * 				true   true  true  true  => &&는 둘다 true일때만 true
 * 				true   False False true => ||는 하나만 true여도 true
 * 				False  true  False true
 * 				False  False False False
 * 
 * 				6<5 && 10==10
 * 				false && true  => false
 * 
 * 				효율적인 연산
 * 				int a=10;
 * 				int b=9;
 * 				a<b && ++b==a => false
 * 				b=?9 =(!!!&&연산은 왼쪽 연산이 false이면 뒷부분 연산을 하지 않는다)
 * 					  (!!!||연산은 왼쪽 연산이 true면 뒷부분 연산을 하지 않는다)	=> 효율적인 연산 =>따라서 우변의 ++나--가 실행되지 않을 수 있으니 주의!!
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1='A';
		int i=65;
		char c2='B';
		boolean bcheck=c1==i || ++c1==c2;
		System.out.println(bcheck); //=> 불린 안쓰고 시스아웃에 바로 c1==i || ++c1==c2 넣어서 출력해도 됨
		System.out.println(c1);

	}

}

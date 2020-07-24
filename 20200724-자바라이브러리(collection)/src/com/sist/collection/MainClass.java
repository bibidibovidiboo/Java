/*
 *   < Collection >  
 *   =========== 자료구조
 *   메모리 저장해서 사용시 편리하게 사용 가능   => 가변형 => 배열
 *   => 사용되는 프로그램 : 입출력=> CURD -> 단점 : 메모리 
 *   										모든 데이터 저장이 가능  -> 같은데이터형으로 맞출 필요
 *      CURD => 읽기, 저장, 삭제, 수정 저장갯수
 *      라이브러리 => 모든 개발자 동일 => 표준화
 *      읽기 : get()
 *      갯수 : size()
 *      수정 : set()
 *      삭제 : remove()
 *      저장 : add()
 *   - 종류
 *    1) 순서가 존재 중복된 데이터 추가   
 *       List(인터페이스) ==========> 데이터베이스
 *         => 구현한 클래스
 *            ArrayList**  : 비동기
 *            Vector**   : 동기화
 *            LinkedList
 *            Queue
 *            Stack
 *    2) 순서가 없고 중복이 없는 데이터 추가 ===> 탐색기
 *    	 Set
 *        	  HashSet
 *            TreeSet
 *    3) 키, 데이터 ==> 두 개를 동시에 저장 ===> 클래스 관리
 *       Map
 *            Hashtable
 *            HashMap**
 *  
 */
package com.sist.collection;
import java.util.ArrayList;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		// 추가
		/*
		list.add(10); // 0
		list.add(10.5); // 1
		list.add("홍길동"); // 2
		list.add('A'); // 3
		
		// 값 읽기
		int a=(int)list.get(0); // (int) 넣은이유 => 형변환
		double d=(double)list.get(1);
		String s=(String)list.get(2);
		char c=(char)list.get(3);
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(s);
		System.out.println(c);
		*/
		// 위에꺼 바꿈 이게 더 편함 => 데이터형을 맞춰서 써줘라
		list.add("홍길동"); //0
		// list.add("강감찬"); 1
		list.add("심청이"); //1 ==> 2번 
		list.add("이순신"); //2 => 만약 삭제되면 #
		list.add("박문수"); //3 => 2번  ==> 3번
		list.add("춘향이"); //4 => 3번  ==> 4번
		
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		list.remove(2); // 2번 이순신 삭제 => 사라져서 루프가 중단되는게 아니라 나머지 번호가 바뀜 #
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		list.add(1, "강감찬"); // 1번 위치에 얘를 써라 (인덱스번호 = 1에 저장)
		/*	
		 * 	만약	==> 3 추가
		 * 	0		0
		 * 	1		1,  
		 *  2		2
		 *  3		=> 3추가
		 *  4		4
		 *  		5
		 *  
		 *  만약  ==> 2삭제
		 *  0		0
		 *  1		1
		 *  2		=> 2 삭제
		 *  3		2
		 *  4		3
		 *  
		 *  추가되거나 지워져도 알아서 해주니 배열 안써도 됨 ==> 알아서 바꿔주니 편함 ★★
		 *   
		 */
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
	}

}
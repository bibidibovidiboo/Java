/*   
 * 	  ArrayList 사용법 , Vector 사용법 , Map
 * 
 *	 	 List
 * 		======
 * 		  |
 * 		--------------------------------
 * 		ArrayList Vector    LinkedList
 * 		---------------------
 * 		둘의 차이 : 동기화 / 비동기화
 * 
 *   => ArrayList는 접근성이 좋아서 자주 사용한다 ★★
 *      
 */
package com.sist.lib;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
public class MainClass2 {
	 public static void main(String[] args) {
		// ArrayList<String> names=new ArrayList<String>();
		// Vector<String> names=new Vector<String>(); 
		LinkedList<String> names=new LinkedList<String>();
		
		// ArrayList 하나만 알면 Vector , LinkedList 다 사용 가능 => 메소드가 동일 ★★
		// 추가,삭제 시 속도가 가장 빠른 것 =>  LinkedList
		// => 메모리 안에는 문자열만 저장 
		
		names.add("홍길동"); // 인덱스 번호 0
		names.add("심청이"); // 1
		names.add("이순신"); // 2
		names.add("강감찬"); // 3
		names.add("춘향이"); // 4 
		
		System.out.println("저장된 갯수:"+names.size());
		System.out.println("=======================");
		// size => 보통 루프 돌릴 때 등장 
		// 출력 => for문 제어하기 편리 , 소스를 간결하게 하기 좋음
		
		// ↓ i<names.size => 갯수가 변동하기 때문에 이렇게 씀 
		for(int i=0;i<names.size();i++) {
			// 데이터를 받을 때 
			String name=names.get(i);
			// 원하는 위치에 저장된 데이터 읽기
			
			System.out.println(name+":"+i); // 인덱스는 자동 생성 => 0번 부터 시작
		}
		
		// 원하는 위치에 출력
		// add() => 5
		// add(index,"값")
		
		System.out.println("==============을지문덕 추가");
		
		// 추가 
		names.add(3,"을지문덕"); // 중간에 3번 을지문덕을 추가하니 뒤에 인덱스 알아서 변경됨
		for(int i=0;i<names.size();i++) {
			// 데이터를 받을 때 
			String name=names.get(i);
			// 원하는 위치에 저장된 데이터 읽기
			
			System.out.println(name+":"+i);			
		}
		
		System.out.println("================이순신 삭제");
		
		// 삭제 
		names.remove(2);
		for(int i=0;i<names.size();i++) {
			// 데이터를 받을 때 
			String name=names.get(i);
			// 원하는 위치에 저장된 데이터 읽기
			
			System.out.println(name+":"+i); 
		 
		}
		
		System.out.println("==============을지문덕=>박문수");
		
		// 수정
		names.set(2, "박문수"); // 을지문덕 => 박문수 
		for(int i=0;i<names.size();i++) {
			// 데이터를 받을 때 
			String name=names.get(i);
			// 원하는 위치에 저장된 데이터 읽기
			
			System.out.println(name+":"+i); 
		 
		}
		names.clear(); // 전체삭제  , 한개삭제는 remove
		System.out.println("저장된 갯수:"+names.size());
		
	 }
}
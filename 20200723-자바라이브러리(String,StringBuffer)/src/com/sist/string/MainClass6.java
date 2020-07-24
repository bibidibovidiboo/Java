// join,format => 자주는 안나옴
// valueOf => 이렇게 3가지 static 함수
package com.sist.string;
public class MainClass6 {
	public static void main(String[] args) {
		String[] arr= {"홍길동","심청이","박문수","이순신","춘향이"}; // 배열을 만들어서
		System.out.println(String.join("-", arr)); // -로 이어서 출력
		
		String str=String.format("%d - %d = %d", 10,2,10-2);
		System.out.println(str);
	}
}
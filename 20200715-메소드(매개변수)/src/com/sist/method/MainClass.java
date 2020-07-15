package com.sist.method;
class AA{
	public void AA() // void가 붙어서 생성자가 아님 => 일반 인스턴스 메소드
	{
		System.out.println("AA() Call...");
		// void => 리턴형 (결과값이 존재하지 않는다)
	}
	// 리턴형이 존재하지 않는다 : 특수메소드 => 메모리에 저장
	public AA() {
		 System.out.println("AA() Call...");
	}
	// 명시적 => 초기화 블록 => 생성자
	// 생성자와 초기화 블럭은 상속되지 않는다 (멤버만 상속)
	
}
public class MainClass {
	AA a=new AA(); // 변경할 수  X
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=new AA(); 
		a.AA();
	}

}

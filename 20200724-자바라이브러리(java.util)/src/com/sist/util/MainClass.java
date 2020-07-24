// java.util : 프로그램에서 많이 사용하는 클래스의 집합
// java.util : 반드시 import를 사용한다
// 필기 +
package com.sist.util;
import java.util.*;
public class MainClass {
	public void random() {
		Random r=new Random();
		int a=r.nextInt(101); // int a=(int)(Math.random()*101) => 더블형
		// 0 ~ 100 => 0부터라 항상 숫자 하나 더 많게 ( ) 안에 넣는다 
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new => 저장한다는 의미
		MainClass m=new MainClass(); // m=> random()이 저장됨
		m.random(); 
		MainClass m1=new MainClass(); // m1=> random()이 저장됨 ==> 따로따로 저장&작동 (인스턴스)
		m1.random();
		
		// 위와 달리 위에서 static을 써서 public void random() 로 줬다면 
		// MainClass.random(); 만 써서 불러올 수 있음 
		// 사용자 정의 메소드는 자동 호출이 없다 
		// 호출이 안되면 실행이 안돼서 꼭 불러와야 한다 ★★ ==> 단 main만 자동으로 호출 
		
	}
	
}

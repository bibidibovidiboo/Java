package com.sist.ann;
import java.util.*;
import java.lang.reflect.Method;
public class UserMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("요청:");
		String ss=scan.next();
		try {
			Class clsName=Class.forName("com.sist.ann.MovieModel");
			// 클래스 정보읽기
			Object obj=clsName.newInstance(); // 메모리 할당 
			// new 말고 이 방식으로도 가능 => new는 의존성이 강해서 잘안쓰여서 앞으로는 이걸 더 사용 ★
			// 메소드 찾기
			Method[] methods=clsName.getDeclaredMethods();
			for(Method m:methods) {
				// System.out.println(m.getName());
				RequestMapping rm=m.getAnnotation(RequestMapping.class); // value = 문자
				if(rm.value().equals(ss)) { // rm.value()랑 사용자 입력 ss가 같다면
					m.invoke(obj, null);
				}
			}
		}catch (Exception ex) {
		}
	}

}

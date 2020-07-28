package com.sist.io;
import java.io.*;
import java.util.*;
// implements Serializable => 이게 없으면 저장이 안된다 (직렬화) p.934
class Movie implements Serializable {
	private int mno;
	private String title;
	private String actor;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
}
public class MainClass3 {
	public static void main(String[] args) {
		try {
			ArrayList<Movie> list=new ArrayList<Movie>(); // Movie 저장
			Movie m=new Movie(); // m 생성 = 1번  
			// System.out.println(m+"m"); => 주소값 확인해보려고 씀	
			
			m.setMno(1);
			m.setTitle("홍길동전");
			m.setActor("홍길동");
			list.add(m);
			// index = 0
			
			m=new Movie(); // 2번
			m.setMno(2);
			m.setTitle("심청전");
			m.setActor("심청");
			list.add(m);
			// index = 1
			
			// new 안넣으면 메모리 생성이 안돼서 모두 같은 공간에 값만 바뀜 ★★
			// 3번 저장하려면 new가 3번 있어야 한다 ★★
			m=new Movie(); 	
			m.setMno(3);
			m.setTitle("춘향전");
			m.setActor("춘향");
			list.add(m);
			// index = 2
			
			// 추가
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c:\\javaDev\\movie_test.txt"));
			oos.writeObject(list); 
			System.out.println("저장 완료");
			/*
			for(int i=0;i<list.size();i++) {
				Movie mm=list.get(i);
				System.out.println(mm.getActor());
			}
			*/
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			
		}
	}
}
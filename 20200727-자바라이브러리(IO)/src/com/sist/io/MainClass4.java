package com.sist.io;
import java.io.*; // try - catch
import java.util.*; 
/*
 * 	FileInputStream , FileReader
 * 	FileOutputStream , FileWriter
 *  BufferedReader , File
 *  
 *  자바 프로그램 
 *  자바 WEB프로그램 (스프링)
 *  ================== 공통기반(예외처리)
 *  
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois=null; // 가져오는거라  input
		try {
			// 객체 단위로 저장하고 불러온다
			ois=new ObjectInputStream(new FileInputStream("c:\\javaDev\\movie_test.txt"));
			// ArrayList<Movie> list=ois.readObject(); => 형변환 안해서 오류남 
			// class가 넘어가는건 전부 object
			ArrayList<Movie> list=(ArrayList<Movie>)ois.readObject(); // 형변환함
			// 출력
			for(Movie m:list) {
				System.out.println(m.getMno()+" "+m.getTitle()+" "+m.getActor());
			}
		}catch (Exception ex) {
			// 에러처리 
			System.out.println(ex.getMessage()); // 에러 확인해주는 디버깅
		}finally {
			try {
				ois.close();
			}catch(Exception ex) {}
		}
	}

}

// 한글자씩 
package com.sist.temp;
import java.io.*;
import java.util.*; // split , StringTokenizer
public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 읽기 => 예외처리
		FileReader fr=null; // 파일 읽기
		// 파일에 저장 : FileWriter ==> 문자 스트림 (한글 포함)
		/*
		 * 	FileInputStream 
		 * 	FileOutputStream
		 * 	================== 1byte (png,jpg...zip)
		 */
		try {
			// 파일 읽기
			fr=new FileReader("c:\\javaDev\\daum_movie.txt");
			int i=0; //  한글자 읽기 => 문자의 번호
			StringBuffer sb=new StringBuffer(); // 문자열 결합
			while((i=fr.read())!=-1) {
				// System.out.print(i);
				sb.append(String.valueOf((char)i)); // 형변환
			}
			// 출력
			System.out.println(sb.toString());
		}catch(Exception ex) {
			// 에러처리 => 디버깅
			/*
			 * 에러 메세지 확인
			 * Trace => 실행과정 => 해당위치 찾기 printStackTrace()
			 * 
			 */
			ex.printStackTrace();
			
		}finally {
			// 파일 닫기 , 쓰레드 종료, 네트워크 서버 종료 , 오라클 연결 해제
			try {
				fr.close();
			}catch (Exception ex) {
			
			}
		}

	}

}

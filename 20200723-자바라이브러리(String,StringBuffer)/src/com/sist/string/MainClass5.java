/*	StringBuffer : 동기화 (안전성) => 일반적
 * 	StringBuilder : 비동기화 (빠르나 손실있을 수 있음) => 멀티미디어
 */
package com.sist.string;
import java.io.FileReader;
public class MainClass5 {
	public static void main(String[] args) throws Exception {
		long start=System.currentTimeMillis();
		// String data=""; #
		// StringBuffer sb=new StringBuffer();
		StringBuilder sb=new StringBuilder(); // StringBuffer보다 빠름 
		FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		int i=0;
		// -1 End Of File
		while((i=fr.read())!=-1) {
			// data+=String.valueOf((char)i); //  char로 형변환 #
			sb.append(String.valueOf((char)i));
		}
		fr.close();
		long end=System.currentTimeMillis();
		System.out.println("수행시간:"+(end-start));
	}
}

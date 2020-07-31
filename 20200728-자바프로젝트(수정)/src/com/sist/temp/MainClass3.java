// 한줄씩 (MainClass보단 얘가 더 좋음)
package com.sist.temp;
import java.io.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예외처리
		try {
			FileInputStream fis=new FileInputStream("c:\\javaDev\\daum_movie.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(fis)); 
			// InputStreamReader => 1byte => 2byte로 변환
			// 네트워크 , 메모리 , 파일
			// BufferedReader => 데이터 메모리에 갖다두고 한줄씩 가져옴 
			while(true) {
				String data=br.readLine();
				if(data==null) break; // data값이 없다면
				System.out.println(data);
			}
			fis.close(); // finally 없으면 여기에 준다 
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}

// 여행 페이지
package com.sist.client;
import java.io.*;
import java.util.Scanner;
public class TripManager {
	static TripVO[] trips=new TripVO[18];

	static {
		try
		{	StringBuffer data=new StringBuffer();
			FileReader fr=new FileReader("c:\\javaDev\\trip.txt");
			
			int i=0;
			while((i=fr.read())!=-1) // -1 EOD(End of File)
			{
				data.append(String.valueOf((char)i)); // char => String 변환
			}
			fr.close();
			
			String[] tripData=data.toString().split("\n"); // Data안에 데이터 저장
			int k=0;
			for(String s:tripData) {
				String[] ss=s.split("\\|"); 
				trips[k]=new TripVO(); // 메모리에 저장
				trips[k].tno=Integer.parseInt(ss[0]);
				// 문자열 ==> 정수로 변환 "1" ==> 1
				trips[k].title=ss[1];
				trips[k].genre=ss[2];
				trips[k].poster=ss[3];
				trips[k].actor=ss[4];
				trips[k].regdate=ss[5];
				trips[k].grade=ss[6];
				trips[k].director=ss[7];
				k++;
			}
			
			// File을 읽는 경우에는 반드시 예외처리
		}catch(Exception ex) {}
		
	} 
	
	// 페이지 나누기 ★★
	static TripVO[] tripListData(int page) {
		TripVO[] m=new TripVO[9];
		int i=0; // 10개씩 나눠주는 변수
		int j=0; // for 횟수
		int rowSize=9; // 각 페이지당 몇개
		int pagecnt=(page*rowSize)-rowSize; // 시작 위치
		
		for(TripVO vo:trips) {
			if(i<9 && j>=pagecnt) {
				m[i]=vo;
				i++;
			}
			j++;
		}
		return m;	
		
	}
		
}

// ���� ������
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
				data.append(String.valueOf((char)i)); 
			}
			fr.close();
			
			String[] tripData=data.toString().split("\n"); // Data�ȿ� ������ ����
			int k=0;
			for(String s:tripData) {
				String[] ss=s.split("\\|"); 
				trips[k]=new TripVO(); // �޸𸮿� ����
				trips[k].tno=Integer.parseInt(ss[0]);
				trips[k].place=ss[1];
				trips[k].date=ss[2];
				trips[k].tripimg=ss[3];
				k++;
			}
			
		// File�� �д� ��쿡�� �ݵ�� ����ó��
		}catch(Exception ex) {
			
		}
		
	} 
	
	// ������ ������ 
	static TripVO[] tripListData(int page) {
		TripVO[] m=new TripVO[9];
		int i=0; // 10���� �����ִ� ����
		int j=0; // for Ƚ��
		int rowSize=9; // �� �������� �
		int pagecnt=(page*rowSize)-rowSize; // ���� ��ġ
		
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

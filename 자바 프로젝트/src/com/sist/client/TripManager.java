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
				data.append(String.valueOf((char)i)); // char => String ��ȯ
			}
			fr.close();
			
			String[] tripData=data.toString().split("\n"); // Data�ȿ� ������ ����
			int k=0;
			for(String s:tripData) {
				String[] ss=s.split("\\|"); 
				trips[k]=new TripVO(); // �޸𸮿� ����
				trips[k].tno=Integer.parseInt(ss[0]);
				// ���ڿ� ==> ������ ��ȯ "1" ==> 1
				trips[k].title=ss[1];
				trips[k].genre=ss[2];
				trips[k].poster=ss[3];
				trips[k].actor=ss[4];
				trips[k].regdate=ss[5];
				trips[k].grade=ss[6];
				trips[k].director=ss[7];
				k++;
			}
			
			// File�� �д� ��쿡�� �ݵ�� ����ó��
		}catch(Exception ex) {}
		
	} 
	
	// ������ ������ �ڡ�
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

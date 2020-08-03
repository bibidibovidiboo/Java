package com.sist.data;
import java.util.*;
import java.io.*;
public class MusicalManager {
	// ����������
	private static ArrayList<MusicalVO> list=new ArrayList<MusicalVO>();
	// Ȩȭ�� ������ 
	static {
		try {
			// ����� ���� �б�
			FileInputStream fr=new FileInputStream("c:\\javaDev\\musical.txt");
			// �޸𸮿� ��ü�����͸� ��Ƽ� ����
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true) {
				String  musical=in.readLine(); // readLine() => \n ���پ�
				if(musical==null) break; // ������ �� ���� ��� ����
				
				StringTokenizer st=new StringTokenizer(musical,"|");
				while(st.hasMoreTokens()) {
					MusicalVO vo=new MusicalVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					vo.setPoster(st.nextToken());
					vo.setPlace(st.nextToken());
					vo.setPeriod(st.nextToken()); 
					vo.setActor(st.nextToken());
					vo.setTime(st.nextToken());
					vo.setGrade(st.nextToken());
					vo.setHost(st.nextToken());

					
					list.add(vo);	
				}
			}			
		}catch (Exception ex) {}	
	}
	
	// Ȩ - 10���� ���
	public ArrayList<MusicalVO> musicalListData(int page){
		ArrayList<MusicalVO> musicals=new ArrayList<MusicalVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		for(MusicalVO vo:list) {
			if(i<10 && j>=pagecnt) {
				musicals.add(vo);
				i++; 
			}
			j++; 
		}
		return musicals;	
	}
	
	// �󼼺���
	public MusicalVO musicalDetailDate(int mno) {
		return list.get(mno-1); // �� �ѱ�
	}
}
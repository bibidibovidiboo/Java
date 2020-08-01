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
						vo.setTitle(st.nextToken());
						vo.setPoster(st.nextToken());
						vo.setInfo(st.nextToken());
						vo.setPlace(st.nextToken());
						vo.setPeriod(st.nextToken());
						vo.setActor(st.nextToken());
						vo.setTime(st.nextToken());
						
//						String score=st.nexextToken());
//						vo.setActor(st.nextToken());
//						vo.setGenre(st.nextToken());
//						String regdate=st.nextToken();
//						regdate=regdate.substring(0,regdate.lastIndexOf("��"));
//						vo.setRegdate(regdate);
//						String grade=st.nextToken();
//						grade=grade.substring(grade.indexOf(",")+1);
//						vo.setGrade(grade.trim());
//						vo.setShowUser(Integer.parseInt(st.nextToken().replace(",", "")));
//						vo.setStory(st.nextToken());
						
						list.add(vo);	
					}
				}			
			}catch (Exception ex) {}	
		}
		
		// Ȩ - 10���� ���
		public ArrayList<MusicalVO> MusicalListData(int page){
			ArrayList<MusicalVO> Musicals=new ArrayList<MusicalVO>();
			int i=0;
			int j=0;
			int pagecnt=(page*10)-10;
			for(MusicalVO vo:list) {
				if(i<10 && j>=pagecnt) {
					Musicals.add(vo);
					i++; // 10���� �����ִ� ����
				}
				j++; // for ���ư��� Ƚ��
			}
			return Musicals;	
		}

		// �󼼺���
		public MusicalVO MusicalDetailDate(int mno) {
			return list.get(mno-1); // �� �ѱ�
		}

}
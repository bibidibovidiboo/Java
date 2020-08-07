package com.sist.data;
import java.util.*;

import java.io.*;
public class MangoManager {
	private static ArrayList<MangoVO> list= new ArrayList<MangoVO>();
	
	static
	{
		try
		{
			FileInputStream fr=new FileInputStream("c:\\javaDev\\five\\mango.txt");
			// 메모리에 전체 데이터를 모아서 관리
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String mango=in.readLine(); // readLine() => \n
				if(mango==null) break;//종료 => 파일 다 읽은 경우
				/*
				 1|1|쿠이신보|
				 4.8|
				 서울시 강남구 신사동 539 대화빌딩|
				 02-546-9215|
				 이자카야 / 오뎅 / 꼬치|
				 2만원-3만원|
				  발렛|
				 월-목: 17:30 - 24:00 금-토: 17:30 - 02:00|
				 https://mp-seoul-image-production-s3.mangoplate.com/832260_1538990876392786.jpg?fit=around
				 */
				StringTokenizer st=new StringTokenizer(mango, "|");
				while(st.hasMoreTokens())
				{
					MangoVO vo=new MangoVO();
					vo.setFno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					String score=st.nextToken();
					vo.setScore(score.trim());
					vo.setAddress(st.nextToken());
					vo.setTel(st.nextToken());
					vo.setType(st.nextToken());
					vo.setPrice(st.nextToken());
					vo.setParking(st.nextToken());
					vo.setTime(st.nextToken());
					vo.setPoster(st.nextToken());
					list.add(vo);
				}
			}
					
				
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	/*
	public ArrayList<MangoVO> mangoListData(int page)
	{
		ArrayList<MangoVO> mangos=new ArrayList<MangoVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		
		for(MangoVO vo:list)
		{
			if(i<10 && j>=pagecnt) //pagecnt: 저장위치
			{
				mangos.add(vo);
				i++; // 10개식 나눠주는 변수
			}
			j++; // for 돌아가는 횟수
		}
		return mangos;
	}
	*/
	
	public int mangoTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
		
	}
	//상세보기
	public MangoVO mangoDetailData(int fno)
	{
		return list.get(fno-1);
	}
	//영화전체읽기
	public ArrayList<MangoVO> mangoAllData(int cno)
	{
		ArrayList<MangoVO> mangos=new ArrayList<MangoVO>();
		for(MangoVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				mangos.add(vo);
			}
		}
		return mangos;
	}
	// 영화검색 
	public ArrayList<MangoVO> mangoFindData(String ss) // ArrayList:가변배열=>검색어에 맞는 여러개의 VO를 묶어서 처리
	{
		ArrayList<MangoVO> mangos=new ArrayList<MangoVO>(); 
		// list 에서 데이터 찾기 -> movies에 저장
		for(MangoVO vo:list)
		{
			if(vo.getTitle().contains(ss))
			{
				mangos.add(vo);
			}
		}
		return mangos;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("페이지:");
		int page=scan.nextInt();
		
		MangoManager m=new MangoManager();
		System.out.println(page+" page / "+m.mangoTotalPage()+" pages");
		
		/*
		//데이터 읽기
		ArrayList<MangoVO> list=m.mangoListData(page);
		
		for(MangoVO vo:list){
			System.out.println(vo.getTitle());
		}
		*/
	}
}

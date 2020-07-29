package com.sist.data;
//데이터 관리
import java.util.*;
import java.io.*;
/*
 * 모든 자바파일에서 공통으로 사용 => 반드시 static
 * 프로그램 작성
 * =파일 : 분리할 수 없다 => 전체를 통으로 저장 => AI
 * 	1. 전체 파일을 읽어서 분리 => 메모리에 저장
 * 						====== ArrayList
 * 		FileReader
 * 		StringTokenizer,split
 * 	2. 메모리에서 제어
 * =오라클 : 분리되어 있는 상태
 * 	필요시마다 오라클에 연결 => 메소드 안에서 처리
 */
public class MovieManager {
	//데이터 저장
	private static ArrayList<MovieVO> list=new ArrayList<MovieVO>();
	//프로그램 시작 => 데이터 수집 => ArrayList에 저장 후 시작
	static
	{
		try
		{
			FileInputStream fr=new FileInputStream("c:\\javaDev\\daum_movie.txt");
			//메모리에 전체 데이터 수집
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String movie=in.readLine();//한줄씩 읽기 =>\n
				if(movie==null)
					break;//파일을 다 읽으면 종료
				StringTokenizer st=new StringTokenizer(movie,"|");
				while(st.hasMoreTokens())
				{
					MovieVO vo=new MovieVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					vo.setPoster("https:"+st.nextToken());
					String score=st.nextToken();
					score=score.substring(score.indexOf("점")+1);
					vo.setScore(score.trim());
					vo.setDirector(st.nextToken());
					vo.setActor(st.nextToken());
					vo.setGenre(st.nextToken());
					String regdate=st.nextToken();
					regdate=regdate.substring(0, regdate.lastIndexOf("개"));
					vo.setRegdate(regdate);
					String grade=st.nextToken();
					grade=grade.substring(grade.indexOf(",")+1);
					vo.setGrade(grade.trim());
					vo.setShowUser(Integer.parseInt(st.nextToken().replace(",", "")));
					vo.setStory(st.nextToken());
					
					list.add(vo);
				}
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
		public ArrayList<MovieVO> movieListData(int page)
		{
			ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
			int i=0;
			int j=0;
			int pagecnt=(page*10)-10;
			/*
			 * 1page => 0~9
			 * 2page => 10~19
			 * 3page => 20~29
			 */
			for(MovieVO vo:list)
			{
				//pagecnt => 저장위치
				if(i<10 && j>=pagecnt)
				{
					movies.add(vo);
					i++; //10개씩 나눠주는 변수
				}
				j++; //for 돌아가는 횟수
			}
			return movies;
		
		
		
	}
	public int movieTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
	}
	
	//상세보기
	public MovieVO movieDetailData(int mno)
	{
		return list.get(mno-1);
	}
	//영화 전체 읽기
	public ArrayList<MovieVO> movieAllData(int cno)
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		for(MovieVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				movies.add(vo);
			}
		}
		return movies;
	}
	
	//검색
	public ArrayList<MovieVO> movieFindData(String ss)
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		//list에서 검색
		for(MovieVO vo:list)
		{
			if(vo.getTitle().contains(ss))
			{
				movies.add(vo);
			}
		}
		return movies;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("페이지:");
		int page=scan.nextInt();
		
		MovieManager m=new MovieManager();
		System.out.println(page+"page / "+m.movieTotalPage()+" pages");
		
		//데이터 읽기
		ArrayList<MovieVO> list=m.movieListData(page);
		for(MovieVO vo:list)
		{
			System.out.println(vo.getTitle());
		}
		/*
		 * for(MovieVO vo:list) { if(vo.getTitle().contains(ss)) {
		 * System.out.println(vo.getTitle()); } }
		 */
			
	}

}
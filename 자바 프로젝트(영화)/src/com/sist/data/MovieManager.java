package com.sist.data;
import java.util.*;
import java.io.*;
public class MovieManager {
	// 데이터저장
	private static ArrayList<MovieVO> list=new ArrayList<MovieVO>();
	// 홈화면 포스터 
	static {
		try {
			// 저장된 파일 읽기
			FileInputStream fr=new FileInputStream("c:\\javaDev\\daum_movie.txt");
			// 메모리에 전체데이터를 모아서 관리
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true) {
				String  movie=in.readLine(); // readLine() => \n 한줄씩
				if(movie==null) break; // 파일을 다 읽은 경우 종료
				
				StringTokenizer st=new StringTokenizer(movie,"|");
				while(st.hasMoreTokens()) {
					MovieVO vo=new MovieVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					vo.setPoster("http:"+st.nextToken());
					String score=st.nextToken();
					score=score.substring(score.indexOf("점")+1);
					vo.setScore(score.trim());
					vo.setDirector(st.nextToken());
					vo.setActor(st.nextToken());
					vo.setGenre(st.nextToken());
					String regdate=st.nextToken();
					regdate=regdate.substring(0,regdate.lastIndexOf("개"));
					vo.setRegdate(regdate);
					String grade=st.nextToken();
					grade=grade.substring(grade.indexOf(",")+1);
					vo.setGrade(grade.trim());
					vo.setShowUser(Integer.parseInt(st.nextToken().replace(",", "")));
					vo.setStory(st.nextToken());
					list.add(vo);	
				}
			}			
		}catch (Exception ex) {}	
	}
	
	// 홈 - 10개씩 출력
	public ArrayList<MovieVO> movieListData(int page){
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		for(MovieVO vo:list) {
			if(i<10 && j>=pagecnt) {
				movies.add(vo);
				i++; // 10개씩 나눠주는 변수
			}
			j++; // for 돌아가는 횟수
		}
		return movies;	
	}

	// 상세보기
	public MovieVO movieDetailDate(int mno) {
		return list.get(mno-1); // 값 넘김
	}

}
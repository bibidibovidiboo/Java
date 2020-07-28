/*
 *  프로그램 작성
 *  필기 + / 중간중간 필기 +
 * 
 */
//  데이터관리
package com.sist.data;
import java.util.*;
import java.io.*;
public class MovieManager {
	// 데이터저장
	private static ArrayList<MovieVO> list=new ArrayList<MovieVO>();
	// 프로그램 시작 => 데이터 수집 => ArrayList 저장 후 시작 
	static {
		try {
			FileInputStream fr=new FileInputStream("c:\\javaDev\\daum_movie.txt");
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true) {
				String  movie=in.readLine(); // readLine() => \n 한줄씩
				if(movie==null) break; // 종료 => 파일을 다 읽은 경우
				
				StringTokenizer st=new StringTokenizer(movie,"|");
				while(st.hasMoreTokens()) {
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
			
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	
	}
	
	public ArrayList<MovieVO> movieListData(int page){
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		/*
		 * 	1page => 0~9
		 * 	2page => 10~19
		 * 	3page => 20~29
		 */
		for(MovieVO vo:list) {
			if(i<10 && j>=pagecnt) {
				movies.add(vo);
				i++; // 10개씩 나눠주는 변수
			}
			j++; // for 돌아가는 횟수
		}
		return movies;
		
	}
	public int movieTotalPage() {
		return (int)(Math.ceil(list.size()/10.0)); 
		// ceil는 올림 메소드
	}
	// 상세보기
	public MovieVO movieDetailDate(int mno) {
		return list.get(mno-1); // 값 넘김
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("페이지:");
		// String ss=scan.next();
		int page=scan.nextInt();
		
		MovieManager m=new MovieManager();
		System.out.println(page+"page / "+m.movieTotalPage()+" pages" );
		
		// 데이터 읽기
		ArrayList<MovieVO> list=m.movieListData(page);
		
		for(MovieVO vo:list) {
			System.out.println(vo.getTitle());
		}
		
		/*
		for(MovieVO vo:list) {
			if(vo.getTitle().contains(ss)) {
				System.out.println(vo.getTitle());
			}
		}
		*/
	}
}
/*
 *    프로그램 작성 
 *    = 파일 : 분리할 수 없다 => 전체를 통으로 저장  ======> AI
 *      = 1. 전체 파일을 읽어서 분리 => 메모리에 저장 
 *                                ===== ArrayList
 *           FileReader
 *           StringTokenizer,split 
 *      = 2. 메모리에서 제어 
 *    = 오라클 : 분리가 되어 있는 상태 
 *      = 필여시마다 오라클에 연결 => 메소드안에서 처리 
 */
//  데이터 관리
package com.sist.data;
import java.util.*;
import java.io.*;
public class MovieManager {
	// 데이터저장
	private static ArrayList<MovieVO> list=new ArrayList<MovieVO>();
	// 모든 자바파일에서 공통으로 사용 => 반드시 static
	// 프로그램 시작 => 데이터 수집 => ArrayList 저장 후 시작 
	/*
	 *   파일 읽기 => 
	 *   1.한글자씩 읽는 방법 => read()
	 *     FileInputStream
	 *     FileReader
	 *   2.한줄씩 읽는 방법  => readLine()
	 *     전체 데이터를 임시저장공간에 저장후 사용 
	 *     BufferedReader 
	 */
	static {
		try {
			// 저장된 파일 읽기
			FileInputStream fr=new FileInputStream("c:\\javaDev\\daum_movie.txt");
			// 메모리에 전체데이터를 모아서 관리
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
	
	// 홈 - 10개씩 출력
	public ArrayList<MovieVO> movieListData(int page){
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		// pagecnt => 저장 위치 
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
	
	// 영화 전체 읽기 
	public ArrayList<MovieVO> movieAllData(int cno){
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		for(MovieVO vo:list) {
			if(vo.getCno()==cno) {
				movies.add(vo);
			}
		}
		return movies;
	}
	
	// static이 아닌 인스턴스라 ListForm 안에 
	// MovieManager m=new MovieManager(); 로 생성해야 쓸 수 있다 ★
	
	// 검색
	// return => 여러개를 모아서 보내주겠다 
	public ArrayList<MovieVO> movieFindDate(String ss){
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>(); // 가변배열
		// list 
		for(MovieVO vo:list) {
			// 타이틀(getTitle).포함한(contains(영화번호))
			if(vo.getTitle().contains(ss)) {
				movies.add(vo); // ss에 포함됐다면 vo에 추가해줘
			}
		}
		
		return movies;
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
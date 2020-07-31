/*
 *    ���α׷� �ۼ� 
 *    = ���� : �и��� �� ���� => ��ü�� ������ ����  ======> AI
 *      = 1. ��ü ������ �о �и� => �޸𸮿� ���� 
 *                                ===== ArrayList
 *           FileReader
 *           StringTokenizer,split 
 *      = 2. �޸𸮿��� ���� 
 *    = ����Ŭ : �и��� �Ǿ� �ִ� ���� 
 *      = �ʿ��ø��� ����Ŭ�� ���� => �޼ҵ�ȿ��� ó�� 
 */
//  ������ ����
package com.sist.data;
import java.util.*;
import java.io.*;
public class MovieManager {
	// ����������
	private static ArrayList<MovieVO> list=new ArrayList<MovieVO>();
	// ��� �ڹ����Ͽ��� �������� ��� => �ݵ�� static
	// ���α׷� ���� => ������ ���� => ArrayList ���� �� ���� 
	/*
	 *   ���� �б� => 
	 *   1.�ѱ��ھ� �д� ��� => read()
	 *     FileInputStream
	 *     FileReader
	 *   2.���پ� �д� ���  => readLine()
	 *     ��ü �����͸� �ӽ���������� ������ ��� 
	 *     BufferedReader 
	 */
	static {
		try {
			// ����� ���� �б�
			FileInputStream fr=new FileInputStream("c:\\javaDev\\daum_movie.txt");
			// �޸𸮿� ��ü�����͸� ��Ƽ� ����
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true) {
				String  movie=in.readLine(); // readLine() => \n ���پ�
				if(movie==null) break; // ���� => ������ �� ���� ���
				StringTokenizer st=new StringTokenizer(movie,"|");
				while(st.hasMoreTokens()) {
					MovieVO vo=new MovieVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					vo.setPoster("https:"+st.nextToken());
					String score=st.nextToken();
					score=score.substring(score.indexOf("��")+1);
					vo.setScore(score.trim());
					vo.setDirector(st.nextToken());
					vo.setActor(st.nextToken());
					vo.setGenre(st.nextToken());
					String regdate=st.nextToken();
					regdate=regdate.substring(0,regdate.lastIndexOf("��"));
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
	
	// Ȩ - 10���� ���
	public ArrayList<MovieVO> movieListData(int page){
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		// pagecnt => ���� ��ġ 
		/*
		 * 	1page => 0~9
		 * 	2page => 10~19
		 * 	3page => 20~29
		 */
		for(MovieVO vo:list) {
			if(i<10 && j>=pagecnt) {
				movies.add(vo);
				i++; // 10���� �����ִ� ����
			}
			j++; // for ���ư��� Ƚ��
		}
		return movies;
		
	}
	public int movieTotalPage() {
		return (int)(Math.ceil(list.size()/10.0)); 
		// ceil�� �ø� �޼ҵ�
	}
	// �󼼺���
	public MovieVO movieDetailDate(int mno) {
		return list.get(mno-1); // �� �ѱ�
	}
	
	// ��ȭ ��ü �б� 
	public ArrayList<MovieVO> movieAllData(int cno){
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		for(MovieVO vo:list) {
			if(vo.getCno()==cno) {
				movies.add(vo);
			}
		}
		return movies;
	}
	
	// static�� �ƴ� �ν��Ͻ��� ListForm �ȿ� 
	// MovieManager m=new MovieManager(); �� �����ؾ� �� �� �ִ� ��
	
	// �˻�
	// return => �������� ��Ƽ� �����ְڴ� 
	public ArrayList<MovieVO> movieFindDate(String ss){
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>(); // �����迭
		// list 
		for(MovieVO vo:list) {
			// Ÿ��Ʋ(getTitle).������(contains(��ȭ��ȣ))
			if(vo.getTitle().contains(ss)) {
				movies.add(vo); // ss�� ���Եƴٸ� vo�� �߰�����
			}
		}
		
		return movies;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("������:");
		// String ss=scan.next();
		int page=scan.nextInt();
		
		MovieManager m=new MovieManager();
		System.out.println(page+"page / "+m.movieTotalPage()+" pages" );
		
		// ������ �б�
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
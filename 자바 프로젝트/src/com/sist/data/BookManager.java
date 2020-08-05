package com.sist.data;
//데이터 관리
import java.util.*;
import java.io.*;

public class BookManager {
	//데이터 저장
	private static ArrayList<BookVO> list=new ArrayList<BookVO>();
	//프로그램 시작 => 데이터 수집 => ArrayList에 저장 후 시작
	static
	{
		try
		{
			FileInputStream fr=new FileInputStream("c:\\javaDev\\book.txt");
			//메모리에 전체 데이터 수집
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String book=in.readLine();//한줄씩 읽기 =>\n
				if(book==null)
					break;//파일을 다 읽으면 종료
				StringTokenizer st=new StringTokenizer(book,"|");
				while(st.hasMoreTokens())
				{
					BookVO vo=new BookVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setTno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					vo.setAuthor(st.nextToken());
					vo.setPublish(st.nextToken());
					vo.setCost(st.nextToken());
					vo.setInfo(st.nextToken());
					vo.setPoster(st.nextToken());
					
					list.add(vo);
				}
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
		public ArrayList<BookVO> BookListData(int page)
		{
			ArrayList<BookVO> books=new ArrayList<BookVO>();
			int i=0;
			int j=0;
			int pagecnt=(page*10)-10;
			/*
			 * 1page => 0~9
			 * 2page => 10~19
			 * 3page => 20~29
			 */
			for(BookVO vo:list)
			{
				//pagecnt => 저장위치
				if(i<10 && j>=pagecnt)
				{
					books.add(vo);
					i++; //10개씩 나눠주는 변수
				}
				j++; //for 돌아가는 횟수
			}
			return books;
		
		
		
	}
	public int BookTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
	}
	
	//상세보기
	public BookVO bookDetailData(int mno)
	{
		return list.get(mno-1);
	}
	//책 전체 읽기
	public ArrayList<BookVO> bookAllData(int tno)
	{
		ArrayList<BookVO> books=new ArrayList<BookVO>();
		for(BookVO vo:list)
		{
			if(vo.getTno()==tno)
			{
				books.add(vo);
			}
		}
		return books;
	}
	
	//검색
	public ArrayList<BookVO> bookFindData(String ss)
	{
		ArrayList<BookVO> books=new ArrayList<BookVO>();
		//list에서 검색
		for(BookVO vo:list)
		{
			if(vo.getTitle().contains(ss))
			{
				books.add(vo);
			}
		}
		return books;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("페이지:");
		int page=scan.nextInt();
		
		BookManager m=new BookManager();
		System.out.println(page+"page / "+m.BookTotalPage()+" pages");
		
		//데이터 읽기
		ArrayList<BookVO> list=m.BookListData(page);
		for(BookVO vo:list)
		{
			System.out.println(vo.getTitle());
		}
		/*
		 * for(MovieVO vo:list) { if(vo.getTitle().contains(ss)) {
		 * System.out.println(vo.getTitle()); } }
		 */
			
	}

}

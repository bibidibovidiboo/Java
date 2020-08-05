package com.sist.data;
//������ ����
import java.util.*;
import java.io.*;

public class BookManager {
	//������ ����
	private static ArrayList<BookVO> list=new ArrayList<BookVO>();
	//���α׷� ���� => ������ ���� => ArrayList�� ���� �� ����
	static
	{
		try
		{
			FileInputStream fr=new FileInputStream("c:\\javaDev\\book.txt");
			//�޸𸮿� ��ü ������ ����
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String book=in.readLine();//���پ� �б� =>\n
				if(book==null)
					break;//������ �� ������ ����
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
				//pagecnt => ������ġ
				if(i<10 && j>=pagecnt)
				{
					books.add(vo);
					i++; //10���� �����ִ� ����
				}
				j++; //for ���ư��� Ƚ��
			}
			return books;
		
		
		
	}
	public int BookTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
	}
	
	//�󼼺���
	public BookVO bookDetailData(int mno)
	{
		return list.get(mno-1);
	}
	//å ��ü �б�
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
	
	//�˻�
	public ArrayList<BookVO> bookFindData(String ss)
	{
		ArrayList<BookVO> books=new ArrayList<BookVO>();
		//list���� �˻�
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
		System.out.print("������:");
		int page=scan.nextInt();
		
		BookManager m=new BookManager();
		System.out.println(page+"page / "+m.BookTotalPage()+" pages");
		
		//������ �б�
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

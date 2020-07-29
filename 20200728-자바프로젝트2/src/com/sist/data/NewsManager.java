package com.sist.data;
import java.util.*;
import java.io.*;
public class NewsManager {
	private static ArrayList<NewsVO> list=new ArrayList<NewsVO>();
	
	//���α׷� ���� => �����͸� �о ArrayList�� ����
	static
	{
		try
		{
			FileInputStream fis=new FileInputStream("c:\\javaDev\\daum_news.txt");
			BufferedReader in=new BufferedReader(new InputStreamReader(fis));
			while(true)
			{
				String data=in.readLine();
				if(data==null)
					break;
				
				StringTokenizer st=new StringTokenizer(data,"|");
				NewsVO vo=new NewsVO();
				vo.setTitle(st.nextToken());
				vo.setContent(st.nextToken());
				vo.setAuthor(st.nextToken());
				vo.setLink(st.nextToken());
				vo.setPoster(st.nextToken());
				list.add(vo);						
				
			}
			fis.close();
		}catch(Exception ex) {}
	}
	public ArrayList<NewsVO> newsListData(int page)
	{
		ArrayList<NewsVO> news=new ArrayList<NewsVO>();
		int i=0; //5���� �����ִ� ����
		int j=0; //for���� ����Ǵ� Ƚ��
		int pagecnt=(page*5)-5;//��� ���� ��ġ => 2������ ��û�ϸ� 5������ ��� 2*5-5
		//if(i<5 && j>=pagecnt)
		for(NewsVO vo:list)
		{
			if(i<5 && j>=pagecnt)
			{
				news.add(vo);
				i++;
			}
			j++;
		}
		
		return news;
	}
	public static void main(String[] args) {
		NewsManager m=new NewsManager();
		ArrayList<NewsVO> list=m.newsListData(5);
		int i=5;
		for(NewsVO vo:list)
		{
			System.out.println(i+"."+vo.getTitle());
			i++;
		}
		
	}
}
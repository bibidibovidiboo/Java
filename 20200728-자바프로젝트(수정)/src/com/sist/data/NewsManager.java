package com.sist.data;
import java.util.*;
import java.io.*;
/*	MovieManager에서 가져옴
  	String img=poster.get(j).attr("style");
    img=img.substring(img.indexOf("(")+1,img.lastIndexOf(")"));
    String data=title.get(j).text()+"|"
    		    +content.get(j).text().replace("|", " ")+"|" 
    		    +link.get(j).attr("href")+"|"
    		    +"https:"+img+"\r\n";
 */
public class NewsManager {
	private static ArrayList<NewsVO> list=new ArrayList<NewsVO>();
	// 프로그램 => 시작 => 데이터 읽어서 => Arraylist에 저장 
	static {
		try {
			FileInputStream fis=new FileInputStream("c:\\javaDev\\daum_news.txt");
			BufferedReader in=new BufferedReader(new InputStreamReader(fis)); // \n 나올 때까지 읽어줌
			while(true) {
				String data=in.readLine();
				if(data==null) break;
				
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
		}catch (Exception ex) {
		
		}
	}
	public ArrayList<NewsVO> newsListData(int page){
		ArrayList<NewsVO> news=new ArrayList<NewsVO>();
		int i=0; // i => 5개씩 나눠주는 변수
		int j=0; // j => for이 수행되는 횟수
		int pagecnt=(page*5)-5; // 출력할 시작위치
		// if(i<5 && j>=pagecnt)
		for(NewsVO vo:list) {
			if(i<5 && j>=pagecnt) {
				news.add(vo);
				i++;
			}
			j++;
		}
		return news;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsManager m=new NewsManager();
		ArrayList<NewsVO> list=m.newsListData(1);
		int i=1;
		for(NewsVO vo:list) {
			System.out.println(i+"."+vo.getTitle());
			i++;
		}
	}

}

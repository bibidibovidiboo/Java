/*      
 * 		try
 *       {
 *           for()
 *           {
 *               try
 *               {
 *               }catch(Exception e){} 오류 ==> continue => for 증가식
 *           }
 *       }catch(Exception e){}
 *       
 *       try
 *       {
 *           for()
 *           {
 *              
 *           } break
 *       }catch(Exception e){}
 *            
 */
package com.sist.project;
import java.io.FileWriter;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class MovieManager {
    public void movieAllData() 
    {
     try {
    	 //	여기에 private , static 못씀 =>  클래스 영역 안에서만 가능
	    	ArrayList<MovieVO> list=
	    			new ArrayList<MovieVO>();
	    	String[] site={
	    		"https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page=",
	    		"https://movie.daum.net/premovie/scheduled?reservationOnly=N&sort=reservation&page=",
	    		"https://movie.daum.net/boxoffice/weekly",
	    		"https://movie.daum.net/boxoffice/monthly",
	    		"https://movie.daum.net/boxoffice/yearly"
	    	};
	    	// <a href="/moviedb/main?movieId=135083" class="name_movie"
	    	// HTML (브라우저에서 실행되는 언어) 
	    	// 태그 <> , 속성 
	    	// 화면 UI => 구분  => id(중복이 없다),class(중복이될때)
	    	
	    	int mno=107; // 영화넘버
	    	int cno=5; // 카테고리 넘버
	    	
	    	// for(int i=1;i<=3;i++) => 페이지 for문
	    	{
	    		// 사이트 연결해서 데이터를 한번에 읽기 => 메모리 저장 => Document
	    		// 페이지 여러개 => Document doc=Jsoup.connect("https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page="+i).get();
	    		Document doc=Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get();
	    	    Elements link=doc.select("a.name_movie"); // css
	    	    for(int j=0;j<link.size();j++)
	    	    {
	    	    	// class Elements extends ArrayList
	    	    	//System.out.println(link.get(j).attr("href")); => 각 영화주소
	    	    	// 상세보기 
	    	    	try {
	    	    		String url="https://movie.daum.net"+link.get(j).attr("href");
		    	    	Document doc2=Jsoup.connect(url).get();
		    	    	
		    	    	Element poster=doc2.selectFirst("span.thumb_img img");
		    	    	System.out.println("포스터:"+poster.attr("src"));
		    	    	Element title=doc2.selectFirst("span.txt_name");
		    	    	System.out.println("제목:"+title.text());
		    	    	// <img src="이미지경로">
		    	    	//<span class="txt_name">제목</span>
		    	    	Element score=doc2.selectFirst("div.info_origin a");
		    	    	System.out.println("등급:"+score.text());
		    	    	
		    	    	Element director=doc2.select("dd.type_ellipsis a.link_person").get(0);
		    	    	System.out.println("감독:"+director.text());
		    	    	Element actor=doc2.select("dd.type_ellipsis a.link_person").get(1);
		    	    	System.out.println("출연:"+actor.text());
		    	    	
		    	    	Element genre=doc2.select("dl.list_movie dd").get(0);
		    	    	System.out.println("장르:"+genre.text());
		    	    	
		    	    	Element regdate=doc2.select("dl.list_movie dd").get(2);
		    	    	System.out.println("장르:"+regdate.text());
		    	    	
		    	    	Element grade=doc2.select("dl.list_movie dd").get(3);
		    	    	System.out.println("장르:"+grade.text());
		    	    	
		    	    	Element showUser=doc2.selectFirst("dd#totalAudience em.emph_g");
		    	    	System.out.println("누적:"+showUser.text());
		    	    	
		    	    	Element story=doc2.selectFirst("div.desc_movie p");
		    	    	System.out.println("줄거리:"+story.text());
		    	    	
		    	    	
		    	    	String msg=mno+"|"+cno+"|"+title.text()+"|"
		    	    			  +poster.attr("src")+"|"+score.text()
		    	    			  +"|"+director.text()+"|"+actor.text()
		    	    			  +"|"+genre.text()+"|"+regdate.text()
		    	    			  +"|"+grade.text()+"|"+showUser.text()
		    	    			  +"|"+story.text()+"\r\n";
		    	    	
		    	    	// 파일에 저장 
		    	    	FileWriter fw=new FileWriter("c:\\javaDev\\daum_movie1.txt",true);
		    	    	fw.write(msg);
		    	    	fw.close();
		    	    	
		    	    	mno++;
		    	    			  
	    	    	}catch(Exception ex) {}
	    	    	
	    	    }
	    	}
      }catch(Exception ex) // actor가 없는 오류
     	// <img src="이미지경로:> ==> attr()
		// <span class="txt_name">#살아있다(2020)</span> ==> text()
      {
    	   System.out.println(ex.getMessage());// 에러 메세지 출력 
      }
     // finally => 파일 닫기 , 오라클 서버 연결 해제 , 네트워크 서버 
    }
    public void daumNewsData()
    {
    	try
    	{
    		for(int i=1;i<=11;i++)
    		{
    	    	Document doc=Jsoup.connect("https://movie.daum.net/magazine/new?tab=nws&regdate=20200727&page="+i).get();
    		    Elements title=doc.select("strong.tit_line a.link_txt");
    		    Elements poster=doc.select("a.thumb_line span.thumb_img");
    		    Elements content=doc.select("a.desc_line");
    		    Elements author=doc.select("span.state_line");
    		    Elements link=doc.select("strong.tit_line a.link_txt");
    		    // 시크릿 가든은 1911년 출간된 이래 단 한번도
    		    
    		    for(int j=0;j<title.size();j++)
    		    {
    		    	System.out.println(title.get(j).text());
    		    	System.out.println(poster.get(j).attr("style"));
    		    	System.out.println(content.get(j).text());
    		    	System.out.println(author.get(j).text());
    		    	System.out.println(link.get(j).attr("href"));
    		    	
    		    	FileWriter fw=new FileWriter("c:\\javaDev\\daum_news1.txt",true); // 저장코드
    		    	String img=poster.get(j).attr("style");
    		    	img=img.substring(img.indexOf("(")+1,img.lastIndexOf(")")); // +1 줘야 다음부터 잘라옴
    		    	String data=title.get(j).text()+"|"
    		    			+content.get(j).text().replace("|", " ")+"|" // replace => |를 공백으로 로 바꿔라 
    		    			+link.get(j).attr("href")+"|"
    		    			+"https:"+img+"\r\n";
    		    			// 소스 앞에 https: 가 생략되어 있어서 추가해줬음 
    		    	fw.write(data);
    		    	fw.close();
    		    	
    		    }
    		}
    	}catch(Exception ex) {System.out.println(ex.getMessage());}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 객체 생성 
		MovieManager m=new MovieManager();
		m.movieAllData();
		//m.daumNewsData();
	}

}

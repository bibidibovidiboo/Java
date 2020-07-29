package com.sist.data;
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
	    	ArrayList<MovieVO> list=
	    			new ArrayList<MovieVO>();
	    	String[] site={
	    		"https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page=",
	    		"https://movie.daum.net/premovie/scheduled?reservationOnly=N&sort=reservation&page=",
	    		"https://movie.daum.net/boxoffice/weekly",
	    		"https://movie.daum.net/boxoffice/monthly",
	    		"https://movie.daum.net/boxoffice/yearly"
	    	};
	    	
	    	int mno=107;
	    	int cno=5;
	    	
	    	// for(int i=1;i<=2;i++)
	    	{
	    		
	    		Document doc=Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get();
	    	    Elements link=doc.select("a.name_movie");
	    	    for(int j=0;j<link.size();j++) {
	    	      	    	
	    	    	// �󼼺��� 
	    	    	try {
		    	    	String url="https://m"
		    	    			+ ""
		    	    			+ ""
		    	    			+ ""
		    	    			+ "ovie.daum.net"+link.get(j).attr("href");
		    	    	Document doc2=Jsoup.connect(url).get();
		    	    	
		    	    	Element poster=doc2.selectFirst("span.thumb_img img");
		    	    	System.out.println("������:"+poster.attr("src"));
		    	    	
		    	    	Element title=doc2.selectFirst("span.txt_name");
		    	    	System.out.println("����:"+title.text());
		    	    	
		    	    	Element score=doc2.selectFirst("div.info_origin a");
		    	    	System.out.println("���:"+score.text());
		    	    	
		    	    	Element director=doc2.select("dd.type_ellipsis a.link_person").get(0);
		    	    	System.out.println("����:"+director.text());
		    	    	
		    	    	Element actor=doc2.select("dd.type_ellipsis a.link_person").get(1);
		    	    	System.out.println("�⿬:"+actor.text());
		    	    	
		    	    	Element genre=doc2.select("dl.list_movie dd").get(0);
		    	    	System.out.println("�帣:"+genre.text());
		    	    	
		    	    	Element regdate=doc2.select("dl.list_movie dd").get(2);
		    	    	System.out.println("����:"+regdate.text());
		    	    	
		    	    	Element grade=doc2.select("dl.list_movie dd").get(3);
		    	    	System.out.println("���:"+grade.text());
		    	    	
		    	    	Element showUser=doc2.selectFirst("dd#totalAudience em.emph_g");
		    	    	System.out.println("����:"+showUser.text());
		    	    	
		    	    	Element story=doc2.selectFirst("div.desc_movie p");
		    	    	System.out.println("�ٰŸ�:"+story.text());
		    	    	    	
		    	    	String msg=mno+"|"+cno+"|"+title.text()+"|"
		    	    			  +poster.attr("src")+"|"+score.text()
		    	    			  +"|"+director.text()+"|"+actor.text()
		    	    			  +"|"+genre.text()+"|"+regdate.text()
		    	    			  +"|"+grade.text()+"|"+showUser.text()
		    	    			  +"|"+story.text()+"\r\n";
		    	    	
		    	    	// ���Ͽ� ���� 
		    	    	FileWriter fw=new FileWriter("c:\\javaDev\\daum_movie.txt",true);
		    	    	fw.write(msg);
		    	    	fw.close();
		    	    	
		    	    	mno++;
		    	    			  
	    	    	}catch(Exception ex) {
	    	    		
	    	    	}	    	    	
	    	    }
	    	}
      }catch(Exception ex) {
    	   System.out.println(ex.getMessage());
      }
    }
   	public static void main(String[] args) {
		MovieManager m=new MovieManager();
		m.movieAllData();		
	}

}

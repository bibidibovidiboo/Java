package com.sist.temp;
import java.io.FileWriter;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sist.data.MusicalVO;
public class MusicalManager {
    public void MusicalAllData() 
    {
     try {
	    	ArrayList<MusicalVO> list=
	    			new ArrayList<MusicalVO>();
	    	String[] site={
		    		"http://ticket.interpark.com/TPGoodsList.asp?Ca=Mus&Sort=1",
		    	};
	    	
	    	int mno=1;
  		
	    		// Document
	    		Document doc=Jsoup.connect("http://ticket.interpark.com/TPGoodsList.asp?Ca=Mus&Sort=1").get();
	    	    Elements link=doc.select("span.fw_bold a");
	    	    for(int j=0;j<link.size();j++)
	    	    {
	    	    	
	    	    	try {
		    	    	String url="http://ticket.interpark.com"+link.get(j).attr("href");
		    	    	Document doc2=Jsoup.connect(url).get();
		    	    	System.out.println(url);
		    	    		    	    	
		    	    	Element title=doc2.selectFirst("span#IDGoodsName");
		    	    	System.out.println("제목:"+title.text());
		    	    	
		    	    	Element poster=doc2.selectFirst("div.poster img");
		    	    	System.out.println("포스터:"+poster.attr("src"));
		    	    	
		    	    	Elements info=doc2.select("dd.etc");
		    	    	System.out.println("정보:"+info.text());
	    	    	
		    	    	Element place=doc2.select("li.item dd").get(0);
		    	    	System.out.println("장소:"+place.text());
		    	    	
		    	    	Element period=doc2.select("li.item dd").get(1);
		    	    	System.out.println("기간:"+period.text());
		    	    	
		    	    	Element actor=doc2.select("li.item dd").get(2);
		    	    	System.out.println("출연:"+ actor.text());

		    	    	Elements time=doc2.select("p.m_T5");
		    	    	System.out.println("공연시간 정보:"+time.text());

		    	    	String msg=mno+"|"+title.text()+"|"+poster.attr("src")+"|"
		    	    	          +info.text()+"|"+place.text()+"|"
		    	    			  +period.text()+"|"+actor.text()+"|"+time.text()+"\r\n";
		    	    			  
		    	    	
		    	    	// 파일에 저장 
		    	    	FileWriter fw=new FileWriter("c:\\javaDev\\musical.txt",true);
		    	    	fw.write(msg);
		    	    	fw.close();
		    	    	mno++;
		    	    	
	    	    	}catch(Exception ex) {}  	
	    	}
      }catch(Exception ex) {    	   
    	  System.out.println(ex.getMessage()); // 에러 메세지 출력 
      }   
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicalManager m=new MusicalManager();
		m.MusicalAllData();		
	}
}
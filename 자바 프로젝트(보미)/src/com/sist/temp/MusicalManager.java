// 뮤지컬 데이터 수집용
package com.sist.temp;
import java.io.FileWriter;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sist.data.MusicalVO;
public class MusicalManager {
    public void musicalAllData() {
     try {   	
	    	ArrayList<MusicalVO> list=new ArrayList<MusicalVO>();
	    	String[] site={
	    		"http://ticket.interpark.com/TPGoodsList.asp?Ca=Mus",
	    		"http://ticket.interpark.com/TPGoodsList.asp?Ca=Mus&Sort=3"
	    	};
	    	
	    	int mno=1; 
	    	int cno=1;
	    	
	    		Document doc=Jsoup.connect("http://ticket.interpark.com/TPGoodsList.asp?Ca=Mus").get();
	    	    Elements link=doc.select("td.RKthumb a");
	    	    for(int j=0;j<link.size();j++) { 	
	    	    	// 상세보기 
	    	    	try {
		    	    	String url="http://ticket.interpark.com"+link.get(j).attr("href");
		    	    	Document doc2=Jsoup.connect(url).get();
		    	    	
		    	    	Element poster=doc2.selectFirst("div.poster img");
		    	    	System.out.println("포스터:"+poster.attr("src"));
		    	    	
		    	    	Element title=doc2.selectFirst("span#IDGoodsName");
		    	    	System.out.println("제목:"+title.text());
		    	    	
		    	    	Element place=doc2.select("li.item dd").get(0);
		    	    	System.out.println("장소:"+place.text());

		    	    	Element period=doc2.select("li.item dd").get(1);
		    	    	System.out.println("기간:"+period.text());
		    	    	
		    	    	Element host=doc2.select("table.table_goods_info td").get(0);
		    	    	System.out.println("주최:"+host.text());
		    	    	   	    	
		    	    	Element time=doc2.select("table.table_goods_info td").get(2);
		    	    	System.out.println("공연시간:"+time.text());
		    	    	
		    	    	Element grade=doc2.select("table.table_goods_info td").get(3);
		    	    	System.out.println("관람등급:"+grade.text());
		    	    	
		    	    	Element actor=doc2.select("table.table_goods_info td").get(4);
		    	    	System.out.println("출연:"+actor.text());

		    	    	String msg=mno+"|"+cno+"|"+title.text()+"|"
		    	    			  +poster.attr("src")+"|"+place.text()+"|"
		    	    			  +period.text()+"|"+actor.text()+"|"
		    	    			  +time.text()+"|"
		    	    			  +grade.text()+"|"+host.text()+"|"
		    	    			  +"\r\n";
		    	    	
		    	    	// 파일에 저장 
		    	    	FileWriter fw=new FileWriter("c:\\javaDev\\musical.txt",true);
		    	    	fw.write(msg);
		    	    	fw.close();
		    	    	
		    	    	mno++;
		    	    			  
	    	    	}catch(Exception ex) {}	    	    	

      		}
      }catch(Exception ex) {
    	   System.out.println(ex.getMessage());
      }    
    }
    
   	public static void main(String[] args) {
		MusicalManager m=new MusicalManager();
		m.musicalAllData();		
	}
   	
	public MusicalVO musicalDetailDate(int mno) {
		// TODO Auto-generated method stub
		return null;
	}
}
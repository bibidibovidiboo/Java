// ������ ������ ������
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
	    	    	// �󼼺��� 
	    	    	try {
		    	    	String url="http://ticket.interpark.com"+link.get(j).attr("href");
		    	    	Document doc2=Jsoup.connect(url).get();
		    	    	
		    	    	Element poster=doc2.selectFirst("div.poster img");
		    	    	System.out.println("������:"+poster.attr("src"));
		    	    	
		    	    	Element title=doc2.selectFirst("span#IDGoodsName");
		    	    	System.out.println("����:"+title.text());
		    	    	
		    	    	Element place=doc2.select("li.item dd").get(0);
		    	    	System.out.println("���:"+place.text());

		    	    	Element period=doc2.select("li.item dd").get(1);
		    	    	System.out.println("�Ⱓ:"+period.text());
		    	    	
		    	    	Element host=doc2.select("table.table_goods_info td").get(0);
		    	    	System.out.println("����:"+host.text());
		    	    	   	    	
		    	    	Element time=doc2.select("table.table_goods_info td").get(2);
		    	    	System.out.println("�����ð�:"+time.text());
		    	    	
		    	    	Element grade=doc2.select("table.table_goods_info td").get(3);
		    	    	System.out.println("�������:"+grade.text());
		    	    	
		    	    	Element actor=doc2.select("table.table_goods_info td").get(4);
		    	    	System.out.println("�⿬:"+actor.text());

		    	    	String msg=mno+"|"+cno+"|"+title.text()+"|"
		    	    			  +poster.attr("src")+"|"+place.text()+"|"
		    	    			  +period.text()+"|"+actor.text()+"|"
		    	    			  +time.text()+"|"
		    	    			  +grade.text()+"|"+host.text()+"|"
		    	    			  +"\r\n";
		    	    	
		    	    	// ���Ͽ� ���� 
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
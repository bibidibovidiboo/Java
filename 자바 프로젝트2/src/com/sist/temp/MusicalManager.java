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
		    	    	System.out.println("����:"+title.text());
		    	    	
		    	    	Element poster=doc2.selectFirst("div.poster img");
		    	    	System.out.println("������:"+poster.attr("src"));
		    	    	
		    	    	Elements info=doc2.select("dd.etc");
		    	    	System.out.println("����:"+info.text());
	    	    	
		    	    	Element place=doc2.select("li.item dd").get(0);
		    	    	System.out.println("���:"+place.text());
		    	    	
		    	    	Element period=doc2.select("li.item dd").get(1);
		    	    	System.out.println("�Ⱓ:"+period.text());
		    	    	
		    	    	Element actor=doc2.select("li.item dd").get(2);
		    	    	System.out.println("�⿬:"+ actor.text());

		    	    	Elements time=doc2.select("p.m_T5");
		    	    	System.out.println("�����ð� ����:"+time.text());

		    	    	String msg=mno+"|"+title.text()+"|"+poster.attr("src")+"|"
		    	    	          +info.text()+"|"+place.text()+"|"
		    	    			  +period.text()+"|"+actor.text()+"|"+time.text()+"\r\n";
		    	    			  
		    	    	
		    	    	// ���Ͽ� ���� 
		    	    	FileWriter fw=new FileWriter("c:\\javaDev\\musical.txt",true);
		    	    	fw.write(msg);
		    	    	fw.close();
		    	    	mno++;
		    	    	
	    	    	}catch(Exception ex) {}  	
	    	}
      }catch(Exception ex) {    	   
    	  System.out.println(ex.getMessage()); // ���� �޼��� ��� 
      }   
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicalManager m=new MusicalManager();
		m.MusicalAllData();		
	}
}
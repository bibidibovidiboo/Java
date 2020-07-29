package com.sist.temp;
import java.io.FileWriter;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class MusicManager {
    public void MusicAllData() 
    {
     try {
    	 
	    	ArrayList<MusicVO> list=
	    			new ArrayList<MusicVO>();
	    	String[] site={
	    		"https://music.bugs.co.kr/chart/track/realtime/total",
	    		"https://music.bugs.co.kr/chart/track/day/total",
	    		"https://music.bugs.co.kr/chart/track/week/total"	    		
	    	};
	    	
	    	int mno=1;
	    	int cno=1;
	    		
	    		// Document
	    		Document doc=Jsoup.connect("https://music.bugs.co.kr/chart/track/realtime/total").get();
	    	    Elements link=doc.select("a.thumbnail");
	    	    for(int j=0;j<link.size();j++)
	    	    {
	    	    	
	    	    	try {
		    	    	String url=link.get(j).attr("href");
		    	    	Document doc2=Jsoup.connect(url).get();
		    	    		    	    	
		    	    	Element title=doc2.selectFirst("div.innerContainer h1");
		    	    	System.out.println("����:"+title.text());
		    	    	
		    	    	Element cover=doc2.selectFirst("div.photos img");
		    	    	System.out.println("�ٹ�Ŀ��:"+cover.attr("src"));
		    	    	
		    	    	Element artist=doc2.select("table.info td").get(0);
		    	    	System.out.println("��Ƽ��Ʈ:"+artist.text());
		    	    	
		    	    	Element kinds=doc2.select("table.info td").get(1);
		    	    	System.out.println("�ٹ�����:"+kinds.text());
		    	    	
		    	    	Element release=doc2.select("table.info td").get(2);
		    	    	System.out.println("�߸���:"+ release.text());
		    	    	
		    	    	Element genre=doc2.select("table.info td").get(3);
		    	    	System.out.println("�帣:"+genre.text());
		    	    	
		    	    	Element company=doc2.select("table.info td").get(5);
		    	    	System.out.println("��ȹ��:"+company.text());
		    	    	
		    	    	Element distributor=doc2.select("table.info td").get(6);
		    	    	System.out.println("�����:"+distributor.text());
		    	    	
		    	    	Element time=doc2.select("table.info td").get(7);
		    	    	System.out.println("����ð�:"+time.text());
		    	    	
    	    	
		    	    	String msg=mno+"|"+cno+"|"+title.text()+"|"
		    	    			  +cover.attr("src")+"|"+artist.text()+"|"
		    	    			  +"|"+kinds.text()+"|"+release.text()
		    	    			  +"|"+genre.text()+"|"+company.text()
		    	    			  +"|"+distributor.text()+"|"+ time.text()
		    	    			  +"\r\n";
		    	    	
		    	    	// ���Ͽ� ���� 
		    	    	FileWriter fw=new FileWriter("c:\\javaDev\\music.txt",true);
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
        // ��ü ���� 
		MusicManager m=new MusicManager();
		m.MusicAllData();
		
	}

}

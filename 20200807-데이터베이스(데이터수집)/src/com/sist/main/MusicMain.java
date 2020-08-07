// Áö´Ï¹ÂÁ÷ (À¥°ú °ü·ÃµÈ ÀÚ¹Ù)
package com.sist.main;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.dao.MusicDAO;
import com.sist.dao.MusicVO;
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicDAO dao=new MusicDAO();
		try {
			int k=1;
			for(int i=1;i<=4;i++) {
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20200807&hh=09&rtm=Y&pg="+i).get(); 
				// ¤¤ URL¿¡¼­ ÆäÀÌÁö ¼Ò½º ´­·¶À» ¶§ ³ª¿À´Â ¼Ò½º¸¦ ÀüºÎ ±Ü¾î¿Â´Ù 
				// System.out.println(doc);
				Elements title=doc.select("td.info a.title");
				Elements singer=doc.select("td.info a.artist");
				Elements album=doc.select("td.info a.albumtitle");
				Elements poster=doc.select("a.cover img");
				Elements temp=doc.select("span.rank");
								
				for(int j=0;j<title.size();j++) {
					System.out.println("¼øÀ§:"+k);
					System.out.println("³ë·¡¸í:"+title.get(j).text());
					System.out.println("°¡¼ö¸í:"+singer.get(j).text());
					System.out.println("¾Ù¹ü¸í:"+album.get(j).text());
					System.out.println("Æ÷½ºÅÍ:"+poster.get(j).attr("src")); // »çÁøÀÌ¶ó ÁÖ¼Ò
					// System.out.println("»óÅÂ:"+temp.get(j).text());
					String str=temp.get(j).text();
					String idcrement="";
					String state="";
					if(str.equals("À¯Áö")) {
						idcrement="0";
						state="À¯Áö";
					}
					else if(str.equals("new")) {
						idcrement="0";
						state="new";
					}
					else {
						// 60
						idcrement=str.replaceAll("[^0-9]", ""); // ¼ýÀÚ¸¸ Á¦¿ÜÇÏ°í °ø¹é
						state=str.replaceAll("[^°¡-ÆR]", ""); // ÇÑ±Û¸¸ Á¦¿ÜÇÏ°í °ø¹é
						// ÇÏ°­
					}
					System.out.println("»óÅÂ:"+state);
					System.out.println("µîÆø:"+idcrement);
					// System.out.println("µ¿¿µ»ó Å°:"+youtubeKeyDate(title.get(j).text())); ¹Ø¿¡ ÀÖ¾î¼­ ÁÖ¼®Ã³¸® 
					System.out.println("=================================");
					
					MusicVO vo=new MusicVO();
					vo.setMno(k);
					vo.setTitle(title.get(j).text());
					vo.setSinger(singer.get(j).text());
					vo.setAlbum(album.get(j).text());
					vo.setPoster(poster.get(j).attr("src"));
					vo.setState(state);
					vo.setIdcrement(Integer.parseInt(idcrement));
					vo.setKey(youtubeKeyDate(title.get(j).text()));
					
					dao.musicInsert(vo); 
					
					Thread.sleep(100);
					k++;
					
				}
			}
		}catch (Exception ex) {}
		
		// youtubeKeyDate("´Ù½Ã ¿©±â ¹Ù´å°¡"); // À¯Æ©ºê È£Ãâ

	}
	public static String youtubeKeyDate(String title){
		String key="";
		try {
			Document doc=Jsoup.connect("https://www.youtube.com/results?search_query="+title).get();	
			Pattern p=Pattern.compile("/watch\\?v=[^°¡-ÆR]+"); // ÇÑ±ÛÁ¦¿ÜÇÏ°í ÀüÃ¼¸¦ ´Þ¶ó , +´Â ÇÑ±ÛÀÚÀÌ»ó / ÆÐÅÏÃ£±â ¡Ú
			Matcher m=p.matcher(doc.toString()); // ÀÏÄ¡ÇÏ´Â ¹®ÀÚ¸¦ Ã£¾Æ¼­ ¸ÅÄ¡
			while(m.find()) {
				// System.out.println(m.group());
				String str=m.group();
				str=str.substring(str.indexOf("=")+1,str.indexOf("\""));
				key=str;
				break;
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return key;
	}

}
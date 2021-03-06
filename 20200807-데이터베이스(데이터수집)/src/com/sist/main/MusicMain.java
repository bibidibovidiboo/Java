// 지니뮤직 (웹과 관련된 자바)
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
				// ㄴ URL에서 페이지 소스 눌렀을 때 나오는 소스를 전부 긁어온다 
				// System.out.println(doc);
				Elements title=doc.select("td.info a.title");
				Elements singer=doc.select("td.info a.artist");
				Elements album=doc.select("td.info a.albumtitle");
				Elements poster=doc.select("a.cover img");
				Elements temp=doc.select("span.rank");
								
				for(int j=0;j<title.size();j++) {
					System.out.println("순위:"+k);
					System.out.println("노래명:"+title.get(j).text());
					System.out.println("가수명:"+singer.get(j).text());
					System.out.println("앨범명:"+album.get(j).text());
					System.out.println("포스터:"+poster.get(j).attr("src")); // 사진이라 주소
					// System.out.println("상태:"+temp.get(j).text());
					String str=temp.get(j).text();
					String idcrement="";
					String state="";
					if(str.equals("유지")) {
						idcrement="0";
						state="유지";
					}
					else if(str.equals("new")) {
						idcrement="0";
						state="new";
					}
					else {
						// 60
						idcrement=str.replaceAll("[^0-9]", ""); // 숫자만 제외하고 공백
						state=str.replaceAll("[^가-힣]", ""); // 한글만 제외하고 공백
						// 하강
					}
					System.out.println("상태:"+state);
					System.out.println("등폭:"+idcrement);
					// System.out.println("동영상 키:"+youtubeKeyDate(title.get(j).text())); 밑에 있어서 주석처리 
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
		
		// youtubeKeyDate("다시 여기 바닷가"); // 유튜브 호출

	}
	public static String youtubeKeyDate(String title){
		String key="";
		try {
			Document doc=Jsoup.connect("https://www.youtube.com/results?search_query="+title).get();	
			Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+"); // 한글제외하고 전체를 달라 , +는 한글자이상 / 패턴찾기 ★
			Matcher m=p.matcher(doc.toString()); // 일치하는 문자를 찾아서 매치
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
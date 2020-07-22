// MovieManager
package com.sist.cgv;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class MovieManager {
	static MovieVO[] movies=new MovieVO[7]; // 공통으로 써서  static => 자동으로 불러줌 
	static {
		try {
			// <a href="/movies/detail-view/?midx=83160">
			// 
			Document doc=Jsoup.connect("http://www.cgv.co.kr/movies/").get(); // 영화 사이트 데이터 불러옴
			Elements link=doc.select("div.box-contents a");
			int j=0;
			for(int i=0;i<7;i++) {
				movies[i]=new MovieVO(); 
				System.out.println("http://www.cgv.co.kr"+link.get(j).attr("href")); // 태그 안이라서  attr을 쓴다 
				Document doc2=Jsoup.connect("http://www.cgv.co.kr"+link.get(j).attr("href")).get();
				
				Element title=doc2.selectFirst("div.title strong"); // selectFirst => 값을 한개만 가져옴
				Element poster=doc2.selectFirst("span.thumb-image img"); // 이미지
				Element grade=doc2.selectFirst("span.ico-grade"); // 등급 
				Element reserve=doc2.selectFirst("strong.percent span"); // 예매율 
				
				/* dl - dt로 묶여서 가져오는 법이 조금 까다로움 
				Elements dt=doc2.select("div.spec dd"); // 여러개라 elements 썼음
				for(int k=0;k<dt.size();k++) {
					System.out.println("=======================");
					
					System.out.println("=======================");
				}
				*/
				Element director=doc2.select("div.spec dd").get(0); 
				// System.out.println(director.text());
				movies[i].setDirector(director.text());  // 실제 메모리 저장
				
				Element actor=doc2.select("div.spec dd").get(2);
				// System.out.println(actor.text()); 
				movies[i].setActor(actor.text());
				
				Element etc=doc2.select("div.spec dd").get(4);
				// System.out.println(etc.text());
				
				// 얘네는 좀 다름 / etc => 15세 이상, 109분, 미국, 캐나다
				String[] temp=etc.text().split(","); // ,를 잘라내려고 
				movies[i].setTime(temp[1].trim());
				movies[i].setFrom(temp[2].trim());
				
				Element regdate=doc2.select("div.spec dd").get(5);
				// System.out.println(regdate.text()); 
				movies[i].setRegdate(regdate.text());
				
				if(i==0) {
					Element genre=doc2.select("div.spec dt").get(3);
					// System.out.println(genre.text());
					movies[i].setGenre(genre.text().substring(genre.text().indexOf(":")+1));
					
					// 장르 앞에 붙어서 잘라낸 것
				}else {
					Element genre=doc2.select("div.spec dt").get(2);
					// System.out.println(genre.text());
					movies[i].setGenre(genre.text().substring(genre.text().indexOf(":")+1));
				}
				// System.out.println(title.text());
				movies[i].setTitle(title.text());
				// System.out.println(poster.attr("src"));
				movies[i].setPoster(poster.attr("src"));
				// System.out.println(grade.text());
				movies[i].setGrade(grade.text());
				// System.out.println(reserve.text());
				movies[i].setReserve(reserve.text());
				movies[i].setMno(i+1);
				
				Element story=doc2.selectFirst("div.sect-story-movie");
				movies[i].setStory(story.text());
				j+=2; // a태그가 다음에 또 있어서 띄어쓰기 하려고 넣음 
			}
		}catch(Exception e) {
			
		}
	}
	/*
	public static void main(String[] args) {
		new MovieManager();
		for(MovieVO vo:movies) {
			System.out.println("=============================================================");
			System.out.println("영화번호:"+vo.getMno());
			System.out.println("제목:"+vo.getTitle());
			System.out.println("감독:"+vo.getDirector());
			System.out.println("출연:"+vo.getActor());
			System.out.println("장르:"+vo.getGenre());
			System.out.println("등급:"+vo.getGrade());
			System.out.println("상영시간:"+vo.getTime());
			System.out.println("국가:"+vo.getFrom());
			System.out.println("상영일"+vo.getRegdate());
			System.out.println("예매율:"+vo.getReserve());
			System.out.println("줄거리:"+vo.getStory());
		}
	}
	*/
}












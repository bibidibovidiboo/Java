// 웹사이트에도 사용됨 - 중요 ★★★
// 망고 플레이트 티라미스 한 섹션 가져옴 
/* <ul class="list-toplist-slider" style="width: 531px;">
        <li>
            <img class="center-croping" alt="티라미수 맛집 베스트 50곳 사진"
             data-lazy="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/rjo80nepigkxn637.png?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80"/>
            <a href="/top_lists/633_tiramisu"
             onclick="trackEvent('CLICK_TOPLIST', {&quot;section_position&quot;:0,&quot;section_title&quot;:&quot;믿고 보는 맛집 리스트&quot;,&quot;position&quot;:0,&quot;link_key&quot;:&quot;LMUMANJ&quot;});">
               <figure class="ls-item">
                 <figcaption class="info">
                   <div class="info_inner_wrap">
                    <span class="title">티라미수 맛집 베스트 50곳</span>
                   		<p class="desc">"최애 디저트는 당근 티라미수 아니겠어?"</p>
*/
package com.sist.data;
import java.io.FileWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import jdk.jfr.events.FileWriteEvent;
public class MainClass3 {
	public static FoodHouseVO[] categoryFoodData() {
		FoodHouseVO[] food=new FoodHouseVO[10];
		try {
			Document doc=Jsoup.connect("https://www.mangoplate.com/top_lists/1965_hotel_bingsu").get();
			// Element 1개 / Elements 여러개
			// 망고플레이트 데이터 하나씩 불러오기 ★
			Elements title=doc.select("span.title h3");
			Elements score=doc.select("strong.point span");
			Elements address=doc.select("p.etc");
			Elements poster=doc.select("img.center-croping");
			Elements review=doc.select("p.short_review");
			for(int i=0;i<10;i++) {
				System.out.println(title.get(i).text());
				System.out.println(score.get(i).text());
				System.out.println(address.get(i).text());
				System.out.println(poster.get(i).attr("data-original")); // 이미지라 text가 아님
				System.out.println(review.get(i).text());
				System.out.println("==================================");
				food[i]=new FoodHouseVO();
				food[i].setTitle(title.get(i).text());
				food[i].setScore(Double.parseDouble(score.get(i).text()));
				// 문자열 => 더블형으로 변환할 때 사용 Double.parseDouble()
				// 문자열 => 정수 Interger.parseInt()
				// 문자열 => 논리 Boolean.parseBoolean()
				// Wrapper Class
				food[i].setAddress(address.get(i).text());
				food[i].setPoster(poster.get(i).attr("data-original"));
				food[i].setReview(review.get(i).text());
				/* text / attr
				 * <p> 보미짱 </p> ==> text
				 * <p data="보미짱"> ==> attr
				 */
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return food;
	}
	public static CategoryVO[] categoryListDate() {
		CategoryVO[] cate=new CategoryVO[10];
		try {
			Document doc=Jsoup.connect("https://www.mangoplate.com").get(); // 페이지소스 불러옴
			// System.out.println(doc); => 불러와졌나 확인해봄
			Elements title=doc.select("div.info_inner_wrap span.title");
			Elements subject=doc.select("div.info_inner_wrap p.desc");
			Elements poster=doc.select("ul.list-toplist-slider img.center-croping");
			// Elements link=doc.select("");
			
				for(int i=0;i<10;i++) {
					System.out.println("=======================");
					System.out.println(title.get(i).text());
					System.out.println(subject.get(i).text());
					System.out.println(poster.get(i).attr("data-lazy"));
					cate[i]=new CategoryVO();
					cate[i].setCno(i+1); // 카테고리번호 1~10번까지 생성
					cate[i].setTitle(title.get(i).text());
					cate[i].setSubject(subject.get(i).text());
					cate[i].setPoster(poster.get(i).attr("data-lazy"));
				}

			}catch (Exception ex) {
				ex.printStackTrace(); // 에러시에 어디서 오류 났는지 확인
			}
		return cate;
	}
	
	public static void main(String[] args) {
		categoryFoodData();
	
	
	
	
	
	}
}

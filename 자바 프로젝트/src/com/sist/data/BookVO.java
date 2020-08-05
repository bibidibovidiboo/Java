package com.sist.data;
/*
 * 제목 : 부의 대이동
 * 부제목 : -달러와 금의 흐름으로 읽는 미래 투자 전략
 * 지은이 : 오건영
 * 출판사 : 페이지2(page2)
 * 가격 : 17,000원
 * 책표지 이미지
 */
public class BookVO {
	private int mno;//책 번호
	private int tno;//책 탭 메뉴 번호
	private String title;//책제목
	private String author;//저자
	private String publish;//출판사
	private String cost;//가격
	private String poster;//책표지이미지
	private String info;//형태사항

	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	
	

	
	
}


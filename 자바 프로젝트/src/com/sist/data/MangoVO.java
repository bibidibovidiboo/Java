package com.sist.data;

/*
 * 	코그커피 4.4
  	주소	대구광역시 중구 달구벌대로443길 15-25
		지번 대구시 중구 삼덕동2가 290-6
	전화번호	010-6861-5478
	음식 종류	카페 / 디저트
	가격대	만원 미만
	주차	유료주차 가능
	영업시간	09:00 - 21:00
	맛있다 49 괜찮다 5 별로 3
 */
// 맛집 1개에 대한 정보

public class MangoVO {
	private int fno;
	private int cno; 
	private String title;
	private String score;
	private String address;
	private String tel;
	private String type;
	private String price;
	private String parking;
	private String time;
	private String poster;
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	

}
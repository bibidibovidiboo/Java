package com.sist.back;
import java.util.Date;
public class BoardVO {
	private int no;
	private String name;
	private String subject;
	private String content;
	private String pwd; // 비번
	private Date regdate; // 쓴 날짜
	private int hit; // 조회수 
	// private : 메모리에 저장됐지만 함부로 가져다 쓸 수 없음 (데이터보호 목적/은닉화) 
	// 캡슐화코딩 : private ==> 누르면 실행되게 getter-setter 써서 public 사용
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
}

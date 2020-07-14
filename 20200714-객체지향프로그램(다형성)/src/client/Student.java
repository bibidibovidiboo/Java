package client;
public class Student {
	private int hakbun;
	public String name;
	String subject;
	protected String tel;
	
	public Student(){
		hakbun=1;
		name="이보미";
		subject="물리";
		tel="010-1111-2222";
	}

	public int getHakbun() {
		return hakbun;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
//  0713) ���������� - ĸ��ȭ - ���� - ���� - ������Ʈ
/*	< ����������  >
 * 	
 * 	���� => �б�(����� ������ �б�) , ����(�޸𸮿� ����)
 * 
 * 	�޼ҵ� >
 * 	�б� : getter() => ����� ������ �� �б�
 * 	���� : setter() => �������� ����
 * 
 * 	private String name;
 * 
 *  ĸ��ȭ ��� => �����͸� ��ȣ�ϴ� ����
 *  
 *  ==> setter
 *  public void setName(String name) {
 *		this.name=name;
 *	}
 *  ==> getter
 *  public String getName(){
 *  	return name;
 *  }
 *  	
 */
import lombok.Getter;
import lombok.Setter;
@Getter 
@Setter
class Student {
	private int hakbun;
	private String name;
	private String sex;
	public int getHakbun() {
		return hakbun;
	}
	/* ���̺귯�� �Ⱦ��� �̷��� ��� ��밡��
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	*/
}
public class ���������� {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		
}

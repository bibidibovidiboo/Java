/*	< 재사용  >
 * 	기존에 만들어진 클래스를 사용 (반복 코딩을 제거)
 * 	1) 상속 (is-a)
 * 	이미 만들어진 기능을 변경해서 사용
 * 	public class MyWindow extends JFrame
 * 						  ==============
 * 						    확장된 클래스	 
 * 	2) 포함 (has-a)
 *  이미 만들어진 기능을 변경해서 사용
 *  public class MyWindow {
 *  	JFrame f=new JFrame();
 *  }
 *  
 *  / 상속 
 *  A클래스가 가지고 있는 모든 것이 상속  => ★★  예외 (private , static , 생성자)
 *  
 *  public class A {
 *  	String name;
 *  	int age;
 *  	public void display();  
 *  }
 *  
 *  public class B extends A {
 *  	int age;
 *  	public void display(); 
 *  }
 *  
 *  
 *  
 */
import javax.swing.*;
public class MainClass extends JFrame {
	// extends String => X 상속할 수 없는 class ==> final class
	// final class : scanner , String , math 등등 
	/*
	 * public MainClass() { } 
	 * 생성자는 가급적이면 public 메소드로 만든다  
	 * 
	 */
	 public MainClass() {
		 // 기능
		 super.setSize(300, 300);
		 this.setVisible(true);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

}

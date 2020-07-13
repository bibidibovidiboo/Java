/* < 상속 응용  >
 * 자바의 모든 클래스는 상속 (생략)
 * ======================
 * class MainWindow2 extends Object {
 * 
 * } 
 */
import javax.swing.*;
public class MainWindow2 {
	JFrame f=new JFrame();
	public MainWindow2() {
		f.setSize(800, 600);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainWindow2();
	}

}
 
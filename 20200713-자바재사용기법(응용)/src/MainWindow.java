/* < ��� ����  >
 * ������ ������ ���� => ���
 * class A extends JFrame
 * �ִ� �״�� => ����
 * 
 * class A 
 * {
 * 	 JFrame f=new JFrame();
 * }
 */
import javax.swing.*;
public class MainWindow extends JFrame {
	// �������ڸ��� => �����츦 ����
	// ������ 
	public MainWindow() {
		// ������ ȭ�鼳��
		setSize(800, 600); // JFrame => �޼ҵ� => ���
		setVisible(true);	
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������
		new MainWindow();	
	}

}

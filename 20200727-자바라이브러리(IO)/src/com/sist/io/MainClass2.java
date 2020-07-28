/*  ������ ���� => ȸ������ , ��� , �Խ���
 *	 	 ���� => ���� => ArrayList 
 * 		 ������ => ArrayList�� ��Ƽ� ����  
 */
package com.sist.io;
import java.io.FileOutputStream;
import java.io.FileWriter;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	���� �����
		 * 	=======
		 * 	r => read
		 * 	w => write
		 * 	a => append
		 * 
		 * 	FileOutputStream(1byte)
		 * 	������
		 * 	    new FileOutputStream("��θ�")
		 * 		new FileOutputStream("��θ�",true/false) => false�� �⺻ default
		 * 	FileWriter(2byte)
		 */
		
		// FileOutputStream fos=null; #
		FileWriter fos=null;
		try {
			// ����
			// fos=new FileOutputStream("c:\\javaDev\\temp.txt",true); #
			// �� �� ��ο� ������ ������ ������ �ڵ����� �������
			fos=new FileWriter("c:\\javaDev\\temp.txt",true); 
			
			// ����
			String str="ABCDFFGHIJKLMN";
			fos.write(str+"\r\n"); // \r\n �����ٿ� ����
			
			// fos.write(str.getBytes()); // getBytes() => ���ڿ��� ����Ʈ �迭�� ������ �� ��� 
			// fos.write('L');
			// fos.write('M');
			// fos.write('N');
			// true�� ��� ��� �ڿ� �ٿ��� => true ���� write()���� ���ڸ� �ٲٸ� �׳� ����� �ȴ� ��
			// �� ex) fos=new FileOutputStream("c:\\javaDev\\temp.txt");  
			
			System.out.println("����Ϸ�!!"); 
			
		}catch (Exception ex) {
			// ����ó��
			System.out.println(ex.getMessage());
		}finally {
			// ���ϴݱ�
			// finally => ���ϴݱ� , �����ݱ� , ����Ŭ ���� ��ü
			try {
				fos.close();
			} catch (Exception ex) {
				
			}
		}

	}

}
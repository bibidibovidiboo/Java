// �ѱ��ھ� 
package com.sist.temp;
import java.io.*;
import java.util.*; // split , StringTokenizer
public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �б� => ����ó��
		FileReader fr=null; // ���� �б�
		// ���Ͽ� ���� : FileWriter ==> ���� ��Ʈ�� (�ѱ� ����)
		/*
		 * 	FileInputStream 
		 * 	FileOutputStream
		 * 	================== 1byte (png,jpg...zip)
		 */
		try {
			// ���� �б�
			fr=new FileReader("c:\\javaDev\\daum_movie.txt");
			int i=0; //  �ѱ��� �б� => ������ ��ȣ
			StringBuffer sb=new StringBuffer(); // ���ڿ� ����
			while((i=fr.read())!=-1) {
				// System.out.print(i);
				sb.append(String.valueOf((char)i)); // ����ȯ
			}
			// ���
			System.out.println(sb.toString());
		}catch(Exception ex) {
			// ����ó�� => �����
			/*
			 * ���� �޼��� Ȯ��
			 * Trace => ������� => �ش���ġ ã�� printStackTrace()
			 * 
			 */
			ex.printStackTrace();
			
		}finally {
			// ���� �ݱ� , ������ ����, ��Ʈ��ũ ���� ���� , ����Ŭ ���� ����
			try {
				fr.close();
			}catch (Exception ex) {
			
			}
		}

	}

}

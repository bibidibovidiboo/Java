// ���پ� (MainClass���� �갡 �� ����)
package com.sist.temp;
import java.io.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����ó��
		try {
			FileInputStream fis=new FileInputStream("c:\\javaDev\\daum_movie.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(fis)); 
			// InputStreamReader => 1byte => 2byte�� ��ȯ
			// ��Ʈ��ũ , �޸� , ����
			// BufferedReader => ������ �޸𸮿� ���ٵΰ� ���پ� ������ 
			while(true) {
				String data=br.readLine();
				if(data==null) break; // data���� ���ٸ�
				System.out.println(data);
			}
			fis.close(); // finally ������ ���⿡ �ش� 
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}

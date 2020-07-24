/*	StringBuffer : ����ȭ (������) => �Ϲ���
 * 	StringBuilder : �񵿱�ȭ (������ �ս����� �� ����) => ��Ƽ�̵��
 */
package com.sist.string;
import java.io.FileReader;
public class MainClass5 {
	public static void main(String[] args) throws Exception {
		long start=System.currentTimeMillis();
		// String data=""; #
		// StringBuffer sb=new StringBuffer();
		StringBuilder sb=new StringBuilder(); // StringBuffer���� ���� 
		FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		int i=0;
		// -1 End Of File
		while((i=fr.read())!=-1) {
			// data+=String.valueOf((char)i); //  char�� ����ȯ #
			sb.append(String.valueOf((char)i));
		}
		fr.close();
		long end=System.currentTimeMillis();
		System.out.println("����ð�:"+(end-start));
	}
}

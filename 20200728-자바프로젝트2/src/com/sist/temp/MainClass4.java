package com.sist.temp;
import java.io.*;
import java.util.*;
public class MainClass4 {
	public static void main(String[] args) {
		try {		
			FileReader fr=new FileReader("c:\\javaDev\\daum_movie.txt");
			int i=0;
			// �����͸� ������ ���ڿ�
			String data="";
			
			while((i=fr.read())!=-1) {
				data+=String.valueOf((char)i);
			}
			fr.close(); // ���� �ݱ�
			System.out.println(data);
			// ����
			// 1. ���پ�
			/*
			String[] movies=data.split("\n"); // ���پ� 
			for(String s:movies) {
				System.out.println(s);
				System.out.println("===================");
				} 
			*/
			// �갡 �� ����
			StringTokenizer st=new StringTokenizer(data,"\n");
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());
				System.out.println("===================");
			}
			}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

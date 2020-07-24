package com.sist.util;
import java.util.*;
public class MainClass3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5]; // 5~14
		
		String day="";
		// �� resDay.length�� �� ���� : ��� �߻����� ���� 
		for(int i=0;i<resDay.length;i++) {
			resDay[i]=r.nextInt(31)+1; // 31���� ������ �Ϸ��� +1
			day+=resDay[i]+"|";
			
		}
		day=day.substring(0,day.lastIndexOf("|")); // �Ǹ����� ����	
		//  �� �̰� ������ �� �������� |�� �Ⱦ�����
		System.out.println(day);	
		
		// ��¥���� �и�
		String[] resDays=day.split("\\|"); // regex => ���Խ��� �����
		// �� split �ȿ��� ���Խ��� �����ؼ� ("|") �̷��� �� �� x / ����p.507
		// �̷��� �ͼ����� �ʾƼ� split ���ٴ� ��а� StringTokenizer�� ����ض�
		/* 	< ���Խ� ��ȣ  >
		 * 	^ => ���۹���  ^A = StartsWith�� ���� / ^[��-�R] ^[A-Za-z] ^[0-9]
		 * 									 [^��-�R] => ���� ==> �ѱ��� ������
		 * 				   				   / ���Ϲ��� 
		 * 								   => 3��� => [^��-�R] ==> 3�� ������
		 * 								   => 1�ϰ� => [^0-9]
		 * 	$ => ������ 	A$
		 *  . => ������ �ѱ��� (��� ����) ==> \\;
		 *  | => ����
		 *  ? => ������ ��� , ������ �����
		 */
		for(String s:resDays) {
			System.out.println(s);
		}
		System.out.println("========StringTokenizer========");
		StringTokenizer st=new StringTokenizer(day,"|");
		// ����� ���� hasMortTokens ����
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
// join,format => ���ִ� �ȳ���
// valueOf => �̷��� 3���� static �Լ�
package com.sist.string;
public class MainClass6 {
	public static void main(String[] args) {
		String[] arr= {"ȫ�浿","��û��","�ڹ���","�̼���","������"}; // �迭�� ����
		System.out.println(String.join("-", arr)); // -�� �̾ ���
		
		String str=String.format("%d - %d = %d", 10,2,10-2);
		System.out.println(str);
	}
}
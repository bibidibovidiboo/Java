package com.sist.ann;
import java.util.*;
import java.lang.reflect.Method;
public class UserMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("��û:");
		String ss=scan.next();
		try {
			Class clsName=Class.forName("com.sist.ann.MovieModel");
			// Ŭ���� �����б�
			Object obj=clsName.newInstance(); // �޸� �Ҵ� 
			// new ���� �� ������ε� ���� => new�� �������� ���ؼ� �߾Ⱦ����� �����δ� �̰� �� ��� ��
			// �޼ҵ� ã��
			Method[] methods=clsName.getDeclaredMethods();
			for(Method m:methods) {
				// System.out.println(m.getName());
				RequestMapping rm=m.getAnnotation(RequestMapping.class); // value = ����
				if(rm.value().equals(ss)) { // rm.value()�� ����� �Է� ss�� ���ٸ�
					m.invoke(obj, null);
				}
			}
		}catch (Exception ex) {
		}
	}

}

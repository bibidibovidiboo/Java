/*
 *    ���̺귯�� => import
 *    ========
 *      1. java.lang
 *         = Object :�ֻ��� Ŭ���� 
 *            = clone() : ���� 
 *            = finalize() : �Ҹ��� 
 *            = toString() : ��ü�� ���ڿ��� ��ȯ 
 *         = String (StringBuffer)
 *            = substring() : ���ڸ� ���� 
 *            = indexOf(),lastIndexOf() => ���ڸ� ã�� ��� (MVC) 
 *            = trim() : �α��� ó�� , ����� �Է°� 
 *            = equals() : ���� ����� ���ڿ��� �� => �α���ó�� , �����ȣ...
 *            = length() : ���� ����
 *            = valueOf() : �����ϰ� => static => ��� ���������� ���ڿ� ��ȯ 
 *            = join() :��ȯ 
 *            *** StringBuffer : append() :���ڿ� 
 *         = Wrapper : Ŭ���� ����ȯ , ���ڿ��� �ٸ� ������������ ���� 
 *            = Integer : parseInt() : ��������ȯ 
 *            = Double  : parseDouble() : �Ǽ�����ȯ 
 *            = Boolean : parseBoolean() : "true" => true, "false"=>false
 *         = Math
 *            = random(), ceil():�ø� (��������)
 *         = System
 *            = gc(): �޸� ȸ��,exit():���α׷� ���� 
 *            = web => �ڵ� �޸�ȸ�� (��Ĺ)
 *      2. java.util
 *         = StringTokenizer : ���ڸ� ����  => split() => ���Խ� 
 *           ===============
 *             = nextToken() : �Ѱ��� ���� ���ڸ� �ڸ��� 
 *             = hasMoreTokens() : �ڸ� ������ŭ ����
 *         = Date , Calendar
 *           Date : �ý����� �ð� , ��¥ �б� 
 *                  Date date=new Date() => date.toString()
 *           Calendar : ���� ���ϱ� , ���� ������ ��¥ �б� 
 *                      ��¥ ��� => ��  (1....) month-1
 *                                ���� => week-1
 *         = Collection 
 *           ==========
 *             = ArrayList : �񵿱�ȭ => �����ͺ��̽� 
 *             = Vector :  ����ȭ  => ��Ʈ��ũ���� ����� ���� (��Ʈ��ũ)
 *             = HashMap : Ű,�� ==> Ű(�Ϲݹ��ڿ�) , ��(Ŭ���� �ּ�) ==> Ŭ���� ���� 
 *               ========
 *                 = MyBatis : Mapper(�����ͺ��̽� ����)
 *                 = Spring : Web
 *             = ���� : ��� Ŭ����,�����͸� �ѹ��� ���� => Object => ����ȯ 
 *                     ========================
 *                      �迭(����),���� 
 *             = ������ ���� => ���׸��� ���α׷� 
 *               <���ϴ� ��������> : ���������� ���� 
 *          ============================================================
 */
package com.sist.lib;
import java.text.*;
import java.util.Calendar;
import java.util.Date; // ��ȯ (�ð�,��¥) => SimpleDateformat()
//  �˾ƾ� �� �κ� : �⵵ ��ҹ��ڷ� ǥ���ϴ� ���  / ��¥�����ϴ� ��  �ڡ� 
//	< ǥ�ù�  >
//  yyyy �⵵ => yy , �� => M(MM) ,  �� => dd(d) , �ð� (h)hh , ��(mm) ,  ��(s) => p.544
// 				    ==========				   =========
//				 	 h(1~12) , 				   H(0~23) 
//	< Ķ����  > 
//	1) �Է³�¥ ����
//	cal.set(Calendar.YEAR,year); // calender.year�� �ٲ�
//	cal.set(Calendar.MONTH,month-1); // 
//	cal.set(Calendar.DATE,1);
//	2) ��¹��
//	System.out.println(cal.get(Calendar.YEAR));
//	System.out.println(cal.get(Calendar.MONTH)+1); 
//	System.out.println(cal.get(Calendar.DATE));
//	System.out.println(cal.get(Calendar.DAY_OF_WEEK)-1); 
//	int week=cal.get(Calendar.DAY_OF_WEEK)-1;
//
//	==> Ķ���Ϳ��� ��¥ �����ϴ� �������� �˸� �ȴ� 
public class MainClass {

	 public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.toString());// ǥ�� �ð��� �о� �´� 
		//��ȯ  => 544page
		// ��ȯ
		SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd hh:mm:ss"); // ��� �ڡ�
		System.out.println(sdf.format(date));
		// �ڹ� = ����Ŭ  => java.util.Date 
		
	}
}
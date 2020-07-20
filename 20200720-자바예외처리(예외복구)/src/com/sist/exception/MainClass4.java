/*	 < ����ó��  >
 *   ���� ó�� ==> ����Ǵ� ������ ������ �ִ� ��� 
 *   try
 *   {
 *        ���������� ����Ǵ� ���� 
 *   }catch(����Ǵ� ����Ŭ����)
 *   {
 *        ����ó�� 
 *   }
 *   catch(����Ǵ� ����Ŭ����)
 *   {
 *        ����ó��  
 *   }
 *   catch(����Ǵ� ����Ŭ����)
 *   {
 *        ����ó��
 *   }
 *   
 *   catch�� ������ ���ÿ��� ������ ���簡 �ִ� 
 *   ����ó�� ���� ���� 
 *   ==============
 *           �ֻ��� Ŭ���� => ��� Ŭ������ ���� Ŭ���� 
 *             Object
 *                |
 *            Throwable
 *                |
 *        ------------------------
 *        |                      |
 *       Error               Exception 
 *                               |
 *                    ---------------------------
 *                    |                         |
 *                IOException
 *                SQLException
 *                ClassFoundException
 *                MalformedURLException
 *                InterruptedException
 *                ===
 *                ===
 *                =====================         |
 *                 CheckException          RuntimeException => ����
 *                                              |
 *                                            NumberFormatException
 *                                            ArithmeticException
 *                                            NullPointerException
 *                                            ArrayIndexOutOfBoundsException
 *                                            ClassCastException
 */
package com.sist.exception;
public class MainClass4 {
	public static void main(String[] args) {
		try {
			int[] arr=new int[2];
			arr[0]=100;
			arr[2]=2; // error
			
			int a=arr[0]/arr[1];
			
		}catch(NumberFormatException e) {
			System.out.println("������ȯ�� �ȵ�");
		}catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println("�迭 ������ ��� ���");
		}catch (ArithmeticException e) {
			System.out.println("0���� ���� ���");
		}catch (RuntimeException e) { // ���� ���ߴ� ���� => ó��
			System.out.println("���� �� ��� ������ ó��");
		}catch (Exception e) { // exception
			System.out.println("������ ������ ��� ������ ó��");
		}catch (Throwable e) { // error , exeception ��� ó����
			System.out.println("���ܿ� ������ ���� ó��");
		}
	}
}

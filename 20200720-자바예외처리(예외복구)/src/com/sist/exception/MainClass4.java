/*	 < 예외처리  >
 *   다중 처리 ==> 예상되는 에러가 여러개 있는 경우 
 *   try
 *   {
 *        정상적으로 실행되는 문장 
 *   }catch(예상되는 예외클래스)
 *   {
 *        에러처리 
 *   }
 *   catch(예상되는 예외클래스)
 *   {
 *        에러처리  
 *   }
 *   catch(예상되는 예외클래스)
 *   {
 *        에러처리
 *   }
 *   
 *   catch를 여러개 사용시에는 순서가 존재가 있다 
 *   예외처리 계층 구조 
 *   ==============
 *           최상위 클래스 => 모든 클래스의 상위 클래스 
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
 *                 CheckException          RuntimeException => 생략
 *				      예외처리 반드시 ★★                                                  |
 *                                         NumberFormatException : 숫자 형식 오류
 *                                         ArithmeticException : 산술 연산 오류 (정수를 0으로 나누는 경우)
 *                                         NullPointerException : null 객체를 참조했을 경우
 *                                         ArrayIndexOutOfBoundsException : 배열을 참조하는 인덱스가 잘못된 경우
 *                                         ClassCastException : 적절치 못하게 Class 형변환하는 경우
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
			System.out.println("정수변환이 안됨");
		}catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println("배열 범위가 벗어난 경우");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 경우");
		}catch (RuntimeException e) { // 예상 못했던 에러 => 처리
			System.out.println("실행 시 모든 에러를 처리");
		}catch (Exception e) { // exception
			System.out.println("수정이 가능한 모든 에러를 처린");
		}catch (Throwable e) { // error , exeception 모두 처리★
			System.out.println("예외와 에러를 동시 처리");
		}
	}
}

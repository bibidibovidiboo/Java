/*	< 생성자  >
 *  - 클래스 
 *  1> 구성요소 
 *     변수 => 기본형 (String:참조형) 
 *     메소드 => 기능처리 (연산자,제어문) 
 *     ---------------------------------------------
 *     생성자 => 선언한 변수에 대한 초기값 => 존재하지 않을 수 있다
 * 	   -> 특징 
 * 		  1. 클래스명과 동일
 * 		  2. 리턴형이 없다
 * 		  3. 생성자는 여러개 있을 수 있다 => 오버로딩
 * 		  	 ***오버로딩   
 * 			 1) 같은 이름의 메소드
 * 			 2) 한개의 클래스 안에 제작
 * 			 3) 매개변수의 갯수나 데이터형이 다르다
 * 			 4) 리턴형은 상관없다
 * 		  4. 생성자가 하는 역할
 * 			 1) 클래스를 메모리에 저장할 경우에 반드시 호출되야 한다
 * 			 2) 멤버변수의 초기값
 *			    = 윈도우 , 네트워크  , 쓰레드 , 데이터베이스 연결 
 *			 *** 클래스 영역
 *			 public class MainClass 
 *			 {
 *				=> 제어문 , 연산처리 ==> 기능을 수행 할 수 없다
 *				   => {} 안에서 작업이 가능 ==> 메소드 (생성자메소드)
 *				=> 변수 선언만 가능 ★★
 *				   ===========
 *				   1) 기본형
 *				   2) 클래스 
 *				   3) 배열
 *			 }
 *			 
 *			=> 구현 ==> 연산 , 제어문 , 라이브러리 ==> 메소드 안에서만 사용이 가능 
 *											  선언 => 지역변수
 *	
 *			=> 선언  ==> 클래스 영역 안에서는 선언만 가능 	
 *					   int a=10;
 *                     String s="";				
 *
 *			변수 : 저장 , 변경 , 읽기 
 *			===
 *			1개 , 여러개 저장 (배열,클래스) ==> 변수의 일종
 *
 *			--------------------------------------------------------
 *			 / class에 변수 선언 (2가지 종류)
 *			 1) 따로 저장해서 사용하는 변수 ==> 멤버변수 , 인스턴스변수
 *       	 2) 한개만 저장해서 => 공통사용 변수 ==> 정적변수 , 클래스변수 , 공유변수
 *			=========================
 * 			 static => 전체제어
 *			
 *     		 / class에서 만드는 메소드 
 *     		 1) 따로 저장되는 메소드 => 인스턴스 메소드
 *     		 2) 공통으로 사용하는 메소드 => 정적메소드
 *     		 3) 저장에 필요한 메소드 => 생성자메소드 ==> 생성자는 static이 없다 ★★
 *				class A
 *				=> A() =====> dafault 생성자
 *				=> A(int a)
 *				=> A(double d)
 *				=> A(int a,int b)
 *			
 *			 class A
 *			 {
 * 				// 생성자가 없는 경우 가상머신이 자동으로  default값으로 생성자를 추가 => new A가 가능
 * 			 }
 * 			
 * 			 ====> A a=new A();
 * 
 * 			 class A
 *			 {
 * 				A(){
 * 				}
 * 			 }
 * 			 ====> A a=new A();
 * 
 * 			 class A
 *			 {
 * 				A(int a){
 * 				}
 * 			 }
 * 			 ===> A a=new A(10);
 * 
 * 			 모든 클래스는 생성자가 존재한다 ★★
 *      	
 *      	---------------------------------------------------------
 *      
 * 	    	= 초기값 설정 
 *           
 *           class A
 *           {
 *              int a;
 *              int b; 
 *           }
 *           ==============> a=0,b=0
 *           
 *           class A
 *           {
 *              int a=10;
 *              int b=20;
 *           }
 *           =============> a=10,b=20
 *           
 *           class A
 *           {
 *              파일에서 읽어서 초기값
 *              int a,b;
 *             
 *              A()
 *              {
 *                 for(int i=1;i<=100;i++)
 *                 a=100;
 *                 b=200;   ===> 구현이 가능
 *              }
 *           }
 *           ============> a=0,b=0 ===> a=100,b=200
 *           
 *           class A
 *           {
 *               int a;
 *               int b;
 *               생성자를 이용하지 않는 방법 
 *               
 *               {
 *                  a=1000;
 *                  b=2000;   구현이 가능
 *               } ====> 초기화 블록 
 *           }
 *           ===========> a=0,b=0
 */
/*
import javax.swing.*;
public class MainClass {
	// Mainclass(){}
		JComboBox box=new JComboBox(); // 박스를 선언
		MainClass()
		{
		box.addItem("영화");
		box.addItem("음악");
		box.addItem("맛집"); // 구현 => 블록 안에 있어야한다
		}
*/
public class MainClass {
	String book="Java의 정석";
	String author="남궁성"; // 변하는 멤버변수(인스턴스 변수)
	// String 두개는 저장이 필요 => new가 필요 ==> 밑에 main에서 출력
	static String publisher="도우출판"; // static은 공통으로 사용하는 변수 
	// static은 자동으로 만들어줌 => 밑에 main에 출력할 필요 X
	public static void main(String[] args) {
		MainClass m=new MainClass(); // book , author ==> .
		System.out.println("책이름:"+m.book);
		System.out.println("저자:"+m.author);
		System.out.println("출판사:"+m.publisher);
		System.out.println("출판사:"+MainClass.publisher); // 권장
		System.out.println("출판사:"+publisher);
		/*
		 *  / static
		 *  => 객체를 통해 접근이 가능 m.publisher
		 *  => 클래스명을 통해 접근이 가능 m.publisher
		 *  => 같은 클래스에 있는 경우에는 publisher
		 * 
		 *  class A {
		 *  	static int a;
		 *  }
		 *  class B {
		 *  	B()
		 *  	{
		 *  	 	System.out.println(a) ==> B가 a를 가지고있다 => error
		 *  		System.out.println(A.a)
		 *  		다른 클래스 안에서는 클래스명.변수명 ★★
		 *  	}
		 *  }
		 *  
		 *  / 기억할 것 ★★★
		 *  = 인스턴스변수 vs 공유변수
		 *  = 공유변수 (static) => 자동으로 메모리에 저장
		 *  = 인스턴스변수 => new를 이용해서 메모리 공간을 만들고 저장
		 *    ==> 반드시 new를 사용해야 저장이 가능
		 * 
		 *  *** 스프링은  new를 저장하지 마라  ==> 리플렉션 (jsp등장 예정)
		 * 
		 */
		
	}	
	
}

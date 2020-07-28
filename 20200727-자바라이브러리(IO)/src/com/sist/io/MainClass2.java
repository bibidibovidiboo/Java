/*  파일의 쓰기 => 회원가입 , 댓글 , 게시판
 *	 	 파일 => 저장 => ArrayList 
 * 		 데이터 => ArrayList에 모아서 저장  
 */
package com.sist.io;
import java.io.FileOutputStream;
import java.io.FileWriter;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	파일 입출력
		 * 	=======
		 * 	r => read
		 * 	w => write
		 * 	a => append
		 * 
		 * 	FileOutputStream(1byte)
		 * 	생성자
		 * 	    new FileOutputStream("경로명")
		 * 		new FileOutputStream("경로명",true/false) => false는 기본 default
		 * 	FileWriter(2byte)
		 */
		
		// FileOutputStream fos=null; #
		FileWriter fos=null;
		try {
			// 생성
			// fos=new FileOutputStream("c:\\javaDev\\temp.txt",true); #
			// ㄴ 이 경로에 파일이 없으면 파일을 자동으로 만들어줌
			fos=new FileWriter("c:\\javaDev\\temp.txt",true); 
			
			// 저장
			String str="ABCDFFGHIJKLMN";
			fos.write(str+"\r\n"); // \r\n 다음줄에 저장
			
			// fos.write(str.getBytes()); // getBytes() => 문자열을 바이트 배열로 변경할 때 사용 
			// fos.write('L');
			// fos.write('M');
			// fos.write('N');
			// true를 줘야 계속 뒤에 붙여줌 => true 없이 write()안을 글자를 바꾸면 그냥 덮어쓰기 된다 ★
			// ㄴ ex) fos=new FileOutputStream("c:\\javaDev\\temp.txt");  
			
			System.out.println("저장완료!!"); 
			
		}catch (Exception ex) {
			// 에러처리
			System.out.println(ex.getMessage());
		}finally {
			// 파일닫기
			// finally => 파일닫기 , 서버닫기 , 오라클 연결 해체
			try {
				fos.close();
			} catch (Exception ex) {
				
			}
		}

	}

}
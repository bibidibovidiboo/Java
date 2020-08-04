// 자바에서 왜 연동하는지 알기, sql 익히기 
package com.sist.db;
import java.sql.*; // sql 연결
import java.util.Scanner;
public class DataBaseMain {
	public static void main(String[] args) {
		try {
			// conn.hr/happy
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 설치 => 클래스로 제작
			String url="jdbc:oracle:thin:@localhost:1521:XE"; // 오라클 서버주소
			// 연결
			Connection conn=DriverManager.getConnection(url,"hr","happy");
			// 오라클(sql) => conn hr/happy
			// SQL 문장전송
			Scanner scan=new Scanner(System.in);
			System.out.print("검색어 입력:");
			String data=scan.next(); // 정수값이면 set int 
			String sql="SELECT ename FROM emp WHERE ename LIKE '%'||?||'%'";
			// || => 문자열 결합 , 논리연산자(조건 OR 조건) && 입력 => 입력 ==>  AND
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, data);
			// 데이터 읽기
			ResultSet rs=ps.executeQuery();
			// next => 커서이동
			while(rs.next()) {
				System.out.println(rs.getString(1)); 
			}
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

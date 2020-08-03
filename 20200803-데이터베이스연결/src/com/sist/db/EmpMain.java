package com.sist.db;
import java.sql.*;
import java.util.*;
public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	// 오라클 연결 => 드라이버 설치
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	// 오라클 연결 
        	// 오라클 주소 
        	String url="jdbc:oracle:thin:@localhost:1521:XE";
        	Connection conn=DriverManager.getConnection(url,"hr","happy");
        	// 오라클에 명령문 전송 
        	String sql="SELECT empno,ename,job,sal FROM emp "
      			  +"WHERE empno=7788"; // 공백 중요 ★
        	
        	// String sql="SELECT empno,ename,job,sal FROM emp WHERE empno=7788"; 이렇게도 가능
        	// emp 뒤에 공백 주는거 중요 ★
        	// String sql="SELECT empno,ename,job,sal FROM emp;" 
        	// 이렇게 안에 세미콜론 붙이면 오류난다는거 꼭 기억하기★
        	
        	PreparedStatement ps=conn.prepareStatement(sql); // 오라클에 보냄 
        	// 실행된 데이터를 읽어 오기 
        	ResultSet rs=ps.executeQuery();
        	// 출력 
        	while(rs.next())
        	{
        		System.out.println(rs.getInt(1)+" "
        				+rs.getString(2)+" "
        				+rs.getString(3)+" "
        				+rs.getInt(4));
        	}
        }catch(Exception ex) 
        {
        	System.out.println(ex.getMessage());
        }
	}
}
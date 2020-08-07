package com.sist.dao;
import java.util.*;
import java.sql.*;
public class EmpDAO {
	//  오라클 연결 => Socket
	private Connection conn; 
	// 송신 , 수신
	private PreparedStatement ps;
	// BufferedReader,OutputStream
	private static EmpDAO dao;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE"; // oracle(프로그램이름),thin(연결),XE(DB이름)
	// 드라이버 등록 => 한번만 실행
	public EmpDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	//  싱글턴 패턴 : 데이터베이스에서 Connection을 한개를 생성 => 재사용
	/*
	 * 	8i,9i
	 * 	10g,11g
	 *  12c
	 * 
	 */
	public static EmpDAO newInstance() {
		if(dao==null) 
			dao=new EmpDAO();
		return dao;
	}
	// 연결
	public void getConnetion() {
		try {
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch (Exception ex) {
		}
	}
	// 해제
	public void disConnetion() {
		try {
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch (Exception ex) {}
	}
	public Connection getConn() {
		return conn;
	}
	public PreparedStatement getPs() {
		return ps;
	}
	// ============ 모든 데이터베이스의 공통 사항
	// 기능 
	
}

package com.sist.dao;
import java.util.*;
import java.sql.*;
public class EmpDAO {
	//  ����Ŭ ���� => Socket
	private Connection conn; 
	// �۽� , ����
	private PreparedStatement ps;
	// BufferedReader,OutputStream
	private static EmpDAO dao;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE"; // oracle(���α׷��̸�),thin(����),XE(DB�̸�)
	// ����̹� ��� => �ѹ��� ����
	public EmpDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	//  �̱��� ���� : �����ͺ��̽����� Connection�� �Ѱ��� ���� => ����
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
	// ����
	public void getConnetion() {
		try {
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch (Exception ex) {
		}
	}
	// ����
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
	// ============ ��� �����ͺ��̽��� ���� ����
	// ��� 
	
}

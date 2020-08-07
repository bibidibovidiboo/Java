package com.sist.dao;
import java.util.*;
import java.sql.*;
public class MusicDAO {
	// ����
	private Connection conn;
	// ����Ŭ => SQL ����
	private PreparedStatement ps;
	// URL
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE"; // final => ����X
	/*
	mno NUMBER(3),  where mno=1
	title VARCHAR2(300),
	singer VARCHAR2(100),
	album VARCHAR2(200),
	poster VARCHAR2(1000),
	state CHAR(6),
	idcrement NUMBER(3),
	key VARCHAR2(50)
	 */
	// ����̹� ���
	public MusicDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
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
	// ��������� ����
	// ������ �߰� (���) => ���⿡ ���� ����� �޶����� 
	public void musicInsert(MusicVO vo) {
		try {
			getConnetion(); // ����
//			String sql="INSERT INTO genie_music VALUES("+vo.getMno()+"','"+vo.getTitle()+"','"+vo.getSinger()
//						+"','"+vo.getAlbum()+"','"+vo.getPoster()+"','"+vo.getState()+"','"+vo.getIdcrement()+",'"+vo.getKey()+"')";
			String sql="INSERT INTO genie_music VALUES(?,?,?,?,?,?,?,?)"; // ���� ó�� ���� ���� ���� ������ �̷��� ?�� ���°� �ξ� ���ϴ�
			ps=conn.prepareStatement(sql);
			// ?�� ���� ä���
			ps.setInt(1, vo.getMno());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getSinger());
			ps.setString(4, vo.getAlbum());
			ps.setString(5, vo.getPoster());
			ps.setString(6, vo.getState());
			ps.setInt(7, vo.getIdcrement());
			ps.setString(8, vo.getKey());
			
			// ����
			ps.executeUpdate();
			
			}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			disConnetion();
		}
	}
	
	
}












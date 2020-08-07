package com.sist.dao;
import java.util.*;
import java.sql.*;
public class MusicDAO {
	// 연결
	private Connection conn;
	// 오라클 => SQL 전송
	private PreparedStatement ps;
	// URL
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE"; // final => 변경X
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
	// 드라이버 등록
	public MusicDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
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
	// 여기까지는 동일
	// 데이터 추가 (기능) => 여기에 따라 기능이 달라진다 
	public void musicInsert(MusicVO vo) {
		try {
			getConnetion(); // 연결
//			String sql="INSERT INTO genie_music VALUES("+vo.getMno()+"','"+vo.getTitle()+"','"+vo.getSinger()
//						+"','"+vo.getAlbum()+"','"+vo.getPoster()+"','"+vo.getState()+"','"+vo.getIdcrement()+",'"+vo.getKey()+"')";
			String sql="INSERT INTO genie_music VALUES(?,?,?,?,?,?,?,?)"; // 위에 처럼 쓰면 오류 나기 쉬워서 이렇게 ?로 쓰는게 훨씬 편하다
			ps=conn.prepareStatement(sql);
			// ?에 값을 채우기
			ps.setInt(1, vo.getMno());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getSinger());
			ps.setString(4, vo.getAlbum());
			ps.setString(5, vo.getPoster());
			ps.setString(6, vo.getState());
			ps.setInt(7, vo.getIdcrement());
			ps.setString(8, vo.getKey());
			
			// 실행
			ps.executeUpdate();
			
			}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			disConnetion();
		}
	}
	
	
}












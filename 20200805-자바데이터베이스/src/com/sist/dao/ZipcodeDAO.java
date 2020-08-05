package com.sist.dao;
import java.sql.*;
import java.util.*;
public class ZipcodeDAO {
	// 연결 
	private Connection conn;
	// 문장전송
	private PreparedStatement ps;
	// 연결 => 오라클주소
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// 드라이버 등록
	public ZipcodeDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	// 연결
			public void getConnection() {
				try {
					conn=DriverManager.getConnection(URL,"hr","happy");
					// conn hr/happy
				}catch (Exception ex) {}
			}
			
			public void disConnection() {
				try {
					if(ps!=null) ps.close();
					if(conn!=null) conn.close();
					// 오라클 exit
				}catch (Exception ex) {}
			}
			// 여기까지는 기본 
			
			/*
			 * 	String a,b,c,d
			 * 	int e,f
			 * 	"INSERT INTO member VALUES('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+")" // 예전에 쓰던 방식
			 *  "INSERT INTO member VALUES(?,?,?,?,?,?) // prepareStatement => 이걸로 바뀌었음 (훨씬 편함)
			 */
			
			// 우편번호 찾기 
			public ArrayList<ZipcodeVO> postfind(String dong){
				ArrayList<ZipcodeVO> list=new ArrayList<ZipcodeVO>();
				try {
					//  연결
					getConnection();
					// SQL 문장 전송
					String sql="SELECT * FROM zipcode "+"WHERE dong LIKE '%'||?||'%'";
					// ? => 사용자가 보내준 데이터
					// 갯수를 몰라서 가변형 데이터인 ArrayList를 배열대신 쓰는 것 ★
					ps=conn.prepareStatement(sql);
					ps.setString(1,dong);	
					ResultSet rs=ps.executeQuery(); // 실행
					// next가 없으면 오류 나서 꼭 넣야한다 ★
					while(rs.next()) {
						ZipcodeVO vo=new ZipcodeVO();
						vo.setZipcode(rs.getString(1));
						vo.setSido(rs.getString(2));
						vo.setGugun(rs.getString(3));
						vo.setDong(rs.getString(4));
						vo.setBunji(rs.getString(5));
						
						list.add(vo);
					}
					
				}catch (Exception ex) {
					System.out.println(ex.getMessage());
				}finally {
					disConnection();
				}
				return list;
			}
}
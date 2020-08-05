package com.sist.dao;
import java.sql.*;
import java.util.*;
public class ZipcodeDAO {
	// ���� 
	private Connection conn;
	// ��������
	private PreparedStatement ps;
	// ���� => ����Ŭ�ּ�
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// ����̹� ���
	public ZipcodeDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	// ����
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
					// ����Ŭ exit
				}catch (Exception ex) {}
			}
			// ��������� �⺻ 
			
			/*
			 * 	String a,b,c,d
			 * 	int e,f
			 * 	"INSERT INTO member VALUES('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+")" // ������ ���� ���
			 *  "INSERT INTO member VALUES(?,?,?,?,?,?) // prepareStatement => �̰ɷ� �ٲ���� (�ξ� ����)
			 */
			
			// �����ȣ ã�� 
			public ArrayList<ZipcodeVO> postfind(String dong){
				ArrayList<ZipcodeVO> list=new ArrayList<ZipcodeVO>();
				try {
					//  ����
					getConnection();
					// SQL ���� ����
					String sql="SELECT * FROM zipcode "+"WHERE dong LIKE '%'||?||'%'";
					// ? => ����ڰ� ������ ������
					// ������ ���� ������ �������� ArrayList�� �迭��� ���� �� ��
					ps=conn.prepareStatement(sql);
					ps.setString(1,dong);	
					ResultSet rs=ps.executeQuery(); // ����
					// next�� ������ ���� ���� �� �־��Ѵ� ��
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
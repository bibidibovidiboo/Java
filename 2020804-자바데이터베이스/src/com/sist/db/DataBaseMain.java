// �ڹٿ��� �� �����ϴ��� �˱�, sql ������ 
package com.sist.db;
import java.sql.*; // sql ����
import java.util.Scanner;
public class DataBaseMain {
	public static void main(String[] args) {
		try {
			// conn.hr/happy
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ����̹� ��ġ => Ŭ������ ����
			String url="jdbc:oracle:thin:@localhost:1521:XE"; // ����Ŭ �����ּ�
			// ����
			Connection conn=DriverManager.getConnection(url,"hr","happy");
			// ����Ŭ(sql) => conn hr/happy
			// SQL ��������
			Scanner scan=new Scanner(System.in);
			System.out.print("�˻��� �Է�:");
			String data=scan.next(); // �������̸� set int 
			String sql="SELECT ename FROM emp WHERE ename LIKE '%'||?||'%'";
			// || => ���ڿ� ���� , ��������(���� OR ����) && �Է� => �Է� ==>  AND
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, data);
			// ������ �б�
			ResultSet rs=ps.executeQuery();
			// next => Ŀ���̵�
			while(rs.next()) {
				System.out.println(rs.getString(1)); 
			}
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

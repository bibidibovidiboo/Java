package com.sist.dao;
import java.util.*;
import java.sql.*;
public class MyDAO {
	// db.jar ���� ���� Bulid Path�ؼ� �����ͼ� ��� (��� ���� �Ŷ�) => ���̺귯���� ����
	EmpDAO dao;
	public MyDAO() {
		dao=EmpDAO.newInstance();
	}
	public void empAllData() {
		dao.getConnetion();
	}
}

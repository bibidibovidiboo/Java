package com.sist.dao;
import java.util.*;
import java.sql.*;
public class MyDAO {
	// db.jar 파일 만들어서 Bulid Path해서 가져와서 사용 (계속 쓰는 거라서) => 라이브러리로 만듬
	EmpDAO dao;
	public MyDAO() {
		dao=EmpDAO.newInstance();
	}
	public void empAllData() {
		dao.getConnetion();
	}
}

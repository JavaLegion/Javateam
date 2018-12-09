package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import db.JDBCUtil;

public class MerchantInfoDAO {
	
	public static void ReleaseWork(String workname,int worktime,String sworkdate, String fworkdate,int worksalary,String workreq) throws ParseException{
		Connection conn= null;
		PreparedStatement ps= null; 
		String sql = "insert into work1 values(null,?,?,?,?,?,?)";
		Date sdate = new SimpleDateFormat("yyyy-MM-dd").parse(sworkdate);
		Date fdate = new SimpleDateFormat("yyyy-MM-dd").parse(fworkdate);
		conn=JDBCUtil.getConnection();
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, workname);
			ps.setInt(2, worktime);
			ps.setDate(3, (java.sql.Date) sdate);
			ps.setDate(4, (java.sql.Date) fdate);
			ps.setInt(5, worksalary);
			ps.setString(6, workreq);
		}catch(SQLException e) {

			e.printStackTrace();
		}			
	}
}

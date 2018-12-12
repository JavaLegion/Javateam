package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import db.DBManager;
import db.JDBCUtil;


public class MerchantInfoDAO {
	//发布兼职
	public static void ReleaseWork(String workname,String worktime,String sworkdate,String fworkdate,String worksalary,String workreq ) throws ParseException{
	
	    Connection conn= null;
		PreparedStatement ps= null; 
		String sql = "insert into work1(workname,worktime,sworkdate,fworkdate,worksalary,workreq) values(?,?,?,?,?,?)";
		
		conn=JDBCUtil.getConnection();
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,workname);
			ps.setInt(2,  Integer.parseInt(worktime));
			ps.setString(3,  sworkdate);
			ps.setString(4, fworkdate);
			ps.setInt(5, Integer.parseInt(worksalary));
			ps.setString(6, workreq);
			ps.execute();
		}catch(SQLException e) {

			e.printStackTrace();
		}			
	}
	//显示兼职信息
}

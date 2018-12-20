package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import db.JDBCUtil;


public class MerchantInfoDAO {
	//登录
	public static String MerchantLogin(String mernam, String merpwd) {
		String ends=null;
		Connection conn= null;
		PreparedStatement ps= null; 
		ResultSet rs= null;
		String sql = "select count(*) from merchant where mernam=? and merpwd=?";
		conn=JDBCUtil.getConnection();
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, mernam);
			ps.setString(2, merpwd);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		rs=JDBCUtil.executeQuery(ps);
		try {
			while (rs.next()) {
				int result = rs.getInt(1);
				ends =JDBCUtil.getServletValue(result);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			JDBCUtil.closeConn(conn);
		}
		return ends;
	}
	//注册
	public static String MerchantRegist(String mernam, String merpwd,String merphone) {
		String ends=null;
		Connection conn= null;
		PreparedStatement ps= null; 
		int i =0;
		String sql = "insert into merchant(mernum,mernam,merpwd, merphone) values(null,?,?,?)";
		conn=JDBCUtil.getConnection();
		try {
			ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, mernam);
			ps.setString(2, merpwd);
			ps.setString(3, merphone);
			i = JDBCUtil.executeupdate(ps);
			ends=JDBCUtil.getServletValue(i);
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			JDBCUtil.closeConn(conn);
		}
	
		return ends;
	}
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

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import  db.JDBCUtil;

public class StudentInfoDAO {
	
	public static String Loginpart(String stuid, String psd) {
		String ends=null;
		Connection conn= null;
		PreparedStatement ps= null; 
		ResultSet rs= null;
		String sql = "select count(*) from student where stuid=? and stupwd=?";
		conn=JDBCUtil.getConnection();
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, stuid);
			ps.setString(2, psd);
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
	
	public static String RegistPart(String stuid, String psd1,String phnum) {
		String ends=null;
		Connection conn= null;
		PreparedStatement ps= null; 
		int i =0;
		String sql = "insert into student(stunum,stuid,stupwd, stuphone) values(null,?,?,?)";
		conn=JDBCUtil.getConnection();
		try {
			ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, stuid);
			ps.setString(2, psd1);
			ps.setString(3, phnum);
			i = JDBCUtil.executeupdate(ps);
			ends=JDBCUtil.getServletValue(i);
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			JDBCUtil.closeConn(conn);
		}
	
		return ends;
	}
	public static String checkStuId(String stuid) {
		String ends=null;
		Connection conn= null;
		PreparedStatement ps= null; 
		ResultSet rs= null;
		String sql = "select count(*) from student where stuid=?";
		conn=JDBCUtil.getConnection();
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, stuid);
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
	public static String changePwd(String stuId,String oldPwd) {
		String ends=null;
		Connection conn= null;
		PreparedStatement ps= null; 
		ResultSet rs= null;
		String sql = "select count(*) from student where stuid=? and stupwd=?";
		conn=JDBCUtil.getConnection();
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, stuId);
			ps.setString(2, oldPwd);
			
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
	public static String upDatePwd(String stuId,String stuPsd ) {
		String ends=null;
		Connection conn= null;
		PreparedStatement ps= null; 
		String sql = "update student set stupwd=? where stuid=?";
		conn=JDBCUtil.getConnection();
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, stuPsd);
			ps.setString(2, stuId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int i = JDBCUtil.executeupdate(ps);
		ends =JDBCUtil.getServletValue(i);
		JDBCUtil.closeConn(conn);
		return ends;
	}
	
}

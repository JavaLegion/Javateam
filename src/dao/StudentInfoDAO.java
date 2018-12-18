package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.WorkInfo;
import  db.JDBCUtil;

public class StudentInfoDAO {
	//登录
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
	//注册
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
	//检查是否存在的用户名
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
	//检查原密码是否填写正确
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
	//修改密码（更新密码）
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
	//找回密码
	public static String stuBackPwd(String stuPhnum) {
		String ends=null;
		Connection conn= null;
		PreparedStatement ps= null; 
		ResultSet rs= null;
		String sql = "select count(*) from student where stuphone=?";
		conn=JDBCUtil.getConnection();
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, stuPhnum);
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
	//确认后更新密码
		public static String backSutPwd(String stuPhnum,String stuPwd ) {
			String ends=null;
			Connection conn= null;
			PreparedStatement ps= null; 
			String sql = "update student set stupwd=? where stuphone=?";
			conn=JDBCUtil.getConnection();
			try {
				ps=conn.prepareStatement(sql);
				ps.setString(1, stuPwd);
				ps.setString(2, stuPhnum);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			int i = JDBCUtil.executeupdate(ps);
			ends =JDBCUtil.getServletValue(i);
			JDBCUtil.closeConn(conn);
			return ends;
		}
		public static  List<WorkInfo> seekJob(String keyWord) {
			System.out.println("1111");
			List<WorkInfo> lists=new ArrayList<>();
			Connection conn= null;
			PreparedStatement ps= null; 
			ResultSet rs= null;
			String key="";
			String sql = "select *  from work1 where  workreq like ? or workname like ? or worksalary like ? ";
			key="%"+keyWord.trim() + "%";
			conn=JDBCUtil.getConnection();
			try {
				ps=conn.prepareStatement(sql);
				ps.setString(1,key );
				ps.setString(2,keyWord );
				ps.setString(3,keyWord );
			} catch (SQLException e) {

				e.printStackTrace();
				
			}
			rs=JDBCUtil.executeQuery(ps);
			System.out.println("333");
			try {
				while (rs.next()) {
					System.out.println("4444");
					WorkInfo w1 = new WorkInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
					lists.add(w1);
					System.out.println("5555");
				}
				System.out.println("666");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("777");
			}finally {
				JDBCUtil.closeConn(conn);
			}
			return lists;
		}
}

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.WorkInfo;
import db.JDBCUtil;

public class SystemDAO {
	public List<String> get(String keyword) {
		Connection conn= null;
		Statement st= null;
		ResultSet rs=null;
		String sql="";
		List<String> lists = new ArrayList<>();
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stu_man","root","123456");
			sql="select username from user where username LIKE '%"+keyword+"%'";
			st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=st.executeQuery(sql);
			while(rs.next()) {
				lists.add(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lists;
	}

	public static List<WorkInfo> getDate(String keyword) {
		Connection conn= null;
		Statement st= null;
		ResultSet rs=null;
		String sql="";
		List<WorkInfo> lists = new ArrayList<WorkInfo>();
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			conn=JDBCUtil.getConnection();
			sql="select * from work1";
			st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=st.executeQuery(sql);
			while(rs.next()) {
				WorkInfo w1 = new WorkInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				lists.add(w1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lists;
		
	}
	public static List<WorkInfo> getNowDate(String workid) {
		Connection conn= null;
		Statement ps= null;
		ResultSet rs=null;
		String sql="";
		List<WorkInfo> lists = new ArrayList<WorkInfo>();
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			conn=JDBCUtil.getConnection();
			sql="select * from work1 where workid="+workid+"";
			ps=conn.createStatement();
			rs=ps.executeQuery(sql);
			while(rs.next()) {
				WorkInfo w1 = new WorkInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				lists.add(w1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lists;
		
	}
}

package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.JDBCUtil;

public class SystemDAO {
	public List<String> getDate(String keyword) {
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
			conn=JDBCUtil.getConnection();
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
}

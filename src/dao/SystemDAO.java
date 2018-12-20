package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Page;
import bean.WorkInfo;
import db.JDBCUtil;

public class SystemDAO {
	private static PreparedStatement ppst;
	public List<String> get(String keyword) {
		Connection conn= null;
		Statement st= null;
		ResultSet rs=null;
		String sql="";
		List<String> lists = new ArrayList<>();
		try {
			conn=JDBCUtil.getConnection();
			sql="select workreq from work1 where workreq LIKE '%"+keyword+"%'";
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
		public static Page<WorkInfo> getDate2(int currentPage,int totalCount){
			Connection conn= null;
			ppst = null;
			ResultSet rs=null;
			String sql="";
			List<WorkInfo> lists = new ArrayList<WorkInfo>();
			Page<WorkInfo> page=new Page<WorkInfo>();
			page.setCurrPage(currentPage);
			int pageSize = 4;
			page.setPageSize(pageSize);
			page.setTotalCount(totalCount);
			double totalcount=totalCount;
	        Double num=Math.ceil(totalcount/pageSize);
	        page.setTotalPage(num.intValue());//转换为整数
			try {
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/part-time job","root","123456");
				sql="select * from work1 limit ?,?;";
				ppst= conn.prepareStatement(sql);
				ppst.setInt(1, (currentPage-1)*pageSize);
				ppst.setInt(2, pageSize);
				rs= ppst.executeQuery();
				while(rs.next()) {
					WorkInfo w1 = new WorkInfo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
					lists.add(w1);
				}
				for(int i = 0 ; i < lists.size() ; i++) {
					  System.out.println(lists.get(i).getWorkid());
					}
				page.setList(lists);
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
			return page;
			
		}
}

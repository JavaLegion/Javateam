package db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mchange.v2.c3p0.ComboPooledDataSource;

 //连接池获得的连接与关闭
public class JDBCUtil {
 //获得c3p0连接池对象
	   private static ComboPooledDataSource ds = new ComboPooledDataSource();	
//	获取数据库连接
	public static Connection getConnection(){
		Connection conn=null;
		try {
			conn= ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
 
	
//关闭连接
	public static void closeConn(Connection conn){
		try {
			if(conn!=null && conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// 3.1执行查询（select）语句获得结果集
		public static ResultSet executeQuery(PreparedStatement ppst) {
			ResultSet resultSet = null;
			try {
				resultSet = ppst.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return resultSet;
		}

		// 3.2执行非查询语句获得结果集
		public static int executeupdate(PreparedStatement ppst) {
			int i=0;
			try {
			 i = ppst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return i;
		}
		// 4.通过存储过程进行处理
			public static int executeProduse(Connection con, String str, Object[] obj) {
				try {
					str = "{call " + str + " }";
					System.out.println(str);
					CallableStatement sp = con.prepareCall(str);
					// 为sql赋值
					for (int i = 0; i <= obj.length - 1; i++) {
						sp.setObject(i + 1, obj[i]);
					}
					sp.execute();
					return 1;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("查询失败");
					return 0;
				}
			}
			// 5. 获取数据库操作
			public static PreparedStatement getPreparedStatement(Connection con, String sql, Object[] obj) {
				PreparedStatement pst = null;
				if (con != null) {
					try {
						pst = con.prepareStatement(sql);
						// 为sql赋值
						for (int i = 0; i < obj.length; i++) {
							pst.setObject(i + 1, obj[i]);
							System.out.println(obj[i]);
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				return pst;
			}
		
}


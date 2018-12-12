package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import dao.*;

/**
 * Servlet implementation class CheckStuIdController
 */
@WebServlet("/CheckStuIdController")
public class CheckStuIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckStuIdController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String checkStuId=request.getParameter("id").trim();//获取填写的用户名
		//得到是否有相同的用户名  ：ends="1"为有相同的，ends="0"为没有相同的，故可用
		String ends=StudentInfoDAO.checkStuId(checkStuId);
		String end="0";
		 boolean flag=false;
					if(end.equals(ends)){
						flag = true;   //用户名可用                            // equalsIgnoreCase 不区分字母的大小写  而 equals会区分字母大小写
					}else{
						flag = false;   //用户名不可用  
					}
					JSONObject json = new JSONObject();//使用json的格式法法
					json.put("flag", flag);
				PrintWriter out = response.getWriter();
				out.print(json.toString());
				out.close();
	
	}

}

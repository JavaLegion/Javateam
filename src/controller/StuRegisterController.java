package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.JDBCUtil;
import dao.StudentInfoDAO;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class StuRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StuRegisterController() {
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

		
//	request.setCharacterEncoding("UTF-8");
//	response.setContentType("text/html;charset=UTF-8");
//	String code = (String) request.getSession().getAttribute("code");
//	
//	String stunam1 = request.getParameter("stunam1").trim();
//	String stupsd1 = request.getParameter("stupsd1").trim();
//	String endrs = DBOperate.RegistPart(stunam1, stupsd1);
//	String codes=request.getParameter("checkCode").trim();
//
//	boolean aBoolean=false;
//	if (codes.equals(code)) {
//			aBoolean=true;
//	}
//	
//	if (endrs.equals("1")&&aBoolean) {
//		System.out.println("注册成功，请选择重新登录");
//		response.sendRedirect("Login.html");
//	}
//else { 
//		System.out.println("注册失败，请重新注册");
//		response.sendRedirect("Register.html");
//	}
//}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

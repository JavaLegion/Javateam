package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentInfoDAO;
/**
 * Servlet implementation class LoginController
 */
@WebServlet("/StuLoginController")
public class StuLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StuLoginController() {
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
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		 String stuid = request.getParameter("stuid").trim();
		 String stupsd = request.getParameter("psd").trim();
		 String checkcode = request.getParameter("checkcode").trim();
		 String code = (String) request.getSession().getAttribute("code");

		 //判断生成的验证码和填写的验证码是否正确
		 boolean aBoolean=false;
			if (code.equalsIgnoreCase(checkcode)) {
					aBoolean=true;
			}
		
	String	endrs=StudentInfoDAO.Loginpart(stuid, stupsd);
		
		if (endrs.equals("1")&&aBoolean) {
			 System.out.println("登录成功!!!");
			response.sendRedirect("Index.jsp");
		} else {
			 System.out.println("登录失败!!!");
			response.sendRedirect("LoginFai.jsp");
		}
	}
	}


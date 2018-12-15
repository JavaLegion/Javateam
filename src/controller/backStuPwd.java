package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentInfoDAO;

/**
 * Servlet implementation class backStuPwd
 */
@WebServlet("/backStuPwd")
public class backStuPwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public backStuPwd() {
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
		
		 String stuPhnum= request.getParameter("stuPhnum").trim();
		 String stuPsd = request.getParameter("newPwd1").trim();
		 String ends=StudentInfoDAO.backSutPwd( stuPhnum, stuPsd );
		 
		 if (ends.equals("1")) {
			 System.out.println("修改密码成功!!!");
			response.sendRedirect("changeSuc.jsp");
		} else {
			 System.out.println("修改密码失败!!!");
			response.sendRedirect("changeFail.jsp");
		}
	}
	

}

package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.sellerLoginService;
import service.stuLoginService;
/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginController() {
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
		
		String  num=request.getParameter("consumer");//获取选中的数字"1"
		
		System.out.println("num="+num);
		 String name = request.getParameter("id").trim();
		 String psd = request.getParameter("psd").trim();
		 
		 String checkCode = request.getParameter("checkcode").trim();//获取填写的验证码
		 String writeCode = (String) request.getSession().getAttribute("imgcode");//获取系统生成的验证码
		 Boolean checkCodeIStrue=stuLoginService.checkCodeIstrue(checkCode, writeCode);//2.判断验证码是否正确
		 System.out.println(" checkCodeIStrue="+ checkCodeIStrue);
		 if(num.equals("1")&&checkCodeIStrue) {
			 String end=stuLoginService.loginPart( name, psd);//学生登录的判断
				if(end.equals("1")){
					System.out.println("登录成功!!!");
					response.sendRedirect("IndexStu.jsp");
				} else {
					System.out.println("登录失败!!!");
					response.sendRedirect("LoginFai.jsp");
		}
	 }else if(num.equals("2")&&checkCodeIStrue) {
		 String end=sellerLoginService.loginPart(name, psd);//商家登录的判断
			if(end.equals("1")){
				System.out.println("登录成功!!!");
				response.sendRedirect("IndexMer.jsp");
			} else {
				System.out.println("登录失败!!!");
				response.sendRedirect("LoginFai.jsp");
				}
	 }else {
		 System.out.println("登录失败!!!");
			response.sendRedirect("LoginFai.jsp");
	 }


		 
		
	}
}


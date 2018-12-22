package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import service.sellerChangePwdService;
import dao.StudentInfoDAO;

/**
 * Servlet implementation class checkMerOldPwdController
 */
@WebServlet("/checkMerOldPwdController")
public class checkMerOldPwdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkMerOldPwdController() {
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
			
		String stuId=request.getParameter("stuId").trim();//获取填写的用户名
		String oldPwd=request.getParameter("oldPwd").trim();//获取填写的原密码
		String ends=sellerChangePwdService.checkOldPwd(stuId, oldPwd);
		String end="1";
		 boolean flag=false;
					if(end.equals(ends)){
						flag = true;   //原密码填写正确                        
					}else{
						flag = false;   //  原密码填写正错误
					}
					JSONObject json = new JSONObject();//使用json的格式法法
					json.put("flag", flag);
					System.out.println("flag="+flag);
				PrintWriter out = response.getWriter();
				out.print(json.toString());
				out.close();
	
	}

}

package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
/**
 * Servlet implementation class CheckPhoneController
 */
@WebServlet("/CheckPhoneCodeController")
public class CheckPhoneCodeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckPhoneCodeController() {
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
			String phoneCode=(String) request.getSession().getAttribute("phoneCode");//
			String checkCode=request.getParameter("checkCode").trim();//获取填写的验证码
			 boolean flag=false;
			  //和Session中的checkCode是否为一样
						if(checkCode.equals(phoneCode)){
							flag = true; //验证码正确                              // equalsIgnoreCase 不区分字母的大小写  而 equals会区分字母大小写
						}else{
							flag = false;   //验证码错误
						}
						JSONObject json = new JSONObject();//使用json的格式法法
						json.put("flag", flag);
					PrintWriter out = response.getWriter();
					out.print(json.toString());
					out.close();
					System.out.println("/checkphone,checkCode:"+checkCode);
					System.out.println("/checkphone,phoneCode:"+phoneCode);
					System.out.println(flag);
					
			
			
			
			
		
	}

}

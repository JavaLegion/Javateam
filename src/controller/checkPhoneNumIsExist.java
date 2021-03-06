package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.alibaba.fastjson.JSONObject;

import service.sellerBackPwdService;
import service.stuBackPwd;

/**
 * Servlet implementation class stuBackPwd
 */
@WebServlet("/checkStuPhnumIsExist")
public class checkPhoneNumIsExist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkPhoneNumIsExist() {
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
		
		String ends=null;
		 String stuPhnum = request.getParameter("stuPhnum").trim();
		 String consumerNum = request.getParameter("consumerNum").trim();
		 request.getSession().setAttribute("consumerNum", consumerNum);
//		 System.out.println("consumerNum="+consumerNum);
		 if(consumerNum.equals("1")) {
		  ends=stuBackPwd.stuBackPwdOfphoneNum(stuPhnum);
		  String end="1";
			 boolean flag=false;
						if(end.equals(ends)){
							flag = true;   //手机号填写正确                        
						}else{
							flag = false;   //手机号填写正错误
						}
						JSONObject json = new JSONObject();//使用json的格式法法
						json.put("flag", flag);
					PrintWriter out = response.getWriter();
					out.print(json.toString());
					out.close();
		  } else {
			 ends=sellerBackPwdService.sellerBackPwdOfphoneNum(stuPhnum);
			 String end="1";
			 boolean flag=false;
						if(end.equals(ends)){
							flag = true;   //手机号填写正确                        
						}else{
							flag = false;   //手机号填写正错误
						}
						JSONObject json = new JSONObject();//使用json的格式法法
						json.put("flag", flag);
					PrintWriter out = response.getWriter();
					out.print(json.toString());
					out.close();
		 }
	}
}

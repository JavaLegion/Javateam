package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.WorkInfo;
import dao.SystemDAO;

/**
 * Servlet implementation class DisplayDetails
 */
@WebServlet("/DisplayDetails")
public class DisplayDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println("jinru");
		try {
			String  workid=request.getParameter("workid");
			System.out.println(workid);
			List<WorkInfo> list=new ArrayList<>();
			list=SystemDAO.getNowDate(workid);
			request.setAttribute("userlist", list);
		}catch(NumberFormatException e) {

			e.printStackTrace();
		}
		request.getRequestDispatcher("JobMessage.jsp").forward(request,response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        


}}

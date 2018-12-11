package controller;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MerchantInfoDAO;

/**
 * Servlet implementation class ReleaseWorkController
 */
@WebServlet("/ReleaseWorkController")
public class ReleaseWorkController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReleaseWorkController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF=8");
		String workname = request.getParameter("workname");
		String worktime = request.getParameter("worktime");
		String sworkdate = request.getParameter("sworkdate");	 	
		String fworkdate = request.getParameter("fworkdate");	 
		String worksalary = request.getParameter("worksalary");
		String workreq =request.getParameter("workreq");
		try {
			MerchantInfoDAO.ReleaseWork(workname, worktime, sworkdate ,fworkdate, worksalary, workreq);
			response.sendRedirect("Index.jsp");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

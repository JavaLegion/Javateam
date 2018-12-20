package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Page;
import bean.WorkInfo;
import dao.StudentInfoDAO;

/**
 * Servlet implementation class MerSeekJob
 */
@WebServlet("/MerSeekJob")
public class MerSeekJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MerSeekJob() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String keyWord=request.getParameter("keyWord").trim();
		
		int currentPage=1;
		if(request.getParameter("currentPage")!=null){
			currentPage=Integer.parseInt(request.getParameter("currentPage"));
		}
		int totalcount = 20;
		Page<WorkInfo> page=new Page<WorkInfo>();
		System.out.println("keyWord`11:"+keyWord);
		page=StudentInfoDAO.seekJob(keyWord,currentPage,totalcount);
		request.setAttribute("pagemsg", page);
		request.setAttribute("keyWord", keyWord);
		request.getRequestDispatcher("IndexMer.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

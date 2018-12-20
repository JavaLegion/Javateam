package service;


import bean.Page;
import bean.WorkInfo;
import dao.StudentInfoDAO;


public class stuSeekJobService {
	//获得查找兼职时的所有兼职封装在lists上
	public static Page<WorkInfo> seekJob( String keyWord,int currentPage,int totalcount){
		Page<WorkInfo> page=StudentInfoDAO.seekJob(keyWord,currentPage,totalcount);
		return page;
		
	}
		
}

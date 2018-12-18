package service;

import java.util.List;

import bean.WorkInfo;
import dao.StudentInfoDAO;


public class studentService {
	
	public static List<WorkInfo> seekJob( String keyWord){
		List<WorkInfo> lists=StudentInfoDAO.seekJob(keyWord);
		return lists;
		
	}
}

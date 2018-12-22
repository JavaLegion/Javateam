package service;

import dao.StudentInfoDAO;
public class stuChangePwdService {
	
	//（填写ID 和原密码）修改密码
	public static String upDatePwd(String stuId,String stuPsd ) {
		String end=StudentInfoDAO.changePwd(stuId, stuPsd);
		return end;
		
	}
}

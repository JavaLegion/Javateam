package service;
import dao.StudentInfoDAO;
public class stuBackPwd {

	public static String stuBackPwdOfphoneNum(String stuPhnum) {
		String end=StudentInfoDAO.stuBackPwdOfphoneNum(stuPhnum);
		return end;
	}
	public static String stuBackPwd(String stuPhnum,String stuPwd) {
		String end=StudentInfoDAO.backStuPwd(stuPhnum, stuPwd);
		return end;
	}
}

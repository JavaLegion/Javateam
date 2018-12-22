package service;

import dao.MerchantInfoDAO;

public class sellerChangePwdService {

	//（填写ID 和原密码）修改密码
	public static String upDatePwd(String merpwd,String mernam ) {
		String end=MerchantInfoDAO.upDatePwd(merpwd, mernam);
		return end;
	}
	public static String checkOldPwd(String stuId,String oldPwd) {
		String end=MerchantInfoDAO.checkOldPwd(stuId, oldPwd);
		return end;
	}
}

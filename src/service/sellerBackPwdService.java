package service;

import dao.MerchantInfoDAO;
public class sellerBackPwdService {
	
	public static String sellerBackPwdOfphoneNum(String stuPhnum) {
		String end=MerchantInfoDAO.sellerBackPwdOfphoneNum(stuPhnum);
		return end;
	}
	public static String sellerBackPwd(String stuPhnum,String stuPwd) {
		String end=MerchantInfoDAO.backSellerPwd( stuPhnum, stuPwd);
		return end;
	}
}

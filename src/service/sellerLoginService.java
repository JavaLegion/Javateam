package service;

import dao.MerchantInfoDAO;
public class sellerLoginService {
	//商家登录
	public static String  loginPart(String id,String psd) {
		String	end=MerchantInfoDAO.MerchantLogin(id, psd);
		return end;
	}
}

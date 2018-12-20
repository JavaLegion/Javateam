package service;
import dao.MerchantInfoDAO;
public class sellerRegistService {
	
		public static String registPart(String sellId,String sellerPsd1,String selllPhnum) {
			String end=MerchantInfoDAO.MerchantRegist(sellId, sellerPsd1, selllPhnum);
			return end;
		}
}

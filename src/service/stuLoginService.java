package service;

import dao.StudentInfoDAO;

public class stuLoginService {

	
	//判断是否为学生
		public static Boolean isStu(String consumer) {
			Boolean isStu=false;
			if(consumer.equals("1")) {
				isStu=true;
			}else {
				isStu=false;
			}
			return isStu;
		}
		 //判断生成的验证码和填写的验证码是否正确
		public static Boolean checkCodeIstrue(String checkCode,String writeCode) {
		 boolean checkCodeIstrue=false;
			if (writeCode.equalsIgnoreCase(checkCode)) {
				checkCodeIstrue=true;
			}else {
				checkCodeIstrue=false;
			}
		return checkCodeIstrue;
		}
		//判断是否为学生and验证码是否正确
		public static Boolean IsStuAndcheckCode(Boolean isStu,Boolean checkCodeIStrue) {
			boolean  ends=false;
			if(isStu&&checkCodeIStrue) {
				ends=true;
				
			}else {
				ends=false;
			}
			return ends;
		}
		
		//学生登录
			public static String  loginPart(String stuid,String stupsd) {
				String	end=StudentInfoDAO.Loginpart(stuid, stupsd);
				return end;
			}
			
			
			
}

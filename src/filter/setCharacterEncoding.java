package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class setCharacterEncoding implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
        HttpServletRequest request2=(HttpServletRequest) arg0;//获取resquest对象
        HttpServletResponse response2=(HttpServletResponse) arg1;//获取response对象
        
        request2.setCharacterEncoding("UTF-8");  
        response2.setCharacterEncoding("UTF-8"); 
        
      //放行，通过了当前过滤器，递交给下一个filter进行过滤
        arg2.doFilter(request2, response2); 

  }
	

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}

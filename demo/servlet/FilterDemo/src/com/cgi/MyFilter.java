package com.cgi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class MyFilter
 */
public class MyFilter implements Filter {

    
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		System.out.println("address is"+request.getRemoteAddr());
		
		System.out.println("request time"+new java.util.Date());
		
		long requestTime=System.currentTimeMillis();
		
		chain.doFilter(request, response);
		
		long responseTime=System.currentTimeMillis();
		
		PrintWriter out=response.getWriter();
		//out.println("Hello from filter ");
		
		long timetaken=
				responseTime-requestTime;
		System.out.println("response time="+responseTime);
		System.out.println("Took "+timetaken+" milli seconds to process the request");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

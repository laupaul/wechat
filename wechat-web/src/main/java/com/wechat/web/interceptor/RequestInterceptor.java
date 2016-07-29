package com.wechat.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RequestInterceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = Logger.getLogger(RequestInterceptor.class);
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String requestURI=request.getRequestURI();
		if (requestURI.indexOf(".") == -1)
			logger.info(String.format("%s(%s)->%s", request.getRemoteAddr(), request.getMethod(), requestURI));
		return super.preHandle(request, response, handler);
	}
}

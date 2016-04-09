package jp.co.sample.framework.web.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * グローバルExceptionHandler<br/>
 *
 * @see GlobalExceptionHandler
 * @see HandlerExceptionResolver
 * @author shiromat55
 *
 */
@Deprecated
public class GlobalExceptionHandler implements HandlerExceptionResolver {

	/**
	 * {@inheritDoc}
	 * @see org.springframework.web.servlet.HandlerExceptionResolver#resolveException(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
										 HttpServletResponse response,
										 Object handler,
										 Exception ex) {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("forward:/error/othererror");

		return mv;
	}

}

package jp.co.sample.framework.web.servlet.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 【Model内プロパティ複合化・暗号化】Interceptor
 *
 * @see ComplexAndEncryptionInterceptor
 * @author shiromat55
 *
 */
public class ComplexAndEncryptionInterceptor implements HandlerInterceptor {

	/**
	 * リクエストハンドラ実行前処理。<br/>
	 * 本メソッドは、Controllerのリクエストハンドラ実行前に呼び出されます。<br/>
	 * <br/>
	 * {@inheritDoc}
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		System.out.println("aaaa");

		return true;
	}

	/**
	 * リクエストハンドラ実行後処理。<br/>
	 * 本メソッドは、Controllerのリクエストハンドラ実行後に呼び出されます。<br/>
	 * なお、呼び出しは、リクエストハンドラ正常終了時に限ります。<br/>
	 * <br/>
	 * {@inheritDoc}
	 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * リクエストハンドラ実行完了後処理。<br/>
	 * 本メソッドは、Controllerのリクエストハンドラ実行後に、正常終了・異常終了に関わらず呼び出されます。<br/>
	 * <br/>
	 * {@inheritDoc}
	 * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

		// 処理なし

	}
}

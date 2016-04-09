package jp.co.sample.framework.web.method;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controllerアドバイス。<br/>
 * グローバルな例外ハンドリング機能を提供します。
 * @see ControllerAdviceForExceptionHandler
 * @author shiromat55
 *
 */
@ControllerAdvice
public class ControllerAdviceForExceptionHandler {

	/**
	 * {@link java.lang.Exception Exception}クラスハンドリング処理。
	 *
	 * @param ex 例外エラー
	 * @return {@link ModelAndView}
	 */
	@ExceptionHandler(Exception.class)
	public ModelAndView exception(Exception ex) {

		ModelAndView mv = new ModelAndView();

		// メッセージを設定
		mv.addObject("exceptionMessage", ex.getMessage());

		// フォワード：その他エラー画面
		mv.setViewName("forward:/error/othererror");

		return mv;
	}
}

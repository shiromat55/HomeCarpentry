package jp.co.sample.framework.web.method;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.WebRequest;

/**
 * Controllerアドバイス。<br/>
 * グローバルなInitBinder機能を提供します。
 *
 * @see ControllerAdviceForInitBinder
 * @author shiromat55
 *
 */
@ControllerAdvice
public class ControllerAdviceForInitBinder {

	/**
	 * 型変換初期化処理。
	 * @param binder {@link WebDataBinder バインダー}
	 * @param request {@link WebRequest リクエスト}
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, WebRequest request) {

		this.registCustomDateEditor(binder);
	}

	/**
	 * {@link java.util.Date Date}クラス全般の型変換処理。
	 * @param binder {@link WebDataBinder バインダー}
	 */
	private void registCustomDateEditor(WebDataBinder binder) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		// false：厳密な解析
		sdf.setLenient(false);

		// カスタムエディターの登録
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
}

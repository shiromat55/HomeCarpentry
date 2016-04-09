package jp.co.sample.framework.web.method;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.WebRequest;

/**
 * コントローラーアドバイス。<br/>
 * グローバルなInitBinder機能を提供します。
 * @author 健
 *
 */
@ControllerAdvice
public class ControllerAdviceForInitBinder {

	/**
	 * 型変換初期化処理。
	 * @param binder バインダー
	 * @param request リクエスト
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, WebRequest request) {

		this.registCustomDateEditor(binder);

	}

	/**
	 * {@link java.util.Date Date}クラス全般の型変換処理。
	 * @param binder バインダー。
	 */
	private void registCustomDateEditor(WebDataBinder binder) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

		// false：厳密な解析
		sdf.setLenient(false);

		// カスタムエディターの登録
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
}

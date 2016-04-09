package jp.co.sample.framework.bind.support;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

/**
 * グローバルBinder。<br/>
 * 下記のクラスのバインドを行います。
 * <ul>
 * <li>{@link java.util.Date Date}</li>
 * </ul>
 * @see WebBindingInitializer
 * @author 健
 *
 */
@Deprecated
public class GlobalBindingInitializer implements WebBindingInitializer {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initBinder(WebDataBinder binder, WebRequest request) {

		// TODO: GlobalBindingInitializer 動作してくれない。。。

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

		// false：厳密な解析
		dateFormat.setLenient(false);

		// カスタムエディターの登録
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));

	}
}

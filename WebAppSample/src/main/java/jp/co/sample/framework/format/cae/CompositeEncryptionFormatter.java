package jp.co.sample.framework.format.cae;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

/**
 * 【複合化・暗号化】Formatter
 * @see CompositeEncryptionFormatter
 * @author shiromat55
 *
 */
public final class CompositeEncryptionFormatter implements Formatter<String> {

	/**
	 * オブジェクトを文字列に変換する。<br/>
	 * <br/>
	 * {@inheritDoc}
	 * @see org.springframework.format.Printer#print(java.lang.Object, java.util.Locale)
	 */
	@Override
	public String print(String object, Locale locale) {

		String result = "暗：" + object + "：暗";

		return result;
	}

	/**
	 * 文字列をオブジェクトに変換する。<br/>
	 * <br/>
	 * {@inheritDoc}
	 * @see org.springframework.format.Parser#parse(java.lang.String, java.util.Locale)
	 */
	@Override
	public String parse(String text, Locale locale) throws ParseException {

		String result = "複：" + text + "：複";

		return result;
	}
}

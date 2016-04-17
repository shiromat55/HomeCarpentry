package jp.co.sample.framework.format;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

/**
 *
 * @see ComplexAndEncryptionFormatter
 * @author shiromat55
 *
 */
public final class ComplexAndEncryptionFormatter implements Formatter<String> {

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

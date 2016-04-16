package jp.co.sample.common.util;

import org.springframework.validation.BindingResult;

import jp.co.sample.constants.MessageCode;

/**
 * メッセージユーティリティ。
 * @see MessageUtil
 * @author shiromat55
 *
 */
public class MessageUtil {

	/**
	 *
	 * @param result バインド結果
	 * @param filedName フィールド名
	 * @param message メッセージコード列挙体
	 * @param messageParam メッセージパラメータ
	 */
	public static void rejectValue(BindingResult result,
								   String filedName,
								   MessageCode message,
								   String... messageParam) {


		result.rejectValue(filedName, message.getCode(), messageParam, "メッセージが見つかりませんでした。。。");
	}
}

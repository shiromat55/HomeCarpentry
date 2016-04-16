package jp.co.sample.constants;

/**
 * メッセージコード列挙体。
 *
 * @see MessageCode
 * @author shiromat55
 *
 */
public enum MessageCode {

	/** {0}は必須です。 */
	W_0001("W_0001"),

	/** {0}の入力が誤っています。 */
	W_0002("W_0002");

	/** メッセージコード */
	private String code;

	/**
	 * コンストラクタ。
	 * @param code メッセージコード
	 */
	private MessageCode(String code) {
		this.code = code;
	}

	/**
	 * メッセージコードを取得します。
	 * @return
	 */
	public String getCode() {
		return this.code;
	}
}

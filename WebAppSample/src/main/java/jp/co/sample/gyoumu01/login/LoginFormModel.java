package jp.co.sample.gyoumu01.login;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 【ログイン画面】FormModel
 * @author 健
 *
 */
public class LoginFormModel {

	/** ログインID */
	@NotBlank(message = "入力は必須です。")
	private String id;

	/** パスワード */
	@NotBlank(message = "入力は必須です。")
	@Length(min = 6, max = 12, message = "{min}桁～{max}桁で入力して下さい。")
	private String password;

	/** アクション実行日 */
	private Date actionDate;

	/**
	 * ログインIDを取得します。
	 * @return ログインID
	 */
	public String getId() {
	    return id;
	}

	/**
	 * ログインIDを設定します。
	 * @param id ログインID
	 */
	public void setId(String id) {
	    this.id = id;
	}

	/**
	 * パスワードを取得します。
	 * @return パスワード
	 */
	public String getPassword() {
	    return password;
	}

	/**
	 * パスワードを設定します。
	 * @param password パスワード
	 */
	public void setPassword(String password) {
	    this.password = password;
	}

	/**
	 * アクション実行日を取得します。
	 * @return アクション実行日
	 */
	public Date getActionDate() {
	    return actionDate;
	}

	/**
	 * アクション実行日を設定します。
	 * @param actionDate アクション実行日
	 */
	public void setActionDate(Date actionDate) {
	    this.actionDate = actionDate;
	}
}

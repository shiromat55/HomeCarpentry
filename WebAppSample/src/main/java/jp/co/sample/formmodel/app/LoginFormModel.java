package jp.co.sample.formmodel.app;

import java.util.Date;

/**
 * 【ログイン画面】FormModel
 *
 * @see LoginFormModel
 * @author shiromat55
 *
 */
public class LoginFormModel {

	/** ログインID */
	private String id;

	/** パスワード */
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

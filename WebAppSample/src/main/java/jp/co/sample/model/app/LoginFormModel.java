package jp.co.sample.model.app;

import java.util.Date;
import java.util.List;

import jp.co.sample.beans.SampleBean;
import jp.co.sample.framework.web.bind.annotation.ComplexAndEncryption;

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

	/** 複合化／暗号化項目 */
	@ComplexAndEncryption
	private String caeTest;

	/**  */
	@ComplexAndEncryption
	private List<SampleBean> sampleList;

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

	/**
	 * 複合化／暗号化項目を取得します。
	 * @return 複合化／暗号化項目
	 */
	public String getCaeTest() {
	    return caeTest;
	}

	/**
	 * 複合化／暗号化項目を設定します。
	 * @param caeTest 複合化／暗号化項目
	 */
	public void setCaeTest(String caeTest) {
	    this.caeTest = caeTest;
	}

	/**
	 * sampleListを取得します。
	 * @return sampleList
	 */
	public List<SampleBean> getSampleList() {
	    return sampleList;
	}

	/**
	 * sampleListを設定します。
	 * @param sampleList sampleList
	 */
	public void setSampleList(List<SampleBean> sampleList) {
	    this.sampleList = sampleList;
	}
}

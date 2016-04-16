package jp.co.sample.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * 【ログインユーザ情報】Bean
 * @see LoginUserInfoBean
 * @author shiromat55
 *
 */
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class LoginUserInfoBean {

	/** ID */
	private String id;

	/** 名前 */
	private String name;

	/** ログイン状態 */
	private boolean loginState;

	/**
	 * IDを取得します。
	 * @return ID
	 */
	public String getId() {
	    return id;
	}

	/**
	 * IDを設定します。
	 * @param id ID
	 */
	public void setId(String id) {
	    this.id = id;
	}

	/**
	 * 名前を取得します。
	 * @return 名前
	 */
	public String getName() {
	    return name;
	}

	/**
	 * 名前を設定します。
	 * @param name 名前
	 */
	public void setName(String name) {
	    this.name = name;
	}

	/**
	 * ログイン状態を取得します。
	 * @return ログイン状態
	 */
	public boolean isLoginState() {
	    return loginState;
	}

	/**
	 * ログイン状態を設定します。
	 * @param loginState ログイン状態
	 */
	public void setLoginState(boolean loginState) {
	    this.loginState = loginState;
	}
}

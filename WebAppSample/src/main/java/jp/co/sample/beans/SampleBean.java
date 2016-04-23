package jp.co.sample.beans;

import jp.co.sample.framework.format.annotation.ComplexAndEncryption;

/**
 * 【サンプル】Bean
 *
 * @see SampleBean
 * @author shiromat55
 *
 */
public class SampleBean {

	/** hoge */
	@ComplexAndEncryption
	private String hoge;

	/**
	 * hogeを取得します。
	 * @return hoge
	 */
	public String getHoge() {
	    return hoge;
	}

	/**
	 * hogeを設定します。
	 * @param hoge hoge
	 */
	public void setHoge(String hoge) {
	    this.hoge = hoge;
	}

}

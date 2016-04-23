package jp.co.sample.beans;

import jp.co.sample.framework.web.bind.annotation.ComplexAndEncryption;

public class SampleBean {

	/**  */
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

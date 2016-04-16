package jp.co.sample.controller.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 【トップページ】Controller
 * @see TopController
 * @author shiromat55
 *
 */
@Controller
@RequestMapping(value = "/app/top")
public class TopController {

	/**
	 * 初期処理。
	 *
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index() {

		return "app/top";
	}
}

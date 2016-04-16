package jp.co.sample.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 【その他エラー画面】Controller
 *
 * @see OhterErrorController
 * @author shiromat55
 *
 */
@Controller
@RequestMapping("/error/othererror")
public class OhterErrorController {

	/**
	 * 初期処理。
	 *
	 * @param model モデル。
	 * @return ビュー名
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {

		return "error/otherError";
	}
}

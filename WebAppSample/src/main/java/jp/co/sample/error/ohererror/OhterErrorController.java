package jp.co.sample.error.ohererror;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 【エラー画面】Controller
 * @author 健
 *
 */
@Controller
@RequestMapping("/error/othererror")
public class OhterErrorController {

	/**
	 * 初期処理。
	 * @param model モデル。
	 * @return ビュー名
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {

		return "error/otherError";
	}
}

package jp.co.sample.controller.angular;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 【インデックスページ】Controller
 *
 * @see IndexController
 * @author shiromat55
 *
 */
@Controller
@RequestMapping(value = "/angular/index")
public class IndexController {

	/*----------------------------------------------------------------------
	 * リクエストハンドラ
	 ----------------------------------------------------------------------*/

	/**
	 * 初期処理。
	 *
	 * @return {@link ModelAndView}
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("angular/index");

		return mv;
	}
}

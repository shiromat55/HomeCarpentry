package jp.co.sample.controller.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.sample.constants.ModelAndViewKey;
import jp.co.sample.model.app.TopFormModel;

/**
 * 【トップページ】Controller
 * @see TopController
 * @author shiromat55
 *
 */
@Controller
@RequestMapping(value = "/app/top")
public class TopController {

	/*-----------------------------------------------------------------
	 *
	 -----------------------------------------------------------------*/

	/*-----------------------------------------------------------------
	 * リクエストハンドラ
	 -----------------------------------------------------------------*/

	/**
	 * 【初期処理】アクション。
	 *
	 * @return {@link ModelAndView}
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index() {

		// 返却値
		ModelAndView mv = new ModelAndView();

		// FormModelを生成
		TopFormModel formModel = new TopFormModel();
		formModel.setName("日本　太郎");

		// FormModelを設定
		mv.addObject(ModelAndViewKey.FORM_MODEL_KEY, formModel);

		// View名を設定
		mv.setViewName("app/top");

		return mv;
	}

	/**
	 * 【送信】アクション。
	 * @param formModel {@link TopFormModel}
	 * @return {@link ModelAndView}
	 */
	@RequestMapping(method = RequestMethod.GET, params = "send")
	public ModelAndView send(@ModelAttribute(ModelAndViewKey.FORM_MODEL_KEY) TopFormModel formModel) {

		ModelAndView mv = new ModelAndView();

		// FormModelの設定
		formModel.setName("送信　太郎");

		// View名を設定
		mv.setViewName("app/top");

		return mv;
	}
}

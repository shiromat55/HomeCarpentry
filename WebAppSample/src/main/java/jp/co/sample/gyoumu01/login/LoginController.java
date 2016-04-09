package jp.co.sample.gyoumu01.login;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 【ログイン画面】Controller
 * @author 健
 *
 */
@Controller
@RequestMapping(value = "/gyoumu01/login")
public class LoginController {

	/**
	 * 型変換初期化処理。
	 * @param binder バインダー
	 */
	@InitBinder("formModel")
	public void initBinder(WebDataBinder binder) {

		// ログインID、パスワードのみバインドを許可する。
		binder.setAllowedFields("id", "password");
		//binder.setDisallowedFields("actionDate");
	}


	/**
	 * モデルの前処理。<br/>
	 * ここは、Modelを生成し、返却する処理をコーディングする処理。<br/>
	 * よって、引数に@ModelAttribute("formModel")なんていう余計な事をする かつ InitBiderを削除した瞬間、なぜか404エラーが発生してこのクラスにすら到達しない意味不明現象が起きるので注意。
	 * @param formModel
	 * @return {@link LoginFormModel}
	 */
	@ModelAttribute("formModel")
	public LoginFormModel newRequest(@RequestParam(required = false, value="id") String id) {

		LoginFormModel result = new LoginFormModel();

		result.setActionDate(new Date());

		return result;
	}

	/**
	 * 初期処理。
	 * @param model モデル
	 * @return {@link ModelAndView}
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(@ModelAttribute("formModel") LoginFormModel formModel,
							  @RequestParam(required = false, value = "gaga") String gaga,
							  Model model) {

		//throw new RuntimeException("ほげ、ほげほげ！！");

		ModelAndView mv = new ModelAndView();

		mv.addObject("formModel", formModel);
		mv.setViewName("gyoumu01/login");

		return mv;
	}

	/**
	 * ログイン処理。
	 * @param formModel フォームモデル
	 * @param result バインド結果
	 * @param model モデル
	 * @param rAttr リダイレクト属性群
	 * @return {@link ModelAndView}
	 */
	@RequestMapping(params = "action_login", method = RequestMethod.POST)
	public ModelAndView login(@Valid @ModelAttribute("formModel") LoginFormModel formModel,
							  BindingResult result,
							  Model model,
							  RedirectAttributes rAttr) {

		ModelAndView mv = new ModelAndView();

		/*--------------------------------------------------------------
		 * バリデーション結果判定
		 --------------------------------------------------------------*/

		if (result.hasErrors()) {
			// ■エラー有り

			mv.addObject("message", "入力内容を確認して下さい。");

			return mv;
		}

		/*--------------------------------------------------------------
		 * リダイレクト属性群の設定
		 --------------------------------------------------------------*/

		// Flashスコープの設定
		rAttr.addFlashAttribute("message", "ログインに成功しました。");

		mv.setViewName("redirect:/gyoumu01/login");

		return mv;
	}
}

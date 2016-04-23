package jp.co.sample.controller.app;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.co.sample.beans.LoginUserInfoBean;
import jp.co.sample.beans.SampleBean;
import jp.co.sample.common.util.MessageUtil;
import jp.co.sample.constants.Message;
import jp.co.sample.framework.format.annotation.ComplexAndEncryption;
import jp.co.sample.model.app.LoginFormModel;

/**
 * 【ログイン画面】Controller
 *
 * @see LoginController
 * @see LoginUserInfoBean
 * @author shiromat55
 *
 */
@Controller
@RequestMapping(value = "/app/login")
public class LoginController {

	/*----------------------------------------------------------------------
	 * 変数(Autowired)
	 ----------------------------------------------------------------------*/

	/** ログインユーザ情報 */
	@Autowired
	private LoginUserInfoBean userInfo;

	/*----------------------------------------------------------------------
	 * 型変換初期処理
	 ----------------------------------------------------------------------*/

	/**
	 * 型変換初期化処理。
	 *
	 * @param binder {@link WebDataBinder}
	 */
	@InitBinder("formModel")
	public void initBinder(WebDataBinder binder) {

		// ログインID、パスワードのみバインドを許可する。
		//binder.setAllowedFields("id", "password");
		//binder.setDisallowedFields("actionDate");
	}

	/*----------------------------------------------------------------------
	 * モデルの前処理
	 ----------------------------------------------------------------------*/

	/**
	 * モデルの前処理。<br/>
	 * ここは、Modelを生成し、返却する処理をコーディングする処理。<br/>
	 * だからかは分からないが、引数に@ModelAttribute("formModel")なんていう余計な事をする かつ InitBiderを削除した瞬間、なぜか404エラーが発生してこのクラスにすら到達しない意味不明現象が起きるので注意。
	 *
	 * @return {@link LoginFormModel}
	 */
	@ModelAttribute("formModel")
	public LoginFormModel newRequest() {

		LoginFormModel result = new LoginFormModel();

		result.setActionDate(new Date());

		return result;
	}

	/*----------------------------------------------------------------------
	 * リクエストハンドラ
	 ----------------------------------------------------------------------*/

	/**
	 * 初期処理。
	 *
	 * @param formModel {@link LoginFormModel フォームモデル}
	 * @return {@link ModelAndView}
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(@ComplexAndEncryption @RequestParam(value = "test", required = false) String param,
							  @ModelAttribute("formModel") LoginFormModel formModel) {

		ModelAndView mv = new ModelAndView();

		formModel.setCaeTest("abc12345");

		formModel.setSampleList(new ArrayList<>());

		SampleBean sample = new SampleBean();
		sample.setHoge("hoge");
		formModel.getSampleList().add(sample);

		sample = new SampleBean();
		sample.setHoge("fuga");
		formModel.getSampleList().add(sample);

		mv.addObject("formModel", formModel);
		mv.setViewName("app/login");
		return mv;
	}

	/**
	 * ログイン処理。
	 *
	 * @param formModel {@link LoginFormModel フォームモデル}
	 * @param result {@link BindingResult バインド結果}
	 * @param webRequest {@link WebRequest Webリクエスト}
	 * @param session {@link HttpSession セッション}
	 * @param rAttr {@link RedirectAttributes リダイレクト属性群}
	 * @return {@link ModelAndView}
	 */
	@RequestMapping(params = "action_login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("formModel") LoginFormModel formModel,
							  BindingResult result,
							  WebRequest webRequest,
							  HttpSession session,
							  RedirectAttributes rAttr) {

		ModelAndView mv = new ModelAndView();

		/*--------------------------------------------------------------
		 * 入力チェック
		 --------------------------------------------------------------*/

		this.hasLoginError(formModel, result);

		if (result.hasErrors()) return mv;

		/*--------------------------------------------------------------
		 * セッション情報生成
		 --------------------------------------------------------------*/

		this.createSession(formModel, webRequest, session);

		/*--------------------------------------------------------------
		 * リダイレクト属性群の設定
		 --------------------------------------------------------------*/

		// Flashスコープの設定
		rAttr.addFlashAttribute("message", "ログインに成功しました。");

		mv.setViewName("redirect:/app/top");

		return mv;
	}

	/*----------------------------------------------------------------------
	 * private メソッド
	 ----------------------------------------------------------------------*/

	/**
	 * 【ログイン処理】の入力チェック処理。
	 * @param formModel {@link LoginFormModel フォームモデル}
	 * @param result {@link BindingResult バインド結果}
	 * @return チェック結果
	 */
	private boolean hasLoginError(LoginFormModel formModel, BindingResult result) {

		// 単項目チェック
		this.hasLoginTankomokuError(formModel, result);
		return result.hasErrors();

	}

	/**
	 * 単項目チェック
	 * @param formModel {@link LoginFormModel フォームモデル}
	 * @param result {@link BindingResult バインド結果}
	 * @return チェック結果
	 */
	private boolean hasLoginTankomokuError(LoginFormModel formModel, BindingResult result) {

		if (StringUtils.isEmpty(formModel.getId())) {
			MessageUtil.rejectValue(result, "id", Message.W_0001, "ログインID");
		}

		if (StringUtils.isEmpty(formModel.getPassword())) {
			MessageUtil.rejectValue(result, "password", Message.W_0001, "パスワード");
		}

		return result.hasErrors();
	}

	/**
	 * セッション情報を生成する。
	 * @param formModel {@link LoginFormModel フォームモデル}
	 * @param webRequest {@link WebRequest Webリクエスト}
	 * @param session {@link HttpSession セッション}
	 */
	private void createSession(LoginFormModel formModel, WebRequest webRequest, HttpSession session) {

		System.out.println("ログイン前セッションID：" + webRequest.getSessionId());

		// セッション情報を破棄・初期化
		session.invalidate();

		System.out.println("ログイン後セッションID：" + webRequest.getSessionId());

		this.userInfo.setId(formModel.getId());
		this.userInfo.setName("shiromat55");
		this.userInfo.setLoginState(true);
	}
}

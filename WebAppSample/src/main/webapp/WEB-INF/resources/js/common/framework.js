var fw = {

	/**
	 * 関数群
	 */
	fnc : {

		/**
		 * Ajaxオプション取得処理。
		 * @param source 個別指定のオプション。省略可能。
		 */
		getAjaxOption : function(source) {

			// Ajaxデフォルトオプションを取得
			var result = {
				type : 'GET',
				cache : false,
				success : function(data, dataType) {
					// デフォルトのため処理なし。
					//alert('defualt success');
				},
				error : function(xmlHttpRequest, textStatus, errorThrown) {
					// デフォルトのため処理なし。
					//alert('defualt error');
				},
				//timeout : 60000,
			}

			if(source != undefined) {

				// マージ
				$.extend(result, source);

			}

			return result;
		},
	},
};

/**
 * 全体共通の初期化処理。
 */
$(function(){


});
var bl = {

	/**
	 *
	 */
	fnc : {

		/**
		 * blWrapper divエレメント取得処理。
		 * @return blWrapper divエレメント
		 */
		getBlWrapper : function(target) {

			var result = null;
			var blWrapper = null;

			if (target == undefined) {



			} else {



			}

			return $('div[id=blWrapper]');
		},

		/**
		 * blHeaderArea divエレメント取得処理。
		 * @return blHeaderArea divエレメント
		 */
		getBlHeaderArea : function() {

			var blWrapper = bl.fnc.getBlWrapper();

			return blWrapper.find('div[id=blHeaderArea]');
		},
		/**
		 * blMainContentsArea divエレメント取得処理。
		 * @return blMainContentsArea divエレメント
		 */
		getBlMainContentsArea : function(target) {

			var result = null;
			var blWrapper = null;

			if (target == undefined) {

				blWrapper = bl.fnc.getBlWrapper();

			} else {

				blWrapper = bl.fnc.getBlWrapper();

			}

			result = blWrapper.find('div[id=blMainContentsArea]');

			return result;
		},
		/**
		 * blFooterArea divエレメント取得処理。
		 * @return blFooterArea divエレメント
		 */
		getBlFooterArea : function() {

			var blWrapper = bl.fnc.getBlWrapper();

			return blWrapper.find('div[id=blFooterArea]');
		},
	},
}
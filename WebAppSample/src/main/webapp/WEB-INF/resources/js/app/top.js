$(function(){

	var blMainContentsArea = $('div#blMainContentsArea');

	var form = $('form#formModel');

	// 送信ボタン
	blMainContentsArea.find('button#send').first().click(function(e){

		// ajaxオプションを生成
		var option = fw.fnc.getAjaxOption({

			url : '/WebAppSample/app/top?send',
			data : form.serialize(),
			success : function(data, dataType) {

				var resMainContentsArea = $(data).find('div#blMainContentsArea');

				blMainContentsArea.html(resMainContentsArea.html());

			},
			error : function(xmlHttpRequest, textStatus, errorThrown) {

				alert('error');

			},
		});

		// 通信開始
		$.ajax(option);

		return e.preventDefault();
	});
});

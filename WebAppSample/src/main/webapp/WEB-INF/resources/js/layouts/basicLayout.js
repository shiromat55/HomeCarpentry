$(function(){

	// 日本語を有効化
	$.datepicker.setDefaults($.datepicker.regional['ja']);

	// 日付選択ボックスを生成
	$('#dateText').datepicker({ dateFormat: 'yy/mm/dd' });
});

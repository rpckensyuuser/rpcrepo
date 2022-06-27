$(function() {
	document.querySelector(`input[type='checkbox'][id="check3"]`).checked = true;
	$('input[id="check5"]').prop('checked', true);
});

function ButtonClick1() {
	// IDがname1のHTMLElementを取得して、テキストに「JavaScriptで表示」を設定
	document.getElementById("name1").value = "JavaScriptで表示";
}

function ButtonClick2() {
	// IDがname2のHTMLElementを取得して、テキストに「jQueryで表示」を設定
	$("#name2").val("jQueryで表示");
}

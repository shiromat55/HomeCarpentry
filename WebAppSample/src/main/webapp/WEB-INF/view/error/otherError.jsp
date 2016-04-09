<!DOCTYPE html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>${title}</title>
		<style>
			h1 { font-size:16px; background-color:#CCCCFF; padding:3px;}
			p { color:#000066;}
		</style>
	</head>

	<body>

		<h1>その他エラー画面</h1>
		<p>例外エラーが発生しました。</p>
		<p>メッセージ：${exceptionMessage}</p>

	</body>

</html>
<!DOCTYPE html>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

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

		<!--  -->
		<div id="basicLayoutWrapper">

			<%-- ヘッダエリア --%>
			<div id="basicLayoutHeaderArea">
				<p style="color:bulue">ヘッダ部分</p>
			</div>

			<%-- エラーメッセージエリア --%>
			<div id="basicLayoutErrorMessageArea">

			</div>

			<%-- コンテンツメインエリア --%>
			<div id="basicLayoutMainContentsArea">

			</div>

			<!-- フッタエリア -->
			<div id="basicLayoutFooterArea">
				<p style="color:green">フッタ部分</p>
			</div>

		</div>

	</body>

</html>
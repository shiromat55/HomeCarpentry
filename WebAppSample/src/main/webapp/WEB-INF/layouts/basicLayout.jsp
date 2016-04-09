<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><tiles:insertAttribute name="pageTitle" /> </title>
	</head>

	<body id="blBody" class="blBody">

		<div id="blWrapper" class="blWrapper">

			<!-- ヘッダエリア -->
			<div id="blHeaderArea" class="blHeaderArea">
				<p style="color:blue">ヘッダエリア</p>
				<p style="color:yellow"></p>
			</div>

			<!-- エラーメッセージエリア -->
			<div id="blErrorMessageArea" class="blErrorMessageArea">
				<p style="color:red">エラーメッセージエリア</p>
			</div>

			<!-- メインコンテンツエリア -->
			<div id="blMainContentsArea" class="blMainContentsArea">
				<tiles:insertAttribute name="mainContents" />
			</div>

			<!-- フッタエリア -->
			<div id="blFooterArea" class="blFooterArea">
				<p style="color:green">フッタエリア</p>
			</div>

		</div>

	</body>

</html>
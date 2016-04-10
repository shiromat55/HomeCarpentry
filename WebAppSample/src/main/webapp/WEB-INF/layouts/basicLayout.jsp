<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<%-- タイトル --%>
		<title>
			<tiles:getAsString name="pageTitle" />
		</title>

		<%-- stylesheet(generalStylesheet) --%>
		<tiles:importAttribute name="generalStylesheet" />
		<c:if test="${!empty generalStylesheet}">
			<c:forEach var="item" items="${generalStylesheet}" varStatus="status">
				<link href="<spring:url value="${item}"/>" rel="stylesheet" />
			</c:forEach>
		</c:if>

		<%-- stylesheet(personalStylesheet) --%>
		<c:if test="${!empty personalStylesheet}">
			<c:forEach var="item" items="${personalStylesheet}" varStatus="status">
				<link href="<spring:url value="${item}"/>" rel="stylesheet" />
			</c:forEach>
		</c:if>

		<%-- javascript(generalJavascript) --%>
		<tiles:importAttribute name="generalJavascript" />
		<c:if test="${!empty generalJavascript}">
			<c:forEach var="item" items="${generalJavascript}" varStatus="status">
				<script type="text/javascript" charset="UTF-8" src="<spring:url value="${item}"/>"></script>
			</c:forEach>
		</c:if>

		<%-- javascript(personalJavascript) --%>
		<tiles:importAttribute name="personalJavascript" />
		<c:if test="${!empty personalJavascript}">
			<c:forEach var="item" items="${personalJavascript}" varStatus="status">
				<script type="text/javascript" charset="UTF-8" src="<spring:url value="${item}"/>"></script>
			</c:forEach>
		</c:if>

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
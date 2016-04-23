<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

	<!-- HEAD -->
	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<!-- タイトル -->
		<title>ログイン画面</title>

		<!-- stylesheet(personalStylesheet) -->
		<link href="<spring:url value="/resources/css/app/login.css"/>" rel="stylesheet" />

	</head>

	<!-- BODY -->
	<body>

		<p>アクション実行日(Binder)：<spring:bind path="formModel.actionDate">${status.value}</spring:bind> </p>
		<p>アクション実行日(Actual)：<spring:bind path="formModel.actionDate">${status.actualValue}</spring:bind></p>
		<p>${message}</p>

		<!-- ▼FORM▼ -->
		<form:form modelAttribute="formModel">

			<!-- エラーメッセージエリア -->
			<form:errors path="*" cssStyle="color:red" />

			<%-- InitBinderでバインドを拒否するためのサンプル --%>
			<form:hidden path="actionDate" />

			<%-- 暗号化・複合化サンプル --%>
			<form:hidden path="caeTest" />

			<c:forEach var="item" items="${formModel.sampleList}" varStatus="status">
				<form:hidden path="sampleList[${status.index}].hoge" />
			</c:forEach>

			<table border="1">

				<tr>
					<td>
						<form:label path="id">ログインID</form:label>
					</td>
					<td>
						<form:input path="id"/>
					</td>
				</tr>

				<tr>
					<td>
						<form:label path="password">パスワード</form:label>
					</td>
					<td>
						<form:password path="password" size="20"/>
					</td>
				</tr>

				<tr>
					<td colspan="2">
						<form:button name="action_login">ログイン</form:button>
					</td>
				</tr>

			</table>

		</form:form>
		<!-- ▲FORM▲ -->

	</body>

</html>

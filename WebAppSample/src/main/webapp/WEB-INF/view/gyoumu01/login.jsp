<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<h1>${title}</h1>
<p>アクション実行日(Binder)：<spring:bind path="formModel.actionDate">${status.value}</spring:bind> </p>
<p>アクション実行日(Actual)：<spring:bind path="formModel.actionDate">${status.actualValue}</spring:bind></p>
<p>${message}</p>

<form:form modelAttribute="formModel">

	<%-- JQueryUIのDatePickerを使ってみる --%>
	<input type="text" id="dateText" size="20" />

	<%-- InitBinderでバインドを拒否するためのサンプル --%>
	<form:hidden path="actionDate" />

	<table border="1">

		<tr>
			<td>
				<form:label path="id">ログインID</form:label>
			</td>
			<td>
				<form:input path="id"/>
				<form:errors path="id" cssStyle="color:red" />
			</td>
		</tr>

		<tr>
			<td>
				<form:label path="password">パスワード</form:label>
			</td>
			<td>
				<form:password path="password" size="20"/>
				<form:errors path="password" cssStyle="color:red" />
			</td>
		</tr>

		<tr>
			<td colspan="2">
				<form:button name="action_login">ログイン</form:button>
			</td>
		</tr>

	</table>

</form:form>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<form:form modelAttribute="formModel">

	<h1>トップページ</h1>

	<%-- JQueryUIのDatePickerを使ってみる --%>
	<input type="text" id="dateText" size="20" />

	<form:input path="name"/>

	<form:button id="send" name="send">送信</form:button>

</form:form>

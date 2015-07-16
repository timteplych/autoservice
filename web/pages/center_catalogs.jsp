<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 13.07.2015
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@page import="ru.ttv.beans.CustomerBean" %>
<jsp:useBean id="customerBean" class="ru.ttv.beans.CustomerBean" scope="page"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="accountobjectlist.jsp" %>
<c:forEach var="item" items="${customerBean.customerList}">
  <c:out value="${item.key}"/>, <c:out value="${item.value}"/>
</c:forEach>

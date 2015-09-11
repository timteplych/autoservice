<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 13.07.2015
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@page import="ru.ttv.beans.EntityBean" %>
<jsp:useBean id="entityBean" class="ru.ttv.beans.EntityBean" scope="page"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="main-wrapper">
  <div class="leftsidebar">
    <%@include file="accountobjectlist.jsp" %>
  </div>
  <div class="center-wrapper">
    <div class="entitylist">
      <h3><c:out value="${entityBean.getCaption(param.catalog)}"/></h3>
      <ul>
        <c:forEach var="item" items="${entityBean.getEntityList(param.catalog)}">
          <li><a href="../pages/entity.jsp?id=${item.key}&entitytype=${param.catalog}">${item.value}</a></li>
        </c:forEach>
      </ul>
    </div>
  </div>
</div>
<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 17.07.2015
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="ru.ttv.beans.EntityBean" %>
<jsp:useBean id="entityBean" class="ru.ttv.beans.EntityBean" scope="page"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="main-wrapper">
  <div class="leftsidebar">
    <%@include file="accountobjectlist.jsp" %>
  </div>
  <div class="center-wrapper">
    <div class="entitycontent">
      <c:if test="${param.entitytype == 'customers' }">
        <%@include file="entity_customer.jsp" %>
      </c:if>
      <c:if test="${param.entitytype == 'cars' }">
        <%@include file="entity_cars.jsp" %>
      </c:if>
      <c:if test="${param.entitytype == 'models' }">
        <%@include file="entity_models.jsp" %>
      </c:if>
      <c:if test="${param.entitytype == 'goods' }">
        <%@include file="entity_goods.jsp" %>
      </c:if>
      <c:if test="${param.entitytype == 'jobs' }">
        <%@include file="entity_jobs.jsp" %>
      </c:if>
      <c:if test="${param.entitytype == 'staff' }">
        <%@include file="entity_staff.jsp" %>
      </c:if>
      <c:if test="${param.entitytype == 'users' }">
        <%@include file="entity_users.jsp" %>
      </c:if>
    </div>
  </div>
</div>

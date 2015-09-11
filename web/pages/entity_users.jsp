<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 28.07.2015
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
  <c:set var="user" scope="page" value="${entityBean.getUserByID(param.id)}" />
  <h3>Справочник: Пользователи</h3>
  <div class="entity-wrapper">
    <form class="entity" action="" method="post">

      <div class="entity-field">
        <label for="entity-id">ID: </label>
        <input class="entity-input" type="text" name="entity-id" value="${user.id}">
      </div>

      <div class="entity-field">
        <label for="entity-username">Имя пользователя: </label>
        <input class="entity-input" type="text" name="entity-username" value="${user.username}">
      </div>
      <div class="entity-field">
        <label for="entity-userprivilege">Уровень прав: </label>
        <input class="entity-input" type="text" name="entity-userprivilege" value="${user.userprivilege}">
      </div>
      <div class="entity-field">
        <label for="entity-password">Пароль: </label>
        <input class="entity-input" type="text" name="entity-password" value="${user.userPassword}">
      </div>
    </form>

  </div>

</div>

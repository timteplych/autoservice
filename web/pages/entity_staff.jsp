<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 28.07.2015
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
  <c:set var="staff" scope="page" value="${entityBean.getStaffByID(param.id)}" />
  <h3>Справочник: Персонал</h3>
  <div class="entity-wrapper">
    <form class="entity" action="" method="post">

      <div class="entity-field">
        <label for="entity-id">ID: </label>
        <input class="entity-input" type="text" name="entity-id" value="${staff.id}">
      </div>

      <div class="entity-field">
        <label for="entity-name">Наименование: </label>
        <input class="entity-input" type="text" name="entity-name" value="${staff.name}">
      </div>
      <div class="entity-field">
        <label for="entity-dateofbirth">Дата рождения: </label>
        <input class="entity-input" type="text" name="entity-dateofbirth" value="${staff.dateOfBirth}">
      </div>
      <div class="entity-field">
        <label for="entity-user">Пользователь: </label>
        <input class="entity-input" type="number" name="entity-user" value="${staff.user}">
      </div>
    </form>

  </div>

</div>

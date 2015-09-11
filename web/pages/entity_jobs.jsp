<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 28.07.2015
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
  <c:set var="jobItem" scope="page" value="${entityBean.getJobByID(param.id)}" />
  <h3>Справочник: Товары</h3>
  <div class="entity-wrapper">
    <form class="entity" action="" method="post">

      <div class="entity-field">
        <label for="entity-id">ID: </label>
        <input class="entity-input" type="text" name="entity-id" value="${jobItem.id}">
      </div>

      <div class="entity-field">
        <label for="entity-name">Наименование: </label>
        <input class="entity-input" type="text" name="entity-name" value="${jobItem.name}">
      </div>
      <div class="entity-field">
        <label for="entity-description">Описание: </label>
        <input class="entity-input" type="text" name="entity-description" value="${jobItem.description}">
      </div>
      <div class="entity-field">
        <label for="entity-rate">Норма времени: </label>
        <input class="entity-input" type="number" name="entity-rate" value="${jobItem.rate}">
      </div>
    </form>

  </div>

</div>

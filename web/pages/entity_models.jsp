<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 26.07.2015
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
  <c:set var="carmodel" scope="page" value="${entityBean.getCarModelByID(param.id)}" />
  <h3>Справочник: Модели автомобилей</h3>
  <div class="entity-wrapper">
    <form class="entity" action="" method="post">

      <div class="entity-field">
        <label for="entity-id">ID: </label>
        <input class="entity-input" type="text" name="entity-id" value="${carmodel.id}">
      </div>

      <div class="entity-field">
        <label for="entity-name">Наименование: </label>
        <input class="entity-input" type="text" name="entity-name" value="${carmodel.modelName}">
      </div>

    </form>

  </div>

</div>

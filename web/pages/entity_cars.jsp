<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 26.07.2015
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
  <c:set var="car" scope="page" value="${entityBean.getCarByID(param.id)}" />
  <h3>Справочник: Автомобили</h3>
  <div class="entity-wrapper">
    <form class="entity" action="" method="post">

      <div class="entity-field">
        <label for="entity-id">ID: </label>
        <input class="entity-input" type="date" name="entity-id" value="${car.id}">
      </div>

      <div class="entity-field">
        <label for="entity-name">Наименование: </label>
        <input class="entity-input" type="text" name="entity-name" value="${car.name}">
      </div>

      <div class="entity-field">
        <label for="entity-model">Модель: </label>
        <input class="entity-input" type="text" name="entity-model" value="${car.model}">
      </div>

      <div class="entity-field">
        <label for="entity-customer">Владелец: </label>
        <input class="entity-input" type="text" name="entity-customer" value="${car.customer}">
      </div>

      <div class="entity-field">
        <label for="entity-author">Автор: </label>
        <input class="entity-input" type="text" name="entity-author" value="${car.author}">
      </div>

      <div class="entity-field">
        <label for="entity-statenumber">Гос номер: </label>
        <input class="entity-input" type="text" name="entity-statenumber" value="${car.stateNumber}">
      </div>

      <div class="entity-field">
        <label for="entity-vin">VIN: </label>
        <input class="entity-input" type="text" name="entity-vin" value="${car.VIN}">
      </div>

    </form>

  </div>

</div>
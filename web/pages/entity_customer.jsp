<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 17.07.2015
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
  <c:set var="customer" scope="page" value="${entityBean.getCustomerByID(param.id)}" />
  <h3>Справочник: Контрагенты</h3>
  <div class="entity-wrapper">
    <form class="entity" action="" method="post">

      <div class="entity-field">
      <label for="entity-name">Наименование: </label>
      <input class="entity-input" type="text" name="entity-name" value="${customer.name}">
      </div>

      <div class="entity-field">
      <label for="entity-creationdate">Дата создания: </label>
      <input class="entity-input" type="date" name="entity-creationdate" value="${customer.creationDate}">
      </div>

      <div class="entity-field">
      <label for="entity-bank">Банк: </label>
      <input class="entity-input" type="text" name="entity-bank" value="${customer.bank}">
      </div>

      <div class="entity-field">
      <label for="entity-author">Автор: </label>
      <input class="entity-input" type="text" name="entity-author" value="${customer.author}">
      </div>

      <div class="entity-field">
      <label for="entity-adress">Адрес: </label>
      <input class="entity-input" type="text" name="entity-adress" value="${customer.adress}">
      </div>

      <div class="entity-field">
      <label for="entity-phones">Контактные телефоны: </label>
      <input class="entity-input" type="text" name="entity-phones" value="${customer.phones}">
      </div>

      <div class="entity-field">
      <label for="entity-fullname">Полное наименование: </label>
      <input class="entity-input" type="text" name="entity-fullname" value="${customer.fullName}">
      </div>

      <div class="entity-field">
      <label for="entity-othercontacts">Дополнительные контакты: </label>
      <input class="entity-input" type="text" name="entity-othercontacts" value="${customer.othercontacts}">
      </div>
      <div class="entity-button">
        <input class="button" type="submit" value="Записать">
      </div>
    </form>

  </div>

</div>


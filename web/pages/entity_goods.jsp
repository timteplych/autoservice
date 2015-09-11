<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 28.07.2015
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
  <c:set var="goodsItem" scope="page" value="${entityBean.getGoodsItemByID(param.id)}" />
  <h3>Справочник: Товары</h3>
  <div class="entity-wrapper">
    <form class="entity" action="" method="post">

      <div class="entity-field">
        <label for="entity-id">ID: </label>
        <input class="entity-input" type="text" name="entity-id" value="${goodsItem.id}">
      </div>

      <div class="entity-field">
        <label for="entity-name">Наименование: </label>
        <input class="entity-input" type="text" name="entity-name" value="${goodsItem.name}">
      </div>
      <div class="entity-field">
        <label for="entity-purchaseprice">Цена покупки: </label>
        <input class="entity-input" type="number" name="entity-purchaseprice" value="${goodsItem.purchasePrice}">
      </div>
      <div class="entity-field">
        <label for="entity-price">Цена: </label>
        <input class="entity-input" type="number" name="entity-price" value="${goodsItem.price}">
      </div>
    </form>

  </div>

</div>
<%--
  Created by IntelliJ IDEA.
  User: user1
  Date: 30.06.2015
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <link type="text/css" href="style/style.css" rel="stylesheet" />
  </head>
  <body>
    <div class="wrapper">
      <div class="main">
        <div class="header">
          <h2>Автосервис</h2>
          <h3>Пожалуйста, авторизуйтесь</h3>
        </div>
        <div>
          <form class="login" action="pages/main.jsp" method="post">
            <label class="label" for="username">Имя пользователя</label>
            <div><input class="input" type="text" name="username" /></div>
            <label class="label" for="password">Пароль</label>
            <div><input class="input" type="password" name="password"/></div>
            <div><input class="button" type="submit" value="Войти"/></div>
          </form>
        </div>
      </div>
    </div>
  </body>
</html>

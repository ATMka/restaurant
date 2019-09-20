<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <link href="css/main.css" rel="stylesheet">
</head>
    <body>
       <div class="main-form">
       <div>Пользователь: ${userName}</div><a href="/logout">Выход</a>
                <ul>
                    <li><a href="/main">Главная</a></li>
                    <li><a href="/login">Вход</a></li>
                    <li><a href="/registration">Регистрация</a></li>
                    <li><a href="">Меню</a></li>
                    <li><a href="">Корзина</a></li>
                </ul>
       </div>
    </body>
</html>

<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <link href="/css/main.css" method="post" rel="stylesheet">
</head>
    <body>
        <form action="/login" class="form">
                <h1>Авторизация</h1>
                <p>
                    <input id ="login" type="text" name="login" placeholder="Логин">
                </p>
                <p>
                    <input type="password" name='password' placeholder="Пароль">
                </p>
                <p>
                    <input type="submit" name="submit" value="Вход">
                    <input type="button" name="registration" value="Регистрация" onclick="location.href='registration.html'">
                </p>
                <p>
                ${errorMsg}
                </p>
        </form>
    </body>
</html>

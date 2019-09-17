<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <link href="/css/main.css" rel="stylesheet">
</head>
    <body>
        <form class="form">
                <h1>Авторизация</h1>
                <p>
                    <input type="text" name="login" placeholder="Логин" required>
                </p>
                <p>
                    <input type="password" name='password' placeholder="Пароль" required>
                </p>
                <p>
                    <input type="submit" name="submit" value="Вход">
                    <input type="button" name="registration" value="Регистрация" onclick="location.href='registration.html'">
                </p>
        </form>
    </body>
</html>

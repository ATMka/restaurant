<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <link href="css/main.css" rel="stylesheet">
</head>
    <body>
        <form action="registration" method="post" class="form" >
                <h1>Регистрация</h1>
                <p>
                    <input id="login"type="text" name="login" placeholder="Логин" required>
                </p>
                <p>
                    <input id="password" type="password" name="password" placeholder="Пароль" required>
                </p>
                <p>
                    <input type="submit" name="submit" value="Регистрация">
                    <input type="button" name="cancel" value="Назад"  onclick="location.href='/login'">
                </p>
        </form>
        	<c:forEach var="error" items="${errors}">
        			${error.defaultMessage}<br>
        	</c:forEach>
        	${errorMsg}
    </body>
</html>

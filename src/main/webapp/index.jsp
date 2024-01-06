<%-- 
    Document   : index
    Created on : Oct 31, 2023, 7:39:36 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <<body>
        <form action="login" method="post">
            <h1>Đăng Nhập</h1>
            <table>
                <tr>
                    <td> Username:</td>
                    <td><input type="text" name="username" value="" required=""/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" value="" required=""/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" /></td>
                    <td><input type="reset" value="Cancel" /></td>
                </tr>
            </table>
        </form>
        <a href="Register.jsp">Đăng Ký</a>
    </body>
</html>

<%-- 
    Document   : register
    Created on : Oct 10, 2023, 5:56:20 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng Ký</title>

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

        <style>
            form {
                max-width: 500px;
                margin: 0 auto;
            }
        </style>


    </head>
    <body>

        <div class="container mt-5">

            <form  action="register" method="post" id="register-form">

                <h1 class="text-center mb-4">Đăng Ký</h1>

                <table width="400">

                    <tr>
                        <td>Tên đăng nhập:</td>
                        <td><input type="text" name="username" required></td>
                    </tr>
                    <tr>
                        <td>Mật khẩu:</td>
                        <td><input type="password" name="password" required>
                    </tr>

                </table>

                <button class="btn btn-primary">Đăng ký</button>
            </form>

        </div>

    </body>
</html>

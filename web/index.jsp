<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01/06/2020
  Time: 15:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Tính Giảm giá</title>
  </head>
  <body>
  <h1>Tính giảm giá và giá sau giảm</h1>
  <span style="alignment: center">
    <form action="/calculator" method="post">
    Product description: <input type="text" name ="description" placeholder="Mô tả sản phẩm"><br>
    Giá niêm yết: <input type="number" name = "price" placeholder="Giá theo list"><br>
    Discount percent: <input type="number" name ="discount" placeholder="% Giảm"><br>
    <input type="submit" name="calculator" value="Tính tiền">
    </form>
  </span>
  </body>
</html>

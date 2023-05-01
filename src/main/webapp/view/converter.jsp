<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/1/2023
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h2>Currency Converter</h2>
<form>
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
    <h3>So vnd laf : ${vnd}</h3>
</form>
</body>
</html>

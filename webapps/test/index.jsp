<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Jsp</title>
</head>
<body>
<h1>Jsp</h1>
<%
    out.write("ClassLoader: " + this.getClass().getClassLoader());
%>
</body>
</html>

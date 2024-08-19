<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 8/12/2024
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Kết quả</h1>
<%-- Kiểm tra nếu dictionary không null --%>
<c:if test="${dictionary != null}">
    <p>Từ tiếng Việt: ${dictionary.vietnamese}</p>
</c:if>

<%-- Nếu dictionary null, hiển thị thông báo --%>
<c:if test="${dictionary == null}">
    <p>Không tìm thấy kết quả cho từ này.</p>
</c:if>
<a href="/dictionarys">Tiếp tục tìm kiếm</a>
</body>
</html>

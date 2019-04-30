<%--
  Created by IntelliJ IDEA.
  User: taoooo
  Date: 2019-04-19
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    定时任务已完成，正在重复计算中1111
</h1>
<script>
    setTimeout(function toMain() {
        window.location.href="${cp}/main";
    }, 1800000);

</script>
</body>
</html>

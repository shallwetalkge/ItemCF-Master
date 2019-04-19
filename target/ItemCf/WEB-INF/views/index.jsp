<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<body>
<h2>定时任务已开启，正在计算中</h2>
</body>
<script>
    toMain();
    function toMain() {
        window.location.href="${cp}/main";
    }
</script>
</html>

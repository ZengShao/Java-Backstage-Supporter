<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
</head>
<body>
    <h1>主界面,ts=<%=System.currentTimeMillis()%>，<a href="${ctx}/admin/logout">退出</a>系统</h1>
    <h1>欢迎您：[${admin.adminName}]</h1>
</body>
</html>
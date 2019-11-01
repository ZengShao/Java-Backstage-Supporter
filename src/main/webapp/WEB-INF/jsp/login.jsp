<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <%@include file="/common/head.jsp"%>
</head>
<body>
    <h1>用户登陆[${admin.adminName}],ts=<%=System.currentTimeMillis()%></h1>
    <div style="color:red">${message}</div>
    <f:form method="post" action="${ctx}/admin/login" modelAttribute="admin">
        adminname:<f:input path="adminName"/><br>
        password:<f:input path="adminPassword"/><br>
        <input type="submit" value="ok">
    </f:form>
</body>
</html>

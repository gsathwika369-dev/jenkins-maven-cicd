<%@ page import="com.student.app.GreetingService" %>
<%
    GreetingService service = new GreetingService();
%>
<html>
<head><title>Jenkins CI/CD Assignment</title></head>
<body style="font-family: sans-serif; margin: 40px;">
    <h1><%= service.getGreeting() %></h1>
    <h2>Build Version: <%= service.getVersion() %></h2>
    <p>Server time: <%= new java.util.Date() %></p>
</body>
</html>


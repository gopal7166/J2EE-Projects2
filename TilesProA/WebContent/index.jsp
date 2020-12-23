<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>Login Page</title>
	</head>
	
	<body>
		<h2>Struts 2 - Login Form</h2>
			<s:actionerror />
			<s:form action="login.action" method="post">
				<s:textfield label="Enter Username" key="username" size="20" />
				<s:password label="Enter Password" key="password" size="20" />
				<s:submit value="Login" />
			</s:form>
	</body>
</html>

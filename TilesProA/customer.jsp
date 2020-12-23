<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<h2 style="margin-left: 200px"> Customer Form</h2>

<div style="margin-left: 200px">
	<s:form action="customer.action" method="post">
		<s:textfield label="Name" key="name" size="20" />
		<s:textfield label="Age" key="age" size="20" />
		<s:textfield label="Email" key="email" size="20" />
		<s:textfield label="Phone" key="phone" size="20" />
		<s:submit value="Submit" align="center" />
	</s:form>	
</div>







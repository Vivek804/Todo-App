<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
	<link href = "webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
		<title>My first page</title>
		<h2>Update TODO list</h2><hr>
	</head>
<body class ="container">
<form:form method="post" modelAttribute ="todolist">
Change Username : <form:input type="text" path="name"/>
Change Task : <form:input type="text" path="task"/>
<button class="btn btn-success">Submit</button>
</form:form>
 </body>
</html>
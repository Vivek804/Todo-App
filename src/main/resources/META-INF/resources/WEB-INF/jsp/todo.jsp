		<%@ include file="common/header.jspf" %>
		<%@ include file="common/navigation.jspf" %>
	 	<div class="container">
	 	<h1>Hey ${name},Enter TODO details</h1> 
	 	<hr>
	 	</div>
	 	<div class="container">
	 		<form:form method="post" modelAttribute="todolist">
	 		<fieldset class="mb-3">
		 		<form:label path="name">Username</form:label>
		 		<form:input type="text" path="name" required="required"/>
		 		<form:errors path="name" cssClass="text-warning"></form:errors>
	 		</fieldset>
	 		<fieldset class="mb-3">
			 	<form:label path="task">Task</form:label>
			 	<form:input type="text" path="task" required = "required"/>
			 	<form:errors path="task" cssClass="text-warning"></form:errors>
	 		</fieldset>
	 		<fieldset>
		 		<form:label path="targetdate">Target Date</form:label>
		 		<form:input type="date" path="targetdate" required="required"/>
	 		</fieldset>
	 			<form:input type="hidden" path="id" required = "required"/>
	 			<form:input type="hidden" path="done" required = "required"/> 
	 	 		<button class="btn btn-success">Add</button>
	 		</form:form>
	 	</div>
	 	<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
	 	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	 	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	 	<script type="text/javascript">
		 	$('#targetdate').datepicker({
		 	    format: 'yyy-mm-dd'
		 	});
	 	</script>
	 	
</body>
</html>

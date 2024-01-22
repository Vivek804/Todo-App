	<%@ include file="common/header.jspf" %>
	<%@ include file="common/navigation.jspf" %>
	<div class = "container">
		<div>
			Welcome ${name}
			<hr>
		</div>
		<h2>Your Todos</h2>
		<table class="table">
			<thead>
				<tr>
					<th>NAME</th>
					<th>TASK</th>
					<th>TARGETDATE</th>
					<th>STATUS</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.name}</td>
						<td>${todo.task}</td>
						<td>${todo.targetdate}</td>
						<td>${todo.done}</td>
						<td><a href="update-todos?id=${todo.id}" class="btn btn-success">UPDATE</a></td>
						<td><a href="delete-todos?id=${todo.id}" class="btn btn-warning">DELETE</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-todo" class="btn btn-success">Add Todo</a>
		<script scr="webjars/bootstrap/5.1.3/js/bootstrap.js"></script>
		<script scr="webjars/jquery/3.6.0/jquery.js"></script>
	</div>
</body>
</html>
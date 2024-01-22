package com.vivek.myfirstwebapplication.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	public static List<TodoList> todos = new ArrayList<TodoList>();
	public static int todocount = 0;
	static {
		todos.add(new TodoList(++todocount,"vivek","Learn springboot",LocalDate.now().plusYears(1),false));
		todos.add(new TodoList(++todocount,"vivek","Learn AWS",LocalDate.now().plusYears(1),false));
		todos.add(new TodoList(++todocount,"vivek","Learn DBMS",LocalDate.now().plusYears(1),false));
		todos.add(new TodoList(++todocount,"dinesh","Learn Java",LocalDate.now().plusYears(3),false));
		
	}
public List<TodoList> findByName(String name) {
	return todos;
}
public void addToDo(String name,String task,LocalDate targetdate,boolean done) {
	TodoList todo = new TodoList(++todocount,name,task,LocalDate.now().plusYears(2),false);
	todos.add(todo);
}
public void deleteById(int id) {
	
	Predicate<? super TodoList> predicate  =
			todos -> todos.getId() == id;
	todos.removeIf(predicate);
}


public TodoList findById(int id) {
	// TODO Auto-generated method stub
	Predicate<? super TodoList> predicate  =
			todos -> todos.getId() == id;
			TodoList todo = todos.stream().filter(predicate).findFirst().get();
			return todo;
	
}

public void updateToDo(@Valid TodoList todo) {
	deleteById(todo.getId());
	todos.add(todo);
	
}

}

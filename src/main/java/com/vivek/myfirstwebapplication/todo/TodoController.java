package com.vivek.myfirstwebapplication.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	private TodoService todoservice;
	
	public TodoController(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}

	@RequestMapping("list-todos")
	public String todoCont(ModelMap model) {
		List<TodoList> todos = todoservice.findByName("vivek");
		model.addAttribute("todos",todos);
		return "listtodos";
	}
	
	@RequestMapping(value="add-todo",method=RequestMethod.GET)
	public String ShowAddNewTodo(ModelMap model) {
//		String username = (String)model.get("name");
		TodoList todolist = new TodoList(0,"","",LocalDate.now().plusYears(1),false);
		model.put("todolist",todolist);
		return "todo";
	}
	
	@RequestMapping(value="add-todo",method=RequestMethod.POST)
	public String AddNewTodoAndShow(ModelMap model,@Valid @ModelAttribute("todolist") TodoList todolist,BindingResult result) {
//		String username = (String)model.get("name");
		if(result.hasErrors()) {
			return "todo";
		}
		todoservice.addToDo(todolist.getName(),todolist.getTask(),LocalDate.now(),false);
		return "redirect:list-todos";
	}
	
	@RequestMapping("delete-todos")
	public String DeleteTodo(@RequestParam int id) {
		todoservice.deleteById(id);
		return "redirect:list-todos";
		
	}
	
	@RequestMapping(value="update-todos",method=RequestMethod.GET)
	public String ShowUpdateTodoPage(@RequestParam int id,ModelMap model) {
		TodoList todolist = todoservice.findById(id);
		model.addAttribute("todolist", todolist);
		return "todo";
		
	}
	
	@RequestMapping(value="update-todos",method=RequestMethod.POST)
	public String UpdateTodoAndShow(ModelMap model,@Valid @ModelAttribute("todolist") TodoList todolist,BindingResult result) {
//		String username = (String)model.get("name");
		if(result.hasErrors()) {
			return "todo";
		}
		todoservice.updateToDo(todolist);
		return "redirect:list-todos";
	}
	

}

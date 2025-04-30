package com.example.SpringProject.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

	public  TodoController(TodoService todoService ) {
		super();
		this.todoService =todoService;//constructor Dependency Injection 
	}
	private TodoService todoService;
	@RequestMapping("list-todos")
	public String listTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("ARPITS CLASSES");
		model.addAttribute("todos", todos);
		
		return "todo";
	}
	
	
}

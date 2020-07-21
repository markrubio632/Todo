package com.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.model.Todo;
import com.server.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TodoService todoservice;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date - dd/MM/yyyy
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}
	
	@GetMapping("/list-todos")
	public String showTodos(ModelMap model) {
		String name = (String) model.get("name");
		model.put("todos", todoservice.retrieveTodos(name));
		return "list-todos";
	}
	
	@GetMapping("/add-todo")
	public String showAddTodoPage(ModelMap model) {
		model.addAttribute("todo", new Todo(0, (String) model.get("name"),
				"Default Desc", new Date(), false));
		return "todo";
	}
	
	@GetMapping("/delete-todo")
	public String deleteTodo(@RequestParam int id) {
		todoservice.deleteTodo(id);
		return "redirect:/list-todos";
	}
	
	@GetMapping("/update-todo")
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		Todo todo = todoservice.retrieveTodo(id);
		model.put("todo", todo);
		return "todo";
	}
	
	@PostMapping("/update-todo")
	public String updateTodo(ModelMap model, @Validated Todo todo,
			BindingResult result) {

		if (result.hasErrors()) {
			return "todo";
		}

		todo.setUser((String) model.get("name"));

		todoservice.updateTodo(todo);

		return "redirect:/list-todos";
	}
	
	@PostMapping("/add-todo")
	public String addTodo(ModelMap model, @Validated Todo todo, BindingResult result) {

		if (result.hasErrors()) {
			return "todo";
		}

		todoservice.addTodo((String) model.get("name"), todo.getDesc(), todo.getTargetDate(),
				false);
		return "redirect:/list-todos";
	}
	
}

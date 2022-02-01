package com.example.Todo.todo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "tasks")
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }


    @GetMapping
    public List<Todo> getTask(){
       return todoService.getTasksFromService();
    }

    @PostMapping
    public void addTask(@RequestBody Todo todo){
        this.todoService.addTasksFromService(todo);
    }

    @DeleteMapping(path = "{todoId}")
    public void deleteTask(@PathVariable("todoId") Long todoId){
        this.todoService.deleteTaskFromService(todoId);
    }
}

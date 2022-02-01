package com.example.Todo.todo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getTasksFromService(){
        return todoRepository.findAll();
    }

    public void addTasksFromService(Todo todo){
        this.todoRepository.save(todo);
    }

    public void deleteTaskFromService(Long todoId){
        this.todoRepository.deleteById(todoId);
    }
}

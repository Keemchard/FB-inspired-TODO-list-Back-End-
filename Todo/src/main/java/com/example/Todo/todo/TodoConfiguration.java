package com.example.Todo.todo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TodoConfiguration {

//
//    @Bean
//    CommandLineRunner commandLineRunner(TodoRepository todoRepository){
//        return args -> {
//            Todo todos [] = {
//                    new Todo("Food Shopping", "Febuary 10, 2022", true),
//                    new Todo("Clean the PC", "Febuary 11, 2022", true),
//                    new Todo("Gala", "Febuary 12, 2022", false),
//                    new Todo("Gala ulit", "Febuary 13, 2022", false)
//            };
//
//            for(int i = 0; i < todos.length; i++){
//                todoRepository.save(todos[i]);
//            }
//        };
//    }
}

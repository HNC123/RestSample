package com.example.RestSample.mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by A-8677 on 12/10/2018.
 */
public class TodoBusinessImpl {
    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> allTodos = todoService.retrieveTodos(user);
        filteredTodos=allTodos.stream().filter(n->n.contains("Spring")).collect(Collectors.toList());
        filteredTodos.forEach(System.out::println);
        return filteredTodos;
    }
}

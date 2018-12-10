package com.example.RestSample;

import com.example.RestSample.mockito.TodoService;

import java.util.Arrays;
import java.util.List;

/**
 * Created by A-8677 on 12/10/2018.
 */
public class TodoServiceStub implements TodoService {
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Spring MVC", "Learn Spring",
                "Learn to Dance");
    }
}

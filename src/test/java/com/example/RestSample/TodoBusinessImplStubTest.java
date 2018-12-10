package com.example.RestSample;

import com.example.RestSample.mockito.TodoBusinessImpl;
import com.example.RestSample.mockito.TodoService;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by A-8677 on 12/10/2018.
 */
public class TodoBusinessImplStubTest {
    @Test
    public void usingAStub() {
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Ranga");
        assertEquals(2, todos.size());
    }
}

package br.com.paulodinelli.todolist.service;

import br.com.paulodinelli.todolist.entities.Todo;
import br.com.paulodinelli.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return read();
    }

    public List<Todo> read(){
        Sort sort = Sort.by("priority").descending().and(
                Sort.by("name").ascending());
        return todoRepository.findAll();
    }

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return read();
    }

    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return read();
    }


}

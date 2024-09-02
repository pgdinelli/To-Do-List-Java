package br.com.paulodinelli.todolist.repository;

import br.com.paulodinelli.todolist.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}

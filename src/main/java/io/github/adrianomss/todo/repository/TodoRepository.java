package io.github.adrianomss.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.adrianomss.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}

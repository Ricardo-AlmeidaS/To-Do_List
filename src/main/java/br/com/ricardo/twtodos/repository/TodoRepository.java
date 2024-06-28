package br.com.ricardo.twtodos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ricardo.twtodos.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}

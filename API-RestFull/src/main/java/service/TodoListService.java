package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import domain.TodoList;
import repository.TodoListRepository;

public class TodoListService {
	@Autowired
    TodoListRepository repository;

    public List<TodoList> todos() {
            return repository.findAll();
    }

    public TodoList novo(TodoList TodoList) {
            return repository.save(TodoList);
    }

    public TodoList busca(Integer id) {
            return repository.findById(id).orElseThrow(() -> new TodoListNaoEncontradaException(id));
    }

    public TodoList atualiza(TodoList TodoList, Integer id) {
            return repository.save(TodoList);
    }

    public void exclui(@PathVariable Integer id) {
            repository.deleteById(id);
    }

}


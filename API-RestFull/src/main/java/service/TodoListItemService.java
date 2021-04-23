package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import domain.TodoListItem;
import repository.TodoListItemRepository;

public class TodoListItemService {
	@Autowired
    TodoListItemRepository repository;

    public List<TodoListItem> todos() {
            return repository.findAll();
    }

    public TodoListItem novo(TodoListItem TodoListItem) {
            return repository.save(TodoListItem);
    }

    public TodoListItem busca(Integer id) {
            return repository.findById(id).orElseThrow(() -> new TodoListItemNaoEncontradaException(id));
    }

    public TodoListItem atualiza(TodoListItem TodoListItem, Integer id) {
            return repository.save(TodoListItem);
    }

    public void exclui(@PathVariable Integer id) {
            repository.deleteById(id);
    }
}
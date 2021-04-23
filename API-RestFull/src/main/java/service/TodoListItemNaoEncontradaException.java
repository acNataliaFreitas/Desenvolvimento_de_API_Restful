package service;

public class TodoListItemNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	TodoListItemNaoEncontradaException(Integer id) {
		super("Nome do Item não encontrado!" + id);
	}

}

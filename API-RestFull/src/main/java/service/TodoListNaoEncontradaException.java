package service;

public class TodoListNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	TodoListNaoEncontradaException(Integer id) {
		super("Nome nao encontrado!" + id);
	}

}

package br.com.poligonosUstore.exceptions;

public class EntradaInvalidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EntradaInvalidaException() {
		super("Opção invalida, escolha 1 para três lados ou 2 para 4 lados");
		
	}

	public EntradaInvalidaException(String message) {
		super(message);
		
	}
	
	

}

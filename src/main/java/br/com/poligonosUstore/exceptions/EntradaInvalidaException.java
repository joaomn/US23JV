package br.com.poligonosUstore.exceptions;

public class EntradaInvalidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EntradaInvalidaException() {
		super("Op��o invalida, escolha 1 para tr�s lados ou 2 para 4 lados");
		
	}

	public EntradaInvalidaException(String message) {
		super(message);
		
	}
	
	

}

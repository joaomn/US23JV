package br.com.poligonosUstore.exceptions;

public class ValorNegativoNaoSuportadoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ValorNegativoNaoSuportadoException() {

		System.out.println("N�o � possivel calcular area com lado negativo");

	}

}

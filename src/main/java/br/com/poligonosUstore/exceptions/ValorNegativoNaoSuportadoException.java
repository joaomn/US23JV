package br.com.poligonosUstore.exceptions;

public class ValorNegativoNaoSuportadoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ValorNegativoNaoSuportadoException() {

		System.out.println("Não é possivel calcular area com lado negativo");

	}

}

package br.com.poligonosUstore.services.exceptions;

public class ValorNegativoNaoSuportadoException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public ValorNegativoNaoSuportadoException() {
		
		System.out.println("N�o � possivel calcular area com lado negativo");
		
		
		
	}

}

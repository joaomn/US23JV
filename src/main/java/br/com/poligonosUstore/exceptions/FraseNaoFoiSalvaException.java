package br.com.poligonosUstore.exceptions;

public class FraseNaoFoiSalvaException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public FraseNaoFoiSalvaException() {
		super("Não foi possivel salvar este poligono na lista");
		
	}

	



	public FraseNaoFoiSalvaException(String message) {
		super(message);
		
	}

	
	

}

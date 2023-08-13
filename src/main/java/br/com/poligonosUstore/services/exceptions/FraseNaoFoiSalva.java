package br.com.poligonosUstore.services.exceptions;

public class FraseNaoFoiSalva extends Exception {

	
	private static final long serialVersionUID = 1L;

	public FraseNaoFoiSalva() {
		super("Não foi possivel salvar este poligono na lista");
		
	}

	



	public FraseNaoFoiSalva(String message) {
		super(message);
		
	}

	
	

}

package br.com.poligonosUstore.services;

import java.util.List;

import br.com.poligonosUstore.services.exceptions.FraseNaoFoiSalva;

public interface ResultadoListaService {
	
	String FraseResultado(double tamanhoLado, double resultadoFinal, String poligono) throws FraseNaoFoiSalva ;
	
	
	
	List<String> GetListaResultados (List<String> listaFinal) throws FraseNaoFoiSalva;
	

}

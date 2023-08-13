package br.com.poligonosUstore.services;

import java.util.List;

import br.com.poligonosUstore.exceptions.FraseNaoFoiSalvaException;

public interface IResultadoListaService {
	
	String FraseResultado(double tamanhoLado, double resultadoFinal, String poligono) throws FraseNaoFoiSalvaException ;
	
	
	
	List<String> GetListaResultados (List<String> listaFinal) throws FraseNaoFoiSalvaException;
	

}

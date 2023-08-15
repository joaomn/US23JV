package br.com.poligonosUstore.services;

import java.util.ArrayList;
import java.util.List;

import br.com.poligonosUstore.exceptions.FraseNaoFoiSalvaException;

public class ResultadoListaImpl implements IResultadoListaService {
	
	//criar frase com stringbuilder

	@Override
	public String fraseResultado(double tamanhoLado, double resultadoFinal, String poligono) throws FraseNaoFoiSalvaException {

		try {
			
			String resultadoFormat = String.format("%.2f", resultadoFinal);

		StringBuilder stingB = new StringBuilder();

		stingB.append(poligono)
		.append(" de lado ")
		.append(tamanhoLado)
		.append(" cm e área ")
		.append(resultadoFormat)
		.append(" cm2");

		String fraseFinal = stingB.toString();

		return fraseFinal;
			
			
			
		} catch (Exception e) {
			throw new FraseNaoFoiSalvaException();
		}
		
		
	}


	
// obter lista
	@Override
	public List<String> getListaResultados(List<String> listaFinal)  throws FraseNaoFoiSalvaException {
		try {
			 
			List<String> lista = listaFinal;
						
			
			return lista;
			
			
		} catch (Exception e) {
			throw  new FraseNaoFoiSalvaException("erro para obter lista");
		}
		
	}

}

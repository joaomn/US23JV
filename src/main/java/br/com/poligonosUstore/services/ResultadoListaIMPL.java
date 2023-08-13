package br.com.poligonosUstore.services;

import java.util.ArrayList;
import java.util.List;

import br.com.poligonosUstore.services.exceptions.FraseNaoFoiSalva;

public class ResultadoListaIMPL implements ResultadoListaService {
	
	//criar frase com stringbuilder

	@Override
	public String FraseResultado(double tamanhoLado, double resultadoFinal, String poligono) throws FraseNaoFoiSalva {

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
			throw new FraseNaoFoiSalva();
		}
		
		
	}


	
// obter lista
	@Override
	public List<String> GetListaResultados(List<String> listaFinal)  throws FraseNaoFoiSalva {
		try {
			 
			List<String> lista = listaFinal;
						
			
			return lista;
			
			
		} catch (Exception e) {
			throw  new FraseNaoFoiSalva("erro para obter lista");
		}
		
	}

}

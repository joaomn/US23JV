package br.com.poligonosUstore.services;

import br.com.poligonosUstore.services.exceptions.ValorNegativoNaoSuportadoException;

public interface PoligonosService {
	
	double CalcularArea(double lado) throws ValorNegativoNaoSuportadoException;

}

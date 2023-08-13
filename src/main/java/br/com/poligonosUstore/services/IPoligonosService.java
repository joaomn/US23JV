package br.com.poligonosUstore.services;

import br.com.poligonosUstore.exceptions.ValorNegativoNaoSuportadoException;

public interface IPoligonosService {
	
	double CalcularArea(double lado) throws ValorNegativoNaoSuportadoException;

}

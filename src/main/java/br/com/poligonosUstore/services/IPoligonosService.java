package br.com.poligonosUstore.services;

import br.com.poligonosUstore.exceptions.ValorNegativoNaoSuportadoException;

public interface IPoligonosService {
	
	public double calcularArea(double lado) throws ValorNegativoNaoSuportadoException;
	
//	public double getArea();

}

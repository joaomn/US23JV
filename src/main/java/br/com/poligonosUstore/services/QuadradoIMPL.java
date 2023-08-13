package br.com.poligonosUstore.services;

import br.com.poligonosUstore.services.exceptions.ValorNegativoNaoSuportadoException;

public class QuadradoIMPL implements PoligonosService {

	@Override
	public double CalcularArea(double lado) throws ValorNegativoNaoSuportadoException {

		if (lado >= 0.0) {

			return Math.pow(lado, 2);

		} else {

			throw new ValorNegativoNaoSuportadoException();

		}

	}



	public double CalculoTotal(double resultado, double resultadoFinal) {

		double resultadoTotal = resultadoFinal + resultado;	

		return resultadoTotal;
 
	}
}

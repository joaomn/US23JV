package br.com.poligonosUstore.services;

import br.com.poligonosUstore.exceptions.ValorNegativoNaoSuportadoException;

public class TrianguloImpl implements IPoligonosService {

	@Override
	public double calcularArea(double lado) throws ValorNegativoNaoSuportadoException {

		if (lado < 0.0) {
			
			throw new ValorNegativoNaoSuportadoException();

			

		} else {
			double potencia = Math.pow(lado, 2);

			double resultado = (potencia * Math.sqrt(3)) / 4;

			return resultado;
			
		}

	}


	
	
	public double CalculoTotal(double resultado, double resultadoFinal) {

		double resultadoTotal = resultadoFinal + resultado;	

		return resultadoTotal;
 
	}

}

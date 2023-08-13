package br.com.poligonosUstore.services;

import br.com.poligonosUstore.services.exceptions.ValorNegativoNaoSuportadoException;

public class TrianguloIMPL implements PoligonosService {

	@Override
	public double CalcularArea(double lado) throws ValorNegativoNaoSuportadoException {

		if (lado >= 0.0) {

			double potencia = Math.pow(lado, 2);

			// assumindo que raiz de 3 é 1.73

			double resultado = (potencia * 1.73) / 4;

			return resultado;

		} else {

			throw new ValorNegativoNaoSuportadoException();
		}

	}


	
	
	public double CalculoTotal(double resultado, double resultadoFinal) {

		double resultadoTotal = resultadoFinal + resultado;	

		return resultadoTotal;
 
	}

}

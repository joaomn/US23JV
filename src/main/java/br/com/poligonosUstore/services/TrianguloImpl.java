package br.com.poligonosUstore.services;

import br.com.poligonosUstore.exceptions.ValorNegativoNaoSuportadoException;

public class TrianguloImpl implements IPoligonosService {
	
	private double lado;
	
	public TrianguloImpl(double lado) {
		this.lado = lado;
	}

	@Override
	public double getArea()  {

		if (lado < 0.0) {

			throw new ValorNegativoNaoSuportadoException();

		} else {
			double potencia = Math.pow(lado, 2);

			double resultado = (potencia * Math.sqrt(3)) / 4;

			return resultado;

		}

	}





}

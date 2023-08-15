package br.com.poligonosUstore.services;

import br.com.poligonosUstore.exceptions.ValorNegativoNaoSuportadoException;

public class QuadradoImpl implements IPoligonosService {

	private double lado;

	public QuadradoImpl(double lado) {
		this.lado = lado;
	}

	@Override
	public double getArea() {

		if (lado < 0.0) {

			throw new ValorNegativoNaoSuportadoException();

		} else {

			return Math.pow(lado, 2);

		}

	}

	@Override
	public double getLado() {
		return this.lado;
	}

}

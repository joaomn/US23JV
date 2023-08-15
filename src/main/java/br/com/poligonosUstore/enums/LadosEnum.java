package br.com.poligonosUstore.enums;

import br.com.poligonosUstore.exceptions.EntradaInvalidaException;

public enum LadosEnum {

	TRIANGULO(1), QUADRADO(2);

	private int identificador;

	LadosEnum(int valor) {
		this.identificador = valor;
	}

	public int getIdentificador() {
		return identificador;
	}

	public static LadosEnum getLadosEnum(int identificador) {
		var enums = LadosEnum.values();

		for (int i = 0; i < enums.length; i++) {
			var lado = enums[i];

			if (lado.getIdentificador() == identificador) {
				return lado;
			}

		}
		throw new EntradaInvalidaException();
	}
}

package br.com.poligonosUstore.menus;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthInternalFrameUI;

import br.com.poligonosUstore.enums.LadosENUM;
import br.com.poligonosUstore.exceptions.FraseNaoFoiSalvaException;
import br.com.poligonosUstore.exceptions.ValorNegativoNaoSuportadoException;
import br.com.poligonosUstore.services.QuadradoImpl;
import br.com.poligonosUstore.services.ResultadoListaImpl;
import br.com.poligonosUstore.services.TrianguloImpl;

public class MenuPoligono {

	private Scanner scan = new Scanner(System.in);

	private String fraseResultado;

	double resultadoFinal = 0.0;

	private List<String> listaResultados = new ArrayList<>();

	private QuadradoImpl quadrado = new QuadradoImpl();

	private TrianguloImpl triangulo = new TrianguloImpl();

	private ResultadoListaImpl lista = new ResultadoListaImpl();

	public List<String> getListaResultados() {
		return listaResultados;
	}

	public void setListaResultados(List<String> listaResultados) {
		this.listaResultados = listaResultados;
	}

	public void menuPoligonos() {

		System.out.println("Digite o numero de lados : Tres ou Quatro?");
		String numLados = scan.next().toUpperCase();

		LadosENUM opcao;
		try {
			opcao = LadosENUM.valueOf(numLados);
		} catch (IllegalArgumentException e) {
			System.out.println("Entrada inválida. Digite: tres ou quatro para informar o número de lados");
			return;
		}

		switch (opcao) {

		case TRES:

			System.out.println("Digite o tamanho do lado (em cm): ");
			var tamanhoLado = scan.nextDouble();

			try {
				var resultadoTriangulo = triangulo.calcularArea(tamanhoLado);

				resultadoFinal = triangulo.CalculoTotal(resultadoTriangulo, resultadoFinal);

				fraseResultado = lista.fraseResultado(tamanhoLado, resultadoTriangulo, "Triangulo");

				listaResultados.add(fraseResultado);

//			

			} catch (ValorNegativoNaoSuportadoException e) {

				System.out.println(e.getMessage());
			}

			break;

		case QUATRO:

			System.out.println("Digite o tamanho do lado (em cm): ");
			tamanhoLado = scan.nextDouble();
			scan.nextLine();

			try {
				var resultadoQuadrado = quadrado.calcularArea(tamanhoLado);

				resultadoFinal = quadrado.calculoTotal(resultadoQuadrado, resultadoFinal);

				fraseResultado = lista.fraseResultado(tamanhoLado, resultadoQuadrado, "Quadrado");

				listaResultados.add(fraseResultado);

			} catch (ValorNegativoNaoSuportadoException e) {

				System.out.println(e.getMessage());
			}

			break;
		default:

			System.out.println(
					"Palavra não reconhecida. Voce deve digitar: tres ou quatro para informar o " + "numero de lados");
			break;

		}

	}

}

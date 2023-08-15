package br.com.poligonosUstore.menus;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthInternalFrameUI;

import br.com.poligonosUstore.enums.LadosEnum;
import br.com.poligonosUstore.exceptions.EntradaInvalidaException;
import br.com.poligonosUstore.exceptions.FraseNaoFoiSalvaException;
import br.com.poligonosUstore.exceptions.ValorNegativoNaoSuportadoException;
import br.com.poligonosUstore.services.QuadradoImpl;
import br.com.poligonosUstore.services.ResultadoListaImpl;
import br.com.poligonosUstore.services.TrianguloImpl;

public class MenuPoligono {

	private Scanner scan ;

	private double resultadoFinal = 0.0;

	private List<String> listaResultados;

	private ResultadoListaImpl lista;
	
	
	public MenuPoligono() {
		this.scan =  new Scanner(System.in);
		this.listaResultados = new ArrayList<>();
		this.lista = new ResultadoListaImpl();
	}
	
	

	public void menuPoligonos() {

		System.out.println("Quantos lados tem este poligono?\n"
				+ "Digite:\n 1 - Para um poligono de 3 lados\n 2 - Para um poligono de 4 lados");
		String numLados = scan.next();

		LadosEnum opcao;
		try {
			opcao = LadosEnum.getLadosEnum(Integer.valueOf(numLados));
		} catch (EntradaInvalidaException e) {
			System.out.println(e.getMessage());;
			return;
		}

		switch (opcao) {

			case TRIANGULO:
	
				System.out.println("Digite o tamanho do lado (em cm): ");
				var tamanhoLado = scan.nextDouble();
	
				try {
					
					var triangulo = new TrianguloImpl(tamanhoLado);
					
					var resultadoTriangulo = triangulo.getArea();
	
					resultadoFinal = resultadoFinal + resultadoTriangulo;
	
					var fraseResultado = lista.fraseResultado(tamanhoLado, resultadoTriangulo, "Triangulo");
	
					listaResultados.add(fraseResultado);
	
	//			
	
				} catch (ValorNegativoNaoSuportadoException e) {
	
					System.out.println(e.getMessage());
				}
	
				break;
	
			case QUADRADO:
	
				System.out.println("Digite o tamanho do lado (em cm): ");
				tamanhoLado = scan.nextDouble();
				scan.nextLine();
	
				try {
					
					var quadrado = new QuadradoImpl(tamanhoLado);
					
					var resultadoQuadrado = quadrado.getArea();
	
					resultadoFinal = resultadoFinal + resultadoQuadrado;
	
					var fraseResultado = lista.fraseResultado(tamanhoLado, resultadoQuadrado, "Quadrado");
	
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

	public List<String> getListaResultados() {
		return listaResultados;
	}

	public void setListaResultados(List<String> listaResultados) {
		this.listaResultados = listaResultados;
	}

	public double getResultadoFinal() {
		return resultadoFinal;
	}

	public void setResultadoFinal(double resultadoFinal) {
		this.resultadoFinal = resultadoFinal;
	}

}

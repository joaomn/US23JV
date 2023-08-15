package br.com.poligonosUstore.menus;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.poligonosUstore.exceptions.FraseNaoFoiSalvaException;
import br.com.poligonosUstore.services.IPoligonosService;

import br.com.poligonosUstore.services.TrianguloImpl;

public class MenuPrincipal {
	Scanner scan = new Scanner(System.in);

	private MenuPoligono poligonoMenu = new MenuPoligono();

	

	public void menuInicial() {

		int opcao;

		do {
			System.out.println("+++++++++++++++++++++++++++++++++++++");
			System.out.println("+                                   +");
			System.out.println("+  Calculadora de Polígonos         +");
			System.out.println("+                                   +");
			System.out.println("+ 1 - Inserir um polígono           +");
			System.out.println("+ 0 - Retornar resultados           +");
			System.out.println("+                                   +");
			System.out.println("+++++++++++++++++++++++++++++++++++++");
			System.out.print("Escolha uma opção: ");

			opcao = scan.nextInt();
			scan.nextLine();

			switch (opcao) {
				case 1:
	
					poligonoMenu.menuPoligonos();
	
					break;
				case 0:
					System.out.println(" ");
					System.out.println("Finalizando a calculadora...\n");
	
					break;
				default:
					System.out.println("Opção inválida. Escolha novamente.");
				}

		} while (opcao != 0);
		
		
		var listaResultados = poligonoMenu.getPoligono();
		
		for(IPoligonosService poligono : listaResultados) {
			var areaFormatada = String.format("%.2f", poligono.getArea());
			if(poligono instanceof TrianguloImpl) {
				System.out.println("Triangulo de lado " + poligono.getLado() + " cm e àrea " + areaFormatada + " cm2");
			}else {
				System.out.println("Quadrado de lado " + poligono.getLado() + " cm e àrea " + areaFormatada + " cm2");
				
			}
		}

		try {
			
			var resultadoFinalFormat = String.format("%.2f", poligonoMenu.getResultadoFinal());

			var Stringbuilder = new StringBuilder();

			Stringbuilder.append("Área total ").append(resultadoFinalFormat).append(" cm2");

			var fraseTotal = Stringbuilder.toString();

			System.out.println(fraseTotal);

		} catch (FraseNaoFoiSalvaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}

package br.com.poligonosUstore.menus;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.poligonosUstore.exceptions.FraseNaoFoiSalvaException;
import br.com.poligonosUstore.services.ResultadoListaImpl;

public class MenuPrincipal {
	Scanner scan = new Scanner(System.in);

	MenuPoligono poligonoMenu = new MenuPoligono();

	ResultadoListaImpl lista = new ResultadoListaImpl();



	public void Menu() {
		
		int opcao;

		do {
			System.out.println("+++++++++++++++++++++++++++++++++++++");
			System.out.println("+                                   +");
			System.out.println("+  Calculadora de Pol�gonos         +");
			System.out.println("+                                   +");
			System.out.println("+ 1 - Inserir um pol�gono           +");
			System.out.println("+ 0 - Retornar resultados           +");
			System.out.println("+                                   +");
			System.out.println("+++++++++++++++++++++++++++++++++++++");
			System.out.print("Escolha uma op��o: ");

			 opcao = scan.nextInt();
			scan.nextLine();

			switch (opcao) {
			case 1:

				poligonoMenu.MenuPoligonos();

				break;
			case 0:
				System.out.println(" ");
				System.out.println("Finalizando a calculadora...\n");

				break;
			default:
				System.out.println("Op��o inv�lida. Escolha novamente.");
			}

		} while (opcao != 0);

		try {
			var listaResultados = lista.GetListaResultados(poligonoMenu.listaResultados);

			for (String frase : listaResultados) {
				System.out.println(frase);
				System.out.println("");
			}

			var resultadoFinalFormat = String.format("%.2f",poligonoMenu.resultadoFinal);

			var Stringbuilder = new StringBuilder();

			Stringbuilder.append("�rea total ").append(resultadoFinalFormat).append(" cm2");

			var fraseTotal = Stringbuilder.toString();

			System.out.println(fraseTotal);

		} catch (FraseNaoFoiSalvaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}

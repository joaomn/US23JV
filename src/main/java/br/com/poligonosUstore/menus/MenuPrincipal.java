package br.com.poligonosUstore.menus;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.poligonosUstore.services.ResultadoListaIMPL;
import br.com.poligonosUstore.services.exceptions.FraseNaoFoiSalva;



public class MenuPrincipal {
	Scanner scan = new Scanner(System.in);

	String fraseResultado = "";

	double tamanhoLado, resultadoTriangulo, resultadoQuadrado;

	int  opcao = 100;

	List<String> listaResultados = new ArrayList<>();
	
	MenuPoligono poligonoMenu = new MenuPoligono();
	
	ResultadoListaIMPL lista = new ResultadoListaIMPL();

	
	DecimalFormat formato = new DecimalFormat("0.00");
	
	
	public void Menu() {
		
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

				poligonoMenu.MenuPoligonos();

				
				break;
			case 0:
				System.out.println(" ");
				System.out.println("Finalizando a calculadora...\n");
				
				break;
			default:
				System.out.println("Opção inválida. Escolha novamente.");
			}

		} while (opcao != 0);
		
		try {
			listaResultados = lista.GetListaResultados(poligonoMenu.listaResultados);
		} catch (FraseNaoFoiSalva e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		for (String frase : listaResultados) {
			System.out.println(frase);
			System.out.println("");
		}
		
		String resultadoFinalFormat = formato.format(poligonoMenu.resultadoFinal);

		System.out.println("Área total " + resultadoFinalFormat + " cm2");
		
		
		
	}


}

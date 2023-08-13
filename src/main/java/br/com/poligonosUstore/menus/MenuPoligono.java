package br.com.poligonosUstore.menus;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.poligonosUstore.enums.LadosENUM;
import br.com.poligonosUstore.services.QuadradoIMPL;
import br.com.poligonosUstore.services.ResultadoListaIMPL;
import br.com.poligonosUstore.services.TrianguloIMPL;
import br.com.poligonosUstore.services.exceptions.FraseNaoFoiSalva;
import br.com.poligonosUstore.services.exceptions.ValorNegativoNaoSuportadoException;



public class MenuPoligono {
	
	Scanner scan = new Scanner(System.in);

	String fraseResultado ;

	double tamanhoLado, resultadoTriangulo, resultadoQuadrado, resultadoFinal = 0.0;

	int numeroLados, opcao = 100;

	List<String> listaResultados = new ArrayList<>();
	
	QuadradoIMPL quadrado = new QuadradoIMPL();
	
	TrianguloIMPL triangulo = new TrianguloIMPL();
	
	ResultadoListaIMPL lista = new ResultadoListaIMPL();



	DecimalFormat formato = new DecimalFormat("0.00");
	
	
	public void MenuPoligonos() {
		
		System.out.println("Digite o numero de lados : Tres ou Quatro");
		String numLados = scan.next().toUpperCase();
		
//		LadosENUM opcao = LadosENUM.valueOf(numLados.toUpperCase());
		
		LadosENUM opcao;
	    try {
	        opcao = LadosENUM.valueOf(numLados);
	    } catch (IllegalArgumentException e) {
	        System.out.println("Entrada inválida. Digite: tres ou quatro para informar o número de lados");
	        return;
	    }
		
		
		
		
		switch(opcao){
		
		case TRES:
			numeroLados = 3;
			
			System.out.println("Digite o tamanho do lado (em cm): ");
			tamanhoLado = scan.nextDouble();
			
			
			try { 
			 resultadoTriangulo = triangulo.CalcularArea(tamanhoLado);
			 
			 
			 
			 resultadoFinal = triangulo.CalculoTotal(resultadoTriangulo, resultadoFinal);
//			
				
			} catch (ValorNegativoNaoSuportadoException e) {
				
				System.out.println(e.getMessage());
			}
			
			try {
				 fraseResultado = lista.FraseResultado(tamanhoLado, resultadoTriangulo, "Triangulo");
				 
				 listaResultados.add(fraseResultado);
				 
				
			} catch (FraseNaoFoiSalva e) {
				// TODO Auto-generated catch block
				
				System.out.println(e.getMessage());
			}
			
			break;
			
		case QUATRO:
			
			numeroLados = 4;
			System.out.println("Digite o tamanho do lado (em cm): ");
			tamanhoLado = scan.nextDouble();
			scan.nextLine();
			
			try { 
			 resultadoQuadrado = quadrado.CalcularArea(tamanhoLado);
			 
			 resultadoFinal = quadrado.CalculoTotal(resultadoQuadrado, resultadoFinal);
			 
			 
				
			} catch (ValorNegativoNaoSuportadoException e) {
				
				System.out.println(e.getMessage());
			}
			
			try {
				fraseResultado = lista.FraseResultado(numeroLados, resultadoQuadrado, "Quadrado");
				
				listaResultados.add(fraseResultado);
				
			} catch (FraseNaoFoiSalva e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
			
			
			
			break;
		default:
			
			System.out.println("Palavra não reconhecida. Voce deve digitar: tres ou quatro para informar o "
					+ "numero de lados");
			break;
			
			
			
		}
		
		
		
		
	}


}

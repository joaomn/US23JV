package br.com.poligonosUstore.menus;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.poligonosUstore.enums.LadosENUM;
import br.com.poligonosUstore.exceptions.FraseNaoFoiSalvaException;
import br.com.poligonosUstore.exceptions.ValorNegativoNaoSuportadoException;
import br.com.poligonosUstore.services.QuadradoImpl;
import br.com.poligonosUstore.services.ResultadoListaImpl;
import br.com.poligonosUstore.services.TrianguloImpl;



public class MenuPoligono {
	
	Scanner scan = new Scanner(System.in);

	String fraseResultado ;

	double tamanhoLado, resultadoTriangulo, resultadoQuadrado, resultadoFinal = 0.0;



	List<String> listaResultados = new ArrayList<>();
	
	QuadradoImpl quadrado = new QuadradoImpl();
	
	TrianguloImpl triangulo = new TrianguloImpl();
	
	ResultadoListaImpl lista = new ResultadoListaImpl();



	
	
	
	public void MenuPoligonos() {
		
		System.out.println("Digite o numero de lados : Tres ou Quatro");
		String numLados = scan.next().toUpperCase();
		

		
		LadosENUM opcao;
	    try {
	        opcao = LadosENUM.valueOf(numLados);
	    } catch (IllegalArgumentException e) {
	        System.out.println("Entrada inválida. Digite: tres ou quatro para informar o número de lados");
	        return;
	    }
		
		
		
		
		switch(opcao){
		
		case TRES:
		
			
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
				 
				
			} catch (FraseNaoFoiSalvaException e) {
				
				
				System.out.println(e.getMessage());
			}
			
			break;
			
		case QUATRO:
			
			
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
				fraseResultado = lista.FraseResultado(tamanhoLado, resultadoQuadrado, "Quadrado");
				
				listaResultados.add(fraseResultado);
				
			} catch (FraseNaoFoiSalvaException e) {
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

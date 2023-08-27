package algoritmos.basico;

import java.util.Random;

public class MatrizImprimirDiagonalSecundaria {

	public static void main(String[] args) {
		/***
		 * Algoritmo basico para imprimir uma matriz e imprimir os elementos apenas da diagonal secundária
		 * matriz 10 x 10 para ficar mais claro o exemplo 
		 */
		
		final int TAM = 10;
		int[][] matriz= new int[TAM][TAM];
		
		inicializarMatriz(matriz);
		
		imprimirMatriz(matriz);
		
		
		imprimirDiagonalSecundaria(matriz);
		
		
		imprimirDiagonalPrincipal(matriz);
		
		
		
		
		

	}
	
	static void imprimirDiagonalSecundaria(int[][] m) {
		
		//System.out.println("Imprimindo na diagonal Secundária");
		
		for(int i=0; i<m.length; i++) {
			
			for(int j =0; j<m[1].length;j++) {
								
				if(j == (m[i].length-1 - i)) {
					System.out.printf("%02d ",m[i][j]);
				}
				else {
					System.out.print("   ");
				}
				
				
			}
			
			System.out.println(" ");
			
		}
		
	}
	
static void imprimirDiagonalPrincipal(int[][] m) {
		
		//System.out.println("Imprimindo na Diagonal Principal");
		
		for(int i=0; i<m.length; i++) {
			
			for(int j =0; j<m[1].length;j++) {
								
				if(j == i) {
					System.out.printf("%02d ",m[i][j]);
				}
				else {
					System.out.print("   ");
				}
				
				
			}
			
			System.out.println(" ");
			
		}
		
	}
	
	static void imprimirMatriz(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j =0; j<m[1].length;j++) {
				System.out.printf("%02d ",m[i][j]);
				
			}
			System.out.println(" ");
			
		}
		
		
	}
	
	static void inicializarMatriz(int[][] m) {
		Random gerador = new Random();
		
		for(int i=0; i<m.length; i++) {
			for(int j =0; j<m.length;j++) {
				m[i][j] = gerador.nextInt(99);
				
			}
		}
		
	}

}
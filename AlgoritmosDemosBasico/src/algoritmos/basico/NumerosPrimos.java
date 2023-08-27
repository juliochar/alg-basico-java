package algoritmos.basico;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		/**
		 * Numeros Primos Demo
		 * O q são numeros primos:
		 * Um número primo é aquele que é dividido apenas por um e por ele mesmo. Entre 0 e 100 existem apenas 25 números primo
		 * 
		 * o segredo é contar qtos divisores tem o numero tem, numeros primos só tem 2 divisores
		 * 
		 */
		
		
		int x, valor =1, divisores = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para verificar se é primo: ");
		x = sc.nextInt();		
		
		sc.close();
		
		
		System.out.println("O Valor : " + x + " é Primo: " + ehPrimo(x));
		
		
		System.out.println("Imprimir os 100 primeiros primos: ");
		
		for(int i=1;i<=100;i++) {
			if(ehPrimo(i))
				System.out.print(i + ",");
		}
		

	}
	
	static boolean ehPrimo(int x) {
		boolean b = false;
		int valor = 1;
		int divisores = 0;
		if(x>0){
			while(valor <= x) {
				if(x % valor == 0) {
					divisores++;
				}
				valor++;
			}
			
			if(divisores == 2) {
				b = true;
			}
		}
				
		
		return b;
	}
	

}
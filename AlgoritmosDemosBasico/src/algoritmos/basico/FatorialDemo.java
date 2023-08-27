package algoritmos.basico;

import java.util.Scanner;

public class FatorialDemo {

	public static void main(String[] args) {
		
		/***
		 * Fatorial: 4!
		 * 4x3x2x1
		 * 
		 * sabendo que fatorial de 1 é igual a -é onde fica a saída da recursão
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor maior que Zero para calculo do Fatorial: ");
		Long valor = sc.nextLong();
		
		if(valor > 0) {
			long resultado = fatorial(valor);
			System.out.println("Valor do fatorial: " + resultado);
			
		}
			
	}
	
	private static Long fatorial(Long n) {
		if(n==0 || n==1) {
			return 1L;
		} else {
			return n * fatorial (n-1);
		}
		
		
	}

}

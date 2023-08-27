package algoritmos.basico;

import java.util.Scanner;

public class TabelaHashDemo {
	public static void main(String[] args) {
		/**
		 * Tabela Hash com vetor de inteiros
		 * 
		 * usando o modelo somente com vetor
		 * 
		 * sem lista encadeada
		 * 
		 * nesta tabela hash levar em conta q valores 0 são posições vazias
		 * 
		 */
		
		//trabalhar com uma tabela pequena de 15 elementos
		// 15 elementos, 2 * 15 = 30; o primo mais próximo é : 31
		
		final int TAM = 31;
		int tabela[] = new int[TAM];
		int retorno;
		
		int opcao=-1;
		
		do {
			System.out.println("Digite uma opção: <1> Inserir - <2> Buscar - <3> Imprimir - <0> Sair");
			Scanner sc = new Scanner(System.in);
			
			opcao = sc.nextInt();
			int valor;
			
			switch(opcao) {
				case 1:
					System.out.println("Digite o Valor a ser Inserido na tabela: ");
					valor = sc.nextInt();
					inserir(tabela, valor);
					break;
				case 2:
					System.out.println("Qual valor deseja buscar: ");
					valor = sc.nextInt();
					retorno = busca(tabela, valor);
						if(retorno!=0)
							System.out.println("Valor encontrado é: "+ retorno);
						else
							System.out.println("Valor não encontrado");
					
					break;
				case 3:
					imprimirTabela(tabela);
					break;
				default:
					System.out.println("Finalizando.");
				
			}
			
			
			
			
		}while(opcao!=0);
		
		
		
		
		
	}
	
	static void iniciarTabela(int[] t) {
		for(int i = 0; i< t.length; i++) {
			t[i]=0;
		}
		
	}
	
	static int funcaoHash(int chave, int tamVetor) {
		return chave % tamVetor;
		
	}
	
	static void inserir(int[] t,int valor) {
		int id = funcaoHash(valor, t.length);
		
		while(t[id] != 0) {
			id = funcaoHash(id+1, t.length); //id +1 vai percorrer o vetor mesmo q chegue no final
		}
		
		t[id] = valor;
		
		
		
	}
	
	static int busca(int[] t, int chave) {
		int id = funcaoHash(chave, t.length);
		System.out.println("Indice Gerado: " + id);
		
		while(t[id] != 0) {
			if(t[id] == chave) {
				return t[id];
			}
			else {
				id = funcaoHash(id+1, t.length);
				System.out.println("Indice Gerado: " + id);
			}
		}
		
		return 0;
		
	}
	
	static void imprimirTabela(int[] t) {
		for(int i=0; i<t.length; i++) {
			System.out.println("Indice: "+ i + " == Chave: " + t[i]);
		}
	}

}

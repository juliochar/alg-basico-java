package algoritmos.basico;

public class MergeSortDemo {

	public static void main(String[] args) {
		/**
		 * MergeSort demo
		 * 
		 */
		
		int[] vetorOriginal = {5,7,9,1,3,10,2,4,8,6 };
		
		imprimir(vetorOriginal);
		
		
		mergeSort(vetorOriginal, 0, vetorOriginal.length - 1);
		
		
		
		imprimir(vetorOriginal);
		
		
		
		
		

	}
	
	static void imprimir(int[] vetor) {
		for(int i=0; i<vetor.length; i++) {
			System.out.print(" " + vetor[i]);
		}
		
		System.out.println("");
		
	}
	
	
	static void mergeSort(int[] vetor,int  inicio, int fim) {
		int meio=0, i, k, j;
		int[] aux = new int[10];
		
		if (inicio < fim) {
			meio = (inicio + fim)/2;
			mergeSort(vetor, inicio, meio);
			mergeSort(vetor, meio +1, fim);
			
			//faz o merge ordenando
			i = inicio;
			j = meio +1;
			k = inicio;
			
			while(i <= meio && j <=fim) {
				if(vetor[i] < vetor[j]) {
					aux[k] = vetor[i];
					i++;
					
				}
				else {
					aux[k] = vetor[j];
					j++;
					
				}
				k++;
			}
			
			while(i<=meio) {
				aux[k] = vetor[i];
				i++;
				k++;
				
			}
			
			while(j<= fim) {
				aux[k] = vetor[j];
				j++;
				k++;
			}
			
			
			for(i = inicio; i<= fim; i++) {
				
				vetor[i] = aux[i];
			}
			
			
			
		}
		
		
	}
	

}

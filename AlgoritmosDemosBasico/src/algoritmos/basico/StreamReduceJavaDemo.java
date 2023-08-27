package algoritmos.basico;

import java.math.BigDecimal;
import java.util.Arrays;

public class StreamReduceJavaDemo {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10 };
		int sum = 0;
		
		for(int i: num) {
			sum+=i;
		}
		
		System.out.println("Soma: " + sum);
		
		
		// com reduce
		
		int soma2 = Arrays.stream(num).reduce(0,(a,b)-> a+b);
		
		System.out.println("Soma2: " + soma2);
		
		Arrays.stream(num).forEach(a -> System.out.println(a));
		
		int soma3 = Arrays.stream(num).reduce(0, Integer::sum);
		
		System.out.println(soma3);
		
		
		
		
		
		
		

	}
	
	class Invoice {
		String invoiceNo;
		BigDecimal price;
		BigDecimal qty;
	}

}

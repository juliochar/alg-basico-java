package algoritmos.basico;

public class StringFormatDemo {

	public static void main(String[] args) {
		
		double random = Math.random();
		
		
		String roundOff = String.format("%.2f", random);
		
		System.out.println(roundOff);
		

	}

}

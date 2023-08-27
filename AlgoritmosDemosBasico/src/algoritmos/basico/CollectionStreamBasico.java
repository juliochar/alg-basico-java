package algoritmos.basico;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionStreamBasico {

	public static void main(String[] args) {
		
		String[] linguagens = {"java", "python", "nodejs", "ruby" };
		
		//String para array
		
		String nome = "Joao Moreira Franco";
		
		//char arrays
		char[] chars = nome.toCharArray();
		
		System.out.println(chars);
		System.out.println(chars[2]);
		
		
		Set<String> hashset1 = new HashSet<>();
		
		hashset1.add("Joao");
		hashset1.add("Pedro");
		hashset1.add("Ana");
		
		System.out.println(hashset1.remove("Joao"));
		System.out.println(hashset1);
		
		Set<String> hashset2 = new HashSet<>();
		hashset2.add("Carlinhos");
		hashset2.add("Eduardo");
		hashset2.add("Pedro");
		
		System.out.println(hashset1.removeAll(hashset2));
		System.out.println(hashset1);
		
		//hashset1.clear();
		System.out.println(hashset1);
		
		
		hashset2.stream().forEach(s-> System.out.println(s));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

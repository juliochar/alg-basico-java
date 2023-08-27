package PadroesProjeto.Singleton;

public class DemoSingletonTeste {

	public static void main(String[] args) {
		
		
		Singleton singleton = Singleton.getInstance("FOO");
		
		Singleton another = Singleton.getInstance("BAR");
		
		System.out.println(singleton.value);
		System.out.println(another.value);

	}

}

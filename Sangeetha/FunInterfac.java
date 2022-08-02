@FunctionalInterface
interface Abc{
	void fun();
	static int app(){
		
	}
}
public class FunInterfac {
	
	public static void main(String[] args) {
		// syntax to lamda expression for functional interface
		Abc bc= ()->{System.out.println("I am created");};
		
		bc.fun();
	}
}



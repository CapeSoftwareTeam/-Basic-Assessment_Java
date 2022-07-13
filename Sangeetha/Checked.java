
public class Checked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ok");
		try{
		Class.forName("testing");
		//ClassLoader.findSystemClass();
		//ClassLoader.loadClass();
		}
		catch(ClassNotFoundException iu){
		System.out.println("This is one of the cause of cnf exception");
		}
	}

}

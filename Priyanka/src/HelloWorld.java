
public class HelloWorld {
	String Name ;
	int id ;
	
	HelloWorld(String i , int a){
		this.Name = i;
		this.id=a;
		
		
		
		
	}


	public static void main(String[] args) {
		HelloWorld helo = new HelloWorld("Priya" , 10);
		 
			System.out.println(helo.Name+"        " + helo.id);
		
	
		
	}
}



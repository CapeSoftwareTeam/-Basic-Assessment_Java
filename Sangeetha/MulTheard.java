
public class MulTheard {

	

	public static void main(String[] args) {
	Sample sm=new Sample();
	System.out.println("I am normal one");

	Thread t1= new Thread(sm);
	Thread t2= new Thread(sm);
	Thread t3= new Thread(sm);
	
t1.start();
	t2.start();
	t3.start();
t1.run();
t2.run();
t3.run();
	}

}

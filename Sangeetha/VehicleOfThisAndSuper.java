
/*public class VehicleOfThisAndSuper {

	int vegetable=30;
}
class onion extends VehicleOfThisAndSuper{
	
	int vegetable=50;
	void display() {
		
		System.out.println(this.vegetable);
	}

	public static void main(String[] args) {
		
		onion vege=new onion();
        vege.display();
	}

	}*/



public class VehicleOfThisAndSuper {
	int fruit12; 
	VehicleOfThisAndSuper(){
		fruit12=45;
	System.out.println(" The price is "+fruit12);
}
}
class mango extends VehicleOfThisAndSuper {
	mango(){
		super();
	 int fruit =55;
		
		System.out.println("The Reduction price is "+super.fruit12);
	}
	public static void main(String args[]) {
		mango mn= new mango();
		
	}
}

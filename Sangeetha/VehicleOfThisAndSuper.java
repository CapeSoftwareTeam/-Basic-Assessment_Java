
public class VehicleOfThisAndSuper {

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

	}



/*public class VehicleOfThisAndSuper {
	VehicleOfThisAndSuper(){
	int fruit=45; 
	System.out.println(" The price is "+fruit);
}
}
class mango{
	mango(){
		super();
		int fruit= 25;
		System.out.println("The Reduction price is "+fruit);
	}
	public static void main(String args[]) {
		mango mn= new mango();
		
	}
}
*/
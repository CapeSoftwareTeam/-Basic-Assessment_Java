
public class Over extends OverRide {
	public void display3() {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		OverRide obj1 = new OverRide();
		obj1.display();
		Over obj2 = new Over();
		obj2.display2();
		obj2.display3();
		// TODO Auto-generated method stub

	}

}

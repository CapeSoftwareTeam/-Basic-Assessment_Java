interface vikram{
	void Syso();
	void display();

}
abstract class rolex implements vikram{
 public void syso() {
	System.out.println("Demo.. D. D. Demo...");
}
}
class sandhanam extends rolex{

	public void Syso() {
		System.out.println(" legends are thugs but thugs are not legends ");
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("arambikalama");
	}
	public static void main(String[] args) {
		vikram sand=new sandhanam();
		sand.display();
		sand.Syso();
	}
}

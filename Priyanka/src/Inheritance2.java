
public class Inheritance2 extends Inheritance {
	 
	@Override
	public Integer cal1() {
int newI  =		super.cal1();
		int i=2+2;
		 
		return  i;
	}

	public static void main(String[] args) {
	 Inheritance2 obj = new Inheritance2();
	 Inheritance obj1 = new Inheritance();
	 Integer returnValue1= obj1.cal1();
	 System.out.println(returnValue1);
	 
	 Integer returnValue= obj.cal1();
	 System.out.println(returnValue);

	}

}

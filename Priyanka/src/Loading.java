
public class Loading {
     public void show(int a, int b) {
    	 System.out.println(a+b);
     }
     public void show(int a,int b,int c) {
    	 System.out.println(a+b+c);
     }
     public void show(double x, double y ) {
    	 System.out.println(x+y);
     }
     public void show(double x, double y, double z) {
    	 System.out.println(x*y*z);
     }
	public static void main(String[] args) {
		Loading load = new Loading();
		load.show(2,4,7);
		load.show(67,78);
		load.show(2.2, 5.6);
		load.show(1.2,3.4,3.4);
		// TODO Auto-generated method stub

	}

}

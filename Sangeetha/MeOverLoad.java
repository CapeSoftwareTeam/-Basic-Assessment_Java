
public class MeOverLoad {
	static int add(int a,int b) {
		System.out.println("The number is"+(a+b));
		return a+b;
		
	}
	 float add(int a, float b) {
		System.out.println("The number is"+(a-b));
		return (a-b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 MeOverLoad mv= new MeOverLoad();
		add(1,8);
		add(4, (int) 1.9);
		
	}
	

}

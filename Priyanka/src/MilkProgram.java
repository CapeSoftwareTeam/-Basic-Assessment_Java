import java.util.Scanner;
public class MilkProgram {

	public static void main(String[] args) {
		
		
		int a,b,c;
		double c1=3.25,c2=4.15,gain,d,e;
		System.out.println("Enter the number of liters of milk purchased by the vendor:");
		Scanner obj1=new Scanner(System.in);
		a=obj1.nextInt();
		b=a/4;
		System.out.println("The amount of water added to the milk in liters is:"+b);
		c=a+b;
		System.out.println("The final quantity of milk and water mixture is:"+c);
		d=a*c1;
		e=c*c2;
		gain=e-d;
		System.out.println("The gain of the vendor is:"+gain+"rupees");
		}
		
		

	}



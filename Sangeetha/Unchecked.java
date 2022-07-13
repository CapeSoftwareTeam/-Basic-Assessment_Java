import java.util.*;
public class Unchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Enter the Numberator");
			Scanner number=new Scanner(System.in);
			int num1= number.nextInt();

			System.out.println("Enter the denominator");
			Scanner number1=new Scanner(System.in);
			int num2= number1.nextInt();

			int num= num1/num2;
			System.out.println("The Division Number is : "+num);
			}
			catch(Exception er){
			System.out.println("These values lead to arithmetic expression");
			}
	}

}

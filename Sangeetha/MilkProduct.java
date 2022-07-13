import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MilkProduct {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(formatter.format(date));
		System.out.println("Welcome");
		Scanner qc=new Scanner(System.in);
		float litre[]=new float[4];
		float amount[]=new float[4];

		for(int i=1;i<=3;i++){
		System.out.println("How many litres of milk is needed? ");
		litre[i]=qc.nextFloat();
		amount[i]=litre[i]*23;
		}
		for(int j=1;j<=3;j++){
		System.out.println("the amount for "+litre[j]+ "is:"+amount[j]);
		}

		System.out.println("Thank you for purchasing Here");

	}
}

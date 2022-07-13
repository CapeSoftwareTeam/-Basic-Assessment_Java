import java.util.Scanner;

public class Milk {
	public static void main(String[] args) { 
	 System.out.println("Welcome");
     System.out.println("How many litres of milk is needed? ");
     System.out.println("Type in decimal");

     Float[] numberOfLiter = new Float[10];

     Scanner scanner = new Scanner(System.in);
     
     for (int i = 0; i <= 3; i++) {

         System.out.println("User -->" + (i));
         Float liter = scanner.nextFloat(); // liter
         System.out.print("Number Of liters" + liter + "amount is -->" + liter.intValue() * 20);

         numberOfLiter[i] = liter;
         System.out.println();

     }

     
 
     System.out.println("List liters");
     int rupess = 0;
     int day = 1;
     for (Float i : numberOfLiter) {
         if (i != null) {
             System.out.print("Day-" + day + " " + +i);
             System.out.print(" --> ");
             rupess = rupess + (i.intValue() * 20);
             day++;
         }

         System.out.println();
     }
     System.out.println("Total amount" + rupess);
	}
}

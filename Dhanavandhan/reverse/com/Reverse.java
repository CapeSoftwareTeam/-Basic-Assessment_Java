package reverse.com;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your String :");
		 String s=sc.nextLine();
		 for(int i=s.length();i>0;--i) {
			 System.out.print(s.charAt(i-1));
		 }
		

	}

}

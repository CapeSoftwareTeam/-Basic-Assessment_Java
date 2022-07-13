package reverse.com;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   Scanner sc=new Scanner(System.in);
                   int a,b;
                  System.out.println("Enter the Value of a:");
                   a=sc.nextInt();
                   System.out.println("Enter the Value of b:");
                   b=sc.nextInt();
                   a=a+b;
                   b=a-b;
                   a=a-b;
                   System.out.println("a="+a+"  "+"b="+b);
	}

}

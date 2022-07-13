package reverse.com;

import java.util.Scanner;

public class uncheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("enter the name");
			String Name = sc.nextLine();
			System.out.println("you enter the Name:" + Name);
		}

	}

}

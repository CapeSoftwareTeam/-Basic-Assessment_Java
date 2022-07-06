package dhana.com;

import java.util.Scanner;

public class Milk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many days:");
		n = sc.nextInt();
		String name[] = new String[n];
		String date[] = new String[n];
		float litter[] = new float[n];
		float amount[] = new float[n];
		float total = 0, change, remain;
		int give, onelitter = 35;
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Enter Your Name:");
			name[i] = sc.nextLine();
			System.out.println("Enter your Date:");
			date[i] = sc.next();
			System.out.println("enter you want Milk:");
			litter[i] = sc.nextFloat();
			amount[i] = litter[i] * onelitter;
			System.out.println("your Bill Value :" + amount[i]);
			total += amount[i];
		}
		System.out.println("your" + " " + n + " " + "Days bill value:" + total);
		System.out.println("You give amount:");
		give = sc.nextInt();
		if (give < total) {
			remain = total - give;
			System.out.println("Please give Remain balance:" + remain);
			System.out.println("Enter amount of remain:");
			give = sc.nextInt();
			if (give > remain) {
				change = give - remain;
				System.out.println("your change please collect amount:" + change);
			}
		} else if (give == total) {
			System.out.println("thank for Purchasing");

		} else {
			change = give - total;
			System.out.println("your change is :" + change);
		}
	}

}

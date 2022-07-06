package dhana.com;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Milk3 {
	static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many days");
		n = sc.nextInt();
		Millk2 m[] = new Millk2[n];

		double totalamount = 0, change, give, balance, remain;
		for (int i = 0; i < n; i++)
		{
			Millk2 k = new Millk2();
			sc.nextLine();
            k.date = LocalDate.now();
			LocalDate.now();
			System.out.println(k.date + " Enter Your Name:");
			k.name = sc.nextLine();
            System.out.println("How Many Litters you want milk:");
			k.litter = sc.nextFloat();
			k.amount = k.litter * k.onelitter;
			System.out.println("your bill values:=" + k.amount);
            m[i] = k;
            totalamount += k.amount;
		}
		System.out.println("Your" + " " + n + "days details are:");
        for (Millk2 s : m) 
        {

			System.out.println("Name:" + s.name + "     " + "Date:" + s.date + "     " + "Litter:" + s.litter + "     "
					+ "Amount:" + s.amount);

		}
		System.out.println("total bill value:" + totalamount);
		System.out.println("Amount you give:");
		give = sc.nextDouble();
		if (give < totalamount) 
		{
			remain = totalamount - give;
			System.out.println("Please give remain balance are:" + remain);
			System.out.println("Enter you give amount:");
			give = sc.nextDouble();
			if (give > remain)
			{
				change = give - remain;
				System.out.println("your change please collect amount:" + change);
			}
		} 
		else if (give == totalamount)
		{
			System.out.println("thanks for Purchasing");

		} else
		{
			change = give - totalamount;
			System.out.println("your change is :" + change);
			System.out.println("thanks for Purchasing");
			
		}
	}
}

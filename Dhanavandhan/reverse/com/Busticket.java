package reverse.com;

import java.util.Scanner;

public class Busticket {
	double ticketPrice;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Busticket a = new Busticket();

		for (int f = 1; f < 6; f++) {
			System.out.println("this bus are only five stops:" + "1)thiruvannamalai" + "   " + "2)gingee" + "   "
					+ "3)Thindivanam" + "   " + "4)chengalpattu" + "   " + "5)perungulathur ");

			System.out.println("press 1 to book ticket thiruvannamalai");
			System.out.println("press 2 to book ticket gingee");
			System.out.println("press 3 to book ticket Thindivanam");
			System.out.println("press 4 to book ticket chengalpattu");
			System.out.println("press 5 to book ticket perungulathur");
			System.out.println("press 6 to Exit");

			f = sc.nextInt();

			switch (f) {

			case 1:

				a.ticketPrice = 175;
				System.out.println("your ticket price:" + a.ticketPrice);

				break;
			case 2:

				a.ticketPrice = 133;
				System.out.println("your ticket price:" + a.ticketPrice);
				break;
			case 3:
				a.ticketPrice = 120;
				System.out.println("your ticket price:" + a.ticketPrice);
				break;
			case 4:
				a.ticketPrice = 75;
				System.out.println("your ticket price:" + a.ticketPrice);
				break;
			case 5:
				a.ticketPrice = 35;
				System.out.println("your ticket price:" + a.ticketPrice);
				break;
			default:

			}

			if (f == 6) {

				System.out.println("thank you");
				// TODO Auto-generated method stub
			} else if (f < 1) {
				System.out.println("You enter Wrong Option");
			}

			else if (f < 6) {
				a.display(sc, a);

			}

			else {
				System.out.println("You enter Wrong Option");
			}
		}
	}

	private void display(Scanner sc, Busticket a) {
		int n;

		double give, remain, change, totalamount;
		Busticket j = new Busticket();
		System.out.println("enter how many Tickets youwant");
		n = sc.nextInt();
		totalamount = n * a.ticketPrice;
		System.out.println("yor total Amount:" + totalamount);
		System.out.println("Amount you give:");
		give = sc.nextDouble();
		if (give < totalamount) {
			remain = totalamount - give;
			System.out.println("Please give remain balance are:" + remain);
			System.out.println("Enter you give amount:");
			give = sc.nextDouble();
			if (give > remain) {
				change = give - remain;
				System.out.println("your change please collect amount:" + change);
				System.out.println("thanks for travel our bus");
			} else if (give == remain) {
				System.out.println("thanks for travel our bus");
			}
		} else if (give == totalamount) {
			System.out.println("thanks for travel our Bus");

		} else {
			change = give - totalamount;
			System.out.println("your change is :" + change);
			System.out.println("thanks for travel our Bus");

		}
	}
}

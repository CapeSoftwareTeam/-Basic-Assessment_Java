package reverse.com;

import java.util.Scanner;

public class Busticket {
	double ticketPrice;
public static void main(String []args) {
	
	Scanner sc=new Scanner(System.in);
	Busticket a=new Busticket();
	
	System.out.println("this bus are only five stops:"
			+ "1)thiruvannamalai"
			+"   "+ "2)gingee"
			+"   "+ "3)Thindivanam"
			+"   "+ "4)chengalpattu"
			+"   "+ "5)perungulathur ");
	
	System.out.println("enter which Place you Want ticket:");
	
	String f=sc.next();
	switch(f) {
	
	case "thiruvannamalai":
	
		a.ticketPrice=175;
		System.out.println("your ticket price:"+a.ticketPrice);
		
	break;
	case "Gingee":
	
		a.ticketPrice=133;
		System.out.println("your ticket price:"+a.ticketPrice);
		break;
	case "Thindivanam":
		a.ticketPrice=120;
		System.out.println("your ticket price:"+a.ticketPrice);
		break;
	case "chengalpattu":
		a.ticketPrice=75;
		System.out.println("your ticket price:"+a.ticketPrice);
		break;
	case "perungulathur":
		a.ticketPrice=35;
		System.out.println("your ticket price:"+a.ticketPrice);
		break;
	default:
		System.out.println("The Stop Not Available in Our Bus Services");
	 
		break;
	}
	
	int n;
	
	double give,remain,change,totalamount;
	Busticket j=new Busticket();
	System.out.println("enter how many Tickets youwant");
	n=sc.nextInt();
	totalamount=n*a.ticketPrice;
	System.out.println("yor total Amount:"+totalamount);
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
			System.out.println("thanks for travel our bus");
		}else if(give == remain) {
			System.out.println("thanks for travel our bus");
		}
	} 
	else if (give == totalamount)
	{
		System.out.println("thanks for travel our Bus");
		

	} else
	{
		change = give - totalamount;
		System.out.println("your change is :" + change);
		System.out.println("thanks for travel our Bus");
	
}
	// TODO Auto-generated method stub

}
}

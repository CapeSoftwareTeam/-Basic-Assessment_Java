package reverse.com;

import java.util.Scanner;

public class bank {
static Scanner sc=new Scanner(System.in);
	int AccountNo,i;
	String Name,h;
    float Balance;
    float a;
    public void show(int i,String j,String h,float a) {
    	
      System.out.println("AccountNo:"+i+" "+"Name:"+Name+"  "+"type:"+h +"    "+"balnce:"+a);
      Balance=a;
    }
	public void depositamount() {
		System.out.println("enter Deposit Amount:");
		a=sc.nextFloat();
		Balance+=a;
		System.out.println("balance:"+Balance);
}
	public void Withdraw()
	{
		System.out.println("Enter you Withdraw Amount");
		a=sc.nextFloat();
		if(Balance<a) {
			System.out.println("Insufficient Balance");
			
		}else
		{
			Balance-=a;
			System.out.println("Your current Balance:"+Balance);
		}
	}
	public void Cheakbalance()
	{
		System.out.println("Your Current Balance Are:"+Balance);
	}
}
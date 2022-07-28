import java.util.Scanner;

public class BankWithdrawal {
	
	int amt = 5000;
	int withdraw;
	int avail;
	int givenamt;
	public void heloo() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Banker: What do u want?");
		System.out.println("User:" +obj.nextLine());
		System.out.println("Banker: Write your Account number and IFSC Code");
		System.out.println("User:" +obj.nextLine());
		System.out.println("Banker:Deposit or withdrawal?");
		String value = obj.nextLine();
		System.out.println("user:" +value);
	
	    if(value.equalsIgnoreCase("Deposit")) {
	    	this.heloo(1);
	    }
	    else if(value.equalsIgnoreCase("Withdrawal")){
	    	this.heloo("a");
	    }
	    System.out.println("Thanks for your transaction");
	}
	
	
	public int heloo(int a) {
		System.out.println("Your account balance:"+amt);
		Scanner obj = new Scanner(System.in);
		System.out.println("Banker: Type Your Deposit amount");
		int givenamt= obj.nextInt();
		System.out.println("User:" +givenamt);
	
			int balance=amt+givenamt;
			System.out.println("Deposit is successful ur available balance "+ balance);
		
		
		return balance;
		
		
	}
	public int heloo(String a) {	
		System.out.println("Your account balance:" +amt);
		Scanner obj = new Scanner(System.in);
		System.out.println("Banker: Type Your Withdrawal");
		int givenamt= obj.nextInt();
		System.out.println("User:" +givenamt);
		if(amt>=givenamt) {
			int balance=amt-givenamt;
			System.out.println("tranasaction is successful ur available balance "+ balance);
			return balance;
		}
		
		else
		{
			System.out.println("Insufficient Fund");
			return amt;
		}		
	}
	

		
	
	

	public static void main(String[] args) {
		BankWithdrawal obbj = new BankWithdrawal();
		obbj.heloo();
		// TODO Auto-generated method stub

	}

}

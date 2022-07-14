import java.util.Scanner;

public class BankWithdrawal {
	
	int Amt;
	int Withdraw;
	int Avail;
	public void helo() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Banker: What do u want?");
		System.out.println("User:" +obj.nextLine());
		System.out.println("Banker: Write your Account number and IFSC Code");
		System.out.println("User:" +obj.nextLine());
		System.out.println("Banker:Deposit or Withdrawal?");
		System.out.println("user:" +obj.nextLine());
	
		
		
			
		
	}
	public void heloo() {
		Amt=5000;
	
		
		System.out.println("Your account balance:5000");
		Scanner obj = new Scanner(System.in);
		System.out.println("Banker: Type Your Withdrawal");
		int givenamt= obj.nextInt();
		System.out.println("User:" +givenamt);
		if(Amt>givenamt) {
			int balance=Amt-givenamt;
			System.out.println("tranasaction is successful ur available balance "+ balance);
		}
		else
		{
			System.out.println("Insufficient Fund");
		}
		
		
	}
	

	public static void main(String[] args) {
		BankWithdrawal obbj = new BankWithdrawal();
		obbj.helo();
		obbj.heloo();
		// TODO Auto-generated method stub

	}

}

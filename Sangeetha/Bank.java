import java.util.Scanner;
public class Bank {
	 void checkbalance() {
		int a= 1000000;
		System.out.println("The balance amount is:" +a);
	}
	void deposit() {
		int a= 1000000;
		System.out.println(" Enter your deposit amount");
		Scanner ds=new Scanner(System.in);
		int r = ds.nextInt();
		int y=a+r;
		System.out.println("The total amount after deposit is:"+y);
		}
    void withdraw() {
    	int a=1000000;
    	System.out.println("how much amount would you like to withdraw");
    	Scanner wd=new Scanner(System.in);
    	int u = wd.nextInt();
    	int i= a-u;
    	if(u>a) {
    		System.out.println("your balance amount is only "+a+" kindly enter amount within your balance");
    	}else {
    		System.out.println(" Your balance amount is "+i);
    }
    }
	public static void main(String[] args) {
		int a=1000000;
Bank bk=new Bank(); 
System.out.println("select any option you need");
System.out.println(" * checkbalance");
System.out.println(" * deposit");
System.out.println(" * withdraw");
Scanner ban= new Scanner (System.in);
String fz= ban.nextLine();
String p="withdraw";
if(fz.matches(p)) {
bk.withdraw();
}
String pa="deposit";
if(fz.matches(pa)) {
bk.deposit();
}
String pp="checkbalance";
if(fz.matches(pp)) {
bk.checkbalance();
	}
	}
}

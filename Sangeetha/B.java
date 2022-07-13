import java.util.Scanner;
public class B {

	public static void main(String[] args) {
	
		System.out.println(" Welcome to Bus No.5E ");
		System.out.println(" Starting Stop is chengalpattu");
		System.out.println(" Select the list of bus stops below: ");
		System.out.println(" * Tambaram");
		System.out.println(" * Alandur");
		System.out.println(" * vadapalani");
		System.out.println(" * cmbt");
		String s="tambaram";
		String s1="alandur";
		String s2="vadapalani";
		String s3="cmbt";
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your Stop: ");
		String hr=sc.next();

		if(hr.compareTo(s) == 0){
		System.out.println(" your stop distance is: 4km ");
		System.out.println(" The ticket amount is: Rs.9 ");
		Scanner qc=new Scanner(System.in);
		System.out.println(" Enter your ticket amount: ");
		int r=qc.nextInt();
		int h = r-9;
		System.out.println(" Your balance amount is: "+h);
		}

		else if(hr.compareTo(s1) == 0){
		System.out.println(" your stop distance is: 6km ");
		System.out.println(" The ticket amount is: Rs.13 ");
		Scanner wc=new Scanner(System.in);
		System.out.println(" Enter your ticket amount: ");
		int t=wc.nextInt();
		int j = t-13;
		System.out.println(" Your balance amount is: "+j);
		}

		else if(hr.compareTo(s2) == 0){
		System.out.println(" your stop distance is: 8km ");
		System.out.println(" The ticket amount is: Rs.15 ");
		Scanner ec=new Scanner(System.in);
		System.out.println(" Enter your ticket amount: ");
		int p=ec.nextInt();
		int k = p-15;
		System.out.println(" Your balance amount is: "+k);
		}

		else if(hr.compareTo(s3) == 0){
		System.out.println(" your stop distance is: 12km ");
		System.out.println(" The ticket amount is: Rs.23 ");
		Scanner vc=new Scanner(System.in);
		System.out.println(" Enter your ticket amount: ");
		int p=vc.nextInt();
		int m = p-23;
		System.out.println(" Your balance amount is: "+m);
		}
		else{
		System.out.println("The bus No:5E will not go to other stop apart from the mentioned above list");
		}
		System.out.println("kindly enjoy your ride");
		}
		
	}



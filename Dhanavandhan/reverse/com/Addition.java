package reverse.com;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,total=0;
		System.out.println("enter the number of Subects:");
		n=sc.nextInt();
		int mark[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the Marks:"+(i+1));
			mark[i]=sc.nextInt();
			total+=mark[i];
			
		}
      System.out.println("total:"+total);
	}

}

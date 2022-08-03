import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of students: ");
		int n=sc.nextInt();
		int rollno[] =new int[n];
		String name[] = new String[n];
		int m1[] = new int[n];
		int m2[] = new int[n];
		int m3[] = new int[n];
		double avg;
		for (int i=0;i<n;i++) {
			System.out.println("Student Detail " +(i=1));
			System.out.print("Roll No:");
			rollno[i] = sc.nextInt();
			System.out.print("Name: ");
			name[i] = sc.next();
			System.out.print("3 subjects Mark: ");
			m1[i] = sc.nextInt();
			m2[i] = sc.nextInt();
			m3[i] = sc.nextInt();
		}
		System.out.println("STUDENT RESULTS");
		for(int i=0; i<n; i++) {
			avg=(m1[i]+m2[i]+m3[i])/3.0;
			System.out.println("Roll No:"+rollno[i]);
			System.out.println("Name:"+name[i]);
			System.out.println("Average"+avg);
			if(avg>=85)
				System.out.println("EXCELLENT");
			else if(avg>=75 && avg<=84)
				System.out.println("DISTINCTION");
			else if(avg>=60 && avg<=74)
				System.out.println("FIRST RANK");
			else if(avg>=40 && avg<=59)
				System.out.println("PASS");
			else
				System.out.println("POOR");
		}
		}

	}



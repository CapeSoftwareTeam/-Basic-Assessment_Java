import java.util.*;
import java.text.SimpleDateFormat;
public class MilkPre {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(" enter your name: ");
		Scanner sc = new Scanner(System.in);
		String user= sc.next();
		String[] name = {"Arun","Dhana","Elango","Thirumoorthy"};
		String [] litre = {"18-07-2022 for 2", "18-07-2022 for 3","18-07-2022 for 8","18-07-2022 for 1"};
		String [] litre1 = {"19-07-2022 for 4", "19-07-2022 for 2","19-07-2022 for 1","19-07-2022 for 3"};
		int[] milk= {2,3,8,1};
		int[] milk1= {4,2,1,3};
		for(int i=0;i<name.length;i++) {
		if(user.equalsIgnoreCase(name[i])){
			System.out.println("The amount for "+litre[i]+ " is " +milk[i]*23);
			System.out.println("The amount for "+litre1[i]+ " is " +milk1[i]*23);
		}
	}
	}
}

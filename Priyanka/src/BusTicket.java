import java.util.Scanner;

public class BusTicket {
	
	
	public static void main(String[] args) {
		String place;
		int busticket=0;
		String place1 ="Vadapalani";
		String place2 ="Ashok pillar";
		String place3 ="Kassi theatre";
		String place4 ="Ekatuthangal";
		String place5 ="Olympia";
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your place");
		place=obj.next();
		if(place.equalsIgnoreCase(place1)) {
			busticket=10;
			}
		else if(place.equalsIgnoreCase(place2)) {
			busticket=15;
		}
		else if(place.equalsIgnoreCase(place3)) {
			busticket=20;
		}
		else if(place.equalsIgnoreCase(place4)) {
			busticket=25;
		}
		else if(place.equalsIgnoreCase(place5)) {
			busticket=30;
		}
		
		else {
			System.out.println("not available");
		}
		
		System.out.println("your bus ticket"+ busticket);
		
		
		
		// TODO Auto-generated method stub

	}

}

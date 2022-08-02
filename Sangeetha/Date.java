import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	 
		String[] nme = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		System.out.println(" Enter name: ");
		Scanner name = new Scanner(System.in);
		char[] inputName = name.next().toCharArray(); //char hi	
 		String indexNumber="";//2
		  //command
 		for (int i = 0; i<inputName.length; i++) {
			for (int j = 0; j <nme.length; j++) { // 	
				if (nme[j].charAt(0) == (inputName[i])) {
					indexNumber=indexNumber +inputName[i]+" index is "+j+ " ";
					//System.out.print(" Your name index is " +j);
				}
			}
		}
		System.out.print(indexNumber);

	}


}

import java.util.*;

public class StudentMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fetch = new Scanner(System.in);

		String[] name = { "san", "priya", "abhi" };
		int[] maths = { 100, 98, 100 };
		int[] eng = { 98, 100, 84 };
		int[] sci = { 99, 99, 65 };
		System.out.println("Enter the name: ");
		String nme = fetch.next();
		
		for (int i = 0; i < name.length; i++) {
			if (name[i].contains(nme)) {
				int res = (maths[i]) + (eng[i]) + (sci[i]);
				System.out.println(" The Student " + name[i]+ "marks in mathematics is : " + maths[i]+"in science is : "
						+ sci [i]+ "and in english is" + eng[i]);
				System.out.println("The total mark is: " + res);

			}
		}
	}
}

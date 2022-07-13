
public class StudentMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			String[] name={"san","priya","abhi"};
			int[] maths={100,98,100};
			int[] eng={98,100,84};
			int[] sci={99,99,98};

			for(int i=0;i<name.length;i++){
			int res= (maths[i])+(eng[i])+(sci[i]);
			System.out.println("The mark for "+name[i]);
			System.out.println("The mark for Maths is"+maths[i]);
			System.out.println("The mark for English is"+eng[i]);
			System.out.println("The mark for Science is"+sci[i]);
			System.out.println("The  total mark is"+res);
			}
	}

}

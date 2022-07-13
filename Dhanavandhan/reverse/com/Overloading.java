package reverse.com;

public class Overloading {

	
	
                int add(int a,int b) {
            	   return a+b;
            	   
               }
               float add(int a,float b) {
            	   return a+b;
               }
               public static void main(String[] args) {
           		// TODO Auto-generated method stub
           		Overloading s=new Overloading();
                          System.out.println(s.add(3, 40));
                            
           	}
}

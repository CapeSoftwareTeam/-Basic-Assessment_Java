
 class Sample extends Thread{
 void s1() {
	 System.out.println("This is method: 1");
  }
 public synchronized void s2() {
	 System.out.println("This is method: 2"); 
 }
 void s3() {
	 System.out.println("This is method: 3"); 
 }
 public void run() {
	 s1();
	 s2();
 }
 }

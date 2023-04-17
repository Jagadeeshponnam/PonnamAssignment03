package Threads;
/**
 * @author S555255 Ponnam Jagadeesh
 *
 * 
 */
public class DriverClass {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ImplementingRunnableInterface r1 = 
			new ImplementingRunnableInterface("Hello, World!");
			 Thread t = new Thread(r1);
			 t.start();
			  }

}

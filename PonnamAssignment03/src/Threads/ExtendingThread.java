package Threads;
/**
 * @author S555255 Ponnam Jagadeesh
 *
 * 
 */
public class ExtendingThread extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendingThread t1 = new ExtendingThread();
		t1.start();
		System.out.println("Running Outside the Thread");
	}

	public void run() {
		System.out.println("Running Inside the Thread");
	}
}

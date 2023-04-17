package Threads;
/**
 * @author S555255 Ponnam Jagadeesh
 *
 * 
 */
public class ImplementingRunnableInterface implements Runnable{
	  private String greeting;
	  
	  public ImplementingRunnableInterface(String greeting) {
		super();
		this.greeting = greeting;
	}

	public void run() {
		 try {
		   System.out.println(greeting);
		 } catch (Exception e) {
		 }
		  
		 }
}

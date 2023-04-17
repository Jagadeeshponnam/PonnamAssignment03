package GarbageCollectionTest;
/**
 * @author S555255 Ponnam Jagadeesh
 *
 * 
 */
public class GarbageCollectionTest {
	   public static void main(String args[]) {
	      System.out.println(Runtime.getRuntime().freeMemory());
	      for (int i=0; i<= 100000; i++) {
	         Double d = new Double(300);
	      }
	      System.out.println(Runtime.getRuntime().freeMemory());
	      System.gc();
	      System.out.println(Runtime.getRuntime().freeMemory());
	   }
	}

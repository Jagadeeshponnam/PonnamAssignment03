package CovarientReturn;
/**
 * @author S555255 Ponnam Jagadeesh
 *
 * 
 */
public class covRtnTyp {
	covRtnTyp get() {
	      System.out.println("SuperClass of Covariant Return Type");
	      return this;
	   }

}
class covReturn extends covRtnTyp {
	   covReturn get() {
	      System.out.println("SubClass of Covariant Return Type");
	      return this;
	   }
	   public static void main(String[] args) {
		   covRtnTyp obj = new covReturn();
	      obj.get();
	   }
	}

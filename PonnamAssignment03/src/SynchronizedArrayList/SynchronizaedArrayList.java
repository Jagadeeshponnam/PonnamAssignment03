package SynchronizedArrayList;
import java.util.*;

/**
 * @author S555255 Ponnam Jagadeesh
 *
 * 
 */
public class SynchronizaedArrayList {
	public static void main (String[] args)
    {
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
 
        list.add("dfe");
        list.add("cas");
        list.add("dad");
 
        synchronized(list)
        {
            // must be in synchronized block
            Iterator<String> it = list.iterator();
 
            while (it.hasNext()) {
            	System.out.println(it.next());
            }
                
        }
    }
}


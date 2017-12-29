
import java.util.*;


public class Union
{
	public static Vector union (Vector a, Vector b)
	{      
		if (a.isEmpty() || b.isEmpty())
	    {
	        throw new IllegalArgumentException ("Min.min");
	    }
		
	    if (a == null || b == null)
	    {
	    	throw new NullPointerException ("Union.union");
	    }
	    return a;
	}
}
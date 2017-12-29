
import java.util.*;


public class Union
{
	public static Vector union (Vector a, Vector b)
	{      
		if (a.isEmpty() || b.isEmpty())
	    {
	        throw new IllegalArgumentException ("Union.union");
	    }
		
	    if (a == null || b == null)
	    {
	    	throw new NullPointerException ("Union.union");
	    }
	    
	    Iterator itr = a.iterator();
	    Vector result = new Vector (b);
	    while (itr.hasNext())
	    {   // throws NPE, CCE as needed
	        Object comp = itr.next();
	        if (b.contains(comp))
	        {
	            ;
	        }else {
	        	result.add (comp);
	        }
	    }
	    return result;
	}
	
	public static Set unionSet (Set a, Set b)
	{
		
		if (a.isEmpty() || b.isEmpty())
	    {
	        throw new IllegalArgumentException ("UnionSet.union");
	    }
		
	    if (a == null || b == null)
	    {
	    	throw new NullPointerException ("UnionSet.union");
	    }
	    Iterator itr = a.iterator();
	    Set result1 = new HashSet(b);
	    while (itr.hasNext())
	    {   // throws NPE, CCE as needed
	        Object comp = itr.next();
	        result1.add (comp);
	    }
	    return result1;
		
	
	}
}
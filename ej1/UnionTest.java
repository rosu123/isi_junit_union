import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class UnionTest {

	//private Vector<String> list;
	private Vector a;
	private Vector b;
	
	@Before
	public void setUp()
	{
	   a = new Vector();
	   b = new Vector();
	}

	@After
	public void tearDown()
	{
	   a = null; 
	   b = null;
	}
	
	@Test
	public void testForNullElements()
	{
		a = null;
		//a.addElement("fruit1");
		b = null;
	   try {
		   Union.union(a, b);
	   } catch (NullPointerException e) {
	      return;
	   }
	   fail ("NullPointerException expected");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testEmptyElements()
	{
		Union.union(a, b);
	}
	
	@Test
	public void testDifferentElements()
	{
	   a.add ("dog");
	   b.add ("cat");
	   Vector vec2 = new Vector();
	   vec2.add("cat");
	   vec2.add("dog");
	   Vector vec1 = Union.union(a, b);
	   assertTrue ("Error adding different elements", vec1.equals(vec2));
	}
	
	

}
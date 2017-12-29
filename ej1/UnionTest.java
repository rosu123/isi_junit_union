import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class UnionTest {

	//private Vector<String> list;
	private Vector a;
	private Vector b;
	private Set c;
	private Set d;
	
	@Before
	public void setUp()
	{
	   a = new Vector();
	   b = new Vector();
	   c = new HashSet();
	   d = new HashSet();
	}

	@After
	public void tearDown()
	{
	   a = null; 
	   b = null;
	   c = null;
	   d = null;
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
	
	@Test
	public void testSetForNullElements()
	{
		c = null;
		//a.addElement("fruit1");
		d = null;
	   try {
		   Union.unionSet(c, d);
	   } catch (NullPointerException e) {
	      return;
	   }
	   fail ("NullPointerException expected");
	}

	@Test (expected = IllegalArgumentException.class)
	public void testSetEmptyElements()
	{
		Union.unionSet(c, d);
	}
}
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class UnionSetTest {

	private Set a;
	private Set b;
	
	@Before
	public void setUp()
	{
	   a = new HashSet();
	   b = new HashSet();
	}

	@After
	public void tearDown()
	{
	   a = null; 
	   b = null;
	}
	
	@Test
	public void testSetForNullElements()
	{
		a = null;
		//a.addElement("fruit1");
		b = null;
	   try {
		   Union.unionSet(a, b);
	   } catch (NullPointerException e) {
	      return;
	   }
	   fail ("NullPointerException expected");
	}

	@Test (expected = IllegalArgumentException.class)
	public void testSetEmptyElements()
	{
		Union.unionSet(a, b);
	}
	
	
	@Test
	public void testSetDifferentElements()
	{
	   a.add ("dog");
	   a.add("bird");
	   b.add ("cat");
	   b.add("dog");
	   Set set2 = new HashSet();
	   set2.add("cat");
	   set2.add("dog");
	   set2.add("bird");
	   Set set1 = Union.unionSet(a, b);
	   assertTrue ("Error adding different elements", set1.equals(set2));
	}
	
	@Test
	public void testSetGenericDifferentTypes()
	{
		a.add ("dog");
		a.add("bird");
		b.add("cat");
		b.add(5);
		Union.unionSet(a, b);
		Set set2 = new HashSet();
		set2.add("cat");
		set2.add("dog");
		set2.add("bird");
		set2.add(5);
		Set set1 = Union.unionSet(a, b);
		assertTrue ("Error adding different elements", set1.equals(set2));
	}
}

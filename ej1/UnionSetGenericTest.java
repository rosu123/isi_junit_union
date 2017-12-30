import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class UnionSetGenericTest {

	//private Vector<String> list;
	private Set<String> a;
	private Set<String> b;
	
	@Before
	public void setUp()
	{
	   a = new HashSet<>();
	   b = new HashSet<>();
	}

	@After
	public void tearDown()
	{
	   a = null; 
	   b = null;
	}
	
	@Test
	public void testSetGenericForNullElements()
	{
		a = null;
		//a.addElement("fruit1");
		b = null;
	   try {
		   Union.unionSetGeneric(a, b);
	   } catch (NullPointerException e) {
	      return;
	   }
	   fail ("NullPointerException expected");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSetGenericEmptyElements()
	{
		Union.unionSetGeneric(a, b);
	}
	
	@Test
	public void testSetGenericDifferentElements()
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
	
}

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
	
	
	
}

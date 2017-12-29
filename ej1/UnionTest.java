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

}

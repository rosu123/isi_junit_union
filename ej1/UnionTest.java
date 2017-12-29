package UnionTest;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class UnionTest {

	//private Vector<String> list;
	private List<String> a;
	private List<String> b;
	
	@Before
	public void setUp()
	{
	   a = new ArrayList<String>();
	   b = new ArrayList<String>();
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
		b = null;
	   try {
	      Union.union (a, b);
	   } catch (NullPointerException e) {
	      return;
	   }
	   fail ("NullPointerException expected");
	}

}

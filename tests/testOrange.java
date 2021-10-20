import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import td_testing.Orange;

public class testOrange {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEquals() {
		Orange o1 = new Orange(10, "Grece");
		Orange o2 = new Orange(20, "France");
		Orange o3 = new Orange(10, "Grece");
		
		assertEquals(o1.equals(o2), false);
		
		assertEquals(o1.equals(o3), true);
		
		assertEquals(o2.equals(o3), false);
		
	}
	
	@Test
	public void testToString() {
		Orange o2 = new Orange(20, "France");
		
		assertEquals(o2.toString(), "France | 20.0\n");
		
	}
	
	@Test
	public void testGetOrigin() {
		Orange o2 = new Orange(20, "France");
		
		assertEquals(o2.getOrigine(), "France");
	}

}

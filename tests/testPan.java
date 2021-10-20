import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import td_testing.Orange;
import td_testing.Panier;

public class testPan {

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
	public void test() {
			ArrayList <Orange> panier1 = new ArrayList<Orange>();
			ArrayList <Orange> panier2 = new ArrayList<Orange>();
			ArrayList <Orange> panier3 = new ArrayList<Orange>();
			
			Panier p1 = new Panier(panier1, 20);
			Panier p2 = new Panier(panier2, 40);
			Panier p3 = new Panier(panier3, 20);
			
			assertEquals(p1.equals(p2), false);
			assertEquals(p1.equals(p3), true);
			assertEquals(p2.equals(p3), false);
	}
	
	@Test
	public void testEstPlein() {
		ArrayList <Orange> panier1 = new ArrayList<Orange>();
		Panier p1 = new Panier(panier1, 2);
		
		Orange o1 = new Orange(10, "France");
		Orange o2 = new Orange(15, "France");
		
		assertEquals(p1.estVide(), true);
		
		p1.ajoute(o1);
		
		assertEquals(p1.estPlein(), false);
		
		p1.ajoute(o2);
		
		assertEquals(p1.estPlein(), true);
		assertEquals(p1.estVide(), false);
		
	}

}

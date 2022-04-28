import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TownTest_STUDENT {
	Town testTown;

	@Before
	public void setUp() throws Exception {
		testTown = new Town("peanuts");
	}

	@After
	public void tearDown() throws Exception {
		testTown = null;
	}

	@Test
	public void testGetName() {
		assertEquals(testTown.getName(), "peanuts");
	}

	@Test
	public void testCompareTo() {
		Town testTown2 = new Town("peanuts");
		assertEquals(testTown.compareTo(testTown2), 0);
	}

	@Test
	public void testToString() {
		assertTrue(testTown.toString().equals("peanuts"));
	}

	@Test
	public void testEquals() {
		Town testTown2 = new Town("peanuts");
		assertTrue(testTown.equals(testTown2));
	}

}

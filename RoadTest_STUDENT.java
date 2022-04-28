import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RoadTest_STUDENT {
	private Road r;
	private Town testSource;
	private Town testDestination;

	@Before
	public void setUp() throws Exception {
		testSource = new Town("Source");
		testDestination = new Town("Destination");
		r = new Road(testSource, testDestination, "testRoad");
	}

	@After
	public void tearDown() throws Exception {
		r = null;
		testSource = null;
		testDestination = null;
	}

	@Test
	public void testCompareTo() {
		Road r2 = new Road(testSource, testDestination, "testRoad");
		assertEquals(r.compareTo(r2), 0);
	}

	@Test
	public void testContains() {
		assertTrue(r.contains(testSource));
	}

	@Test
	public void testEquals() {
		Road r2 = new Road(testSource, testDestination, "testRoad");
		assertTrue(r.equals(r2));
	}

	@Test
	public void testGetDestination() {
		assertTrue(r.getDestination().equals(testDestination));
	}

	@Test
	public void testGetName() {
		assertTrue(r.getName().equals("testRoad"));
	}

	@Test
	public void testGetSource() {
		assertTrue(r.getSource().equals(testSource));
	}

	@Test
	public void testGetWeight() {
		assertEquals(r.getWeight(), 1);
	}

	@Test
	public void testToString() {
		assertEquals(r.toString(), "Source via testRoad to Destination 1 mi");
	}
}

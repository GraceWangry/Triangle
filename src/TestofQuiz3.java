
import static org.junit.Assert.*;

import org.junit.*;

public class TestofQuiz3 {

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
	public void testPeri() throws TriangleException {
		Quiz3 tri1 = null;
		try {
			tri1 = new Quiz3(3,4,5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double peri1 = 12;
		assertEquals(peri1, tri1.getPerimeter(), 0);
	}
	
	
	@Test
	public void testArea() throws Exception {
		Quiz3 tri2 = new Quiz3(3,4,5);
		double area1 = 6;
		assertEquals(area1,tri2.getArea(),0);
	}
	
	@Test(expected=TriangleException.class)
	public void testTriangleException() throws Exception {
		Quiz3 tri = new Quiz3(0,1,2);
	}
}
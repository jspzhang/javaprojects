/**
 * 
 */
package romanToInt;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author jspzh
 *
 */
public class RomanToIntTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link romanToInt.Solution#romanToInt(java.lang.String)}.
	 */
	@Test
	public final void testRomanToInt() {
		Solution solution = new Solution();
		String testString = "VIII";
		int result = 8;
		System.out.println("Input roman " + testString);
		assertEquals(solution.romanToInt(testString), result);

	}

}
